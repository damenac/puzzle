/**
 */
package Deployments.ComponentDeployments;

import Deployments.Artifacts.ArtifactsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Deployments.ComponentDeployments.ComponentDeploymentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentDeploymentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentDeployments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Deployments/ComponentDeployments";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentDeployments";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDeploymentsPackage eINSTANCE = Deployments.ComponentDeployments.impl.ComponentDeploymentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Deployments.ComponentDeployments.impl.DeploymentSpecificationImpl <em>Deployment Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Deployments.ComponentDeployments.impl.DeploymentSpecificationImpl
	 * @see Deployments.ComponentDeployments.impl.ComponentDeploymentsPackageImpl#getDeploymentSpecification()
	 * @generated
	 */
	int DEPLOYMENT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__FILE_NAME = ArtifactsPackage.ARTIFACT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__OWNED_OPERATION = ArtifactsPackage.ARTIFACT__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE = ArtifactsPackage.ARTIFACT__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT = ArtifactsPackage.ARTIFACT__NESTED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Manifestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__MANIFESTATION = ArtifactsPackage.ARTIFACT__MANIFESTATION;

	/**
	 * The feature id for the '<em><b>Deployment Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION = ArtifactsPackage.ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION = ArtifactsPackage.ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION__DEPLOYMENT = ArtifactsPackage.ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION_FEATURE_COUNT = ArtifactsPackage.ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Deployment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPECIFICATION_OPERATION_COUNT = ArtifactsPackage.ARTIFACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Deployments.ComponentDeployments.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Specification</em>'.
	 * @see Deployments.ComponentDeployments.DeploymentSpecification
	 * @generated
	 */
	EClass getDeploymentSpecification();

	/**
	 * Returns the meta object for the attribute '{@link Deployments.ComponentDeployments.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Location</em>'.
	 * @see Deployments.ComponentDeployments.DeploymentSpecification#getDeploymentLocation()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EAttribute getDeploymentSpecification_DeploymentLocation();

	/**
	 * Returns the meta object for the attribute '{@link Deployments.ComponentDeployments.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Location</em>'.
	 * @see Deployments.ComponentDeployments.DeploymentSpecification#getExecutionLocation()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EAttribute getDeploymentSpecification_ExecutionLocation();

	/**
	 * Returns the meta object for the container reference '{@link Deployments.ComponentDeployments.DeploymentSpecification#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Deployment</em>'.
	 * @see Deployments.ComponentDeployments.DeploymentSpecification#getDeployment()
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	EReference getDeploymentSpecification_Deployment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentDeploymentsFactory getComponentDeploymentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Deployments.ComponentDeployments.impl.DeploymentSpecificationImpl <em>Deployment Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Deployments.ComponentDeployments.impl.DeploymentSpecificationImpl
		 * @see Deployments.ComponentDeployments.impl.ComponentDeploymentsPackageImpl#getDeploymentSpecification()
		 * @generated
		 */
		EClass DEPLOYMENT_SPECIFICATION = eINSTANCE.getDeploymentSpecification();

		/**
		 * The meta object literal for the '<em><b>Deployment Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION = eINSTANCE.getDeploymentSpecification_DeploymentLocation();

		/**
		 * The meta object literal for the '<em><b>Execution Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION = eINSTANCE.getDeploymentSpecification_ExecutionLocation();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPECIFICATION__DEPLOYMENT = eINSTANCE.getDeploymentSpecification_Deployment();

	}

} //ComponentDeploymentsPackage
