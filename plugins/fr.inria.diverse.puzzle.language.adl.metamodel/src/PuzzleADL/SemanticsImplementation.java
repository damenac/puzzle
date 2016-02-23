/**
 */
package PuzzleADL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantics Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PuzzleADL.SemanticsImplementation#getAspectsIdentifiers <em>Aspects Identifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see PuzzleADL.PuzzleADLPackage#getSemanticsImplementation()
 * @model
 * @generated
 */
public interface SemanticsImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Aspects Identifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects Identifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects Identifiers</em>' attribute list.
	 * @see PuzzleADL.PuzzleADLPackage#getSemanticsImplementation_AspectsIdentifiers()
	 * @model
	 * @generated
	 */
	EList<String> getAspectsIdentifiers();

} // SemanticsImplementation
