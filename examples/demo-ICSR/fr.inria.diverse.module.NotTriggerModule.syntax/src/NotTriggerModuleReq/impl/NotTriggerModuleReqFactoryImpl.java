/**
 */
package NotTriggerModuleReq.impl;

import NotTriggerModuleReq.*;

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
public class NotTriggerModuleReqFactoryImpl extends EFactoryImpl implements NotTriggerModuleReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotTriggerModuleReqFactory init() {
		try {
			NotTriggerModuleReqFactory theNotTriggerModuleReqFactory = (NotTriggerModuleReqFactory)EPackage.Registry.INSTANCE.getEFactory(NotTriggerModuleReqPackage.eNS_URI);
			if (theNotTriggerModuleReqFactory != null) {
				return theNotTriggerModuleReqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NotTriggerModuleReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTriggerModuleReqFactoryImpl() {
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
			case NotTriggerModuleReqPackage.TRIGGER: return createTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public NotTriggerModuleReqPackage getNotTriggerModuleReqPackage() {
		return (NotTriggerModuleReqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NotTriggerModuleReqPackage getPackage() {
		return NotTriggerModuleReqPackage.eINSTANCE;
	}

} //NotTriggerModuleReqFactoryImpl
