/**
 */
package ConstraintModule;

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
 * @see ConstraintModule.ConstraintModuleFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConstraintModule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ConstraintModule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ConstraintModule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintModulePackage eINSTANCE = ConstraintModule.impl.ConstraintModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.ConstraintImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

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
	 * The meta object id for the '{@link ConstraintModule.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.RelationalConstraintImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getRelationalConstraint()
	 * @generated
	 */
	int RELATIONAL_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.ExpressionImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ConstraintModule.impl.VarReferenceImpl <em>Var Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintModule.impl.VarReferenceImpl
	 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getVarReference()
	 * @generated
	 */
	int VAR_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE__KEY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ConstraintModule.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ConstraintModule.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.RelationalConstraint <em>Relational Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Constraint</em>'.
	 * @see ConstraintModule.RelationalConstraint
	 * @generated
	 */
	EClass getRelationalConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ConstraintModule.RelationalConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ConstraintModule.RelationalConstraint#getExpression()
	 * @see #getRelationalConstraint()
	 * @generated
	 */
	EReference getRelationalConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.VarReference <em>Var Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Reference</em>'.
	 * @see ConstraintModule.VarReference
	 * @generated
	 */
	EClass getVarReference();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintModule.VarReference#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ConstraintModule.VarReference#getKey()
	 * @see #getVarReference()
	 * @generated
	 */
	EAttribute getVarReference_Key();

	/**
	 * Returns the meta object for class '{@link ConstraintModule.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ConstraintModule.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintModuleFactory getConstraintModuleFactory();

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
		 * The meta object literal for the '{@link ConstraintModule.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.ConstraintImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.RelationalConstraintImpl <em>Relational Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.RelationalConstraintImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getRelationalConstraint()
		 * @generated
		 */
		EClass RELATIONAL_CONSTRAINT = eINSTANCE.getRelationalConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONSTRAINT__EXPRESSION = eINSTANCE.getRelationalConstraint_Expression();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.VarReferenceImpl <em>Var Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.VarReferenceImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getVarReference()
		 * @generated
		 */
		EClass VAR_REFERENCE = eINSTANCE.getVarReference();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REFERENCE__KEY = eINSTANCE.getVarReference_Key();

		/**
		 * The meta object literal for the '{@link ConstraintModule.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintModule.impl.ExpressionImpl
		 * @see ConstraintModule.impl.ConstraintModulePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

	}

} //ConstraintModulePackage
