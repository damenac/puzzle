/**
 */
package Activities.BasicActivities.impl;

import Activities.BasicActivities.ActivityEdge;
import Activities.BasicActivities.BasicActivitiesPackage;

import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.IntermediateActivities.ActivityPartition;
import Activities.IntermediateActivities.IntermediateActivitiesPackage;
import Activities.IntermediateActivities.InterruptibleActivityRegion;
import Activities.IntermediateActivities.ValueSpecification;

import Activities.StructuredActivities.StructuredActivitiesPackage;
import Activities.StructuredActivities.StructuredActivityNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getRedefinedEdge <em>Redefined Edge</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link Activities.BasicActivities.impl.ActivityEdgeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityEdgeImpl extends RedefinableElementImpl implements ActivityEdge {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getRedefinedEdge() <em>Redefined Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> redefinedEdge;

	/**
	 * The cached value of the '{@link #getInGroup() <em>In Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> inGroup;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification guard;

	/**
	 * The cached value of the '{@link #getInPartition() <em>In Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> inPartition;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification weight;

	/**
	 * The cached value of the '{@link #getInterrupts() <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion interrupts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActivitiesPackage.Literals.ACTIVITY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActivitiesPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNode newTarget, NotificationChain msgs) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNode newSource, NotificationChain msgs) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ActivityNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getRedefinedEdge() {
		if (redefinedEdge == null) {
			redefinedEdge = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, BasicActivitiesPackage.ACTIVITY_EDGE__REDEFINED_EDGE);
		}
		return redefinedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getInGroup() {
		if (inGroup == null) {
			inGroup = new EObjectWithInverseResolvingEList.ManyInverse<ActivityGroup>(ActivityGroup.class, this, BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP, FundamentalActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE);
		}
		return inGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard, NotificationChain msgs) {
		ValueSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ValueSpecification newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicActivitiesPackage.ACTIVITY_EDGE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicActivitiesPackage.ACTIVITY_EDGE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getInPartition() {
		if (inPartition == null) {
			inPartition = new EObjectWithInverseResolvingEList.ManyInverse<ActivityPartition>(ActivityPartition.class, this, BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION, IntermediateActivitiesPackage.ACTIVITY_PARTITION__EDGE);
		}
		return inPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(ValueSpecification newWeight, NotificationChain msgs) {
		ValueSpecification oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT, oldWeight, newWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(ValueSpecification newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInterrupts() {
		if (interrupts != null && interrupts.eIsProxy()) {
			InternalEObject oldInterrupts = (InternalEObject)interrupts;
			interrupts = (InterruptibleActivityRegion)eResolveProxy(oldInterrupts);
			if (interrupts != oldInterrupts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS, oldInterrupts, interrupts));
			}
		}
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInterrupts() {
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterrupts(InterruptibleActivityRegion newInterrupts, NotificationChain msgs) {
		InterruptibleActivityRegion oldInterrupts = interrupts;
		interrupts = newInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS, oldInterrupts, newInterrupts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterrupts(InterruptibleActivityRegion newInterrupts) {
		if (newInterrupts != interrupts) {
			NotificationChain msgs = null;
			if (interrupts != null)
				msgs = ((InternalEObject)interrupts).eInverseRemove(this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, InterruptibleActivityRegion.class, msgs);
			if (newInterrupts != null)
				msgs = ((InternalEObject)newInterrupts).eInverseAdd(this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, InterruptibleActivityRegion.class, msgs);
			msgs = basicSetInterrupts(newInterrupts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS, newInterrupts, newInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID() != BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE) return null;
		return (StructuredActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInStructuredNode(StructuredActivityNode newInStructuredNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer() || (eContainerFeatureID() != BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject)newInStructuredNode).eInverseAdd(this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE, StructuredActivityNode.class, msgs);
			msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));
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
			case BasicActivitiesPackage.ACTIVITY_EDGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY_NODE__INCOMING, ActivityNode.class, msgs);
				return basicSetTarget((ActivityNode)otherEnd, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, FundamentalActivitiesPackage.ACTIVITY_NODE__OUTGOING, ActivityNode.class, msgs);
				return basicSetSource((ActivityNode)otherEnd, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInGroup()).basicAdd(otherEnd, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPartition()).basicAdd(otherEnd, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS:
				if (interrupts != null)
					msgs = ((InternalEObject)interrupts).eInverseRemove(this, IntermediateActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, InterruptibleActivityRegion.class, msgs);
				return basicSetInterrupts((InterruptibleActivityRegion)otherEnd, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
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
			case BasicActivitiesPackage.ACTIVITY_EDGE__TARGET:
				return basicSetTarget(null, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				return basicSetSource(null, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP:
				return ((InternalEList<?>)getInGroup()).basicRemove(otherEnd, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__GUARD:
				return basicSetGuard(null, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION:
				return ((InternalEList<?>)getInPartition()).basicRemove(otherEnd, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT:
				return basicSetWeight(null, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS:
				return basicSetInterrupts(null, msgs);
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return eInternalContainer().eInverseRemove(this, StructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE, StructuredActivityNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicActivitiesPackage.ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case BasicActivitiesPackage.ACTIVITY_EDGE__REDEFINED_EDGE:
				return getRedefinedEdge();
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP:
				return getInGroup();
			case BasicActivitiesPackage.ACTIVITY_EDGE__GUARD:
				return getGuard();
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION:
				return getInPartition();
			case BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT:
				return getWeight();
			case BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS:
				if (resolve) return getInterrupts();
				return basicGetInterrupts();
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
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
			case BasicActivitiesPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__REDEFINED_EDGE:
				getRedefinedEdge().clear();
				getRedefinedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP:
				getInGroup().clear();
				getInGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)newValue);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
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
			case BasicActivitiesPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__REDEFINED_EDGE:
				getRedefinedEdge().clear();
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP:
				getInGroup().clear();
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION:
				getInPartition().clear();
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)null);
				return;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
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
			case BasicActivitiesPackage.ACTIVITY_EDGE__TARGET:
				return target != null;
			case BasicActivitiesPackage.ACTIVITY_EDGE__SOURCE:
				return source != null;
			case BasicActivitiesPackage.ACTIVITY_EDGE__REDEFINED_EDGE:
				return redefinedEdge != null && !redefinedEdge.isEmpty();
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_GROUP:
				return inGroup != null && !inGroup.isEmpty();
			case BasicActivitiesPackage.ACTIVITY_EDGE__GUARD:
				return guard != null;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case BasicActivitiesPackage.ACTIVITY_EDGE__WEIGHT:
				return weight != null;
			case BasicActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS:
				return interrupts != null;
			case BasicActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityEdgeImpl
