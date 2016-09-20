/**
 */
package simpleconstraints.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleconstraints.Constraint;
import simpleconstraints.OperationKind;
import simpleconstraints.Program;
import simpleconstraints.Real;
import simpleconstraints.RelationalExpression;
import simpleconstraints.SimpleconstraintsFactory;
import simpleconstraints.SimpleconstraintsPackage;
import simpleconstraints.StmtBlock;
import simpleconstraints.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleconstraintsFactoryImpl extends EFactoryImpl implements SimpleconstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleconstraintsFactory init() {
		try {
			SimpleconstraintsFactory theSimpleconstraintsFactory = (SimpleconstraintsFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleconstraintsPackage.eNS_URI);
			if (theSimpleconstraintsFactory != null) {
				return theSimpleconstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleconstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintsFactoryImpl() {
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
			case SimpleconstraintsPackage.PROGRAM: return createProgram();
			case SimpleconstraintsPackage.CONSTRAINT: return createConstraint();
			case SimpleconstraintsPackage.VARIABLE: return createVariable();
			case SimpleconstraintsPackage.INTEGER: return createInteger();
			case SimpleconstraintsPackage.BOOLEAN: return createBoolean();
			case SimpleconstraintsPackage.STRING: return createString();
			case SimpleconstraintsPackage.REAL: return createReal();
			case SimpleconstraintsPackage.STMT_BLOCK: return createStmtBlock();
			case SimpleconstraintsPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
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
			case SimpleconstraintsPackage.OPERATION_KIND:
				return createOperationKindFromString(eDataType, initialValue);
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
			case SimpleconstraintsPackage.OPERATION_KIND:
				return convertOperationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
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
	public simpleconstraints.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simpleconstraints.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simpleconstraints.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StmtBlock createStmtBlock() {
		StmtBlockImpl stmtBlock = new StmtBlockImpl();
		return stmtBlock;
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
	public OperationKind createOperationKindFromString(EDataType eDataType, String initialValue) {
		OperationKind result = OperationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintsPackage getSimpleconstraintsPackage() {
		return (SimpleconstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleconstraintsPackage getPackage() {
		return SimpleconstraintsPackage.eINSTANCE;
	}

} //SimpleconstraintsFactoryImpl
