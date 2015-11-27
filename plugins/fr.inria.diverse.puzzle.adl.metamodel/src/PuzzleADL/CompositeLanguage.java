/**
 */
package PuzzleADL;

import fr.inria.diverse.melange.metamodel.melange.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PuzzleADL.CompositeLanguage#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see PuzzleADL.PuzzleADLPackage#getCompositeLanguage()
 * @model
 * @generated
 */
public interface CompositeLanguage extends Element {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link PuzzleADL.CompositionLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see PuzzleADL.PuzzleADLPackage#getCompositeLanguage_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionLink> getLinks();

} // CompositeLanguage
