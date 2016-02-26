/**
 */
package pqr;

import abc.AbcPackage;

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
 * @see pqr.PqrFactory
 * @model kind="package"
 * @generated
 */
public interface PqrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pqr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pqr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pqr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PqrPackage eINSTANCE = pqr.impl.PqrPackageImpl.init();

	/**
	 * The meta object id for the '{@link pqr.impl.PImpl <em>P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pqr.impl.PImpl
	 * @see pqr.impl.PqrPackageImpl#getP()
	 * @generated
	 */
	int P = 0;

	/**
	 * The feature id for the '<em><b>Ces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__CES = AbcPackage.B__CES;

	/**
	 * The feature id for the '<em><b>Xes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__XES = AbcPackage.B__XES;

	/**
	 * The feature id for the '<em><b>Pes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PES = AbcPackage.B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = AbcPackage.B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_OPERATION_COUNT = AbcPackage.B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pqr.impl.QImpl <em>Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pqr.impl.QImpl
	 * @see pqr.impl.PqrPackageImpl#getQ()
	 * @generated
	 */
	int Q = 1;

	/**
	 * The feature id for the '<em><b>Res</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__RES = 0;

	/**
	 * The number of structural features of the '<em>Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pqr.impl.RImpl <em>R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pqr.impl.RImpl
	 * @see pqr.impl.PqrPackageImpl#getR()
	 * @generated
	 */
	int R = 2;

	/**
	 * The number of structural features of the '<em>R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pqr.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P</em>'.
	 * @see pqr.P
	 * @generated
	 */
	EClass getP();

	/**
	 * Returns the meta object for the containment reference list '{@link pqr.P#getPes <em>Pes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pes</em>'.
	 * @see pqr.P#getPes()
	 * @see #getP()
	 * @generated
	 */
	EReference getP_Pes();

	/**
	 * Returns the meta object for class '{@link pqr.Q <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Q</em>'.
	 * @see pqr.Q
	 * @generated
	 */
	EClass getQ();

	/**
	 * Returns the meta object for the containment reference list '{@link pqr.Q#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Res</em>'.
	 * @see pqr.Q#getRes()
	 * @see #getQ()
	 * @generated
	 */
	EReference getQ_Res();

	/**
	 * Returns the meta object for class '{@link pqr.R <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R</em>'.
	 * @see pqr.R
	 * @generated
	 */
	EClass getR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PqrFactory getPqrFactory();

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
		 * The meta object literal for the '{@link pqr.impl.PImpl <em>P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pqr.impl.PImpl
		 * @see pqr.impl.PqrPackageImpl#getP()
		 * @generated
		 */
		EClass P = eINSTANCE.getP();

		/**
		 * The meta object literal for the '<em><b>Pes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P__PES = eINSTANCE.getP_Pes();

		/**
		 * The meta object literal for the '{@link pqr.impl.QImpl <em>Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pqr.impl.QImpl
		 * @see pqr.impl.PqrPackageImpl#getQ()
		 * @generated
		 */
		EClass Q = eINSTANCE.getQ();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Q__RES = eINSTANCE.getQ_Res();

		/**
		 * The meta object literal for the '{@link pqr.impl.RImpl <em>R</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pqr.impl.RImpl
		 * @see pqr.impl.PqrPackageImpl#getR()
		 * @generated
		 */
		EClass R = eINSTANCE.getR();

	}

} //PqrPackage
