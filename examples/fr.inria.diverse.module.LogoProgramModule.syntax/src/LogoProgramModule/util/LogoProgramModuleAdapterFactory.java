/**
 */
package LogoProgramModule.util;

import LogoProgramModule.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LogoProgramModule.LogoProgramModulePackage
 * @generated
 */
public class LogoProgramModuleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogoProgramModulePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoProgramModuleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogoProgramModulePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogoProgramModuleSwitch<Adapter> modelSwitch =
		new LogoProgramModuleSwitch<Adapter>() {
			@Override
			public Adapter caseLogoProgram(LogoProgram object) {
				return createLogoProgramAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter casePrimitive(Primitive object) {
				return createPrimitiveAdapter();
			}
			@Override
			public Adapter caseBack(Back object) {
				return createBackAdapter();
			}
			@Override
			public Adapter caseForward(Forward object) {
				return createForwardAdapter();
			}
			@Override
			public Adapter caseLeft(Left object) {
				return createLeftAdapter();
			}
			@Override
			public Adapter caseRight(Right object) {
				return createRightAdapter();
			}
			@Override
			public Adapter casePenDown(PenDown object) {
				return createPenDownAdapter();
			}
			@Override
			public Adapter casePenUp(PenUp object) {
				return createPenUpAdapter();
			}
			@Override
			public Adapter caseClear(Clear object) {
				return createClearAdapter();
			}
			@Override
			public Adapter caseProcCall(ProcCall object) {
				return createProcCallAdapter();
			}
			@Override
			public Adapter caseProcDeclaration(ProcDeclaration object) {
				return createProcDeclarationAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseControlStructure(ControlStructure object) {
				return createControlStructureAdapter();
			}
			@Override
			public Adapter caseRepeat(Repeat object) {
				return createRepeatAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterCall(ParameterCall object) {
				return createParameterCallAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.LogoProgram <em>Logo Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.LogoProgram
	 * @generated
	 */
	public Adapter createLogoProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Primitive
	 * @generated
	 */
	public Adapter createPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Back
	 * @generated
	 */
	public Adapter createBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Forward
	 * @generated
	 */
	public Adapter createForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Left
	 * @generated
	 */
	public Adapter createLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Right
	 * @generated
	 */
	public Adapter createRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.PenDown
	 * @generated
	 */
	public Adapter createPenDownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.PenUp
	 * @generated
	 */
	public Adapter createPenUpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Clear
	 * @generated
	 */
	public Adapter createClearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.ProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.ProcCall
	 * @generated
	 */
	public Adapter createProcCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.ProcDeclaration <em>Proc Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.ProcDeclaration
	 * @generated
	 */
	public Adapter createProcDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.ControlStructure
	 * @generated
	 */
	public Adapter createControlStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.ParameterCall
	 * @generated
	 */
	public Adapter createParameterCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LogoProgramModule.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LogoProgramModule.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogoProgramModuleAdapterFactory
