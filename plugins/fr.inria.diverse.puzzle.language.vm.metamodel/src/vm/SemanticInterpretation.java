/**
 */
package vm;

import PuzzleADL.SemanticsImplementation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.SemanticInterpretation#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link vm.SemanticInterpretation#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getSemanticInterpretation()
 * @model
 * @generated
 */
public interface SemanticInterpretation extends EObject {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(SemanticsImplementation)
	 * @see vm.VmPackage#getSemanticInterpretation_Implementation()
	 * @model required="true"
	 * @generated
	 */
	SemanticsImplementation getImplementation();

	/**
	 * Sets the value of the '{@link vm.SemanticInterpretation#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(SemanticsImplementation value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see vm.VmPackage#getSemanticInterpretation_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link vm.SemanticInterpretation#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // SemanticInterpretation
