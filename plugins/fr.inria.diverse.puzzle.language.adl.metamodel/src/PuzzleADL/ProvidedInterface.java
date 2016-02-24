/**
 */
package PuzzleADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PuzzleADL.ProvidedInterface#getEcorePath <em>Ecore Path</em>}</li>
 *   <li>{@link PuzzleADL.ProvidedInterface#getEcoreRelativePath <em>Ecore Relative Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see PuzzleADL.PuzzleADLPackage#getProvidedInterface()
 * @model
 * @generated
 */
public interface ProvidedInterface extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Ecore Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Path</em>' attribute.
	 * @see #setEcorePath(String)
	 * @see PuzzleADL.PuzzleADLPackage#getProvidedInterface_EcorePath()
	 * @model
	 * @generated
	 */
	String getEcorePath();

	/**
	 * Sets the value of the '{@link PuzzleADL.ProvidedInterface#getEcorePath <em>Ecore Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Path</em>' attribute.
	 * @see #getEcorePath()
	 * @generated
	 */
	void setEcorePath(String value);

	/**
	 * Returns the value of the '<em><b>Ecore Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Relative Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Relative Path</em>' attribute.
	 * @see #setEcoreRelativePath(String)
	 * @see PuzzleADL.PuzzleADLPackage#getProvidedInterface_EcoreRelativePath()
	 * @model
	 * @generated
	 */
	String getEcoreRelativePath();

	/**
	 * Sets the value of the '{@link PuzzleADL.ProvidedInterface#getEcoreRelativePath <em>Ecore Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Relative Path</em>' attribute.
	 * @see #getEcoreRelativePath()
	 * @generated
	 */
	void setEcoreRelativePath(String value);
} // ProvidedInterface
