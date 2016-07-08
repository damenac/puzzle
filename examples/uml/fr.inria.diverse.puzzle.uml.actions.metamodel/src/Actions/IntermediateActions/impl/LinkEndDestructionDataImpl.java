/**
 */
package Actions.IntermediateActions.impl;

import Actions.BasicActions.InputPin;

import Actions.IntermediateActions.IntermediateActionsPackage;
import Actions.IntermediateActions.LinkEndDestructionData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.impl.LinkEndDestructionDataImpl#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 *   <li>{@link Actions.IntermediateActions.impl.LinkEndDestructionDataImpl#getDestroyAt <em>Destroy At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDestructionDataImpl extends LinkEndDataImpl implements LinkEndDestructionData {
	/**
	 * The default value of the '{@link #isIsDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_DUPLICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected boolean isDestroyDuplicates = IS_DESTROY_DUPLICATES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestroyAt() <em>Destroy At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin destroyAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndDestructionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActionsPackage.Literals.LINK_END_DESTRUCTION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDestroyDuplicates() {
		return isDestroyDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyDuplicates(boolean newIsDestroyDuplicates) {
		boolean oldIsDestroyDuplicates = isDestroyDuplicates;
		isDestroyDuplicates = newIsDestroyDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES, oldIsDestroyDuplicates, isDestroyDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getDestroyAt() {
		return destroyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestroyAt(InputPin newDestroyAt, NotificationChain msgs) {
		InputPin oldDestroyAt = destroyAt;
		destroyAt = newDestroyAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt, newDestroyAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyAt(InputPin newDestroyAt) {
		if (newDestroyAt != destroyAt) {
			NotificationChain msgs = null;
			if (destroyAt != null)
				msgs = ((InternalEObject)destroyAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, null, msgs);
			if (newDestroyAt != null)
				msgs = ((InternalEObject)newDestroyAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, null, msgs);
			msgs = basicSetDestroyAt(newDestroyAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, newDestroyAt, newDestroyAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				return basicSetDestroyAt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				return isIsDestroyDuplicates();
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				return getDestroyAt();
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
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				setIsDestroyDuplicates((Boolean)newValue);
				return;
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				setDestroyAt((InputPin)newValue);
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
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				setIsDestroyDuplicates(IS_DESTROY_DUPLICATES_EDEFAULT);
				return;
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				setDestroyAt((InputPin)null);
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
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				return isDestroyDuplicates != IS_DESTROY_DUPLICATES_EDEFAULT;
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				return destroyAt != null;
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
		result.append(" (isDestroyDuplicates: ");
		result.append(isDestroyDuplicates);
		result.append(')');
		return result.toString();
	}

} //LinkEndDestructionDataImpl
