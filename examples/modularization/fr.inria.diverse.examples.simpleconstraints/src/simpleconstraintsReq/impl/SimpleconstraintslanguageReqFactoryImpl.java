/**
 */
package simpleconstraintsReq.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleconstraintsReq.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleconstraintslanguageReqFactoryImpl extends EFactoryImpl implements SimpleconstraintslanguageReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleconstraintslanguageReqFactory init() {
		try {
			SimpleconstraintslanguageReqFactory theSimpleconstraintslanguageReqFactory = (SimpleconstraintslanguageReqFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleconstraintslanguageReqPackage.eNS_URI);
			if (theSimpleconstraintslanguageReqFactory != null) {
				return theSimpleconstraintslanguageReqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleconstraintslanguageReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintslanguageReqFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintslanguageReqPackage getSimpleconstraintslanguageReqPackage() {
		return (SimpleconstraintslanguageReqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleconstraintslanguageReqPackage getPackage() {
		return SimpleconstraintslanguageReqPackage.eINSTANCE;
	}

} //SimpleconstraintslanguageReqFactoryImpl
