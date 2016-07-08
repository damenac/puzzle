/**
 */
package Deployments.Nodes;

import Deployments.ComponentDeployments.DeploymentSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Deployments.Nodes.Deployment#getLocation <em>Location</em>}</li>
 *   <li>{@link Deployments.Nodes.Deployment#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link Deployments.Nodes.Deployment#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see Deployments.Nodes.NodesPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Dependency {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Deployments.Nodes.DeploymentTarget#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(DeploymentTarget)
	 * @see Deployments.Nodes.NodesPackage#getDeployment_Location()
	 * @see Deployments.Nodes.DeploymentTarget#getDeployment
	 * @model opposite="deployment" required="true" transient="false"
	 * @generated
	 */
	DeploymentTarget getLocation();

	/**
	 * Sets the value of the '{@link Deployments.Nodes.Deployment#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DeploymentTarget value);

	/**
	 * Returns the value of the '<em><b>Deployed Artifact</b></em>' reference list.
	 * The list contents are of type {@link Deployments.Nodes.DeployedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Artifact</em>' reference list.
	 * @see Deployments.Nodes.NodesPackage#getDeployment_DeployedArtifact()
	 * @model
	 * @generated
	 */
	EList<DeployedArtifact> getDeployedArtifact();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link Deployments.ComponentDeployments.DeploymentSpecification}.
	 * It is bidirectional and its opposite is '{@link Deployments.ComponentDeployments.DeploymentSpecification#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see Deployments.Nodes.NodesPackage#getDeployment_Configuration()
	 * @see Deployments.ComponentDeployments.DeploymentSpecification#getDeployment
	 * @model opposite="deployment" containment="true"
	 * @generated
	 */
	EList<DeploymentSpecification> getConfiguration();

} // Deployment
