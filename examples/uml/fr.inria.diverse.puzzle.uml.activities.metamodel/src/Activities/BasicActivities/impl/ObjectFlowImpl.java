/**
 */
package Activities.BasicActivities.impl;

import Activities.BasicActivities.BasicActivitiesPackage;
import Activities.BasicActivities.ObjectFlow;
import Activities.BasicActivities.ObjectNodeOrderingKind;

import Activities.FundamentalActivities.Behavior;

import Activities.IntermediateActivities.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.BasicActivities.impl.ObjectFlowImpl#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ObjectFlowImpl#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ObjectFlowImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ObjectFlowImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ObjectFlowImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ObjectFlowImpl#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ObjectFlowImpl#getInState <em>In State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow {
	/**
	 * The default value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean isMulticast = IS_MULTICAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultireceive = IS_MULTIRECEIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Behavior transformation;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Behavior selection;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.UNORDERED;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected boolean isControlType = IS_CONTROL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInState() <em>In State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> inState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActivitiesPackage.Literals.OBJECT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMulticast() {
		return isMulticast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = isMulticast;
		isMulticast = newIsMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.OBJECT_FLOW__IS_MULTICAST, oldIsMulticast, isMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultireceive() {
		return isMultireceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = isMultireceive;
		isMultireceive = newIsMultireceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.OBJECT_FLOW__IS_MULTIRECEIVE, oldIsMultireceive, isMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (Behavior)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActivitiesPackage.OBJECT_FLOW__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Behavior newTransformation) {
		Behavior oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.OBJECT_FLOW__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Behavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActivitiesPackage.OBJECT_FLOW__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Behavior newSelection) {
		Behavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.OBJECT_FLOW__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.OBJECT_FLOW__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControlType() {
		return isControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlType(boolean newIsControlType) {
		boolean oldIsControlType = isControlType;
		isControlType = newIsControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.OBJECT_FLOW__IS_CONTROL_TYPE, oldIsControlType, isControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getInState() {
		if (inState == null) {
			inState = new EObjectResolvingEList<State>(State.class, this, BasicActivitiesPackage.OBJECT_FLOW__IN_STATE);
		}
		return inState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTICAST:
				return isIsMulticast();
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return isIsMultireceive();
			case BasicActivitiesPackage.OBJECT_FLOW__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case BasicActivitiesPackage.OBJECT_FLOW__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case BasicActivitiesPackage.OBJECT_FLOW__ORDERING:
				return getOrdering();
			case BasicActivitiesPackage.OBJECT_FLOW__IS_CONTROL_TYPE:
				return isIsControlType();
			case BasicActivitiesPackage.OBJECT_FLOW__IN_STATE:
				return getInState();
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
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast((Boolean)newValue);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive((Boolean)newValue);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__TRANSFORMATION:
				setTransformation((Behavior)newValue);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__SELECTION:
				setSelection((Behavior)newValue);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__IS_CONTROL_TYPE:
				setIsControlType((Boolean)newValue);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__IN_STATE:
				getInState().clear();
				getInState().addAll((Collection<? extends State>)newValue);
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
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__TRANSFORMATION:
				setTransformation((Behavior)null);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__SELECTION:
				setSelection((Behavior)null);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__IS_CONTROL_TYPE:
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case BasicActivitiesPackage.OBJECT_FLOW__IN_STATE:
				getInState().clear();
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
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTICAST:
				return isMulticast != IS_MULTICAST_EDEFAULT;
			case BasicActivitiesPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return isMultireceive != IS_MULTIRECEIVE_EDEFAULT;
			case BasicActivitiesPackage.OBJECT_FLOW__TRANSFORMATION:
				return transformation != null;
			case BasicActivitiesPackage.OBJECT_FLOW__SELECTION:
				return selection != null;
			case BasicActivitiesPackage.OBJECT_FLOW__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case BasicActivitiesPackage.OBJECT_FLOW__IS_CONTROL_TYPE:
				return isControlType != IS_CONTROL_TYPE_EDEFAULT;
			case BasicActivitiesPackage.OBJECT_FLOW__IN_STATE:
				return inState != null && !inState.isEmpty();
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
		result.append(" (isMulticast: ");
		result.append(isMulticast);
		result.append(", isMultireceive: ");
		result.append(isMultireceive);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(", isControlType: ");
		result.append(isControlType);
		result.append(')');
		return result.toString();
	}

} //ObjectFlowImpl
