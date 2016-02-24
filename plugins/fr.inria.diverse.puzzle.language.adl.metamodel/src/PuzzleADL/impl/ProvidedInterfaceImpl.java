/**
 */
package PuzzleADL.impl;

import PuzzleADL.ProvidedInterface;
import PuzzleADL.PuzzleADLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PuzzleADL.impl.ProvidedInterfaceImpl#getEcorePath <em>Ecore Path</em>}</li>
 *   <li>{@link PuzzleADL.impl.ProvidedInterfaceImpl#getEcoreRelativePath <em>Ecore Relative Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedInterfaceImpl extends NamedElementImpl implements ProvidedInterface {
	/**
	 * The default value of the '{@link #getEcorePath() <em>Ecore Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcorePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEcorePath() <em>Ecore Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcorePath()
	 * @generated
	 * @ordered
	 */
	protected String ecorePath = ECORE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEcoreRelativePath() <em>Ecore Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreRelativePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_RELATIVE_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEcoreRelativePath() <em>Ecore Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreRelativePath()
	 * @generated
	 * @ordered
	 */
	protected String ecoreRelativePath = ECORE_RELATIVE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzleADLPackage.Literals.PROVIDED_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcorePath() {
		return ecorePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcorePath(String newEcorePath) {
		String oldEcorePath = ecorePath;
		ecorePath = newEcorePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_PATH, oldEcorePath, ecorePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcoreRelativePath() {
		return ecoreRelativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreRelativePath(String newEcoreRelativePath) {
		String oldEcoreRelativePath = ecoreRelativePath;
		ecoreRelativePath = newEcoreRelativePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_RELATIVE_PATH, oldEcoreRelativePath, ecoreRelativePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_PATH:
				return getEcorePath();
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_RELATIVE_PATH:
				return getEcoreRelativePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_PATH:
				setEcorePath((String)newValue);
				return;
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_RELATIVE_PATH:
				setEcoreRelativePath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_PATH:
				setEcorePath(ECORE_PATH_EDEFAULT);
				return;
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_RELATIVE_PATH:
				setEcoreRelativePath(ECORE_RELATIVE_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_PATH:
				return ECORE_PATH_EDEFAULT == null ? ecorePath != null : !ECORE_PATH_EDEFAULT.equals(ecorePath);
			case PuzzleADLPackage.PROVIDED_INTERFACE__ECORE_RELATIVE_PATH:
				return ECORE_RELATIVE_PATH_EDEFAULT == null ? ecoreRelativePath != null : !ECORE_RELATIVE_PATH_EDEFAULT.equals(ecoreRelativePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ecorePath: ");
		result.append(ecorePath);
		result.append(", ecoreRelativePath: ");
		result.append(ecoreRelativePath);
		result.append(')');
		return result.toString();
	}

} //ProvidedInterfaceImpl
