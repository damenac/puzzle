/**
 */
package vm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PFeature Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.PFeatureRef#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getPFeatureRef()
 * @model
 * @generated
 */
public interface PFeatureRef extends PBooleanExpression {
	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see vm.VmPackage#getPFeatureRef_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link vm.PFeatureRef#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // PFeatureRef
