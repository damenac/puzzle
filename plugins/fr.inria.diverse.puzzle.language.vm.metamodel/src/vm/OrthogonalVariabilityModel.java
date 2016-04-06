/**
 */
package vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orthogonal Variability Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vm.OrthogonalVariabilityModel#getSemanticVariationPoints <em>Semantic Variation Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see vm.VmPackage#getOrthogonalVariabilityModel()
 * @model
 * @generated
 */
public interface OrthogonalVariabilityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Variation Points</b></em>' containment reference list.
	 * The list contents are of type {@link vm.SemanticVariationPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Variation Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Variation Points</em>' containment reference list.
	 * @see vm.VmPackage#getOrthogonalVariabilityModel_SemanticVariationPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticVariationPoint> getSemanticVariationPoints();

} // OrthogonalVariabilityModel
