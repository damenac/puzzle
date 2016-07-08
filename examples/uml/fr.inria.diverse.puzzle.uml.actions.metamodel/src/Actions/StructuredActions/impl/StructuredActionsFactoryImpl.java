/**
 */
package Actions.StructuredActions.impl;

import Actions.StructuredActions.*;

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
public class StructuredActionsFactoryImpl extends EFactoryImpl implements StructuredActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuredActionsFactory init() {
		try {
			StructuredActionsFactory theStructuredActionsFactory = (StructuredActionsFactory)EPackage.Registry.INSTANCE.getEFactory(StructuredActionsPackage.eNS_URI);
			if (theStructuredActionsFactory != null) {
				return theStructuredActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuredActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActionsFactoryImpl() {
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
			case StructuredActionsPackage.VARIABLE: return createVariable();
			case StructuredActionsPackage.READ_VARIABLE_ACTION: return createReadVariableAction();
			case StructuredActionsPackage.WRITE_VARIABLE_ACTION: return createWriteVariableAction();
			case StructuredActionsPackage.ADD_VARIABLE_VALUE_ACTION: return createAddVariableValueAction();
			case StructuredActionsPackage.REMOVE_VARIABLE_VALUE_ACTION: return createRemoveVariableValueAction();
			case StructuredActionsPackage.CLEAR_VARIABLE_ACTION: return createClearVariableAction();
			case StructuredActionsPackage.RAISE_EXCEPTION_ACTION: return createRaiseExceptionAction();
			case StructuredActionsPackage.ACTION_INPUT_PIN: return createActionInputPin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public ReadVariableAction createReadVariableAction() {
		ReadVariableActionImpl readVariableAction = new ReadVariableActionImpl();
		return readVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteVariableAction createWriteVariableAction() {
		WriteVariableActionImpl writeVariableAction = new WriteVariableActionImpl();
		return writeVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableValueAction createAddVariableValueAction() {
		AddVariableValueActionImpl addVariableValueAction = new AddVariableValueActionImpl();
		return addVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveVariableValueAction createRemoveVariableValueAction() {
		RemoveVariableValueActionImpl removeVariableValueAction = new RemoveVariableValueActionImpl();
		return removeVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearVariableAction createClearVariableAction() {
		ClearVariableActionImpl clearVariableAction = new ClearVariableActionImpl();
		return clearVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionAction createRaiseExceptionAction() {
		RaiseExceptionActionImpl raiseExceptionAction = new RaiseExceptionActionImpl();
		return raiseExceptionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInputPin createActionInputPin() {
		ActionInputPinImpl actionInputPin = new ActionInputPinImpl();
		return actionInputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActionsPackage getStructuredActionsPackage() {
		return (StructuredActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuredActionsPackage getPackage() {
		return StructuredActionsPackage.eINSTANCE;
	}

} //StructuredActionsFactoryImpl
