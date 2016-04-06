/**
 */
package PuzzleADL;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PuzzleADL.LanguageModule#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link PuzzleADL.LanguageModule#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link PuzzleADL.LanguageModule#getAbstractSyntax <em>Abstract Syntax</em>}</li>
 *   <li>{@link PuzzleADL.LanguageModule#getSemanticsImplementation <em>Semantics Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see PuzzleADL.PuzzleADLPackage#getLanguageModule()
 * @model
 * @generated
 */
public interface LanguageModule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Required Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface</em>' containment reference.
	 * @see #setRequiredInterface(RequiredInterface)
	 * @see PuzzleADL.PuzzleADLPackage#getLanguageModule_RequiredInterface()
	 * @model containment="true"
	 * @generated
	 */
	RequiredInterface getRequiredInterface();

	/**
	 * Sets the value of the '{@link PuzzleADL.LanguageModule#getRequiredInterface <em>Required Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interface</em>' containment reference.
	 * @see #getRequiredInterface()
	 * @generated
	 */
	void setRequiredInterface(RequiredInterface value);

	/**
	 * Returns the value of the '<em><b>Provided Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface</em>' containment reference.
	 * @see #setProvidedInterface(ProvidedInterface)
	 * @see PuzzleADL.PuzzleADLPackage#getLanguageModule_ProvidedInterface()
	 * @model containment="true"
	 * @generated
	 */
	ProvidedInterface getProvidedInterface();

	/**
	 * Sets the value of the '{@link PuzzleADL.LanguageModule#getProvidedInterface <em>Provided Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface</em>' containment reference.
	 * @see #getProvidedInterface()
	 * @generated
	 */
	void setProvidedInterface(ProvidedInterface value);

	/**
	 * Returns the value of the '<em><b>Abstract Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Syntax</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Syntax</em>' containment reference.
	 * @see #setAbstractSyntax(AbstractSyntaxImplementation)
	 * @see PuzzleADL.PuzzleADLPackage#getLanguageModule_AbstractSyntax()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractSyntaxImplementation getAbstractSyntax();

	/**
	 * Sets the value of the '{@link PuzzleADL.LanguageModule#getAbstractSyntax <em>Abstract Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Syntax</em>' containment reference.
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	void setAbstractSyntax(AbstractSyntaxImplementation value);

	/**
	 * Returns the value of the '<em><b>Semantics Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link PuzzleADL.SemanticsImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics Implementation</em>' containment reference list.
	 * @see PuzzleADL.PuzzleADLPackage#getLanguageModule_SemanticsImplementation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticsImplementation> getSemanticsImplementation();

} // LanguageModule
