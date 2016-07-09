/**
 */
package Activities.CompleteStructuredActivities.impl;

import Activities.CompleteStructuredActivities.*;

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
public class CompleteStructuredActivitiesFactoryImpl extends EFactoryImpl implements CompleteStructuredActivitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompleteStructuredActivitiesFactory init() {
		try {
			CompleteStructuredActivitiesFactory theCompleteStructuredActivitiesFactory = (CompleteStructuredActivitiesFactory)EPackage.Registry.INSTANCE.getEFactory(CompleteStructuredActivitiesPackage.eNS_URI);
			if (theCompleteStructuredActivitiesFactory != null) {
				return theCompleteStructuredActivitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompleteStructuredActivitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteStructuredActivitiesFactoryImpl() {
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
			case CompleteStructuredActivitiesPackage.INPUT_PIN: return createInputPin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteStructuredActivitiesPackage getCompleteStructuredActivitiesPackage() {
		return (CompleteStructuredActivitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompleteStructuredActivitiesPackage getPackage() {
		return CompleteStructuredActivitiesPackage.eINSTANCE;
	}

} //CompleteStructuredActivitiesFactoryImpl
