package fr.inria.diverse.k3.sle.common.comparisonOperators;

import org.eclipse.xtext.common.types.JvmOperation;

import fr.inria.diverse.k3.sle.common.commands.MethodComparison;

/**
 * Service for methods comparison by simple naming match
 * @author David Mendez-Acuna
 */
public class NamingMethodComparison implements MethodComparison {

	@Override
	public boolean equal(JvmOperation left, JvmOperation right) {
		return left.getSimpleName().equals(right.getSimpleName());
	}
}