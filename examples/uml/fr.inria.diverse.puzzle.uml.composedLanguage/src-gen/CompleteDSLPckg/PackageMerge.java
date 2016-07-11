/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.PackageMerge#getReceivingPackage <em>Receiving Package</em>}</li>
 *   <li>{@link CompleteDSLPckg.PackageMerge#getMergedPackage <em>Merged Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getPackageMerge()
 * @model
 * @generated
 */
public interface PackageMerge extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Receiving Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Package#getPackageMerge <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Package</em>' container reference.
	 * @see #setReceivingPackage(CompleteDSLPckg.Package)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getPackageMerge_ReceivingPackage()
	 * @see CompleteDSLPckg.Package#getPackageMerge
	 * @model opposite="packageMerge" required="true" transient="false"
	 * @generated
	 */
	CompleteDSLPckg.Package getReceivingPackage();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.PackageMerge#getReceivingPackage <em>Receiving Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Package</em>' container reference.
	 * @see #getReceivingPackage()
	 * @generated
	 */
	void setReceivingPackage(CompleteDSLPckg.Package value);

	/**
	 * Returns the value of the '<em><b>Merged Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged Package</em>' reference.
	 * @see #setMergedPackage(CompleteDSLPckg.Package)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getPackageMerge_MergedPackage()
	 * @model required="true"
	 * @generated
	 */
	CompleteDSLPckg.Package getMergedPackage();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.PackageMerge#getMergedPackage <em>Merged Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged Package</em>' reference.
	 * @see #getMergedPackage()
	 * @generated
	 */
	void setMergedPackage(CompleteDSLPckg.Package value);

} // PackageMerge
