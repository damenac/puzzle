/**
 */
package Deployments.Nodes;

import Deployments.Artifacts.NamedElement;
import Deployments.Artifacts.PackageableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Deployments.Nodes.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link Deployments.Nodes.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see Deployments.Nodes.NodesPackage#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
	 * The list contents are of type {@link Deployments.Artifacts.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference list.
	 * @see Deployments.Nodes.NodesPackage#getDeploymentTarget_DeployedElement()
	 * @model
	 * @generated
	 */
	EList<PackageableElement> getDeployedElement();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link Deployments.Nodes.Deployment}.
	 * It is bidirectional and its opposite is '{@link Deployments.Nodes.Deployment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see Deployments.Nodes.NodesPackage#getDeploymentTarget_Deployment()
	 * @see Deployments.Nodes.Deployment#getLocation
	 * @model opposite="location" containment="true"
	 * @generated
	 */
	EList<Deployment> getDeployment();

} // DeploymentTarget
