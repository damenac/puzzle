/**
 */
package Interactions.Fragments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Interactions.Fragments.FragmentsPackage
 * @generated
 */
public interface FragmentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FragmentsFactory eINSTANCE = Interactions.Fragments.impl.FragmentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Operand</em>'.
	 * @generated
	 */
	InteractionOperand createInteractionOperand();

	/**
	 * Returns a new object of class '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Fragment</em>'.
	 * @generated
	 */
	CombinedFragment createCombinedFragment();

	/**
	 * Returns a new object of class '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consider Ignore Fragment</em>'.
	 * @generated
	 */
	ConsiderIgnoreFragment createConsiderIgnoreFragment();

	/**
	 * Returns a new object of class '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuation</em>'.
	 * @generated
	 */
	Continuation createContinuation();

	/**
	 * Returns a new object of class '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Constraint</em>'.
	 * @generated
	 */
	InteractionConstraint createInteractionConstraint();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	Gate createGate();

	/**
	 * Returns a new object of class '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Use</em>'.
	 * @generated
	 */
	InteractionUse createInteractionUse();

	/**
	 * Returns a new object of class '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Decomposition</em>'.
	 * @generated
	 */
	PartDecomposition createPartDecomposition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FragmentsPackage getFragmentsPackage();

} //FragmentsFactory
