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
	 * The meta object id for the '{@link vm.impl.PNamedElementImpl <em>PNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PNamedElementImpl
	 * @see vm.impl.VmPackageImpl#getPNamedElement()
	 * @generated
	 */
	int PNAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>PNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureModelImpl <em>Language Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureModelImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeatureModel()
	 * @generated
	 */
	int LANGUAGE_FEATURE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL__NAME = PNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL__ROOT_FEATURE = PNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL__CONSTRAINTS = PNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Language Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL_FEATURE_COUNT = PNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Language Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_MODEL_OPERATION_COUNT = PNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureImpl <em>Language Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeature()
	 * @generated
	 */
	int LANGUAGE_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__NAME = PNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__MANDATORY = PNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__CHILDREN = PNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__PARENT = PNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__GROUPS = PNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__PARENT_GROUP = PNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implementation Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__IMPLEMENTATION_MODULE = PNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__SELECTED = PNAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Language Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_FEATURE_COUNT = PNAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Language Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_OPERATION_COUNT = PNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.LanguageFeatureGroupImpl <em>Language Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.LanguageFeatureGroupImpl
	 * @see vm.impl.VmPackageImpl#getLanguageFeatureGroup()
	 * @generated
	 */
	int LANGUAGE_FEATURE_GROUP = 3;

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
	int LANGUAGE_FEATURE_GROUP_CARDINALITY = 4;

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
	int LANGUAGE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT__NAME = PNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT__EXPRESSION = PNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT_FEATURE_COUNT = PNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Language Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CONSTRAINT_OPERATION_COUNT = PNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.BooleanExpressionImpl
	 * @see vm.impl.VmPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 6;

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
	int LANGUAGE_FEATURE_REF = 7;

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
	int UNARY_EXPRESSION = 8;

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
	int BINARY_EXPRESSION = 9;

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
	 * The meta object id for the '{@link vm.UninaryOperator <em>Uninary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.UninaryOperator
	 * @see vm.impl.VmPackageImpl#getUninaryOperator()
	 * @generated
	 */
	int UNINARY_OPERATOR = 10;

	/**
	 * The meta object id for the '{@link vm.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.BinaryOperator
	 * @see vm.impl.VmPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 11;


	/**
	 * Returns the meta object for class '{@link vm.PNamedElement <em>PNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PNamed Element</em>'.
	 * @see vm.PNamedElement
	 * @generated
	 */
	EClass getPNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link vm.PNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vm.PNamedElement#getName()
	 * @see #getPNamedElement()
	 * @generated
	 */
	EAttribute getPNamedElement_Name();

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
		 * The meta object literal for the '{@link vm.impl.PNamedElementImpl <em>PNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PNamedElementImpl
		 * @see vm.impl.VmPackageImpl#getPNamedElement()
		 * @generated
		 */
		EClass PNAMED_ELEMENT = eINSTANCE.getPNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PNAMED_ELEMENT__NAME = eINSTANCE.getPNamedElement_Name();

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
