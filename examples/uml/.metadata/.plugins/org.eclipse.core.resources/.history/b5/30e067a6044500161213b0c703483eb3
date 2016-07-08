/**
 */
package CompositeStructures.InternalStructures.impl;

import CompositeStructures.InternalStructures.Association;
import CompositeStructures.InternalStructures.Connector;
import CompositeStructures.InternalStructures.ConnectorEnd;
import CompositeStructures.InternalStructures.InternalStructuresFactory;
import CompositeStructures.InternalStructures.InternalStructuresPackage;
import CompositeStructures.InternalStructures.Property;
import CompositeStructures.InternalStructures.StructuredClassifier;

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
public class InternalStructuresFactoryImpl extends EFactoryImpl implements InternalStructuresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InternalStructuresFactory init() {
		try {
			InternalStructuresFactory theInternalStructuresFactory = (InternalStructuresFactory)EPackage.Registry.INSTANCE.getEFactory(InternalStructuresPackage.eNS_URI);
			if (theInternalStructuresFactory != null) {
				return theInternalStructuresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InternalStructuresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStructuresFactoryImpl() {
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
			case InternalStructuresPackage.CONNECTOR: return createConnector();
			case InternalStructuresPackage.STRUCTURED_CLASSIFIER: return createStructuredClassifier();
			case InternalStructuresPackage.CLASS: return createClass();
			case InternalStructuresPackage.PROPERTY: return createProperty();
			case InternalStructuresPackage.CONNECTOR_END: return createConnectorEnd();
			case InternalStructuresPackage.ASSOCIATION: return createAssociation();
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
	public CompositeStructures.InternalStructures.Class createClass() {
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
	public InternalStructuresPackage getInternalStructuresPackage() {
		return (InternalStructuresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InternalStructuresPackage getPackage() {
		return InternalStructuresPackage.eINSTANCE;
	}

} //InternalStructuresFactoryImpl
