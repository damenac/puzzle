/**
 */
package vm;

import PuzzleADL.SemanticsImplementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.SemanticVariationPoint#getFeature <em>Feature</em>}</li>
 *   <li>{@link vm.SemanticVariationPoint#getInterpretations <em>Interpretations</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getSemanticVariationPoint()
 * @model
 * @generated
 */
public interface SemanticVariationPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vm.LanguageFeature#getSemanticVariationPoint <em>Semantic Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(LanguageFeature)
	 * @see vm.VmPackage#getSemanticVariationPoint_Feature()
	 * @see vm.LanguageFeature#getSemanticVariationPoint
	 * @model opposite="semanticVariationPoint" required="true"
	 * @generated
	 */
	LanguageFeature getFeature();

	/**
	 * Sets the value of the '{@link vm.SemanticVariationPoint#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(LanguageFeature value);

	/**
	 * Returns the value of the '<em><b>Interpretations</b></em>' containment reference list.
	 * The list contents are of type {@link PuzzleADL.SemanticsImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretations</em>' containment reference list.
	 * @see vm.VmPackage#getSemanticVariationPoint_Interpretations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SemanticsImplementation> getInterpretations();

} // SemanticVariationPoint
