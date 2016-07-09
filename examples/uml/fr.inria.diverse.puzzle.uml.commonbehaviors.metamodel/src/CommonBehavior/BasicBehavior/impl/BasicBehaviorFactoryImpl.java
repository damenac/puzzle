/**
 */
package CommonBehavior.BasicBehavior.impl;

import CommonBehavior.BasicBehavior.BasicBehaviorFactory;
import CommonBehavior.BasicBehavior.BasicBehaviorPackage;
import CommonBehavior.BasicBehavior.BehavioredClassifier;
import CommonBehavior.BasicBehavior.Constraint;
import CommonBehavior.BasicBehavior.FunctionBehavior;
import CommonBehavior.BasicBehavior.OpaqueBehavior;
import CommonBehavior.BasicBehavior.OpaqueExpression;
import CommonBehavior.BasicBehavior.Parameter;

import org.eclipse.emf.ecore.EClass;
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
public class BasicBehaviorFactoryImpl extends EFactoryImpl implements BasicBehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicBehaviorFactory init() {
		try {
			BasicBehaviorFactory theBasicBehaviorFactory = (BasicBehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(BasicBehaviorPackage.eNS_URI);
			if (theBasicBehaviorFactory != null) {
				return theBasicBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicBehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorFactoryImpl() {
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
			case BasicBehaviorPackage.BEHAVIORED_CLASSIFIER: return createBehavioredClassifier();
			case BasicBehaviorPackage.OPAQUE_BEHAVIOR: return createOpaqueBehavior();
			case BasicBehaviorPackage.FUNCTION_BEHAVIOR: return createFunctionBehavior();
			case BasicBehaviorPackage.PARAMETER: return createParameter();
			case BasicBehaviorPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
			case BasicBehaviorPackage.CONSTRAINT: return createConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier createBehavioredClassifier() {
		BehavioredClassifierImpl behavioredClassifier = new BehavioredClassifierImpl();
		return behavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior createOpaqueBehavior() {
		OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
		return opaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior createFunctionBehavior() {
		FunctionBehaviorImpl functionBehavior = new FunctionBehaviorImpl();
		return functionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
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
	public BasicBehaviorPackage getBasicBehaviorPackage() {
		return (BasicBehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicBehaviorPackage getPackage() {
		return BasicBehaviorPackage.eINSTANCE;
	}

} //BasicBehaviorFactoryImpl
