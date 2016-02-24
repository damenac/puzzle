/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.LanguageFeature#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link vm.LanguageFeature#getChildren <em>Children</em>}</li>
 *   <li>{@link vm.LanguageFeature#getParent <em>Parent</em>}</li>
 *   <li>{@link vm.LanguageFeature#getGroups <em>Groups</em>}</li>
 *   <li>{@link vm.LanguageFeature#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link vm.LanguageFeature#getImplementationModule <em>Implementation Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getLanguageFeature()
 * @model
 * @generated
 */
public interface LanguageFeature extends PNamedElement {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see vm.VmPackage#getLanguageFeature_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link vm.LanguageFeature#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link vm.LanguageFeature}.
	 * It is bidirectional and its opposite is '{@link vm.LanguageFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see vm.VmPackage#getLanguageFeature_Children()
	 * @see vm.LanguageFeature#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<LanguageFeature> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vm.LanguageFeature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(LanguageFeature)
	 * @see vm.VmPackage#getLanguageFeature_Parent()
	 * @see vm.LanguageFeature#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	LanguageFeature getParent();

	/**
	 * Sets the value of the '{@link vm.LanguageFeature#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(LanguageFeature value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link vm.LanguageFeatureGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see vm.VmPackage#getLanguageFeature_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<LanguageFeatureGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Parent Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vm.LanguageFeatureGroup#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Group</em>' reference.
	 * @see #setParentGroup(LanguageFeatureGroup)
	 * @see vm.VmPackage#getLanguageFeature_ParentGroup()
	 * @see vm.LanguageFeatureGroup#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	LanguageFeatureGroup getParentGroup();

	/**
	 * Sets the value of the '{@link vm.LanguageFeature#getParentGroup <em>Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Group</em>' reference.
	 * @see #getParentGroup()
	 * @generated
	 */
	void setParentGroup(LanguageFeatureGroup value);

	/**
	 * Returns the value of the '<em><b>Implementation Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Module</em>' containment reference.
	 * @see #setImplementationModule(LanguageModule)
	 * @see vm.VmPackage#getLanguageFeature_ImplementationModule()
	 * @model containment="true"
	 * @generated
	 */
	LanguageModule getImplementationModule();

	/**
	 * Sets the value of the '{@link vm.LanguageFeature#getImplementationModule <em>Implementation Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Module</em>' containment reference.
	 * @see #getImplementationModule()
	 * @generated
	 */
	void setImplementationModule(LanguageModule value);

} // LanguageFeature
