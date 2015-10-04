/**
 */
package vm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vm.PAbstractSyntax;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAbstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.PAbstractSyntaxImpl#getEcorePath <em>Ecore Path</em>}</li>
 *   <li>{@link vm.impl.PAbstractSyntaxImpl#getEcoreProject <em>Ecore Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAbstractSyntaxImpl extends MinimalEObjectImpl.Container implements PAbstractSyntax {
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
	 * The default value of the '{@link #getEcoreProject() <em>Ecore Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreProject()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcoreProject() <em>Ecore Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreProject()
	 * @generated
	 * @ordered
	 */
	protected String ecoreProject = ECORE_PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PAbstractSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.PABSTRACT_SYNTAX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PABSTRACT_SYNTAX__ECORE_PATH, oldEcorePath, ecorePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcoreProject() {
		return ecoreProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreProject(String newEcoreProject) {
		String oldEcoreProject = ecoreProject;
		ecoreProject = newEcoreProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PABSTRACT_SYNTAX__ECORE_PROJECT, oldEcoreProject, ecoreProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PATH:
				return getEcorePath();
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PROJECT:
				return getEcoreProject();
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
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PATH:
				setEcorePath((String)newValue);
				return;
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PROJECT:
				setEcoreProject((String)newValue);
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
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PATH:
				setEcorePath(ECORE_PATH_EDEFAULT);
				return;
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PROJECT:
				setEcoreProject(ECORE_PROJECT_EDEFAULT);
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
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PATH:
				return ECORE_PATH_EDEFAULT == null ? ecorePath != null : !ECORE_PATH_EDEFAULT.equals(ecorePath);
			case VmPackage.PABSTRACT_SYNTAX__ECORE_PROJECT:
				return ECORE_PROJECT_EDEFAULT == null ? ecoreProject != null : !ECORE_PROJECT_EDEFAULT.equals(ecoreProject);
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
		result.append(", ecoreProject: ");
		result.append(ecoreProject);
		result.append(')');
		return result.toString();
	}

} //PAbstractSyntaxImpl
