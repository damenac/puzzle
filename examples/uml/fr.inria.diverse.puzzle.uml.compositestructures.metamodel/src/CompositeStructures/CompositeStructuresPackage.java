/**
 */
package CompositeStructures;

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
 * @see CompositeStructures.CompositeStructuresFactory
 * @model kind="package"
 * @generated
 */
public interface CompositeStructuresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CompositeStructures";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml.classes.metamodel/CompositeStructures";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CompositeStructures";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositeStructuresPackage eINSTANCE = CompositeStructures.impl.CompositeStructuresPackageImpl.init();

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.RedefinableElementImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getRedefinableElement()
	 * @generated
	 */
	int REDEFINABLE_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.FeatureImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURING_CLASSIFIER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = REDEFINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = REDEFINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.ConnectorImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Redefined Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REDEFINED_CONNECTOR = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.NamespaceImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 5;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.ClassifierImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__COLLABORATION_USE = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__REPRESENTATION = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.StructuredClassifierImpl <em>Structured Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.StructuredClassifierImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getStructuredClassifier()
	 * @generated
	 */
	int STRUCTURED_CLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__FEATURE = CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__COLLABORATION_USE = CLASSIFIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__REPRESENTATION = CLASSIFIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__OWNED_CONNECTOR = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__ROLE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER__PART = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Structured Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Structured Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.StructuralFeatureImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 6;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.ClassImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 7;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE = STRUCTURED_CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COLLABORATION_USE = STRUCTURED_CLASSIFIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REPRESENTATION = STRUCTURED_CLASSIFIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_CONNECTOR = STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ROLE = STRUCTURED_CLASSIFIER__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PART = STRUCTURED_CLASSIFIER__PART;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_PORT = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = STRUCTURED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.TypedElementImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 9;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.ConnectableElementImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getConnectableElement()
	 * @generated
	 */
	int CONNECTABLE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT__END = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connectable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_ELEMENT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.PropertyImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__END = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = STRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.ConnectorEndImpl <em>Connector End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.ConnectorEndImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getConnectorEnd()
	 * @generated
	 */
	int CONNECTOR_END = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Defining End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__DEFINING_END = 2;

	/**
	 * The feature id for the '<em><b>Part With Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__PART_WITH_PORT = 3;

	/**
	 * The number of structural features of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.AssociationImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 12;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.PortImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 13;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__END = PROPERTY__END;

	/**
	 * The feature id for the '<em><b>Is Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_BEHAVIOR = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_SERVICE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_CONJUGATED = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REQUIRED = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROVIDED = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Redefined Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REDEFINED_PORT = PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.InterfaceImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 14;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.EncapsulatedClassifierImpl <em>Encapsulated Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.EncapsulatedClassifierImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getEncapsulatedClassifier()
	 * @generated
	 */
	int ENCAPSULATED_CLASSIFIER = 15;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__FEATURE = STRUCTURED_CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__COLLABORATION_USE = STRUCTURED_CLASSIFIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__REPRESENTATION = STRUCTURED_CLASSIFIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__OWNED_CONNECTOR = STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__ROLE = STRUCTURED_CLASSIFIER__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE = STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__PART = STRUCTURED_CLASSIFIER__PART;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER__OWNED_PORT = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Encapsulated Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER_FEATURE_COUNT = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Encapsulated Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATED_CLASSIFIER_OPERATION_COUNT = STRUCTURED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.ParameterImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END = CONNECTABLE_ELEMENT__END;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.CollaborationImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 17;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__FEATURE = STRUCTURED_CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__COLLABORATION_USE = STRUCTURED_CLASSIFIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__REPRESENTATION = STRUCTURED_CLASSIFIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__OWNED_CONNECTOR = STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ROLE = STRUCTURED_CLASSIFIER__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__OWNED_ATTRIBUTE = STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__PART = STRUCTURED_CLASSIFIER__PART;

	/**
	 * The feature id for the '<em><b>Collaboration Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__COLLABORATION_ROLE = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = STRUCTURED_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_OPERATION_COUNT = STRUCTURED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.BehavioredClassifierImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getBehavioredClassifier()
	 * @generated
	 */
	int BEHAVIORED_CLASSIFIER = 18;

	/**
	 * The number of structural features of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.NamedElementImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 20;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.CollaborationUseImpl <em>Collaboration Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.CollaborationUseImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getCollaborationUse()
	 * @generated
	 */
	int COLLABORATION_USE = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE__ROLE_BINDING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collaboration Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collaboration Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.DependencyImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 21;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.InvocationActionImpl <em>Invocation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.InvocationActionImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getInvocationAction()
	 * @generated
	 */
	int INVOCATION_ACTION = 22;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__ON_PORT = 0;

	/**
	 * The number of structural features of the '<em>Invocation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Invocation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.TriggerImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 23;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PORT = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.impl.VariableImpl
	 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__END = CONNECTABLE_ELEMENT__END;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CompositeStructures.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see CompositeStructures.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Connector#getRedefinedConnector <em>Redefined Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Connector</em>'.
	 * @see CompositeStructures.Connector#getRedefinedConnector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_RedefinedConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link CompositeStructures.Connector#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see CompositeStructures.Connector#getEnd()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_End();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see CompositeStructures.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featuring Classifier</em>'.
	 * @see CompositeStructures.Feature#getFeaturingClassifier()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeaturingClassifier();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Element</em>'.
	 * @see CompositeStructures.RedefinableElement
	 * @generated
	 */
	EClass getRedefinableElement();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Classifier</em>'.
	 * @see CompositeStructures.StructuredClassifier
	 * @generated
	 */
	EClass getStructuredClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link CompositeStructures.StructuredClassifier#getOwnedConnector <em>Owned Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Connector</em>'.
	 * @see CompositeStructures.StructuredClassifier#getOwnedConnector()
	 * @see #getStructuredClassifier()
	 * @generated
	 */
	EReference getStructuredClassifier_OwnedConnector();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.StructuredClassifier#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see CompositeStructures.StructuredClassifier#getRole()
	 * @see #getStructuredClassifier()
	 * @generated
	 */
	EReference getStructuredClassifier_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link CompositeStructures.StructuredClassifier#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see CompositeStructures.StructuredClassifier#getOwnedAttribute()
	 * @see #getStructuredClassifier()
	 * @generated
	 */
	EReference getStructuredClassifier_OwnedAttribute();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.StructuredClassifier#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part</em>'.
	 * @see CompositeStructures.StructuredClassifier#getPart()
	 * @see #getStructuredClassifier()
	 * @generated
	 */
	EReference getStructuredClassifier_Part();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see CompositeStructures.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see CompositeStructures.Classifier#getFeature()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link CompositeStructures.Classifier#getCollaborationUse <em>Collaboration Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaboration Use</em>'.
	 * @see CompositeStructures.Classifier#getCollaborationUse()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_CollaborationUse();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.Classifier#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see CompositeStructures.Classifier#getRepresentation()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Representation();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see CompositeStructures.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see CompositeStructures.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see CompositeStructures.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable Element</em>'.
	 * @see CompositeStructures.ConnectableElement
	 * @generated
	 */
	EClass getConnectableElement();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.ConnectableElement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End</em>'.
	 * @see CompositeStructures.ConnectableElement#getEnd()
	 * @see #getConnectableElement()
	 * @generated
	 */
	EReference getConnectableElement_End();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see CompositeStructures.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see CompositeStructures.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector End</em>'.
	 * @see CompositeStructures.ConnectorEnd
	 * @generated
	 */
	EClass getConnectorEnd();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.ConnectorEnd#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see CompositeStructures.ConnectorEnd#getType()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Type();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see CompositeStructures.ConnectorEnd#getRole()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Role();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.ConnectorEnd#getDefiningEnd <em>Defining End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining End</em>'.
	 * @see CompositeStructures.ConnectorEnd#getDefiningEnd()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_DefiningEnd();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.ConnectorEnd#getPartWithPort <em>Part With Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part With Port</em>'.
	 * @see CompositeStructures.ConnectorEnd#getPartWithPort()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_PartWithPort();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see CompositeStructures.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see CompositeStructures.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link CompositeStructures.Port#isIsBehavior <em>Is Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Behavior</em>'.
	 * @see CompositeStructures.Port#isIsBehavior()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsBehavior();

	/**
	 * Returns the meta object for the attribute '{@link CompositeStructures.Port#isIsService <em>Is Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Service</em>'.
	 * @see CompositeStructures.Port#isIsService()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsService();

	/**
	 * Returns the meta object for the attribute '{@link CompositeStructures.Port#isIsConjugated <em>Is Conjugated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Conjugated</em>'.
	 * @see CompositeStructures.Port#isIsConjugated()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsConjugated();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Port#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required</em>'.
	 * @see CompositeStructures.Port#getRequired()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Required();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Port#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided</em>'.
	 * @see CompositeStructures.Port#getProvided()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Provided();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Port#getRedefinedPort <em>Redefined Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Port</em>'.
	 * @see CompositeStructures.Port#getRedefinedPort()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_RedefinedPort();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see CompositeStructures.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsulated Classifier</em>'.
	 * @see CompositeStructures.EncapsulatedClassifier
	 * @generated
	 */
	EClass getEncapsulatedClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link CompositeStructures.EncapsulatedClassifier#getOwnedPort <em>Owned Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Port</em>'.
	 * @see CompositeStructures.EncapsulatedClassifier#getOwnedPort()
	 * @see #getEncapsulatedClassifier()
	 * @generated
	 */
	EReference getEncapsulatedClassifier_OwnedPort();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see CompositeStructures.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see CompositeStructures.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Collaboration#getCollaborationRole <em>Collaboration Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collaboration Role</em>'.
	 * @see CompositeStructures.Collaboration#getCollaborationRole()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_CollaborationRole();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviored Classifier</em>'.
	 * @see CompositeStructures.BehavioredClassifier
	 * @generated
	 */
	EClass getBehavioredClassifier();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.CollaborationUse <em>Collaboration Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Use</em>'.
	 * @see CompositeStructures.CollaborationUse
	 * @generated
	 */
	EClass getCollaborationUse();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.CollaborationUse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see CompositeStructures.CollaborationUse#getType()
	 * @see #getCollaborationUse()
	 * @generated
	 */
	EReference getCollaborationUse_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link CompositeStructures.CollaborationUse#getRoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Binding</em>'.
	 * @see CompositeStructures.CollaborationUse#getRoleBinding()
	 * @see #getCollaborationUse()
	 * @generated
	 */
	EReference getCollaborationUse_RoleBinding();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see CompositeStructures.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see CompositeStructures.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Action</em>'.
	 * @see CompositeStructures.InvocationAction
	 * @generated
	 */
	EClass getInvocationAction();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.InvocationAction#getOnPort <em>On Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Port</em>'.
	 * @see CompositeStructures.InvocationAction#getOnPort()
	 * @see #getInvocationAction()
	 * @generated
	 */
	EReference getInvocationAction_OnPort();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see CompositeStructures.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Trigger#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see CompositeStructures.Trigger#getPort()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Port();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see CompositeStructures.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompositeStructuresFactory getCompositeStructuresFactory();

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
		 * The meta object literal for the '{@link CompositeStructures.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.ConnectorImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Redefined Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__REDEFINED_CONNECTOR = eINSTANCE.getConnector_RedefinedConnector();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__END = eINSTANCE.getConnector_End();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.FeatureImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Featuring Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURING_CLASSIFIER = eINSTANCE.getFeature_FeaturingClassifier();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.RedefinableElementImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getRedefinableElement()
		 * @generated
		 */
		EClass REDEFINABLE_ELEMENT = eINSTANCE.getRedefinableElement();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.StructuredClassifierImpl <em>Structured Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.StructuredClassifierImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getStructuredClassifier()
		 * @generated
		 */
		EClass STRUCTURED_CLASSIFIER = eINSTANCE.getStructuredClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASSIFIER__OWNED_CONNECTOR = eINSTANCE.getStructuredClassifier_OwnedConnector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASSIFIER__ROLE = eINSTANCE.getStructuredClassifier_Role();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE = eINSTANCE.getStructuredClassifier_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASSIFIER__PART = eINSTANCE.getStructuredClassifier_Part();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.ClassifierImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__FEATURE = eINSTANCE.getClassifier_Feature();

		/**
		 * The meta object literal for the '<em><b>Collaboration Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__COLLABORATION_USE = eINSTANCE.getClassifier_CollaborationUse();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__REPRESENTATION = eINSTANCE.getClassifier_Representation();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.NamespaceImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.StructuralFeatureImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.ClassImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.ConnectableElementImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getConnectableElement()
		 * @generated
		 */
		EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTABLE_ELEMENT__END = eINSTANCE.getConnectableElement_End();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.TypedElementImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.PropertyImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.ConnectorEndImpl <em>Connector End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.ConnectorEndImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getConnectorEnd()
		 * @generated
		 */
		EClass CONNECTOR_END = eINSTANCE.getConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__TYPE = eINSTANCE.getConnectorEnd_Type();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__ROLE = eINSTANCE.getConnectorEnd_Role();

		/**
		 * The meta object literal for the '<em><b>Defining End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__DEFINING_END = eINSTANCE.getConnectorEnd_DefiningEnd();

		/**
		 * The meta object literal for the '<em><b>Part With Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__PART_WITH_PORT = eINSTANCE.getConnectorEnd_PartWithPort();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.AssociationImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.PortImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Is Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_BEHAVIOR = eINSTANCE.getPort_IsBehavior();

		/**
		 * The meta object literal for the '<em><b>Is Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_SERVICE = eINSTANCE.getPort_IsService();

		/**
		 * The meta object literal for the '<em><b>Is Conjugated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_CONJUGATED = eINSTANCE.getPort_IsConjugated();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REQUIRED = eINSTANCE.getPort_Required();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PROVIDED = eINSTANCE.getPort_Provided();

		/**
		 * The meta object literal for the '<em><b>Redefined Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REDEFINED_PORT = eINSTANCE.getPort_RedefinedPort();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.InterfaceImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.EncapsulatedClassifierImpl <em>Encapsulated Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.EncapsulatedClassifierImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getEncapsulatedClassifier()
		 * @generated
		 */
		EClass ENCAPSULATED_CLASSIFIER = eINSTANCE.getEncapsulatedClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATED_CLASSIFIER__OWNED_PORT = eINSTANCE.getEncapsulatedClassifier_OwnedPort();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.ParameterImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.CollaborationImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '<em><b>Collaboration Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__COLLABORATION_ROLE = eINSTANCE.getCollaboration_CollaborationRole();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.BehavioredClassifierImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getBehavioredClassifier()
		 * @generated
		 */
		EClass BEHAVIORED_CLASSIFIER = eINSTANCE.getBehavioredClassifier();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.CollaborationUseImpl <em>Collaboration Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.CollaborationUseImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getCollaborationUse()
		 * @generated
		 */
		EClass COLLABORATION_USE = eINSTANCE.getCollaborationUse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_USE__TYPE = eINSTANCE.getCollaborationUse_Type();

		/**
		 * The meta object literal for the '<em><b>Role Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_USE__ROLE_BINDING = eINSTANCE.getCollaborationUse_RoleBinding();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.NamedElementImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.DependencyImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.InvocationActionImpl <em>Invocation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.InvocationActionImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getInvocationAction()
		 * @generated
		 */
		EClass INVOCATION_ACTION = eINSTANCE.getInvocationAction();

		/**
		 * The meta object literal for the '<em><b>On Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ACTION__ON_PORT = eINSTANCE.getInvocationAction_OnPort();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.TriggerImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__PORT = eINSTANCE.getTrigger_Port();

		/**
		 * The meta object literal for the '{@link CompositeStructures.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.impl.VariableImpl
		 * @see CompositeStructures.impl.CompositeStructuresPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

	}

} //CompositeStructuresPackage
