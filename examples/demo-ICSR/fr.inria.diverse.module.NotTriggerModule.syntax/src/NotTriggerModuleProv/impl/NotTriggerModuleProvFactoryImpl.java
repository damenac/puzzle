/**
 */
package NotTriggerModuleProv.impl;

import NotTriggerModuleProv.*;

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
public class NotTriggerModuleProvFactoryImpl extends EFactoryImpl implements NotTriggerModuleProvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotTriggerModuleProvFactory init() {
		try {
			NotTriggerModuleProvFactory theNotTriggerModuleProvFactory = (NotTriggerModuleProvFactory)EPackage.Registry.INSTANCE.getEFactory(NotTriggerModuleProvPackage.eNS_URI);
			if (theNotTriggerModuleProvFactory != null) {
				return theNotTriggerModuleProvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NotTriggerModuleProvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTriggerModuleProvFactoryImpl() {
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
			case NotTriggerModuleProvPackage.NOT_TRIGGER: return createNotTrigger();
			case NotTriggerModuleProvPackage.OR_TRIGGER: return createOrTrigger();
			case NotTriggerModuleProvPackage.TRIGGER: return createTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTrigger createNotTrigger() {
		NotTriggerImpl notTrigger = new NotTriggerImpl();
		return notTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrTrigger createOrTrigger() {
		OrTriggerImpl orTrigger = new OrTriggerImpl();
		return orTrigger;
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
	public NotTriggerModuleProvPackage getNotTriggerModuleProvPackage() {
		return (NotTriggerModuleProvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NotTriggerModuleProvPackage getPackage() {
		return NotTriggerModuleProvPackage.eINSTANCE;
	}

} //NotTriggerModuleProvFactoryImpl
