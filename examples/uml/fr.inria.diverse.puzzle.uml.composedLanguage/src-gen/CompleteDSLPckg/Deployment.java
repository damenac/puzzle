/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Deployment#getLocation <em>Location</em>}</li>
 *   <li>{@link CompleteDSLPckg.Deployment#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link CompleteDSLPckg.Deployment#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Dependency {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(DeploymentTarget)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDeployment_Location()
	 * @model required="true"
	 * @generated
	 */
	DeploymentTarget getLocation();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Deployment#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DeploymentTarget value);

	/**
	 * Returns the value of the '<em><b>Deployed Artifact</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.DeployedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Artifact</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDeployment_DeployedArtifact()
	 * @model
	 * @generated
	 */
	EList<DeployedArtifact> getDeployedArtifact();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.DeploymentSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDeployment_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentSpecification> getConfiguration();

} // Deployment
