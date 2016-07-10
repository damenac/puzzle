/**
 */
package UseCases;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCases.Extend#getExtensionLocation <em>Extension Location</em>}</li>
 *   <li>{@link UseCases.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link UseCases.Extend#getCondition <em>Condition</em>}</li>
 *   <li>{@link UseCases.Extend#getExtendedCase <em>Extended Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCases.UseCasesPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends NamedElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Extension Location</b></em>' reference list.
	 * The list contents are of type {@link UseCases.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Location</em>' reference list.
	 * @see UseCases.UseCasesPackage#getExtend_ExtensionLocation()
	 * @model required="true"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionLocation();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UseCases.UseCase#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' container reference.
	 * @see #setExtension(UseCase)
	 * @see UseCases.UseCasesPackage#getExtend_Extension()
	 * @see UseCases.UseCase#getExtend
	 * @model opposite="extend" required="true" transient="false"
	 * @generated
	 */
	UseCase getExtension();

	/**
	 * Sets the value of the '{@link UseCases.Extend#getExtension <em>Extension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' container reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(UseCase value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Constraint)
	 * @see UseCases.UseCasesPackage#getExtend_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getCondition();

	/**
	 * Sets the value of the '{@link UseCases.Extend#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Extended Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Case</em>' reference.
	 * @see #setExtendedCase(UseCase)
	 * @see UseCases.UseCasesPackage#getExtend_ExtendedCase()
	 * @model required="true"
	 * @generated
	 */
	UseCase getExtendedCase();

	/**
	 * Sets the value of the '{@link UseCases.Extend#getExtendedCase <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Case</em>' reference.
	 * @see #getExtendedCase()
	 * @generated
	 */
	void setExtendedCase(UseCase value);

} // Extend
