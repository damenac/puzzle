/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.InstanceSpecification#getSlot <em>Slot</em>}</li>
 *   <li>{@link CompleteDSLPckg.InstanceSpecification#getSpecification <em>Specification</em>}</li>
 *   <li>{@link CompleteDSLPckg.InstanceSpecification#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInstanceSpecification()
 * @model
 * @generated
 */
public interface InstanceSpecification extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Slot}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Slot#getOwningInstace <em>Owning Instace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInstanceSpecification_Slot()
	 * @see CompleteDSLPckg.Slot#getOwningInstace
	 * @model opposite="owningInstace" containment="true"
	 * @generated
	 */
	EList<Slot> getSlot();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.ValueSpecification#getOwningInstanceSpec <em>Owning Instance Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInstanceSpecification_Specification()
	 * @see CompleteDSLPckg.ValueSpecification#getOwningInstanceSpec
	 * @model opposite="owningInstanceSpec" containment="true"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.InstanceSpecification#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInstanceSpecification_Classifier()
	 * @model
	 * @generated
	 */
	EList<Classifier> getClassifier();

} // InstanceSpecification
