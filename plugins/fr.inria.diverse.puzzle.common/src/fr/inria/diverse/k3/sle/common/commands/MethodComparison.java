package fr.inria.diverse.k3.sle.common.commands;

import org.eclipse.xtext.common.types.JvmOperation;

/**
 * Contract for the methods comparison command
 * @author David Mendez-Acuna
 */
public interface MethodComparison {

	public boolean equal(JvmOperation left, JvmOperation right);
}
