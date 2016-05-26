/**
 */
package fsm;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsm.FsmPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evalStatement(Map<?, ?> context);

} // Block
