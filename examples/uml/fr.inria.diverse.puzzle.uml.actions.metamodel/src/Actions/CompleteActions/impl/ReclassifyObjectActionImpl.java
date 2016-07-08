/**
 */
package Actions.CompleteActions.impl;

import Actions.BasicActions.Classifier;
import Actions.BasicActions.InputPin;

import Actions.BasicActions.impl.ActionImpl;

import Actions.CompleteActions.CompleteActionsPackage;
import Actions.CompleteActions.ReclassifyObjectAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Actions.CompleteActions.impl.ReclassifyObjectActionImpl#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link Actions.CompleteActions.impl.ReclassifyObjectActionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link Actions.CompleteActions.impl.ReclassifyObjectActionImpl#getOldClassifier <em>Old Classifier</em>}</li>
 *   <li>{@link Actions.CompleteActions.impl.ReclassifyObjectActionImpl#getNewClassifier <em>New Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReclassifyObjectActionImpl extends ActionImpl implements ReclassifyObjectAction {
	/**
	 * The default value of the '{@link #isIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACE_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected boolean isReplaceAll = IS_REPLACE_ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object;

	/**
	 * The cached value of the '{@link #getOldClassifier() <em>Old Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> oldClassifier;

	/**
	 * The cached value of the '{@link #getNewClassifier() <em>New Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> newClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReclassifyObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteActionsPackage.Literals.RECLASSIFY_OBJECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReplaceAll() {
		return isReplaceAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(boolean newIsReplaceAll) {
		boolean oldIsReplaceAll = isReplaceAll;
		isReplaceAll = newIsReplaceAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject, NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getOldClassifier() {
		if (oldClassifier == null) {
			oldClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
		}
		return oldClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNewClassifier() {
		if (newClassifier == null) {
			newClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);
		}
		return newClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				return basicSetObject(null, msgs);
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
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				return isIsReplaceAll();
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				return getObject();
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				return getOldClassifier();
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				return getNewClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll((Boolean)newValue);
				return;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				setObject((InputPin)newValue);
				return;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				getOldClassifier().clear();
				getOldClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				getNewClassifier().clear();
				getNewClassifier().addAll((Collection<? extends Classifier>)newValue);
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
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
				return;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				setObject((InputPin)null);
				return;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				getOldClassifier().clear();
				return;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				getNewClassifier().clear();
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
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL:
				return isReplaceAll != IS_REPLACE_ALL_EDEFAULT;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OBJECT:
				return object != null;
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER:
				return oldClassifier != null && !oldClassifier.isEmpty();
			case CompleteActionsPackage.RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER:
				return newClassifier != null && !newClassifier.isEmpty();
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
		result.append(" (isReplaceAll: ");
		result.append(isReplaceAll);
		result.append(')');
		return result.toString();
	}

} //ReclassifyObjectActionImpl
