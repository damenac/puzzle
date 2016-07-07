/**
 */
package ChoiceModuleReq.impl;

import ChoiceModuleReq.*;

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
public class ChoiceModuleReqFactoryImpl extends EFactoryImpl implements ChoiceModuleReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChoiceModuleReqFactory init() {
		try {
			ChoiceModuleReqFactory theChoiceModuleReqFactory = (ChoiceModuleReqFactory)EPackage.Registry.INSTANCE.getEFactory(ChoiceModuleReqPackage.eNS_URI);
			if (theChoiceModuleReqFactory != null) {
				return theChoiceModuleReqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChoiceModuleReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceModuleReqFactoryImpl() {
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
	public ChoiceModuleReqPackage getChoiceModuleReqPackage() {
		return (ChoiceModuleReqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChoiceModuleReqPackage getPackage() {
		return ChoiceModuleReqPackage.eINSTANCE;
	}

} //ChoiceModuleReqFactoryImpl
