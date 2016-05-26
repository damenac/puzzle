/**
 */
package triggers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import triggers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggersFactoryImpl extends EFactoryImpl implements TriggersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggersFactory init() {
		try {
			TriggersFactory theTriggersFactory = (TriggersFactory)EPackage.Registry.INSTANCE.getEFactory(TriggersPackage.eNS_URI);
			if (theTriggersFactory != null) {
				return theTriggersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TriggersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersFactoryImpl() {
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
			case TriggersPackage.TRIGGER: return createTrigger();
			case TriggersPackage.NOT_TRIGGER: return createNotTrigger();
			case TriggersPackage.AND_TRIGGER: return createAndTrigger();
			case TriggersPackage.OR_TRIGGER: return createOrTrigger();
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
	public NotTrigger createNotTrigger() {
		NotTriggerImpl notTrigger = new NotTriggerImpl();
		return notTrigger;
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
	public OrTrigger createOrTrigger() {
		OrTriggerImpl orTrigger = new OrTriggerImpl();
		return orTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersPackage getTriggersPackage() {
		return (TriggersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TriggersPackage getPackage() {
		return TriggersPackage.eINSTANCE;
	}

} //TriggersFactoryImpl
