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
	 * The meta object id for the '{@link vm.impl.PFeatureModelImpl <em>PFeature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PFeatureModelImpl
	 * @see vm.impl.VmPackageImpl#getPFeatureModel()
	 * @generated
	 */
	int PFEATURE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_MODEL__NAME = PNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_MODEL__ROOT_FEATURE = PNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_MODEL__CONSTRAINTS = PNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PFeature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_MODEL_FEATURE_COUNT = PNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PFeature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_MODEL_OPERATION_COUNT = PNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.PFeatureImpl <em>PFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PFeatureImpl
	 * @see vm.impl.VmPackageImpl#getPFeature()
	 * @generated
	 */
	int PFEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__NAME = PNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__MANDATORY = PNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__CHILDREN = PNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__PARENT = PNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE__GROUPS = PNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_FEATURE_COUNT = PNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>PFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_OPERATION_COUNT = PNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.PFeatureGroupImpl <em>PFeature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PFeatureGroupImpl
	 * @see vm.impl.VmPackageImpl#getPFeatureGroup()
	 * @generated
	 */
	int PFEATURE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_GROUP__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_GROUP__KIND = 1;

	/**
	 * The number of structural features of the '<em>PFeature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PFeature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.PConstraintImpl <em>PConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PConstraintImpl
	 * @see vm.impl.VmPackageImpl#getPConstraint()
	 * @generated
	 */
	int PCONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONSTRAINT__NAME = PNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONSTRAINT__EXPRESSION = PNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONSTRAINT_FEATURE_COUNT = PNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONSTRAINT_OPERATION_COUNT = PNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.PBooleanExpressionImpl <em>PBoolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PBooleanExpressionImpl
	 * @see vm.impl.VmPackageImpl#getPBooleanExpression()
	 * @generated
	 */
	int PBOOLEAN_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>PBoolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PBoolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vm.impl.PFeatureRefImpl <em>PFeature Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PFeatureRefImpl
	 * @see vm.impl.VmPackageImpl#getPFeatureRef()
	 * @generated
	 */
	int PFEATURE_REF = 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_REF__REF = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PFeature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_REF_FEATURE_COUNT = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PFeature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFEATURE_REF_OPERATION_COUNT = PBOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.PUnaryExpressionImpl <em>PUnary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PUnaryExpressionImpl
	 * @see vm.impl.VmPackageImpl#getPUnaryExpression()
	 * @generated
	 */
	int PUNARY_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNARY_EXPRESSION__EXPR = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNARY_EXPRESSION__OPERATOR = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PUnary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNARY_EXPRESSION_FEATURE_COUNT = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PUnary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNARY_EXPRESSION_OPERATION_COUNT = PBOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.impl.PBinaryExpressionImpl <em>PBinary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.impl.PBinaryExpressionImpl
	 * @see vm.impl.VmPackageImpl#getPBinaryExpression()
	 * @generated
	 */
	int PBINARY_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBINARY_EXPRESSION__LEFT = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBINARY_EXPRESSION__RIGHT = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBINARY_EXPRESSION__OPERATOR = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PBinary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBINARY_EXPRESSION_FEATURE_COUNT = PBOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PBinary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBINARY_EXPRESSION_OPERATION_COUNT = PBOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vm.PGroupKind <em>PGroup Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.PGroupKind
	 * @see vm.impl.VmPackageImpl#getPGroupKind()
	 * @generated
	 */
	int PGROUP_KIND = 9;

	/**
	 * The meta object id for the '{@link vm.PUninaryOperator <em>PUninary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.PUninaryOperator
	 * @see vm.impl.VmPackageImpl#getPUninaryOperator()
	 * @generated
	 */
	int PUNINARY_OPERATOR = 10;

	/**
	 * The meta object id for the '{@link vm.PBinaryOperator <em>PBinary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vm.PBinaryOperator
	 * @see vm.impl.VmPackageImpl#getPBinaryOperator()
	 * @generated
	 */
	int PBINARY_OPERATOR = 11;


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
	 * Returns the meta object for class '{@link vm.PFeatureModel <em>PFeature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PFeature Model</em>'.
	 * @see vm.PFeatureModel
	 * @generated
	 */
	EClass getPFeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link vm.PFeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see vm.PFeatureModel#getRootFeature()
	 * @see #getPFeatureModel()
	 * @generated
	 */
	EReference getPFeatureModel_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.PFeatureModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see vm.PFeatureModel#getConstraints()
	 * @see #getPFeatureModel()
	 * @generated
	 */
	EReference getPFeatureModel_Constraints();

	/**
	 * Returns the meta object for class '{@link vm.PFeature <em>PFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PFeature</em>'.
	 * @see vm.PFeature
	 * @generated
	 */
	EClass getPFeature();

	/**
	 * Returns the meta object for the attribute '{@link vm.PFeature#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see vm.PFeature#isMandatory()
	 * @see #getPFeature()
	 * @generated
	 */
	EAttribute getPFeature_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.PFeature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see vm.PFeature#getChildren()
	 * @see #getPFeature()
	 * @generated
	 */
	EReference getPFeature_Children();

	/**
	 * Returns the meta object for the container reference '{@link vm.PFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see vm.PFeature#getParent()
	 * @see #getPFeature()
	 * @generated
	 */
	EReference getPFeature_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link vm.PFeature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see vm.PFeature#getGroups()
	 * @see #getPFeature()
	 * @generated
	 */
	EReference getPFeature_Groups();

	/**
	 * Returns the meta object for class '{@link vm.PFeatureGroup <em>PFeature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PFeature Group</em>'.
	 * @see vm.PFeatureGroup
	 * @generated
	 */
	EClass getPFeatureGroup();

	/**
	 * Returns the meta object for the reference list '{@link vm.PFeatureGroup#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see vm.PFeatureGroup#getFeatures()
	 * @see #getPFeatureGroup()
	 * @generated
	 */
	EReference getPFeatureGroup_Features();

	/**
	 * Returns the meta object for the attribute '{@link vm.PFeatureGroup#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see vm.PFeatureGroup#getKind()
	 * @see #getPFeatureGroup()
	 * @generated
	 */
	EAttribute getPFeatureGroup_Kind();

	/**
	 * Returns the meta object for class '{@link vm.PConstraint <em>PConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PConstraint</em>'.
	 * @see vm.PConstraint
	 * @generated
	 */
	EClass getPConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link vm.PConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see vm.PConstraint#getExpression()
	 * @see #getPConstraint()
	 * @generated
	 */
	EReference getPConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link vm.PBooleanExpression <em>PBoolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PBoolean Expression</em>'.
	 * @see vm.PBooleanExpression
	 * @generated
	 */
	EClass getPBooleanExpression();

	/**
	 * Returns the meta object for class '{@link vm.PFeatureRef <em>PFeature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PFeature Ref</em>'.
	 * @see vm.PFeatureRef
	 * @generated
	 */
	EClass getPFeatureRef();

	/**
	 * Returns the meta object for the reference '{@link vm.PFeatureRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see vm.PFeatureRef#getRef()
	 * @see #getPFeatureRef()
	 * @generated
	 */
	EReference getPFeatureRef_Ref();

	/**
	 * Returns the meta object for class '{@link vm.PUnaryExpression <em>PUnary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PUnary Expression</em>'.
	 * @see vm.PUnaryExpression
	 * @generated
	 */
	EClass getPUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link vm.PUnaryExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see vm.PUnaryExpression#getExpr()
	 * @see #getPUnaryExpression()
	 * @generated
	 */
	EReference getPUnaryExpression_Expr();

	/**
	 * Returns the meta object for the attribute '{@link vm.PUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see vm.PUnaryExpression#getOperator()
	 * @see #getPUnaryExpression()
	 * @generated
	 */
	EAttribute getPUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link vm.PBinaryExpression <em>PBinary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PBinary Expression</em>'.
	 * @see vm.PBinaryExpression
	 * @generated
	 */
	EClass getPBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link vm.PBinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see vm.PBinaryExpression#getLeft()
	 * @see #getPBinaryExpression()
	 * @generated
	 */
	EReference getPBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link vm.PBinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see vm.PBinaryExpression#getRight()
	 * @see #getPBinaryExpression()
	 * @generated
	 */
	EReference getPBinaryExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link vm.PBinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see vm.PBinaryExpression#getOperator()
	 * @see #getPBinaryExpression()
	 * @generated
	 */
	EAttribute getPBinaryExpression_Operator();

	/**
	 * Returns the meta object for enum '{@link vm.PGroupKind <em>PGroup Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PGroup Kind</em>'.
	 * @see vm.PGroupKind
	 * @generated
	 */
	EEnum getPGroupKind();

	/**
	 * Returns the meta object for enum '{@link vm.PUninaryOperator <em>PUninary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PUninary Operator</em>'.
	 * @see vm.PUninaryOperator
	 * @generated
	 */
	EEnum getPUninaryOperator();

	/**
	 * Returns the meta object for enum '{@link vm.PBinaryOperator <em>PBinary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PBinary Operator</em>'.
	 * @see vm.PBinaryOperator
	 * @generated
	 */
	EEnum getPBinaryOperator();

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
		 * The meta object literal for the '{@link vm.impl.PFeatureModelImpl <em>PFeature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PFeatureModelImpl
		 * @see vm.impl.VmPackageImpl#getPFeatureModel()
		 * @generated
		 */
		EClass PFEATURE_MODEL = eINSTANCE.getPFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFEATURE_MODEL__ROOT_FEATURE = eINSTANCE.getPFeatureModel_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFEATURE_MODEL__CONSTRAINTS = eINSTANCE.getPFeatureModel_Constraints();

		/**
		 * The meta object literal for the '{@link vm.impl.PFeatureImpl <em>PFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PFeatureImpl
		 * @see vm.impl.VmPackageImpl#getPFeature()
		 * @generated
		 */
		EClass PFEATURE = eINSTANCE.getPFeature();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFEATURE__MANDATORY = eINSTANCE.getPFeature_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFEATURE__CHILDREN = eINSTANCE.getPFeature_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFEATURE__PARENT = eINSTANCE.getPFeature_Parent();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFEATURE__GROUPS = eINSTANCE.getPFeature_Groups();

		/**
		 * The meta object literal for the '{@link vm.impl.PFeatureGroupImpl <em>PFeature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PFeatureGroupImpl
		 * @see vm.impl.VmPackageImpl#getPFeatureGroup()
		 * @generated
		 */
		EClass PFEATURE_GROUP = eINSTANCE.getPFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFEATURE_GROUP__FEATURES = eINSTANCE.getPFeatureGroup_Features();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFEATURE_GROUP__KIND = eINSTANCE.getPFeatureGroup_Kind();

		/**
		 * The meta object literal for the '{@link vm.impl.PConstraintImpl <em>PConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PConstraintImpl
		 * @see vm.impl.VmPackageImpl#getPConstraint()
		 * @generated
		 */
		EClass PCONSTRAINT = eINSTANCE.getPConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCONSTRAINT__EXPRESSION = eINSTANCE.getPConstraint_Expression();

		/**
		 * The meta object literal for the '{@link vm.impl.PBooleanExpressionImpl <em>PBoolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PBooleanExpressionImpl
		 * @see vm.impl.VmPackageImpl#getPBooleanExpression()
		 * @generated
		 */
		EClass PBOOLEAN_EXPRESSION = eINSTANCE.getPBooleanExpression();

		/**
		 * The meta object literal for the '{@link vm.impl.PFeatureRefImpl <em>PFeature Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PFeatureRefImpl
		 * @see vm.impl.VmPackageImpl#getPFeatureRef()
		 * @generated
		 */
		EClass PFEATURE_REF = eINSTANCE.getPFeatureRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFEATURE_REF__REF = eINSTANCE.getPFeatureRef_Ref();

		/**
		 * The meta object literal for the '{@link vm.impl.PUnaryExpressionImpl <em>PUnary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PUnaryExpressionImpl
		 * @see vm.impl.VmPackageImpl#getPUnaryExpression()
		 * @generated
		 */
		EClass PUNARY_EXPRESSION = eINSTANCE.getPUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUNARY_EXPRESSION__EXPR = eINSTANCE.getPUnaryExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUNARY_EXPRESSION__OPERATOR = eINSTANCE.getPUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link vm.impl.PBinaryExpressionImpl <em>PBinary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.impl.PBinaryExpressionImpl
		 * @see vm.impl.VmPackageImpl#getPBinaryExpression()
		 * @generated
		 */
		EClass PBINARY_EXPRESSION = eINSTANCE.getPBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PBINARY_EXPRESSION__LEFT = eINSTANCE.getPBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PBINARY_EXPRESSION__RIGHT = eINSTANCE.getPBinaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBINARY_EXPRESSION__OPERATOR = eINSTANCE.getPBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link vm.PGroupKind <em>PGroup Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.PGroupKind
		 * @see vm.impl.VmPackageImpl#getPGroupKind()
		 * @generated
		 */
		EEnum PGROUP_KIND = eINSTANCE.getPGroupKind();

		/**
		 * The meta object literal for the '{@link vm.PUninaryOperator <em>PUninary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.PUninaryOperator
		 * @see vm.impl.VmPackageImpl#getPUninaryOperator()
		 * @generated
		 */
		EEnum PUNINARY_OPERATOR = eINSTANCE.getPUninaryOperator();

		/**
		 * The meta object literal for the '{@link vm.PBinaryOperator <em>PBinary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vm.PBinaryOperator
		 * @see vm.impl.VmPackageImpl#getPBinaryOperator()
		 * @generated
		 */
		EEnum PBINARY_OPERATOR = eINSTANCE.getPBinaryOperator();

	}

} //VmPackage
