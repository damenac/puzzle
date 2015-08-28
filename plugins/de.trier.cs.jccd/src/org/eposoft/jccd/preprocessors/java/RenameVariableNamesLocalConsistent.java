package org.eposoft.jccd.preprocessors.java;

import java.util.HashMap;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ANode;
import org.eposoft.jccd.data.ast.ASTManager;
import org.eposoft.jccd.parser.java.antlr3.Antlr3JavaParser;

/**
 * Rename all variable names consistent inside a block.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RenameVariableNamesLocalConsistent extends
		ARenameVariableNames {

	@Override
	protected void process(final SourceUnitManager container) {
		walkThroughTree((ASTManager) container,
				new HashMap<VariableIdentifier, Integer>(),
				new HashMap<VariableIdentifier, Integer>());
	}

	/**
	 * Walks through whole tree and removes special nodes.
	 * 
	 * @param container
	 *            preprocessing container
	 * @param localVariabelNames
	 *            all local mapped variable names
	 * @param globalVariabelNames
	 *            all global mapped variable names
	 */
	private void walkThroughTree(final ASTManager container,
			final HashMap<VariableIdentifier, Integer> localVariabelNames,
			final HashMap<VariableIdentifier, Integer> globalVariabelNames) {

		int i = 0;
		while (i < container.getChildCountOfMarkedNode()) {
			final ANode child = container.getMarkedNode().getChild(i);
			container.markChild(i);
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
					localVariabelNames.put(varIdentifier, localVariabelNames
							.size());
				}

				// try to get name from local variable names
				final String variableName;
				if (null == varIdentifier) {
					varIdentifier = new VariableIdentifier(child);
				}
				Integer varId = localVariabelNames.get(varIdentifier);

				if (null == varId) {
					// `this` will be added to the variable name
					varIdentifier.setHasThis(true);

					// name not found, lookup in the global map
					varId = globalVariabelNames.get(varIdentifier);
					if (null == varId) {
						varId = globalVariabelNames.size();
						globalVariabelNames.put(varIdentifier, varId);
					}

					variableName = "G" + varId;
				} else {
					variableName = "" + varId;
				}
				container.getMarkedNode().addAnnotation(this.getClass(),
						"varname", variableName);
				container.removeAllChildrenOfMarkedNode();
			} else {
				// check if child node is a block or a method
				final boolean isBlock = (container.getMarkedNode().getType() == Antlr3JavaParser.BLOCK_SCOPE);
				final boolean isClassBlock = (container.getMarkedNode()
						.getType() == Antlr3JavaParser.CLASS_TOP_LEVEL_SCOPE);
				final boolean isInterfaceBlock = (container.getMarkedNode()
						.getType() == Antlr3JavaParser.INTERFACE_TOP_LEVEL_SCOPE);
				final boolean isEnumBlock = (container.getMarkedNode()
						.getType() == Antlr3JavaParser.ENUM_TOP_LEVEL_SCOPE);
				final boolean isParameterList = (container.getMarkedNode()
						.getType() == Antlr3JavaParser.FORMAL_PARAM_LIST);

				final HashMap<VariableIdentifier, Integer> childLocalVariableNames;
				final HashMap<VariableIdentifier, Integer> childGlobalVariableNames;
				if (isBlock || isClassBlock || isInterfaceBlock || isEnumBlock
						|| isParameterList) {
					childLocalVariableNames = new HashMap<VariableIdentifier, Integer>();
					childGlobalVariableNames = new HashMap<VariableIdentifier, Integer>();
				} else {
					childLocalVariableNames = localVariabelNames;
					childGlobalVariableNames = globalVariabelNames;
				}
				walkThroughTree(container, childLocalVariableNames,
						childGlobalVariableNames);
			}

			++i;
			container.markParentNode();
		}
	}
}
