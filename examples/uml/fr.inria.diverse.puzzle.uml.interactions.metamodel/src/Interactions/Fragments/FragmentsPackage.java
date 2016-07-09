/**
 */
package Interactions.Fragments;

import Interactions.BasicInteractions.BasicInteractionsPackage;

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
 * @see Interactions.Fragments.FragmentsFactory
 * @model kind="package"
 * @generated
 */
public interface FragmentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Fragments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/Interactions/Fragments";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Fragments";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FragmentsPackage eINSTANCE = Interactions.Fragments.impl.FragmentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.NamespaceImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 1;

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
	 * The meta object id for the '{@link Interactions.Fragments.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.InteractionOperandImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionOperand()
	 * @generated
	 */
	int INTERACTION_OPERAND = 0;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__FRAGMENT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__GUARD = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.CombinedFragmentImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 2;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OPERAND = 0;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__INTERACTION_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__CFRAGMENT_GATE = 2;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.ConsiderIgnoreFragmentImpl <em>Consider Ignore Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.ConsiderIgnoreFragmentImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getConsiderIgnoreFragment()
	 * @generated
	 */
	int CONSIDER_IGNORE_FRAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__OPERAND = COMBINED_FRAGMENT__OPERAND;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR = COMBINED_FRAGMENT__INTERACTION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE = COMBINED_FRAGMENT__CFRAGMENT_GATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__MESSAGE = COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consider Ignore Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT_FEATURE_COUNT = COMBINED_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Consider Ignore Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT_OPERATION_COUNT = COMBINED_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.ContinuationImpl <em>Continuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.ContinuationImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getContinuation()
	 * @generated
	 */
	int CONTINUATION = 4;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__COVERED = BasicInteractionsPackage.INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__GENERAL_ORDERING = BasicInteractionsPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__ENCLOSING_OPERAND = BasicInteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Setting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__SETTING = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_FEATURE_COUNT = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_OPERATION_COUNT = BasicInteractionsPackage.INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.InteractionConstraintImpl <em>Interaction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.InteractionConstraintImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionConstraint()
	 * @generated
	 */
	int INTERACTION_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__MAXINT = BasicInteractionsPackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__MININT = BasicInteractionsPackage.CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT_FEATURE_COUNT = BasicInteractionsPackage.CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT_OPERATION_COUNT = BasicInteractionsPackage.CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.GateImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 6;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__MESSAGE = BasicInteractionsPackage.MESSAGE_END__MESSAGE;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = BasicInteractionsPackage.MESSAGE_END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = BasicInteractionsPackage.MESSAGE_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.InteractionUseImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionUse()
	 * @generated
	 */
	int INTERACTION_USE = 7;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__COVERED = BasicInteractionsPackage.INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__GENERAL_ORDERING = BasicInteractionsPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ENCLOSING_OPERAND = BasicInteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ACTUAL_GATE = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ARGUMENT = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__RETURN_VALUE = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__RETURN_VALUE_RECIPIENT = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__REFERS_TO = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_FEATURE_COUNT = BasicInteractionsPackage.INTERACTION_FRAGMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_OPERATION_COUNT = BasicInteractionsPackage.INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.PropertyImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.impl.PartDecompositionImpl <em>Part Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.impl.PartDecompositionImpl
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getPartDecomposition()
	 * @generated
	 */
	int PART_DECOMPOSITION = 9;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__COVERED = INTERACTION_USE__COVERED;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__GENERAL_ORDERING = INTERACTION_USE__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ENCLOSING_OPERAND = INTERACTION_USE__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ACTUAL_GATE = INTERACTION_USE__ACTUAL_GATE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ARGUMENT = INTERACTION_USE__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__RETURN_VALUE = INTERACTION_USE__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__RETURN_VALUE_RECIPIENT = INTERACTION_USE__RETURN_VALUE_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__REFERS_TO = INTERACTION_USE__REFERS_TO;

	/**
	 * The number of structural features of the '<em>Part Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION_FEATURE_COUNT = INTERACTION_USE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Part Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION_OPERATION_COUNT = INTERACTION_USE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Interactions.Fragments.InteractionOperandKind <em>Interaction Operand Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Interactions.Fragments.InteractionOperandKind
	 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionOperandKind()
	 * @generated
	 */
	int INTERACTION_OPERAND_KIND = 10;


	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Operand</em>'.
	 * @see Interactions.Fragments.InteractionOperand
	 * @generated
	 */
	EClass getInteractionOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.Fragments.InteractionOperand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragment</em>'.
	 * @see Interactions.Fragments.InteractionOperand#getFragment()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_Fragment();

	/**
	 * Returns the meta object for the containment reference '{@link Interactions.Fragments.InteractionOperand#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see Interactions.Fragments.InteractionOperand#getGuard()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_Guard();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see Interactions.Fragments.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see Interactions.Fragments.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for the containment reference '{@link Interactions.Fragments.CombinedFragment#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see Interactions.Fragments.CombinedFragment#getOperand()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_Operand();

	/**
	 * Returns the meta object for the attribute '{@link Interactions.Fragments.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Operator</em>'.
	 * @see Interactions.Fragments.CombinedFragment#getInteractionOperator()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_InteractionOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.Fragments.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cfragment Gate</em>'.
	 * @see Interactions.Fragments.CombinedFragment#getCfragmentGate()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_CfragmentGate();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.ConsiderIgnoreFragment <em>Consider Ignore Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consider Ignore Fragment</em>'.
	 * @see Interactions.Fragments.ConsiderIgnoreFragment
	 * @generated
	 */
	EClass getConsiderIgnoreFragment();

	/**
	 * Returns the meta object for the reference list '{@link Interactions.Fragments.ConsiderIgnoreFragment#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see Interactions.Fragments.ConsiderIgnoreFragment#getMessage()
	 * @see #getConsiderIgnoreFragment()
	 * @generated
	 */
	EReference getConsiderIgnoreFragment_Message();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuation</em>'.
	 * @see Interactions.Fragments.Continuation
	 * @generated
	 */
	EClass getContinuation();

	/**
	 * Returns the meta object for the attribute '{@link Interactions.Fragments.Continuation#isSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setting</em>'.
	 * @see Interactions.Fragments.Continuation#isSetting()
	 * @see #getContinuation()
	 * @generated
	 */
	EAttribute getContinuation_Setting();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.InteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Constraint</em>'.
	 * @see Interactions.Fragments.InteractionConstraint
	 * @generated
	 */
	EClass getInteractionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link Interactions.Fragments.InteractionConstraint#getMaxint <em>Maxint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maxint</em>'.
	 * @see Interactions.Fragments.InteractionConstraint#getMaxint()
	 * @see #getInteractionConstraint()
	 * @generated
	 */
	EReference getInteractionConstraint_Maxint();

	/**
	 * Returns the meta object for the containment reference '{@link Interactions.Fragments.InteractionConstraint#getMinint <em>Minint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minint</em>'.
	 * @see Interactions.Fragments.InteractionConstraint#getMinint()
	 * @see #getInteractionConstraint()
	 * @generated
	 */
	EReference getInteractionConstraint_Minint();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see Interactions.Fragments.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.InteractionUse <em>Interaction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Use</em>'.
	 * @see Interactions.Fragments.InteractionUse
	 * @generated
	 */
	EClass getInteractionUse();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.Fragments.InteractionUse#getActualGate <em>Actual Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Gate</em>'.
	 * @see Interactions.Fragments.InteractionUse#getActualGate()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ActualGate();

	/**
	 * Returns the meta object for the containment reference list '{@link Interactions.Fragments.InteractionUse#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see Interactions.Fragments.InteractionUse#getArgument()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_Argument();

	/**
	 * Returns the meta object for the containment reference '{@link Interactions.Fragments.InteractionUse#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see Interactions.Fragments.InteractionUse#getReturnValue()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ReturnValue();

	/**
	 * Returns the meta object for the reference '{@link Interactions.Fragments.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value Recipient</em>'.
	 * @see Interactions.Fragments.InteractionUse#getReturnValueRecipient()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ReturnValueRecipient();

	/**
	 * Returns the meta object for the reference '{@link Interactions.Fragments.InteractionUse#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see Interactions.Fragments.InteractionUse#getRefersTo()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_RefersTo();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see Interactions.Fragments.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link Interactions.Fragments.PartDecomposition <em>Part Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Decomposition</em>'.
	 * @see Interactions.Fragments.PartDecomposition
	 * @generated
	 */
	EClass getPartDecomposition();

	/**
	 * Returns the meta object for enum '{@link Interactions.Fragments.InteractionOperandKind <em>Interaction Operand Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interaction Operand Kind</em>'.
	 * @see Interactions.Fragments.InteractionOperandKind
	 * @generated
	 */
	EEnum getInteractionOperandKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FragmentsFactory getFragmentsFactory();

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
		 * The meta object literal for the '{@link Interactions.Fragments.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.InteractionOperandImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionOperand()
		 * @generated
		 */
		EClass INTERACTION_OPERAND = eINSTANCE.getInteractionOperand();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__FRAGMENT = eINSTANCE.getInteractionOperand_Fragment();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__GUARD = eINSTANCE.getInteractionOperand_Guard();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.NamespaceImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.CombinedFragmentImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__OPERAND = eINSTANCE.getCombinedFragment_Operand();

		/**
		 * The meta object literal for the '<em><b>Interaction Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__INTERACTION_OPERATOR = eINSTANCE.getCombinedFragment_InteractionOperator();

		/**
		 * The meta object literal for the '<em><b>Cfragment Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__CFRAGMENT_GATE = eINSTANCE.getCombinedFragment_CfragmentGate();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.ConsiderIgnoreFragmentImpl <em>Consider Ignore Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.ConsiderIgnoreFragmentImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getConsiderIgnoreFragment()
		 * @generated
		 */
		EClass CONSIDER_IGNORE_FRAGMENT = eINSTANCE.getConsiderIgnoreFragment();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSIDER_IGNORE_FRAGMENT__MESSAGE = eINSTANCE.getConsiderIgnoreFragment_Message();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.ContinuationImpl <em>Continuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.ContinuationImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getContinuation()
		 * @generated
		 */
		EClass CONTINUATION = eINSTANCE.getContinuation();

		/**
		 * The meta object literal for the '<em><b>Setting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUATION__SETTING = eINSTANCE.getContinuation_Setting();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.InteractionConstraintImpl <em>Interaction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.InteractionConstraintImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionConstraint()
		 * @generated
		 */
		EClass INTERACTION_CONSTRAINT = eINSTANCE.getInteractionConstraint();

		/**
		 * The meta object literal for the '<em><b>Maxint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_CONSTRAINT__MAXINT = eINSTANCE.getInteractionConstraint_Maxint();

		/**
		 * The meta object literal for the '<em><b>Minint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_CONSTRAINT__MININT = eINSTANCE.getInteractionConstraint_Minint();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.GateImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.InteractionUseImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionUse()
		 * @generated
		 */
		EClass INTERACTION_USE = eINSTANCE.getInteractionUse();

		/**
		 * The meta object literal for the '<em><b>Actual Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__ACTUAL_GATE = eINSTANCE.getInteractionUse_ActualGate();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__ARGUMENT = eINSTANCE.getInteractionUse_Argument();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__RETURN_VALUE = eINSTANCE.getInteractionUse_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Return Value Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__RETURN_VALUE_RECIPIENT = eINSTANCE.getInteractionUse_ReturnValueRecipient();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__REFERS_TO = eINSTANCE.getInteractionUse_RefersTo();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.PropertyImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.impl.PartDecompositionImpl <em>Part Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.impl.PartDecompositionImpl
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getPartDecomposition()
		 * @generated
		 */
		EClass PART_DECOMPOSITION = eINSTANCE.getPartDecomposition();

		/**
		 * The meta object literal for the '{@link Interactions.Fragments.InteractionOperandKind <em>Interaction Operand Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Interactions.Fragments.InteractionOperandKind
		 * @see Interactions.Fragments.impl.FragmentsPackageImpl#getInteractionOperandKind()
		 * @generated
		 */
		EEnum INTERACTION_OPERAND_KIND = eINSTANCE.getInteractionOperandKind();

	}

} //FragmentsPackage
