/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link CompleteDSLPckg.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDeploymentTarget_DeployedElement()
	 * @model
	 * @generated
	 */
	EList<PackageableElement> getDeployedElement();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Deployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDeploymentTarget_Deployment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deployment> getDeployment();

} // DeploymentTarget
