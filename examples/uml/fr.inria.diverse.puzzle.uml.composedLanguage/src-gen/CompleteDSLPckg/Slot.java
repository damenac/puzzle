/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Slot#getOwningInstace <em>Owning Instace</em>}</li>
 *   <li>{@link CompleteDSLPckg.Slot#getValue <em>Value</em>}</li>
 *   <li>{@link CompleteDSLPckg.Slot#getDefiningFeature <em>Defining Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends Element {
	/**
	 * Returns the value of the '<em><b>Owning Instace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.InstanceSpecification#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Instace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Instace</em>' container reference.
	 * @see #setOwningInstace(InstanceSpecification)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSlot_OwningInstace()
	 * @see CompleteDSLPckg.InstanceSpecification#getSlot
	 * @model opposite="slot" required="true" transient="false"
	 * @generated
	 */
	InstanceSpecification getOwningInstace();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Slot#getOwningInstace <em>Owning Instace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Instace</em>' container reference.
	 * @see #getOwningInstace()
	 * @generated
	 */
	void setOwningInstace(InstanceSpecification value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ValueSpecification}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.ValueSpecification#getOwningSlot <em>Owning Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSlot_Value()
	 * @see CompleteDSLPckg.ValueSpecification#getOwningSlot
	 * @model opposite="owningSlot" containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getValue();

	/**
	 * Returns the value of the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Feature</em>' reference.
	 * @see #setDefiningFeature(StructuralFeature)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSlot_DefiningFeature()
	 * @model required="true"
	 * @generated
	 */
	StructuralFeature getDefiningFeature();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Slot#getDefiningFeature <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Feature</em>' reference.
	 * @see #getDefiningFeature()
	 * @generated
	 */
	void setDefiningFeature(StructuralFeature value);

} // Slot
