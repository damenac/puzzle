/**
 */
package complextriggers.impl;

import complextriggers.*;

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
public class ComplextriggersFactoryImpl extends EFactoryImpl implements ComplextriggersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComplextriggersFactory init() {
		try {
			ComplextriggersFactory theComplextriggersFactory = (ComplextriggersFactory)EPackage.Registry.INSTANCE.getEFactory(ComplextriggersPackage.eNS_URI);
			if (theComplextriggersFactory != null) {
				return theComplextriggersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComplextriggersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplextriggersFactoryImpl() {
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
			case ComplextriggersPackage.TRIGGER: return createTrigger();
			case ComplextriggersPackage.NOT_TRIGGER: return createNotTrigger();
			case ComplextriggersPackage.AND_TRIGGER: return createAndTrigger();
			case ComplextriggersPackage.OR_TRIGGER: return createOrTrigger();
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
	public ComplextriggersPackage getComplextriggersPackage() {
		return (ComplextriggersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComplextriggersPackage getPackage() {
		return ComplextriggersPackage.eINSTANCE;
	}

} //ComplextriggersFactoryImpl
