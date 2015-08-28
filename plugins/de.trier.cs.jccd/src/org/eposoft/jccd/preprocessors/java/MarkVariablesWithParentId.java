package org.eposoft.jccd.preprocessors.java;

import java.util.HashMap;
import java.util.Set;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.data.ast.NodeTypes;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Rename all variable names to its parent id (when they were declared).
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class MarkVariablesWithParentId extends ARenameVariableNames {

	@Override
	protected void process(final SourceUnitManager container) {
		walkThroughTree((ASTManager) container,
				new HashMap<VariableIdentifier, Integer>(), 0, 0);
	}

	/**
	 * Walks through whole tree and removes special nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 * @param variableNames
	 *            all local mapped variable names
	 */
	private void walkThroughTree(final ASTManager container,
			final HashMap<VariableIdentifier, Integer> variableNames,
			final int parentId, final int parentType) {

		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);
			if (isVariableIdentifier(child)) {
				// check if this is an identifier of a variable (check parent
				// type)
				VariableIdentifier varIdentifier = null;
				switch (child.getParent().getType()) {
				// variable initialization
				case Antlr3JavaParser.VAR_DECLARATOR:
				case Antlr3JavaParser.FORMAL_PARAM_STD_DECL:
				case Antlr3JavaParser.FORMAL_PARAM_VARARG_DECL:
				case Antlr3JavaParser.ENUM_TOP_LEVEL_SCOPE:
					varIdentifier = new VariableIdentifier(child);
					switch (parentType) {
					case Antlr3JavaParser.CLASS:
					case Antlr3JavaParser.INTERFACE:
					case Antlr3JavaParser.ENUM:
						varIdentifier.setHasThis(true);
					}
					variableNames.put(varIdentifier, parentId);
				}

				// try to get name from local variable names
				final String variableName;
				if (null == varIdentifier) {
					varIdentifier = new VariableIdentifier(child);
				}
				Integer varId = variableNames.get(varIdentifier);

				if (null == varId) {
					// check if a member variable was set
					varIdentifier.setHasThis(true);
					varId = variableNames.get(varIdentifier);
					if (null == varId) {
						variableName = "?_" + parentId;
					} else {
						variableName = "" + varId;
					}
				} else {
					variableName = "" + varId;
				}
				container.addNodeOverChild(i, NodeTypes.IDENT.toString(),
						NodeTypes.IDENT.getType());
				container.markChild(i);
				container.getMarkedNode().addAnnotation(this.getClass(),
						"varname", variableName);
				container.markParentNode();
			} else {
				final HashMap<VariableIdentifier, Integer> childLocalVariableNames;
				final int localParentId;
				final int localParentType;
				switch (child.getType()) {
				case Antlr3JavaParser.CLASS:
				case Antlr3JavaParser.ENUM:
				case Antlr3JavaParser.INTERFACE:
				case Antlr3JavaParser.FUNCTION_METHOD_DECL:
				case Antlr3JavaParser.VOID_METHOD_DECL:
					childLocalVariableNames = new HashMap<VariableIdentifier, Integer>();
					final Set<VariableIdentifier> keys = variableNames.keySet();
					// clone hashmap
					for (final VariableIdentifier key : keys) {
						childLocalVariableNames
								.put(key, variableNames.get(key));
					}
					localParentId = child.getId();
					localParentType = child.getType();
					break;
				default:
					childLocalVariableNames = variableNames;
					localParentId = parentId;
					localParentType = parentType;
					break;
				}
				container.markChild(i);
				walkThroughTree(container, childLocalVariableNames,
						localParentId, localParentType);
				container.markParentNode();
			}
			++i;
		}
	}
}
