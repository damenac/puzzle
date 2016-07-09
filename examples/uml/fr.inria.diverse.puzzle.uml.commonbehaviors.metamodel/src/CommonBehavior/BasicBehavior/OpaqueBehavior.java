/**
 */
package CommonBehavior.BasicBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.OpaqueBehavior#getBody <em>Body</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.OpaqueBehavior#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getOpaqueBehavior()
 * @model
 * @generated
 */
public interface OpaqueBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getOpaqueBehavior_Body()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getOpaqueBehavior_Language()
	 * @model
	 * @generated
	 */
	EList<String> getLanguage();

} // OpaqueBehavior
