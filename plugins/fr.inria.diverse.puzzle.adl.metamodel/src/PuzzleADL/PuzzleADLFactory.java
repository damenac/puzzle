/**
 */
package PuzzleADL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PuzzleADL.PuzzleADLPackage
 * @generated
 */
public interface PuzzleADLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PuzzleADLFactory eINSTANCE = PuzzleADL.impl.PuzzleADLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Language</em>'.
	 * @generated
	 */
	CompositeLanguage createCompositeLanguage();

	/**
	 * Returns a new object of class '<em>Aggregation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Link</em>'.
	 * @generated
	 */
	AggregationLink createAggregationLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PuzzleADLPackage getPuzzleADLPackage();

} //PuzzleADLFactory
