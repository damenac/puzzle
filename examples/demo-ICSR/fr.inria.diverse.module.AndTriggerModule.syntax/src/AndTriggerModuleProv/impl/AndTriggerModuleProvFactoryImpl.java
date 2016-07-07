/**
 */
package AndTriggerModuleProv.impl;

import AndTriggerModuleProv.*;

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
public class AndTriggerModuleProvFactoryImpl extends EFactoryImpl implements AndTriggerModuleProvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AndTriggerModuleProvFactory init() {
		try {
			AndTriggerModuleProvFactory theAndTriggerModuleProvFactory = (AndTriggerModuleProvFactory)EPackage.Registry.INSTANCE.getEFactory(AndTriggerModuleProvPackage.eNS_URI);
			if (theAndTriggerModuleProvFactory != null) {
				return theAndTriggerModuleProvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AndTriggerModuleProvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndTriggerModuleProvFactoryImpl() {
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
			case AndTriggerModuleProvPackage.AND_TRIGGER: return createAndTrigger();
			case AndTriggerModuleProvPackage.DEEP_HISTORY: return createDeepHistory();
			case AndTriggerModuleProvPackage.TRIGGER: return createTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndTrigger createAndTrigger() {
		AndTriggerImpl andTrigger = new AndTriggerImpl();
		return andTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeepHistory createDeepHistory() {
		DeepHistoryImpl deepHistory = new DeepHistoryImpl();
		return deepHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndTriggerModuleProvPackage getAndTriggerModuleProvPackage() {
		return (AndTriggerModuleProvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AndTriggerModuleProvPackage getPackage() {
		return AndTriggerModuleProvPackage.eINSTANCE;
	}

} //AndTriggerModuleProvFactoryImpl
