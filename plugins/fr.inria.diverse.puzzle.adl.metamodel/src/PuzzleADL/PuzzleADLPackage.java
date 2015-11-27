/**
 */
package PuzzleADL;

import fr.inria.diverse.melange.metamodel.melange.MelangePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PuzzleADL.PuzzleADLFactory
 * @model kind="package"
 * @generated
 */
public interface PuzzleADLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PuzzleADL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.adl.metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PuzzleADL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PuzzleADLPackage eINSTANCE = PuzzleADL.impl.PuzzleADLPackageImpl.init();

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.CompositeLanguageImpl <em>Composite Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.CompositeLanguageImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getCompositeLanguage()
	 * @generated
	 */
	int COMPOSITE_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LANGUAGE__LINKS = MelangePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LANGUAGE_FEATURE_COUNT = MelangePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LANGUAGE_OPERATION_COUNT = MelangePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.CompositionLinkImpl <em>Composition Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.CompositionLinkImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getCompositionLink()
	 * @generated
	 */
	int COMPOSITION_LINK = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Composition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Composition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PuzzleADL.impl.AggregationLinkImpl <em>Aggregation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PuzzleADL.impl.AggregationLinkImpl
	 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getAggregationLink()
	 * @generated
	 */
	int AGGREGATION_LINK = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LINK__LEFT = COMPOSITION_LINK__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LINK__RIGHT = COMPOSITION_LINK__RIGHT;

	/**
	 * The number of structural features of the '<em>Aggregation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LINK_FEATURE_COUNT = COMPOSITION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LINK_OPERATION_COUNT = COMPOSITION_LINK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link PuzzleADL.CompositeLanguage <em>Composite Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Language</em>'.
	 * @see PuzzleADL.CompositeLanguage
	 * @generated
	 */
	EClass getCompositeLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link PuzzleADL.CompositeLanguage#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see PuzzleADL.CompositeLanguage#getLinks()
	 * @see #getCompositeLanguage()
	 * @generated
	 */
	EReference getCompositeLanguage_Links();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.CompositionLink <em>Composition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Link</em>'.
	 * @see PuzzleADL.CompositionLink
	 * @generated
	 */
	EClass getCompositionLink();

	/**
	 * Returns the meta object for the reference '{@link PuzzleADL.CompositionLink#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see PuzzleADL.CompositionLink#getLeft()
	 * @see #getCompositionLink()
	 * @generated
	 */
	EReference getCompositionLink_Left();

	/**
	 * Returns the meta object for the reference '{@link PuzzleADL.CompositionLink#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see PuzzleADL.CompositionLink#getRight()
	 * @see #getCompositionLink()
	 * @generated
	 */
	EReference getCompositionLink_Right();

	/**
	 * Returns the meta object for class '{@link PuzzleADL.AggregationLink <em>Aggregation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Link</em>'.
	 * @see PuzzleADL.AggregationLink
	 * @generated
	 */
	EClass getAggregationLink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PuzzleADLFactory getPuzzleADLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.CompositeLanguageImpl <em>Composite Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.CompositeLanguageImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getCompositeLanguage()
		 * @generated
		 */
		EClass COMPOSITE_LANGUAGE = eINSTANCE.getCompositeLanguage();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_LANGUAGE__LINKS = eINSTANCE.getCompositeLanguage_Links();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.CompositionLinkImpl <em>Composition Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.CompositionLinkImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getCompositionLink()
		 * @generated
		 */
		EClass COMPOSITION_LINK = eINSTANCE.getCompositionLink();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_LINK__LEFT = eINSTANCE.getCompositionLink_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_LINK__RIGHT = eINSTANCE.getCompositionLink_Right();

		/**
		 * The meta object literal for the '{@link PuzzleADL.impl.AggregationLinkImpl <em>Aggregation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PuzzleADL.impl.AggregationLinkImpl
		 * @see PuzzleADL.impl.PuzzleADLPackageImpl#getAggregationLink()
		 * @generated
		 */
		EClass AGGREGATION_LINK = eINSTANCE.getAggregationLink();

	}

} //PuzzleADLPackage
