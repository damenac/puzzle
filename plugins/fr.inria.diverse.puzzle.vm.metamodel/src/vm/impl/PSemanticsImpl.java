/**
 */
package vm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vm.PSemantics;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSemantics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.PSemanticsImpl#getXtendPath <em>Xtend Path</em>}</li>
 *   <li>{@link vm.impl.PSemanticsImpl#getXtendProject <em>Xtend Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PSemanticsImpl extends MinimalEObjectImpl.Container implements PSemantics {
	/**
	 * The default value of the '{@link #getXtendPath() <em>Xtend Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtendPath()
	 * @generated
	 * @ordered
	 */
	protected static final String XTEND_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXtendPath() <em>Xtend Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtendPath()
	 * @generated
	 * @ordered
	 */
	protected String xtendPath = XTEND_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getXtendProject() <em>Xtend Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtendProject()
	 * @generated
	 * @ordered
	 */
	protected static final String XTEND_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXtendProject() <em>Xtend Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtendProject()
	 * @generated
	 * @ordered
	 */
	protected String xtendProject = XTEND_PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSemanticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.PSEMANTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXtendPath() {
		return xtendPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXtendPath(String newXtendPath) {
		String oldXtendPath = xtendPath;
		xtendPath = newXtendPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PSEMANTICS__XTEND_PATH, oldXtendPath, xtendPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXtendProject() {
		return xtendProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXtendProject(String newXtendProject) {
		String oldXtendProject = xtendProject;
		xtendProject = newXtendProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PSEMANTICS__XTEND_PROJECT, oldXtendProject, xtendProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.PSEMANTICS__XTEND_PATH:
				return getXtendPath();
			case VmPackage.PSEMANTICS__XTEND_PROJECT:
				return getXtendProject();
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
			case VmPackage.PSEMANTICS__XTEND_PATH:
				setXtendPath((String)newValue);
				return;
			case VmPackage.PSEMANTICS__XTEND_PROJECT:
				setXtendProject((String)newValue);
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
			case VmPackage.PSEMANTICS__XTEND_PATH:
				setXtendPath(XTEND_PATH_EDEFAULT);
				return;
			case VmPackage.PSEMANTICS__XTEND_PROJECT:
				setXtendProject(XTEND_PROJECT_EDEFAULT);
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
			case VmPackage.PSEMANTICS__XTEND_PATH:
				return XTEND_PATH_EDEFAULT == null ? xtendPath != null : !XTEND_PATH_EDEFAULT.equals(xtendPath);
			case VmPackage.PSEMANTICS__XTEND_PROJECT:
				return XTEND_PROJECT_EDEFAULT == null ? xtendProject != null : !XTEND_PROJECT_EDEFAULT.equals(xtendProject);
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
		result.append(" (xtendPath: ");
		result.append(xtendPath);
		result.append(", xtendProject: ");
		result.append(xtendProject);
		result.append(')');
		return result.toString();
	}

} //PSemanticsImpl
