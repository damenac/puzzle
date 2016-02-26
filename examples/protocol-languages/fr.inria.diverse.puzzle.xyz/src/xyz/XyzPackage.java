/**
 */
package xyz;

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
 * @see xyz.XyzFactory
 * @model kind="package"
 * @generated
 */
public interface XyzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xyz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xyz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xyz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XyzPackage eINSTANCE = xyz.impl.XyzPackageImpl.init();

	/**
	 * The meta object id for the '{@link xyz.impl.XImpl <em>X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xyz.impl.XImpl
	 * @see xyz.impl.XyzPackageImpl#getX()
	 * @generated
	 */
	int X = 0;

	/**
	 * The feature id for the '<em><b>Yes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__YES = 0;

	/**
	 * The number of structural features of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xyz.impl.YImpl <em>Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xyz.impl.YImpl
	 * @see xyz.impl.XyzPackageImpl#getY()
	 * @generated
	 */
	int Y = 1;

	/**
	 * The feature id for the '<em><b>Zes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__ZES = 0;

	/**
	 * The number of structural features of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xyz.impl.ZImpl <em>Z</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xyz.impl.ZImpl
	 * @see xyz.impl.XyzPackageImpl#getZ()
	 * @generated
	 */
	int Z = 2;

	/**
	 * The number of structural features of the '<em>Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Z_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link xyz.X <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X</em>'.
	 * @see xyz.X
	 * @generated
	 */
	EClass getX();

	/**
	 * Returns the meta object for the containment reference list '{@link xyz.X#getYes <em>Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Yes</em>'.
	 * @see xyz.X#getYes()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_Yes();

	/**
	 * Returns the meta object for class '{@link xyz.Y <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Y</em>'.
	 * @see xyz.Y
	 * @generated
	 */
	EClass getY();

	/**
	 * Returns the meta object for the containment reference list '{@link xyz.Y#getZes <em>Zes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zes</em>'.
	 * @see xyz.Y#getZes()
	 * @see #getY()
	 * @generated
	 */
	EReference getY_Zes();

	/**
	 * Returns the meta object for class '{@link xyz.Z <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Z</em>'.
	 * @see xyz.Z
	 * @generated
	 */
	EClass getZ();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XyzFactory getXyzFactory();

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
		 * The meta object literal for the '{@link xyz.impl.XImpl <em>X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xyz.impl.XImpl
		 * @see xyz.impl.XyzPackageImpl#getX()
		 * @generated
		 */
		EClass X = eINSTANCE.getX();

		/**
		 * The meta object literal for the '<em><b>Yes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__YES = eINSTANCE.getX_Yes();

		/**
		 * The meta object literal for the '{@link xyz.impl.YImpl <em>Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xyz.impl.YImpl
		 * @see xyz.impl.XyzPackageImpl#getY()
		 * @generated
		 */
		EClass Y = eINSTANCE.getY();

		/**
		 * The meta object literal for the '<em><b>Zes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Y__ZES = eINSTANCE.getY_Zes();

		/**
		 * The meta object literal for the '{@link xyz.impl.ZImpl <em>Z</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xyz.impl.ZImpl
		 * @see xyz.impl.XyzPackageImpl#getZ()
		 * @generated
		 */
		EClass Z = eINSTANCE.getZ();

	}

} //XyzPackage
