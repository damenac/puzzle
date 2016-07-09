/**
 */
package Activities.StructuredActivities;

import Activities.ExtraStructuredActivities.ExceptionHandler;

import Activities.FundamentalActivities.ActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.StructuredActivities.ExecutableNode#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getExecutableNode()
 * @model
 * @generated
 */
public interface ExecutableNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.ExtraStructuredActivities.ExceptionHandler}.
	 * It is bidirectional and its opposite is '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getExecutableNode_Handler()
	 * @see Activities.ExtraStructuredActivities.ExceptionHandler#getProtectedNode
	 * @model opposite="protectedNode" containment="true"
	 * @generated
	 */
	EList<ExceptionHandler> getHandler();

} // ExecutableNode
