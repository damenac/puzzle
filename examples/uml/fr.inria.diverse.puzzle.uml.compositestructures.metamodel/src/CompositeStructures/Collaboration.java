/**
 */
package CompositeStructures;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompositeStructures.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompositeStructures.CompositeStructuresPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends StructuredClassifier, BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' reference list.
	 * The list contents are of type {@link CompositeStructures.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' reference list.
	 * @see CompositeStructures.CompositeStructuresPackage#getCollaboration_CollaborationRole()
	 * @model
	 * @generated
	 */
	EList<ConnectableElement> getCollaborationRole();

} // Collaboration
