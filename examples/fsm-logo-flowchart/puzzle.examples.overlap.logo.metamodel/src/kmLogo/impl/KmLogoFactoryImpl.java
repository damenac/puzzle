/**
 */
package kmLogo.impl;

import kmLogo.*;

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
public class KmLogoFactoryImpl extends EFactoryImpl implements KmLogoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KmLogoFactory init() {
		try {
			KmLogoFactory theKmLogoFactory = (KmLogoFactory)EPackage.Registry.INSTANCE.getEFactory(KmLogoPackage.eNS_URI);
			if (theKmLogoFactory != null) {
				return theKmLogoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KmLogoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmLogoFactoryImpl() {
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
			case KmLogoPackage.LOGO_PROGRAM: return createLogoProgram();
			case KmLogoPackage.BACK: return createBack();
			case KmLogoPackage.FORWARD: return createForward();
			case KmLogoPackage.LEFT: return createLeft();
			case KmLogoPackage.RIGHT: return createRight();
			case KmLogoPackage.PEN_DOWN: return createPenDown();
			case KmLogoPackage.PEN_UP: return createPenUp();
			case KmLogoPackage.CLEAR: return createClear();
			case KmLogoPackage.LITERAL: return createLiteral();
			case KmLogoPackage.INTEGER_LIT: return createIntegerLit();
			case KmLogoPackage.STRING_LIT: return createStringLit();
			case KmLogoPackage.BOOL_LIT: return createBoolLit();
			case KmLogoPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
			case KmLogoPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case KmLogoPackage.VAR_REFERENCE: return createVarReference();
			case KmLogoPackage.VAR_DECLARATION: return createVarDeclaration();
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
			case KmLogoPackage.ARITHMETIC_OPERATOR:
				return createArithmeticOperatorFromString(eDataType, initialValue);
			case KmLogoPackage.RELATIONAL_OPERATOR:
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
			case KmLogoPackage.ARITHMETIC_OPERATOR:
				return convertArithmeticOperatorToString(eDataType, instanceValue);
			case KmLogoPackage.RELATIONAL_OPERATOR:
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
	public LogoProgram createLogoProgram() {
		LogoProgramImpl logoProgram = new LogoProgramImpl();
		return logoProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Back createBack() {
		BackImpl back = new BackImpl();
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenDown createPenDown() {
		PenDownImpl penDown = new PenDownImpl();
		return penDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenUp createPenUp() {
		PenUpImpl penUp = new PenUpImpl();
		return penUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clear createClear() {
		ClearImpl clear = new ClearImpl();
		return clear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
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
	public VarDeclaration createVarDeclaration() {
		VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
		return varDeclaration;
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
	public KmLogoPackage getKmLogoPackage() {
		return (KmLogoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KmLogoPackage getPackage() {
		return KmLogoPackage.eINSTANCE;
	}

} //KmLogoFactoryImpl
