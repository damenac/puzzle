/**
 */
package ConditionalModuleReq.impl;

import ConditionalModuleReq.*;

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
public class ConditionalModuleReqFactoryImpl extends EFactoryImpl implements ConditionalModuleReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConditionalModuleReqFactory init() {
		try {
			ConditionalModuleReqFactory theConditionalModuleReqFactory = (ConditionalModuleReqFactory)EPackage.Registry.INSTANCE.getEFactory(ConditionalModuleReqPackage.eNS_URI);
			if (theConditionalModuleReqFactory != null) {
				return theConditionalModuleReqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConditionalModuleReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalModuleReqFactoryImpl() {
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
	public ConditionalModuleReqPackage getConditionalModuleReqPackage() {
		return (ConditionalModuleReqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConditionalModuleReqPackage getPackage() {
		return ConditionalModuleReqPackage.eINSTANCE;
	}

} //ConditionalModuleReqFactoryImpl
