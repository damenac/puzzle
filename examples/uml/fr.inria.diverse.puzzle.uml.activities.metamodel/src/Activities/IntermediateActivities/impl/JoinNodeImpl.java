/**
 */
package Activities.IntermediateActivities.impl;

import Activities.BasicActivities.impl.ControlNodeImpl;

import Activities.IntermediateActivities.IntermediateActivitiesPackage;
import Activities.IntermediateActivities.JoinNode;
import Activities.IntermediateActivities.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.impl.JoinNodeImpl#isIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.impl.JoinNodeImpl#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinNodeImpl extends ControlNodeImpl implements JoinNode {
	/**
	 * The default value of the '{@link #isIsCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCombineDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMBINE_DUPLICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCombineDuplicate()
	 * @generated
	 * @ordered
	 */
	protected boolean isCombineDuplicate = IS_COMBINE_DUPLICATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJoinSpec() <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinSpec()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification joinSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActivitiesPackage.Literals.JOIN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCombineDuplicate() {
		return isCombineDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCombineDuplicate(boolean newIsCombineDuplicate) {
		boolean oldIsCombineDuplicate = isCombineDuplicate;
		isCombineDuplicate = newIsCombineDuplicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.JOIN_NODE__IS_COMBINE_DUPLICATE, oldIsCombineDuplicate, isCombineDuplicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getJoinSpec() {
		return joinSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinSpec(ValueSpecification newJoinSpec, NotificationChain msgs) {
		ValueSpecification oldJoinSpec = joinSpec;
		joinSpec = newJoinSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC, oldJoinSpec, newJoinSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinSpec(ValueSpecification newJoinSpec) {
		if (newJoinSpec != joinSpec) {
			NotificationChain msgs = null;
			if (joinSpec != null)
				msgs = ((InternalEObject)joinSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC, null, msgs);
			if (newJoinSpec != null)
				msgs = ((InternalEObject)newJoinSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC, null, msgs);
			msgs = basicSetJoinSpec(newJoinSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC, newJoinSpec, newJoinSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC:
				return basicSetJoinSpec(null, msgs);
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
			case IntermediateActivitiesPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				return isIsCombineDuplicate();
			case IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC:
				return getJoinSpec();
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
			case IntermediateActivitiesPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				setIsCombineDuplicate((Boolean)newValue);
				return;
			case IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC:
				setJoinSpec((ValueSpecification)newValue);
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
			case IntermediateActivitiesPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				setIsCombineDuplicate(IS_COMBINE_DUPLICATE_EDEFAULT);
				return;
			case IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC:
				setJoinSpec((ValueSpecification)null);
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
			case IntermediateActivitiesPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
				return isCombineDuplicate != IS_COMBINE_DUPLICATE_EDEFAULT;
			case IntermediateActivitiesPackage.JOIN_NODE__JOIN_SPEC:
				return joinSpec != null;
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
		result.append(" (isCombineDuplicate: ");
		result.append(isCombineDuplicate);
		result.append(')');
		return result.toString();
	}

} //JoinNodeImpl
