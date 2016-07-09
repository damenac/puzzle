/**
 */
package Interactions.Fragments;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.Fragments.CombinedFragment#getOperand <em>Operand</em>}</li>
 *   <li>{@link Interactions.Fragments.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link Interactions.Fragments.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.Fragments.FragmentsPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends EObject {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(InteractionOperand)
	 * @see Interactions.Fragments.FragmentsPackage#getCombinedFragment_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InteractionOperand getOperand();

	/**
	 * Sets the value of the '{@link Interactions.Fragments.CombinedFragment#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(InteractionOperand value);

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Interactions.Fragments.InteractionOperandKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see Interactions.Fragments.InteractionOperandKind
	 * @see #setInteractionOperator(InteractionOperandKind)
	 * @see Interactions.Fragments.FragmentsPackage#getCombinedFragment_InteractionOperator()
	 * @model
	 * @generated
	 */
	InteractionOperandKind getInteractionOperator();

	/**
	 * Sets the value of the '{@link Interactions.Fragments.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see Interactions.Fragments.InteractionOperandKind
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperandKind value);

	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.Fragments.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfragment Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see Interactions.Fragments.FragmentsPackage#getCombinedFragment_CfragmentGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getCfragmentGate();

} // CombinedFragment
