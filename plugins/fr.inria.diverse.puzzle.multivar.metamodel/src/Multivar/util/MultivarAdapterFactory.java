/**
 */
package Multivar.util;

import Multivar.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Multivar.MultivarPackage
 * @generated
 */
public class MultivarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MultivarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultivarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MultivarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultivarSwitch<Adapter> modelSwitch =
		new MultivarSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseLanguageProductLine(LanguageProductLine object) {
				return createLanguageProductLineAdapter();
			}
			@Override
			public Adapter caseProductLineVariability(ProductLineVariability object) {
				return createProductLineVariabilityAdapter();
			}
			@Override
			public Adapter caseLanguageFeature(LanguageFeature object) {
				return createLanguageFeatureAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseMandatoryChild(MandatoryChild object) {
				return createMandatoryChildAdapter();
			}
			@Override
			public Adapter caseOptionalChild(OptionalChild object) {
				return createOptionalChildAdapter();
			}
			@Override
			public Adapter caseOrGroupChild(OrGroupChild object) {
				return createOrGroupChildAdapter();
			}
			@Override
			public Adapter caseAlternativeGroup(AlternativeGroup object) {
				return createAlternativeGroupAdapter();
			}
			@Override
			public Adapter caseLanguageVariability(LanguageVariability object) {
				return createLanguageVariabilityAdapter();
			}
			@Override
			public Adapter caseVariabilityPoint(VariabilityPoint object) {
				return createVariabilityPointAdapter();
			}
			@Override
			public Adapter caseVariation(Variation object) {
				return createVariationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Multivar.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.LanguageProductLine <em>Language Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.LanguageProductLine
	 * @generated
	 */
	public Adapter createLanguageProductLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.ProductLineVariability <em>Product Line Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.ProductLineVariability
	 * @generated
	 */
	public Adapter createProductLineVariabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.LanguageFeature <em>Language Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.LanguageFeature
	 * @generated
	 */
	public Adapter createLanguageFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.MandatoryChild <em>Mandatory Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.MandatoryChild
	 * @generated
	 */
	public Adapter createMandatoryChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.OptionalChild <em>Optional Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.OptionalChild
	 * @generated
	 */
	public Adapter createOptionalChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.OrGroupChild <em>Or Group Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.OrGroupChild
	 * @generated
	 */
	public Adapter createOrGroupChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.AlternativeGroup <em>Alternative Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.AlternativeGroup
	 * @generated
	 */
	public Adapter createAlternativeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.LanguageVariability <em>Language Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.LanguageVariability
	 * @generated
	 */
	public Adapter createLanguageVariabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.VariabilityPoint <em>Variability Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.VariabilityPoint
	 * @generated
	 */
	public Adapter createVariabilityPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Multivar.Variation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Multivar.Variation
	 * @generated
	 */
	public Adapter createVariationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MultivarAdapterFactory
