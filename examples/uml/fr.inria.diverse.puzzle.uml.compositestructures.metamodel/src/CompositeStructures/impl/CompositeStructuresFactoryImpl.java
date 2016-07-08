/**
 */
package CompositeStructures.impl;

import CompositeStructures.Association;
import CompositeStructures.BehavioredClassifier;
import CompositeStructures.Collaboration;
import CompositeStructures.CollaborationUse;
import CompositeStructures.CompositeStructuresFactory;
import CompositeStructures.CompositeStructuresPackage;
import CompositeStructures.Connector;
import CompositeStructures.ConnectorEnd;
import CompositeStructures.Dependency;
import CompositeStructures.Interface;
import CompositeStructures.Parameter;
import CompositeStructures.Port;
import CompositeStructures.Property;
import CompositeStructures.StructuredClassifier;
import CompositeStructures.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeStructuresFactoryImpl extends EFactoryImpl implements CompositeStructuresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompositeStructuresFactory init() {
		try {
			CompositeStructuresFactory theCompositeStructuresFactory = (CompositeStructuresFactory)EPackage.Registry.INSTANCE.getEFactory(CompositeStructuresPackage.eNS_URI);
			if (theCompositeStructuresFactory != null) {
				return theCompositeStructuresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompositeStructuresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStructuresFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompositeStructuresPackage.CONNECTOR: return createConnector();
			case CompositeStructuresPackage.STRUCTURED_CLASSIFIER: return createStructuredClassifier();
			case CompositeStructuresPackage.CLASS: return createClass();
			case CompositeStructuresPackage.PROPERTY: return createProperty();
			case CompositeStructuresPackage.CONNECTOR_END: return createConnectorEnd();
			case CompositeStructuresPackage.ASSOCIATION: return createAssociation();
			case CompositeStructuresPackage.PORT: return createPort();
			case CompositeStructuresPackage.INTERFACE: return createInterface();
			case CompositeStructuresPackage.PARAMETER: return createParameter();
			case CompositeStructuresPackage.COLLABORATION: return createCollaboration();
			case CompositeStructuresPackage.BEHAVIORED_CLASSIFIER: return createBehavioredClassifier();
			case CompositeStructuresPackage.COLLABORATION_USE: return createCollaborationUse();
			case CompositeStructuresPackage.DEPENDENCY: return createDependency();
			case CompositeStructuresPackage.VARIABLE: return createVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifier createStructuredClassifier() {
		StructuredClassifierImpl structuredClassifier = new StructuredClassifierImpl();
		return structuredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStructures.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createConnectorEnd() {
		ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier createBehavioredClassifier() {
		BehavioredClassifierImpl behavioredClassifier = new BehavioredClassifierImpl();
		return behavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createCollaborationUse() {
		CollaborationUseImpl collaborationUse = new CollaborationUseImpl();
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStructuresPackage getCompositeStructuresPackage() {
		return (CompositeStructuresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompositeStructuresPackage getPackage() {
		return CompositeStructuresPackage.eINSTANCE;
	}

} //CompositeStructuresFactoryImpl
