/**
 */
package Deployments.Nodes.impl;

import Deployments.Artifacts.impl.NamedElementImpl;

import Deployments.Nodes.DeployedArtifact;
import Deployments.Nodes.NodesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DeployedArtifactImpl extends NamedElementImpl implements DeployedArtifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.DEPLOYED_ARTIFACT;
	}

} //DeployedArtifactImpl
