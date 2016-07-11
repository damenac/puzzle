/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ValueSpecification#getOwningUpper <em>Owning Upper</em>}</li>
 *   <li>{@link CompleteDSLPckg.ValueSpecification#getOwningLower <em>Owning Lower</em>}</li>
 *   <li>{@link CompleteDSLPckg.ValueSpecification#getOwningConstraint <em>Owning Constraint</em>}</li>
 *   <li>{@link CompleteDSLPckg.ValueSpecification#getOwningSlot <em>Owning Slot</em>}</li>
 *   <li>{@link CompleteDSLPckg.ValueSpecification#getOwningInstanceSpec <em>Owning Instance Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends TypedElement, PackageableElement {
	/**
	 * Returns the value of the '<em><b>Owning Upper</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.MultiplicityElement#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Upper</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Upper</em>' container reference.
	 * @see #setOwningUpper(MultiplicityElement)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getValueSpecification_OwningUpper()
	 * @see CompleteDSLPckg.MultiplicityElement#getUpperValue
	 * @model opposite="upperValue" transient="false"
	 * @generated
	 */
	MultiplicityElement getOwningUpper();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ValueSpecification#getOwningUpper <em>Owning Upper</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Upper</em>' container reference.
	 * @see #getOwningUpper()
	 * @generated
	 */
	void setOwningUpper(MultiplicityElement value);

	/**
	 * Returns the value of the '<em><b>Owning Lower</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.MultiplicityElement#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Lower</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Lower</em>' container reference.
	 * @see #setOwningLower(MultiplicityElement)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getValueSpecification_OwningLower()
	 * @see CompleteDSLPckg.MultiplicityElement#getLowerValue
	 * @model opposite="lowerValue" transient="false"
	 * @generated
	 */
	MultiplicityElement getOwningLower();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ValueSpecification#getOwningLower <em>Owning Lower</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Lower</em>' container reference.
	 * @see #getOwningLower()
	 * @generated
	 */
	void setOwningLower(MultiplicityElement value);

	/**
	 * Returns the value of the '<em><b>Owning Constraint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Constraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Constraint</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Constraint</em>' container reference.
	 * @see #setOwningConstraint(Constraint)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getValueSpecification_OwningConstraint()
	 * @see CompleteDSLPckg.Constraint#getSpecification
	 * @model opposite="specification" transient="false"
	 * @generated
	 */
	Constraint getOwningConstraint();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ValueSpecification#getOwningConstraint <em>Owning Constraint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Constraint</em>' container reference.
	 * @see #getOwningConstraint()
	 * @generated
	 */
	void setOwningConstraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Owning Slot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Slot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Slot</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Slot</em>' container reference.
	 * @see #setOwningSlot(Slot)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getValueSpecification_OwningSlot()
	 * @see CompleteDSLPckg.Slot#getValue
	 * @model opposite="value" transient="false"
	 * @generated
	 */
	Slot getOwningSlot();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ValueSpecification#getOwningSlot <em>Owning Slot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Slot</em>' container reference.
	 * @see #getOwningSlot()
	 * @generated
	 */
	void setOwningSlot(Slot value);

	/**
	 * Returns the value of the '<em><b>Owning Instance Spec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.InstanceSpecification#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Instance Spec</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Instance Spec</em>' container reference.
	 * @see #setOwningInstanceSpec(InstanceSpecification)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getValueSpecification_OwningInstanceSpec()
	 * @see CompleteDSLPckg.InstanceSpecification#getSpecification
	 * @model opposite="specification" transient="false"
	 * @generated
	 */
	InstanceSpecification getOwningInstanceSpec();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ValueSpecification#getOwningInstanceSpec <em>Owning Instance Spec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Instance Spec</em>' container reference.
	 * @see #getOwningInstanceSpec()
	 * @generated
	 */
	void setOwningInstanceSpec(InstanceSpecification value);

} // ValueSpecification
