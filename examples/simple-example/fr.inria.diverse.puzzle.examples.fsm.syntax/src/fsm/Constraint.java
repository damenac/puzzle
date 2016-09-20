/**
 */
package fsm;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsm.FsmPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean eval(Map<?, ?> context);

} // Constraint
