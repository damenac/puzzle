/**
 */
package Interactions.BasicInteractions.impl;

import Interactions.BasicInteractions.BasicInteractionsPackage;
import Interactions.BasicInteractions.GeneralOrdering;
import Interactions.BasicInteractions.OccurenceSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.impl.GeneralOrderingImpl#getAfter <em>After</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.GeneralOrderingImpl#getBefore <em>Before</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralOrderingImpl extends NamedElementImpl implements GeneralOrdering {
	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected OccurenceSpecification after;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected OccurenceSpecification before;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralOrderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicInteractionsPackage.Literals.GENERAL_ORDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification getAfter() {
		if (after != null && after.eIsProxy()) {
			InternalEObject oldAfter = (InternalEObject)after;
			after = (OccurenceSpecification)eResolveProxy(oldAfter);
			if (after != oldAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicInteractionsPackage.GENERAL_ORDERING__AFTER, oldAfter, after));
			}
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification basicGetAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(OccurenceSpecification newAfter, NotificationChain msgs) {
		OccurenceSpecification oldAfter = after;
		after = newAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.GENERAL_ORDERING__AFTER, oldAfter, newAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(OccurenceSpecification newAfter) {
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject)after).eInverseRemove(this, BasicInteractionsPackage.OCCURENCE_SPECIFICATION__TO_BEFORE, OccurenceSpecification.class, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject)newAfter).eInverseAdd(this, BasicInteractionsPackage.OCCURENCE_SPECIFICATION__TO_BEFORE, OccurenceSpecification.class, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.GENERAL_ORDERING__AFTER, newAfter, newAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification getBefore() {
		if (before != null && before.eIsProxy()) {
			InternalEObject oldBefore = (InternalEObject)before;
			before = (OccurenceSpecification)eResolveProxy(oldBefore);
			if (before != oldBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicInteractionsPackage.GENERAL_ORDERING__BEFORE, oldBefore, before));
			}
		}
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceSpecification basicGetBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(OccurenceSpecification newBefore, NotificationChain msgs) {
		OccurenceSpecification oldBefore = before;
		before = newBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.GENERAL_ORDERING__BEFORE, oldBefore, newBefore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(OccurenceSpecification newBefore) {
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject)before).eInverseRemove(this, BasicInteractionsPackage.OCCURENCE_SPECIFICATION__TO_AFTER, OccurenceSpecification.class, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject)newBefore).eInverseAdd(this, BasicInteractionsPackage.OCCURENCE_SPECIFICATION__TO_AFTER, OccurenceSpecification.class, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.GENERAL_ORDERING__BEFORE, newBefore, newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicInteractionsPackage.GENERAL_ORDERING__AFTER:
				if (after != null)
					msgs = ((InternalEObject)after).eInverseRemove(this, BasicInteractionsPackage.OCCURENCE_SPECIFICATION__TO_BEFORE, OccurenceSpecification.class, msgs);
				return basicSetAfter((OccurenceSpecification)otherEnd, msgs);
			case BasicInteractionsPackage.GENERAL_ORDERING__BEFORE:
				if (before != null)
					msgs = ((InternalEObject)before).eInverseRemove(this, BasicInteractionsPackage.OCCURENCE_SPECIFICATION__TO_AFTER, OccurenceSpecification.class, msgs);
				return basicSetBefore((OccurenceSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicInteractionsPackage.GENERAL_ORDERING__AFTER:
				return basicSetAfter(null, msgs);
			case BasicInteractionsPackage.GENERAL_ORDERING__BEFORE:
				return basicSetBefore(null, msgs);
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
			case BasicInteractionsPackage.GENERAL_ORDERING__AFTER:
				if (resolve) return getAfter();
				return basicGetAfter();
			case BasicInteractionsPackage.GENERAL_ORDERING__BEFORE:
				if (resolve) return getBefore();
				return basicGetBefore();
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
			case BasicInteractionsPackage.GENERAL_ORDERING__AFTER:
				setAfter((OccurenceSpecification)newValue);
				return;
			case BasicInteractionsPackage.GENERAL_ORDERING__BEFORE:
				setBefore((OccurenceSpecification)newValue);
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
			case BasicInteractionsPackage.GENERAL_ORDERING__AFTER:
				setAfter((OccurenceSpecification)null);
				return;
			case BasicInteractionsPackage.GENERAL_ORDERING__BEFORE:
				setBefore((OccurenceSpecification)null);
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
			case BasicInteractionsPackage.GENERAL_ORDERING__AFTER:
				return after != null;
			case BasicInteractionsPackage.GENERAL_ORDERING__BEFORE:
				return before != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralOrderingImpl
