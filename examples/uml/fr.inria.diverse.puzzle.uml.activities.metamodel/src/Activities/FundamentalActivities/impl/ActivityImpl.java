/**
 */
package Activities.FundamentalActivities.impl;

import Activities.BasicActivities.ActivityEdge;

import Activities.FundamentalActivities.Activity;
import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.IntermediateActivities.ActivityPartition;

import Activities.StructuredActivities.StructuredActivitiesPackage;
import Activities.StructuredActivities.StructuredActivityNode;
import Activities.StructuredActivities.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#getNode <em>Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActivityImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends BehaviorImpl implements Activity {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> group;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> partition;

	/**
	 * The default value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructuredNode() <em>Structured Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredActivityNode> structuredNode;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FundamentalActivitiesPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, FundamentalActivitiesPackage.ACTIVITY__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, FundamentalActivitiesPackage.ACTIVITY__GROUP, FundamentalActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, FundamentalActivitiesPackage.ACTIVITY__EDGE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getPartition() {
		if (partition == null) {
			partition = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this, FundamentalActivitiesPackage.ACTIVITY__PARTITION);
		}
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingleExecution() {
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(boolean newIsSingleExecution) {
		boolean oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredActivityNode> getStructuredNode() {
		if (structuredNode == null) {
			structuredNode = new EObjectContainmentWithInverseEList<StructuredActivityNode>(StructuredActivityNode.class, this, FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY);
		}
		return structuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, FundamentalActivitiesPackage.ACTIVITY__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FundamentalActivitiesPackage.ACTIVITY__GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup()).basicAdd(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructuredNode()).basicAdd(otherEnd, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				return ((InternalEList<?>)getStructuredNode()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTIVITY__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
			case FundamentalActivitiesPackage.ACTIVITY__NODE:
				return getNode();
			case FundamentalActivitiesPackage.ACTIVITY__GROUP:
				return getGroup();
			case FundamentalActivitiesPackage.ACTIVITY__EDGE:
				return getEdge();
			case FundamentalActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				return isIsReadOnly();
			case FundamentalActivitiesPackage.ACTIVITY__PARTITION:
				return getPartition();
			case FundamentalActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return isIsSingleExecution();
			case FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				return getStructuredNode();
			case FundamentalActivitiesPackage.ACTIVITY__VARIABLE:
				return getVariable();
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
			case FundamentalActivitiesPackage.ACTIVITY__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__PARTITION:
				getPartition().clear();
				getPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution((Boolean)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				getStructuredNode().clear();
				getStructuredNode().addAll((Collection<? extends StructuredActivityNode>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
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
			case FundamentalActivitiesPackage.ACTIVITY__NODE:
				getNode().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY__GROUP:
				getGroup().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY__EDGE:
				getEdge().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__PARTITION:
				getPartition().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				getStructuredNode().clear();
				return;
			case FundamentalActivitiesPackage.ACTIVITY__VARIABLE:
				getVariable().clear();
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
			case FundamentalActivitiesPackage.ACTIVITY__NODE:
				return node != null && !node.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY__GROUP:
				return group != null && !group.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY__EDGE:
				return edge != null && !edge.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case FundamentalActivitiesPackage.ACTIVITY__PARTITION:
				return partition != null && !partition.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return isSingleExecution != IS_SINGLE_EXECUTION_EDEFAULT;
			case FundamentalActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				return structuredNode != null && !structuredNode.isEmpty();
			case FundamentalActivitiesPackage.ACTIVITY__VARIABLE:
				return variable != null && !variable.isEmpty();
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isSingleExecution: ");
		result.append(isSingleExecution);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
