/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link CompleteDSLPckg.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link CompleteDSLPckg.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CompleteDSLPckg.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see CompleteDSLPckg.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getExpansionRegion_Mode()
	 * @model
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see CompleteDSLPckg.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ExpansionNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getExpansionRegion_InputElement()
	 * @model required="true"
	 * @generated
	 */
	EList<ExpansionNode> getInputElement();

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ExpansionNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getExpansionRegion_OutputElement()
	 * @model
	 * @generated
	 */
	EList<ExpansionNode> getOutputElement();

} // ExpansionRegion
