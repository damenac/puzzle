/**
 */
package Deployments.ComponentDeployments;

import Deployments.Artifacts.Artifact;

import Deployments.Nodes.Deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Deployments.ComponentDeployments.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link Deployments.ComponentDeployments.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link Deployments.ComponentDeployments.DeploymentSpecification#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see Deployments.ComponentDeployments.ComponentDeploymentsPackage#getDeploymentSpecification()
 * @model
 * @generated
 */
public interface DeploymentSpecification extends Artifact {
	/**
	 * Returns the value of the '<em><b>Deployment Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Location</em>' attribute.
	 * @see #setDeploymentLocation(String)
	 * @see Deployments.ComponentDeployments.ComponentDeploymentsPackage#getDeploymentSpecification_DeploymentLocation()
	 * @model
	 * @generated
	 */
	String getDeploymentLocation();

	/**
	 * Sets the value of the '{@link Deployments.ComponentDeployments.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Location</em>' attribute.
	 * @see #getDeploymentLocation()
	 * @generated
	 */
	void setDeploymentLocation(String value);

	/**
	 * Returns the value of the '<em><b>Execution Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Location</em>' attribute.
	 * @see #setExecutionLocation(String)
	 * @see Deployments.ComponentDeployments.ComponentDeploymentsPackage#getDeploymentSpecification_ExecutionLocation()
	 * @model
	 * @generated
	 */
	String getExecutionLocation();

	/**
	 * Sets the value of the '{@link Deployments.ComponentDeployments.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Location</em>' attribute.
	 * @see #getExecutionLocation()
	 * @generated
	 */
	void setExecutionLocation(String value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Deployments.Nodes.Deployment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see Deployments.ComponentDeployments.ComponentDeploymentsPackage#getDeploymentSpecification_Deployment()
	 * @see Deployments.Nodes.Deployment#getConfiguration
	 * @model opposite="configuration" transient="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link Deployments.ComponentDeployments.DeploymentSpecification#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

} // DeploymentSpecification
