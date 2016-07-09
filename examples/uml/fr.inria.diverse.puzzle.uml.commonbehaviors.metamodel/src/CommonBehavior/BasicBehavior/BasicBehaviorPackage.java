/**
 */
package CommonBehavior.BasicBehavior;

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
 * @see CommonBehavior.BasicBehavior.BasicBehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BasicBehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicBehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/CommonBehavior/BasicBehavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BasicBehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicBehaviorPackage eINSTANCE = CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.RedefinableElementImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getRedefinableElement()
	 * @generated
	 */
	int REDEFINABLE_ELEMENT = 4;

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
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.ClassifierImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = REDEFINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.BehavioredClassifierImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getBehavioredClassifier()
	 * @generated
	 */
	int BEHAVIORED_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.ClassImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_BEHAVIOR = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASSIFIER_BEHAVIOR = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RECEPTION = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.BehaviorImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_BEHAVIOR = CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CLASSIFIER_BEHAVIOR = CLASS__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_RECEPTION = CLASS__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTEXT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_REENTRANT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__REDEFINED_BEHAVIOR = CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SPECIFICATION = CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_PARAMETER = CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PRECONDITION = CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__POSTCONDITION = CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.OpaqueBehaviorImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getOpaqueBehavior()
	 * @generated
	 */
	int OPAQUE_BEHAVIOR = 5;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_BEHAVIOR = BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR = BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_RECEPTION = BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CONTEXT = BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_REENTRANT = BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR = BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SPECIFICATION = BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_PARAMETER = BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PRECONDITION = BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__POSTCONDITION = BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__BODY = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__LANGUAGE = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.FunctionBehaviorImpl <em>Function Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.FunctionBehaviorImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getFunctionBehavior()
	 * @generated
	 */
	int FUNCTION_BEHAVIOR = 6;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_BEHAVIOR = OPAQUE_BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__CLASSIFIER_BEHAVIOR = OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_RECEPTION = OPAQUE_BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__CONTEXT = OPAQUE_BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__IS_REENTRANT = OPAQUE_BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__REDEFINED_BEHAVIOR = OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__SPECIFICATION = OPAQUE_BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_PARAMETER = OPAQUE_BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__PRECONDITION = OPAQUE_BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__POSTCONDITION = OPAQUE_BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__BODY = OPAQUE_BEHAVIOR__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__LANGUAGE = OPAQUE_BEHAVIOR__LANGUAGE;

	/**
	 * The number of structural features of the '<em>Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR_FEATURE_COUNT = OPAQUE_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR_OPERATION_COUNT = OPAQUE_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.BehavioralFeatureImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getBehavioralFeature()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__CONCURRENCY = 1;

	/**
	 * The number of structural features of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.ParameterImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.OpaqueExpressionImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getOpaqueExpression()
	 * @generated
	 */
	int OPAQUE_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__BEHAVIOR = 1;

	/**
	 * The number of structural features of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonBehavior.BasicBehavior.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonBehavior.BasicBehavior.impl.ConstraintImpl
	 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 10;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviored Classifier</em>'.
	 * @see CommonBehavior.BasicBehavior.BehavioredClassifier
	 * @generated
	 */
	EClass getBehavioredClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonBehavior.BasicBehavior.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Behavior</em>'.
	 * @see CommonBehavior.BasicBehavior.BehavioredClassifier#getOwnedBehavior()
	 * @see #getBehavioredClassifier()
	 * @generated
	 */
	EReference getBehavioredClassifier_OwnedBehavior();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.BasicBehavior.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier Behavior</em>'.
	 * @see CommonBehavior.BasicBehavior.BehavioredClassifier#getClassifierBehavior()
	 * @see #getBehavioredClassifier()
	 * @generated
	 */
	EReference getBehavioredClassifier_ClassifierBehavior();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see CommonBehavior.BasicBehavior.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see CommonBehavior.BasicBehavior.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonBehavior.BasicBehavior.Class#getOwnedReception <em>Owned Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Reception</em>'.
	 * @see CommonBehavior.BasicBehavior.Class#getOwnedReception()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedReception();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.BasicBehavior.Behavior#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior#getContext()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Context();

	/**
	 * Returns the meta object for the attribute '{@link CommonBehavior.BasicBehavior.Behavior#isIsReentrant <em>Is Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reentrant</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior#isIsReentrant()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_IsReentrant();

	/**
	 * Returns the meta object for the reference list '{@link CommonBehavior.BasicBehavior.Behavior#getRedefinedBehavior <em>Redefined Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Behavior</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior#getRedefinedBehavior()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_RedefinedBehavior();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.BasicBehavior.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior#getSpecification()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Specification();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonBehavior.BasicBehavior.Behavior#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior#getOwnedParameter()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_OwnedParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonBehavior.BasicBehavior.Behavior#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior#getPrecondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonBehavior.BasicBehavior.Behavior#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postcondition</em>'.
	 * @see CommonBehavior.BasicBehavior.Behavior#getPostcondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Postcondition();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Element</em>'.
	 * @see CommonBehavior.BasicBehavior.RedefinableElement
	 * @generated
	 */
	EClass getRedefinableElement();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.OpaqueBehavior <em>Opaque Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior</em>'.
	 * @see CommonBehavior.BasicBehavior.OpaqueBehavior
	 * @generated
	 */
	EClass getOpaqueBehavior();

	/**
	 * Returns the meta object for the attribute list '{@link CommonBehavior.BasicBehavior.OpaqueBehavior#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Body</em>'.
	 * @see CommonBehavior.BasicBehavior.OpaqueBehavior#getBody()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_Body();

	/**
	 * Returns the meta object for the attribute list '{@link CommonBehavior.BasicBehavior.OpaqueBehavior#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see CommonBehavior.BasicBehavior.OpaqueBehavior#getLanguage()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_Language();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.FunctionBehavior <em>Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Behavior</em>'.
	 * @see CommonBehavior.BasicBehavior.FunctionBehavior
	 * @generated
	 */
	EClass getFunctionBehavior();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature</em>'.
	 * @see CommonBehavior.BasicBehavior.BehavioralFeature
	 * @generated
	 */
	EClass getBehavioralFeature();

	/**
	 * Returns the meta object for the reference list '{@link CommonBehavior.BasicBehavior.BehavioralFeature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method</em>'.
	 * @see CommonBehavior.BasicBehavior.BehavioralFeature#getMethod()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_Method();

	/**
	 * Returns the meta object for the attribute '{@link CommonBehavior.BasicBehavior.BehavioralFeature#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see CommonBehavior.BasicBehavior.BehavioralFeature#getConcurrency()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EAttribute getBehavioralFeature_Concurrency();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see CommonBehavior.BasicBehavior.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Expression</em>'.
	 * @see CommonBehavior.BasicBehavior.OpaqueExpression
	 * @generated
	 */
	EClass getOpaqueExpression();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.BasicBehavior.OpaqueExpression#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see CommonBehavior.BasicBehavior.OpaqueExpression#getResult()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EReference getOpaqueExpression_Result();

	/**
	 * Returns the meta object for the reference '{@link CommonBehavior.BasicBehavior.OpaqueExpression#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see CommonBehavior.BasicBehavior.OpaqueExpression#getBehavior()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EReference getOpaqueExpression_Behavior();

	/**
	 * Returns the meta object for class '{@link CommonBehavior.BasicBehavior.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see CommonBehavior.BasicBehavior.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicBehaviorFactory getBasicBehaviorFactory();

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
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.BehavioredClassifierImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getBehavioredClassifier()
		 * @generated
		 */
		EClass BEHAVIORED_CLASSIFIER = eINSTANCE.getBehavioredClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR = eINSTANCE.getBehavioredClassifier_OwnedBehavior();

		/**
		 * The meta object literal for the '<em><b>Classifier Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR = eINSTANCE.getBehavioredClassifier_ClassifierBehavior();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.ClassifierImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.ClassImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Owned Reception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_RECEPTION = eINSTANCE.getClass_OwnedReception();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.BehaviorImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__CONTEXT = eINSTANCE.getBehavior_Context();

		/**
		 * The meta object literal for the '<em><b>Is Reentrant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__IS_REENTRANT = eINSTANCE.getBehavior_IsReentrant();

		/**
		 * The meta object literal for the '<em><b>Redefined Behavior</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__REDEFINED_BEHAVIOR = eINSTANCE.getBehavior_RedefinedBehavior();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__SPECIFICATION = eINSTANCE.getBehavior_Specification();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__OWNED_PARAMETER = eINSTANCE.getBehavior_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__PRECONDITION = eINSTANCE.getBehavior_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__POSTCONDITION = eINSTANCE.getBehavior_Postcondition();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.RedefinableElementImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getRedefinableElement()
		 * @generated
		 */
		EClass REDEFINABLE_ELEMENT = eINSTANCE.getRedefinableElement();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.OpaqueBehaviorImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getOpaqueBehavior()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR = eINSTANCE.getOpaqueBehavior();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__BODY = eINSTANCE.getOpaqueBehavior_Body();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__LANGUAGE = eINSTANCE.getOpaqueBehavior_Language();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.FunctionBehaviorImpl <em>Function Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.FunctionBehaviorImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getFunctionBehavior()
		 * @generated
		 */
		EClass FUNCTION_BEHAVIOR = eINSTANCE.getFunctionBehavior();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.BehavioralFeatureImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getBehavioralFeature()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__METHOD = eINSTANCE.getBehavioralFeature_Method();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_FEATURE__CONCURRENCY = eINSTANCE.getBehavioralFeature_Concurrency();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.ParameterImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.OpaqueExpressionImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getOpaqueExpression()
		 * @generated
		 */
		EClass OPAQUE_EXPRESSION = eINSTANCE.getOpaqueExpression();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_EXPRESSION__RESULT = eINSTANCE.getOpaqueExpression_Result();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_EXPRESSION__BEHAVIOR = eINSTANCE.getOpaqueExpression_Behavior();

		/**
		 * The meta object literal for the '{@link CommonBehavior.BasicBehavior.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonBehavior.BasicBehavior.impl.ConstraintImpl
		 * @see CommonBehavior.BasicBehavior.impl.BasicBehaviorPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

	}

} //BasicBehaviorPackage
