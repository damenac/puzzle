/**
 */
package ConstraintModule.impl;

import ConstraintModule.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ConstraintModuleFactoryImpl extends EFactoryImpl implements ConstraintModuleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintModuleFactory init() {
		try {
			ConstraintModuleFactory theConstraintModuleFactory = (ConstraintModuleFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintModulePackage.eNS_URI);
			if (theConstraintModuleFactory != null) {
				return theConstraintModuleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstraintModuleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintModuleFactoryImpl() {
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
			case ConstraintModulePackage.RELATIONAL_CONSTRAINT: return createRelationalConstraint();
			case ConstraintModulePackage.INTEGER_LIT: return createIntegerLit();
			case ConstraintModulePackage.STRING_LIT: return createStringLit();
			case ConstraintModulePackage.BOOL_LIT: return createBoolLit();
			case ConstraintModulePackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
			case ConstraintModulePackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case ConstraintModulePackage.VAR_REFERENCE: return createVarReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConstraintModulePackage.ARITHMETIC_OPERATOR:
				return createArithmeticOperatorFromString(eDataType, initialValue);
			case ConstraintModulePackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConstraintModulePackage.ARITHMETIC_OPERATOR:
				return convertArithmeticOperatorToString(eDataType, instanceValue);
			case ConstraintModulePackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalConstraint createRelationalConstraint() {
		RelationalConstraintImpl relationalConstraint = new RelationalConstraintImpl();
		return relationalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLit createIntegerLit() {
		IntegerLitImpl integerLit = new IntegerLitImpl();
		return integerLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLit createStringLit() {
		StringLitImpl stringLit = new StringLitImpl();
		return stringLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolLit createBoolLit() {
		BoolLitImpl boolLit = new BoolLitImpl();
		return boolLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarReference createVarReference() {
		VarReferenceImpl varReference = new VarReferenceImpl();
		return varReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintModulePackage getConstraintModulePackage() {
		return (ConstraintModulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstraintModulePackage getPackage() {
		return ConstraintModulePackage.eINSTANCE;
	}

} //ConstraintModuleFactoryImpl
