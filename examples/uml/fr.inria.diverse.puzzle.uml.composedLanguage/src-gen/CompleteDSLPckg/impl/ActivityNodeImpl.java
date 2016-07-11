/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.ActivityEdge;
import CompleteDSLPckg.ActivityGroup;
import CompleteDSLPckg.ActivityNode;
import CompleteDSLPckg.ActivityPartition;
import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.InterruptibleActivityRegion;
import CompleteDSLPckg.RedefinableElement;
import CompleteDSLPckg.StructuredActivityNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends NamedElementImpl implements ActivityNode {
	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RedefinableElement> redefinedElement;

	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinitionContext;

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
	 * The cached value of the '{@link #getRedefinedNode() <em>Redefined Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> redefinedNode;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoing;

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
	 * The cached value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion inInterruptibleRegion;

	/**
	 * The cached value of the '{@link #getInStructuredNode() <em>In Structured Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected StructuredActivityNode inStructuredNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ACTIVITY_NODE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_ELEMENT);
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT);
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getInGroup() {
		if (inGroup == null) {
			inGroup = new EObjectResolvingEList<ActivityGroup>(ActivityGroup.class, this, CompleteDSLPckgPackage.ACTIVITY_NODE__IN_GROUP);
		}
		return inGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getRedefinedNode() {
		if (redefinedNode == null) {
			redefinedNode = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_NODE);
		}
		return redefinedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, CompleteDSLPckgPackage.ACTIVITY_NODE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, CompleteDSLPckgPackage.ACTIVITY_NODE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getInPartition() {
		if (inPartition == null) {
			inPartition = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this, CompleteDSLPckgPackage.ACTIVITY_NODE__IN_PARTITION);
		}
		return inPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInInterruptibleRegion() {
		if (inInterruptibleRegion != null && inInterruptibleRegion.eIsProxy()) {
			InternalEObject oldInInterruptibleRegion = (InternalEObject)inInterruptibleRegion;
			inInterruptibleRegion = (InterruptibleActivityRegion)eResolveProxy(oldInInterruptibleRegion);
			if (inInterruptibleRegion != oldInInterruptibleRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
			}
		}
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInInterruptibleRegion() {
		return inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInInterruptibleRegion(InterruptibleActivityRegion newInInterruptibleRegion) {
		InterruptibleActivityRegion oldInInterruptibleRegion = inInterruptibleRegion;
		inInterruptibleRegion = newInInterruptibleRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, oldInInterruptibleRegion, inInterruptibleRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (inStructuredNode != null && inStructuredNode.eIsProxy()) {
			InternalEObject oldInStructuredNode = (InternalEObject)inStructuredNode;
			inStructuredNode = (StructuredActivityNode)eResolveProxy(oldInStructuredNode);
			if (inStructuredNode != oldInStructuredNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, oldInStructuredNode, inStructuredNode));
			}
		}
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetInStructuredNode() {
		return inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		StructuredActivityNode oldInStructuredNode = inStructuredNode;
		inStructuredNode = newInStructuredNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, oldInStructuredNode, inStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IS_LEAF:
				return isIsLeaf();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_GROUP:
				return getInGroup();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_NODE:
				return getRedefinedNode();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_PARTITION:
				return getInPartition();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
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
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				getInGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				getRedefinedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)newValue);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
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
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_NODE:
				getRedefinedNode().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				setInInterruptibleRegion((InterruptibleActivityRegion)null);
				return;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
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
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_GROUP:
				return inGroup != null && !inGroup.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_NODE:
				return redefinedNode != null && !redefinedNode.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null;
			case CompleteDSLPckgPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return inStructuredNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.ACTIVITY_NODE__IS_LEAF: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF: return CompleteDSLPckgPackage.ACTIVITY_NODE__IS_LEAF;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.ACTIVITY_NODE__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(')');
		return result.toString();
	}

} //ActivityNodeImpl
