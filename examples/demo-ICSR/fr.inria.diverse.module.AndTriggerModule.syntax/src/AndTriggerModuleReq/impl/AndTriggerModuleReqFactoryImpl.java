/**
 */
package AndTriggerModuleReq.impl;

import AndTriggerModuleReq.*;

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
public class AndTriggerModuleReqFactoryImpl extends EFactoryImpl implements AndTriggerModuleReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AndTriggerModuleReqFactory init() {
		try {
			AndTriggerModuleReqFactory theAndTriggerModuleReqFactory = (AndTriggerModuleReqFactory)EPackage.Registry.INSTANCE.getEFactory(AndTriggerModuleReqPackage.eNS_URI);
			if (theAndTriggerModuleReqFactory != null) {
				return theAndTriggerModuleReqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AndTriggerModuleReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndTriggerModuleReqFactoryImpl() {
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
			case AndTriggerModuleReqPackage.TRIGGER: return createTrigger();
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
	public AndTriggerModuleReqPackage getAndTriggerModuleReqPackage() {
		return (AndTriggerModuleReqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AndTriggerModuleReqPackage getPackage() {
		return AndTriggerModuleReqPackage.eINSTANCE;
	}

} //AndTriggerModuleReqFactoryImpl
