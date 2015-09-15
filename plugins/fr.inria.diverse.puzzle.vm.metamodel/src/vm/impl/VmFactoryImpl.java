/**
 */
package vm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmFactoryImpl extends EFactoryImpl implements VmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmFactory init() {
		try {
			VmFactory theVmFactory = (VmFactory)EPackage.Registry.INSTANCE.getEFactory(VmPackage.eNS_URI);
			if (theVmFactory != null) {
				return theVmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmFactoryImpl() {
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
			case VmPackage.PFEATURE_MODEL: return createPFeatureModel();
			case VmPackage.PFEATURE: return createPFeature();
			case VmPackage.PFEATURE_GROUP: return createPFeatureGroup();
			case VmPackage.PFEATURE_GROUP_CARDINALITY: return createPFeatureGroupCardinality();
			case VmPackage.PCONSTRAINT: return createPConstraint();
			case VmPackage.PFEATURE_REF: return createPFeatureRef();
			case VmPackage.PUNARY_EXPRESSION: return createPUnaryExpression();
			case VmPackage.PBINARY_EXPRESSION: return createPBinaryExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VmPackage.PUNINARY_OPERATOR:
				return createPUninaryOperatorFromString(eDataType, initialValue);
			case VmPackage.PBINARY_OPERATOR:
				return createPBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VmPackage.PUNINARY_OPERATOR:
				return convertPUninaryOperatorToString(eDataType, instanceValue);
			case VmPackage.PBINARY_OPERATOR:
				return convertPBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeatureModel createPFeatureModel() {
		PFeatureModelImpl pFeatureModel = new PFeatureModelImpl();
		return pFeatureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeature createPFeature() {
		PFeatureImpl pFeature = new PFeatureImpl();
		return pFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeatureGroup createPFeatureGroup() {
		PFeatureGroupImpl pFeatureGroup = new PFeatureGroupImpl();
		return pFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeatureGroupCardinality createPFeatureGroupCardinality() {
		PFeatureGroupCardinalityImpl pFeatureGroupCardinality = new PFeatureGroupCardinalityImpl();
		return pFeatureGroupCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConstraint createPConstraint() {
		PConstraintImpl pConstraint = new PConstraintImpl();
		return pConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFeatureRef createPFeatureRef() {
		PFeatureRefImpl pFeatureRef = new PFeatureRefImpl();
		return pFeatureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PUnaryExpression createPUnaryExpression() {
		PUnaryExpressionImpl pUnaryExpression = new PUnaryExpressionImpl();
		return pUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PBinaryExpression createPBinaryExpression() {
		PBinaryExpressionImpl pBinaryExpression = new PBinaryExpressionImpl();
		return pBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PUninaryOperator createPUninaryOperatorFromString(EDataType eDataType, String initialValue) {
		PUninaryOperator result = PUninaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPUninaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PBinaryOperator createPBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		PBinaryOperator result = PBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPackage getVmPackage() {
		return (VmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmPackage getPackage() {
		return VmPackage.eINSTANCE;
	}

} //VmFactoryImpl
