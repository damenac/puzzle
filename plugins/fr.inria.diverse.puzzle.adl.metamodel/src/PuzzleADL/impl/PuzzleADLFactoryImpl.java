/**
 */
package PuzzleADL.impl;

import PuzzleADL.*;

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
public class PuzzleADLFactoryImpl extends EFactoryImpl implements PuzzleADLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PuzzleADLFactory init() {
		try {
			PuzzleADLFactory thePuzzleADLFactory = (PuzzleADLFactory)EPackage.Registry.INSTANCE.getEFactory(PuzzleADLPackage.eNS_URI);
			if (thePuzzleADLFactory != null) {
				return thePuzzleADLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PuzzleADLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleADLFactoryImpl() {
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
			case PuzzleADLPackage.COMPOSITE_LANGUAGE: return createCompositeLanguage();
			case PuzzleADLPackage.AGGREGATION_LINK: return createAggregationLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeLanguage createCompositeLanguage() {
		CompositeLanguageImpl compositeLanguage = new CompositeLanguageImpl();
		return compositeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationLink createAggregationLink() {
		AggregationLinkImpl aggregationLink = new AggregationLinkImpl();
		return aggregationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleADLPackage getPuzzleADLPackage() {
		return (PuzzleADLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PuzzleADLPackage getPackage() {
		return PuzzleADLPackage.eINSTANCE;
	}

} //PuzzleADLFactoryImpl
