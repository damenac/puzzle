/**
 */
package Interactions.Fragments;

import Interactions.BasicInteractions.Interaction;
import Interactions.BasicInteractions.InteractionFragment;
import Interactions.BasicInteractions.ValueSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.Fragments.InteractionUse#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link Interactions.Fragments.InteractionUse#getArgument <em>Argument</em>}</li>
 *   <li>{@link Interactions.Fragments.InteractionUse#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link Interactions.Fragments.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}</li>
 *   <li>{@link Interactions.Fragments.InteractionUse#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.Fragments.FragmentsPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.Fragments.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see Interactions.Fragments.FragmentsPackage#getInteractionUse_ActualGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getActualGate();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see Interactions.Fragments.FragmentsPackage#getInteractionUse_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(ValueSpecification)
	 * @see Interactions.Fragments.FragmentsPackage#getInteractionUse_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getReturnValue();

	/**
	 * Sets the value of the '{@link Interactions.Fragments.InteractionUse#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value Recipient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value Recipient</em>' reference.
	 * @see #setReturnValueRecipient(Property)
	 * @see Interactions.Fragments.FragmentsPackage#getInteractionUse_ReturnValueRecipient()
	 * @model
	 * @generated
	 */
	Property getReturnValueRecipient();

	/**
	 * Sets the value of the '{@link Interactions.Fragments.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value Recipient</em>' reference.
	 * @see #getReturnValueRecipient()
	 * @generated
	 */
	void setReturnValueRecipient(Property value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Interaction)
	 * @see Interactions.Fragments.FragmentsPackage#getInteractionUse_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	Interaction getRefersTo();

	/**
	 * Sets the value of the '{@link Interactions.Fragments.InteractionUse#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Interaction value);

} // InteractionUse
