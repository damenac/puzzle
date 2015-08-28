package org.eposoft.jccd.preprocessors.java;

import java.util.HashMap;

import org.eposoft.jccd.data.SourceUnitManager;
import org.eposoft.jccd.data.ast.ASTManager;

/**
 * Rename all variable names consistent.
 * 
 * Supported languages: Java
 * 
 * @author biegel
 */
public final class RenameVariableNamesConsistent extends ARenameVariableNames {

	/** map of all variable names of one parent node */
	private final HashMap<Integer, HashMap<VariableIdentifier, Integer>> variableNames = new HashMap<Integer, HashMap<VariableIdentifier, Integer>>();

	@Override
	protected void process(final SourceUnitManager container) {
		walkThroughTree((ASTManager) container);
		this.variableNames.clear();
	}

	/**
	 * Walks through whole tree and rename variables consistent.
	 * 
	 * @param container
	 *            preprocessing container
	 */
	private void walkThroughTree(final ASTManager container) {
		final Integer variableParentId = (Integer) container.getMarkedNode()
				.getAnnotation(ARenameVariableNames.class, "varname");

		if (null != variableParentId) {
			// annotated parent id found, consistent renaming ...
			HashMap<VariableIdentifier, Integer> groupNames = this.variableNames
					.get(variableParentId);

			if (null == groupNames) {
				// new variable name not set yet
				groupNames = new HashMap<VariableIdentifier, Integer>();
				this.variableNames.put(variableParentId, groupNames);
			}

			// add new name if the variable wasn't set yet
			final VariableIdentifier varId = new VariableIdentifier(container
					.getMarkedNode());
			if (!groupNames.containsKey(varId)) {
				groupNames.put(varId, groupNames.size());
			}

			final StringBuffer sb = new StringBuffer();
			sb.append(variableParentId);
			sb.append('.');
			sb.append(groupNames.get(varId));
			container.getMarkedNode().addAnnotation(this.getClass(), "varname",
					sb.toString());
		}

		if (0 == container.getChildCountOfMarkedNode()) {
			return;
		}

		for (int i = 0; i < container.getChildCountOfMarkedNode(); i++) {
			container.markChild(i);
			walkThroughTree(container);
			container.markParentNode();
		}
	}
}
