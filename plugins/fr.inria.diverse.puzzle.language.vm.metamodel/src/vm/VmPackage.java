/**
 */
package vm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see vm.VmFactory
 * @model kind="package"
 * @generated
 */
public interface VmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.vm.metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmPackage eINSTANCE = vm.impl.VmPackageImpl.init();

	/**
	 * The meta object id for the '{@link vm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.NamedElementImpl
	 * @see vm.impl.VmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageProductLineImpl <em>Language Product Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageProductLineImpl
	 * @see vm.impl.VmPackageImpl#getLanguageProductLine()
	 * @generated
	 */
	int LANGUAGE_PRODUCT_LINE = 1;

	/**
	 * The feature id for the '<em><b>Functional Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY = 0;

	/**
	 * The feature id for the '<em><b>Semantical Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY = 1;

	/**
	 * The number of structural features of the '<em>Language Product Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language Product Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureModelImpl <em>Language Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureModelImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeatureModel()
	 * @generated
	 */
	int LANGUAGE_FEATURE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL__ROOT_FEATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Language Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Language Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureImpl <em>Language Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeature()
	 * @generated
	 */
	int LANGUAGE_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__MANDATORY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__CHILDREN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__PARENT_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implementation Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__IMPLEMENTATION_MODULE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__SELECTED = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Semantic Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Language Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Language Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureGroupImpl <em>Language Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureGroupImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeatureGroup()
	 * @generated
	 */
	int LANGUAGE_FEATURE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP__CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>Language Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureGroupCardinalityImpl <em>Language Feature Group Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureGroupCardinalityImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeatureGroupCardinality()
	 * @generated
	 */
	int LANGUAGE_FEATURE_GROUP_CARDINALITY = 5;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP_CARDINALITY__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP_CARDINALITY__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Language Feature Group Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP_CARDINALITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language Feature Group Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_GROUP_CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageConstraintImpl <em>Language Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageConstraintImpl
	 * @see vm.impl.VmPackageImpl#getLanguageConstraint()
	 * @generated
	 */
	int LANGUAGE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT__EXPRESSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Language Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.BooleanExpressionImpl
	 * @see vm.impl.VmPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureRefImpl <em>Language Feature Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureRefImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeatureRef()
	 * @generated
	 */
	int LANGUAGE_FEATURE_REF = 8;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_REF__REF = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_REF_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Language Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_REF_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.UnaryExpressionImpl
	 * @see vm.impl.VmPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.BinaryExpressionImpl
	 * @see vm.impl.VmPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.OrthogonalVariabilityModelImpl <em>Orthogonal Variability Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.OrthogonalVariabilityModelImpl
	 * @see vm.impl.VmPackageImpl#getOrthogonalVariabilityModel()
	 * @generated
	 */
	int ORTHOGONAL_VARIABILITY_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Semantic Variation Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Orthogonal Variability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGONAL_VARIABILITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orthogonal Variability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTHOGONAL_VARIABILITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.SemanticVariationPointImpl <em>Semantic Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.SemanticVariationPointImpl
	 * @see vm.impl.VmPackageImpl#getSemanticVariationPoint()
	 * @generated
	 */
	int SEMANTIC_VARIATION_POINT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VARIATION_POINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VARIATION_POINT__FEATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpretations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VARIATION_POINT__INTERPRETATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semantic Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VARIATION_POINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semantic Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_VARIATION_POINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.SemanticInterpretationImpl <em>Semantic Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.SemanticInterpretationImpl
	 * @see vm.impl.VmPackageImpl#getSemanticInterpretation()
	 * @generated
	 */
	int SEMANTIC_INTERPRETATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_INTERPRETATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_INTERPRETATION__IMPLEMENTATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_INTERPRETATION__SELECTED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semantic Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_INTERPRETATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semantic Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_INTERPRETATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.UninaryOperator <em>Uninary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.UninaryOperator
	 * @see vm.impl.VmPackageImpl#getUninaryOperator()
	 * @generated
	 */
	int UNINARY_OPERATOR = 14;

	/**
	 * The meta object id for the '{@link vm.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.BinaryOperator
	 * @see vm.impl.VmPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 15;


	/**
	 * Returns the meta object for class '{@link vm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see vm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link vm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link vm.LanguageProductLine <em>Language Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Product Line</em>'.
	 * @see vm.LanguageProductLine
	 * @generated
	 */
	EClass getLanguageProductLine();

	/**
	 * Returns the meta object for the containment reference '{@link vm.LanguageProductLine#getFunctionalVariability <em>Functional Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Variability</em>'.
	 * @see vm.LanguageProductLine#getFunctionalVariability()
	 * @see #getLanguageProductLine()
	 * @generated
	 */
	EReference getLanguageProductLine_FunctionalVariability();

	/**
	 * Returns the meta object for the containment reference '{@link vm.LanguageProductLine#getSemanticalVariability <em>Semantical Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantical Variability</em>'.
	 * @see vm.LanguageProductLine#getSemanticalVariability()
	 * @see #getLanguageProductLine()
	 * @generated
	 */
	EReference getLanguageProductLine_SemanticalVariability();

	/**
	 * Returns the meta object for class '{@link vm.LanguageFeatureModel <em>Language Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Feature Model</em>'.
	 * @see vm.LanguageFeatureModel
	 * @generated
	 */
	EClass getLanguageFeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link vm.LanguageFeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see vm.LanguageFeatureModel#getRootFeature()
	 * @see #getLanguageFeatureModel()
	 * @generated
	 */
	EReference getLanguageFeatureModel_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.LanguageFeatureModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see vm.LanguageFeatureModel#getConstraints()
	 * @see #getLanguageFeatureModel()
	 * @generated
	 */
	EReference getLanguageFeatureModel_Constraints();

	/**
	 * Returns the meta object for class '{@link vm.LanguageFeature <em>Language Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Feature</em>'.
	 * @see vm.LanguageFeature
	 * @generated
	 */
	EClass getLanguageFeature();

	/**
	 * Returns the meta object for the attribute '{@link vm.LanguageFeature#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see vm.LanguageFeature#isMandatory()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EAttribute getLanguageFeature_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.LanguageFeature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see vm.LanguageFeature#getChildren()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_Children();

	/**
	 * Returns the meta object for the container reference '{@link vm.LanguageFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see vm.LanguageFeature#getParent()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.LanguageFeature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see vm.LanguageFeature#getGroups()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_Groups();

	/**
	 * Returns the meta object for the reference '{@link vm.LanguageFeature#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Group</em>'.
	 * @see vm.LanguageFeature#getParentGroup()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_ParentGroup();

	/**
	 * Returns the meta object for the reference '{@link vm.LanguageFeature#getImplementationModule <em>Implementation Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Module</em>'.
	 * @see vm.LanguageFeature#getImplementationModule()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_ImplementationModule();

	/**
	 * Returns the meta object for the attribute '{@link vm.LanguageFeature#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see vm.LanguageFeature#isSelected()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EAttribute getLanguageFeature_Selected();

	/**
	 * Returns the meta object for the reference '{@link vm.LanguageFeature#getSemanticVariationPoint <em>Semantic Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semantic Variation Point</em>'.
	 * @see vm.LanguageFeature#getSemanticVariationPoint()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_SemanticVariationPoint();

	/**
	 * Returns the meta object for class '{@link vm.LanguageFeatureGroup <em>Language Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Feature Group</em>'.
	 * @see vm.LanguageFeatureGroup
	 * @generated
	 */
	EClass getLanguageFeatureGroup();

	/**
	 * Returns the meta object for the reference list '{@link vm.LanguageFeatureGroup#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see vm.LanguageFeatureGroup#getFeatures()
	 * @see #getLanguageFeatureGroup()
	 * @generated
	 */
	EReference getLanguageFeatureGroup_Features();

	/**
	 * Returns the meta object for the containment reference '{@link vm.LanguageFeatureGroup#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see vm.LanguageFeatureGroup#getCardinality()
	 * @see #getLanguageFeatureGroup()
	 * @generated
	 */
	EReference getLanguageFeatureGroup_Cardinality();

	/**
	 * Returns the meta object for class '{@link vm.LanguageFeatureGroupCardinality <em>Language Feature Group Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Feature Group Cardinality</em>'.
	 * @see vm.LanguageFeatureGroupCardinality
	 * @generated
	 */
	EClass getLanguageFeatureGroupCardinality();

	/**
	 * Returns the meta object for the attribute '{@link vm.LanguageFeatureGroupCardinality#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see vm.LanguageFeatureGroupCardinality#getLowerBound()
	 * @see #getLanguageFeatureGroupCardinality()
	 * @generated
	 */
	EAttribute getLanguageFeatureGroupCardinality_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link vm.LanguageFeatureGroupCardinality#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see vm.LanguageFeatureGroupCardinality#getUpperBound()
	 * @see #getLanguageFeatureGroupCardinality()
	 * @generated
	 */
	EAttribute getLanguageFeatureGroupCardinality_UpperBound();

	/**
	 * Returns the meta object for class '{@link vm.LanguageConstraint <em>Language Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Constraint</em>'.
	 * @see vm.LanguageConstraint
	 * @generated
	 */
	EClass getLanguageConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link vm.LanguageConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see vm.LanguageConstraint#getExpression()
	 * @see #getLanguageConstraint()
	 * @generated
	 */
	EReference getLanguageConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link vm.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see vm.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link vm.LanguageFeatureRef <em>Language Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Feature Ref</em>'.
	 * @see vm.LanguageFeatureRef
	 * @generated
	 */
	EClass getLanguageFeatureRef();

	/**
	 * Returns the meta object for the reference '{@link vm.LanguageFeatureRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see vm.LanguageFeatureRef#getRef()
	 * @see #getLanguageFeatureRef()
	 * @generated
	 */
	EReference getLanguageFeatureRef_Ref();

	/**
	 * Returns the meta object for class '{@link vm.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see vm.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link vm.UnaryExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see vm.UnaryExpression#getExpr()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expr();

	/**
	 * Returns the meta object for the attribute '{@link vm.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see vm.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link vm.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see vm.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link vm.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see vm.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link vm.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see vm.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link vm.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see vm.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link vm.OrthogonalVariabilityModel <em>Orthogonal Variability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orthogonal Variability Model</em>'.
	 * @see vm.OrthogonalVariabilityModel
	 * @generated
	 */
	EClass getOrthogonalVariabilityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.OrthogonalVariabilityModel#getSemanticVariationPoints <em>Semantic Variation Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Variation Points</em>'.
	 * @see vm.OrthogonalVariabilityModel#getSemanticVariationPoints()
	 * @see #getOrthogonalVariabilityModel()
	 * @generated
	 */
	EReference getOrthogonalVariabilityModel_SemanticVariationPoints();

	/**
	 * Returns the meta object for class '{@link vm.SemanticVariationPoint <em>Semantic Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Variation Point</em>'.
	 * @see vm.SemanticVariationPoint
	 * @generated
	 */
	EClass getSemanticVariationPoint();

	/**
	 * Returns the meta object for the reference '{@link vm.SemanticVariationPoint#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see vm.SemanticVariationPoint#getFeature()
	 * @see #getSemanticVariationPoint()
	 * @generated
	 */
	EReference getSemanticVariationPoint_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.SemanticVariationPoint#getInterpretations <em>Interpretations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interpretations</em>'.
	 * @see vm.SemanticVariationPoint#getInterpretations()
	 * @see #getSemanticVariationPoint()
	 * @generated
	 */
	EReference getSemanticVariationPoint_Interpretations();

	/**
	 * Returns the meta object for class '{@link vm.SemanticInterpretation <em>Semantic Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Interpretation</em>'.
	 * @see vm.SemanticInterpretation
	 * @generated
	 */
	EClass getSemanticInterpretation();

	/**
	 * Returns the meta object for the reference '{@link vm.SemanticInterpretation#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see vm.SemanticInterpretation#getImplementation()
	 * @see #getSemanticInterpretation()
	 * @generated
	 */
	EReference getSemanticInterpretation_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link vm.SemanticInterpretation#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see vm.SemanticInterpretation#isSelected()
	 * @see #getSemanticInterpretation()
	 * @generated
	 */
	EAttribute getSemanticInterpretation_Selected();

	/**
	 * Returns the meta object for enum '{@link vm.UninaryOperator <em>Uninary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uninary Operator</em>'.
	 * @see vm.UninaryOperator
	 * @generated
	 */
	EEnum getUninaryOperator();

	/**
	 * Returns the meta object for enum '{@link vm.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see vm.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmFactory getVmFactory();

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
		 * The meta object literal for the '{@link vm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.NamedElementImpl
		 * @see vm.impl.VmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link vm.impl.LanguageProductLineImpl <em>Language Product Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.LanguageProductLineImpl
		 * @see vm.impl.VmPackageImpl#getLanguageProductLine()
		 * @generated
		 */
		EClass LANGUAGE_PRODUCT_LINE = eINSTANCE.getLanguageProductLine();

		/**
		 * The meta object literal for the '<em><b>Functional Variability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_PRODUCT_LINE__FUNCTIONAL_VARIABILITY = eINSTANCE.getLanguageProductLine_FunctionalVariability();

		/**
		 * The meta object literal for the '<em><b>Semantical Variability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_PRODUCT_LINE__SEMANTICAL_VARIABILITY = eINSTANCE.getLanguageProductLine_SemanticalVariability();

		/**
		 * The meta object literal for the '{@link vm.impl.LanguageFeatureModelImpl <em>Language Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.LanguageFeatureModelImpl
		 * @see vm.impl.VmPackageImpl#getLanguageFeatureModel()
		 * @generated
		 */
		EClass LANGUAGE_FEATURE_MODEL = eINSTANCE.getLanguageFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE_MODEL__ROOT_FEATURE = eINSTANCE.getLanguageFeatureModel_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE_MODEL__CONSTRAINTS = eINSTANCE.getLanguageFeatureModel_Constraints();

		/**
		 * The meta object literal for the '{@link vm.impl.LanguageFeatureImpl <em>Language Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.LanguageFeatureImpl
		 * @see vm.impl.VmPackageImpl#getLanguageFeature()
		 * @generated
		 */
		EClass LANGUAGE_FEATURE = eINSTANCE.getLanguageFeature();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_FEATURE__MANDATORY = eINSTANCE.getLanguageFeature_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__CHILDREN = eINSTANCE.getLanguageFeature_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__PARENT = eINSTANCE.getLanguageFeature_Parent();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__GROUPS = eINSTANCE.getLanguageFeature_Groups();

		/**
		 * The meta object literal for the '<em><b>Parent Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__PARENT_GROUP = eINSTANCE.getLanguageFeature_ParentGroup();

		/**
		 * The meta object literal for the '<em><b>Implementation Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__IMPLEMENTATION_MODULE = eINSTANCE.getLanguageFeature_ImplementationModule();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_FEATURE__SELECTED = eINSTANCE.getLanguageFeature_Selected();

		/**
		 * The meta object literal for the '<em><b>Semantic Variation Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__SEMANTIC_VARIATION_POINT = eINSTANCE.getLanguageFeature_SemanticVariationPoint();

		/**
		 * The meta object literal for the '{@link vm.impl.LanguageFeatureGroupImpl <em>Language Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.LanguageFeatureGroupImpl
		 * @see vm.impl.VmPackageImpl#getLanguageFeatureGroup()
		 * @generated
		 */
		EClass LANGUAGE_FEATURE_GROUP = eINSTANCE.getLanguageFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE_GROUP__FEATURES = eINSTANCE.getLanguageFeatureGroup_Features();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE_GROUP__CARDINALITY = eINSTANCE.getLanguageFeatureGroup_Cardinality();

		/**
		 * The meta object literal for the '{@link vm.impl.LanguageFeatureGroupCardinalityImpl <em>Language Feature Group Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.LanguageFeatureGroupCardinalityImpl
		 * @see vm.impl.VmPackageImpl#getLanguageFeatureGroupCardinality()
		 * @generated
		 */
		EClass LANGUAGE_FEATURE_GROUP_CARDINALITY = eINSTANCE.getLanguageFeatureGroupCardinality();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_FEATURE_GROUP_CARDINALITY__LOWER_BOUND = eINSTANCE.getLanguageFeatureGroupCardinality_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_FEATURE_GROUP_CARDINALITY__UPPER_BOUND = eINSTANCE.getLanguageFeatureGroupCardinality_UpperBound();

		/**
		 * The meta object literal for the '{@link vm.impl.LanguageConstraintImpl <em>Language Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.LanguageConstraintImpl
		 * @see vm.impl.VmPackageImpl#getLanguageConstraint()
		 * @generated
		 */
		EClass LANGUAGE_CONSTRAINT = eINSTANCE.getLanguageConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_CONSTRAINT__EXPRESSION = eINSTANCE.getLanguageConstraint_Expression();

		/**
		 * The meta object literal for the '{@link vm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.BooleanExpressionImpl
		 * @see vm.impl.VmPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link vm.impl.LanguageFeatureRefImpl <em>Language Feature Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.LanguageFeatureRefImpl
		 * @see vm.impl.VmPackageImpl#getLanguageFeatureRef()
		 * @generated
		 */
		EClass LANGUAGE_FEATURE_REF = eINSTANCE.getLanguageFeatureRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE_REF__REF = eINSTANCE.getLanguageFeatureRef_Ref();

		/**
		 * The meta object literal for the '{@link vm.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.UnaryExpressionImpl
		 * @see vm.impl.VmPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getUnaryExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link vm.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.BinaryExpressionImpl
		 * @see vm.impl.VmPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link vm.impl.OrthogonalVariabilityModelImpl <em>Orthogonal Variability Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.OrthogonalVariabilityModelImpl
		 * @see vm.impl.VmPackageImpl#getOrthogonalVariabilityModel()
		 * @generated
		 */
		EClass ORTHOGONAL_VARIABILITY_MODEL = eINSTANCE.getOrthogonalVariabilityModel();

		/**
		 * The meta object literal for the '<em><b>Semantic Variation Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORTHOGONAL_VARIABILITY_MODEL__SEMANTIC_VARIATION_POINTS = eINSTANCE.getOrthogonalVariabilityModel_SemanticVariationPoints();

		/**
		 * The meta object literal for the '{@link vm.impl.SemanticVariationPointImpl <em>Semantic Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.SemanticVariationPointImpl
		 * @see vm.impl.VmPackageImpl#getSemanticVariationPoint()
		 * @generated
		 */
		EClass SEMANTIC_VARIATION_POINT = eINSTANCE.getSemanticVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VARIATION_POINT__FEATURE = eINSTANCE.getSemanticVariationPoint_Feature();

		/**
		 * The meta object literal for the '<em><b>Interpretations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_VARIATION_POINT__INTERPRETATIONS = eINSTANCE.getSemanticVariationPoint_Interpretations();

		/**
		 * The meta object literal for the '{@link vm.impl.SemanticInterpretationImpl <em>Semantic Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.SemanticInterpretationImpl
		 * @see vm.impl.VmPackageImpl#getSemanticInterpretation()
		 * @generated
		 */
		EClass SEMANTIC_INTERPRETATION = eINSTANCE.getSemanticInterpretation();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_INTERPRETATION__IMPLEMENTATION = eINSTANCE.getSemanticInterpretation_Implementation();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_INTERPRETATION__SELECTED = eINSTANCE.getSemanticInterpretation_Selected();

		/**
		 * The meta object literal for the '{@link vm.UninaryOperator <em>Uninary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.UninaryOperator
		 * @see vm.impl.VmPackageImpl#getUninaryOperator()
		 * @generated
		 */
		EEnum UNINARY_OPERATOR = eINSTANCE.getUninaryOperator();

		/**
		 * The meta object literal for the '{@link vm.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.BinaryOperator
		 * @see vm.impl.VmPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //VmPackage
