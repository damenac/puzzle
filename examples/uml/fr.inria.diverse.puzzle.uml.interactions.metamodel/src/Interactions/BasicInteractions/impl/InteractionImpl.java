/**
 */
package Interactions.BasicInteractions.impl;

import Interactions.BasicInteractions.Action;
import Interactions.BasicInteractions.BasicInteractionsPackage;
import Interactions.BasicInteractions.GeneralOrdering;
import Interactions.BasicInteractions.Interaction;
import Interactions.BasicInteractions.InteractionFragment;
import Interactions.BasicInteractions.Lifeline;
import Interactions.BasicInteractions.NamedElement;

import Interactions.Fragments.FragmentsPackage;
import Interactions.Fragments.Gate;
import Interactions.Fragments.InteractionOperand;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.impl.InteractionImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.InteractionImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.InteractionImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.InteractionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.InteractionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.InteractionImpl#getFormalGate <em>Formal Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends BehaviorImpl implements Interaction {
	/**
	 * The cached value of the '{@link #getCovered() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> covered;

	/**
	 * The cached value of the '{@link #getGeneralOrdering() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> generalOrdering;

	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragment;

	/**
	 * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeline()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> lifeline;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getFormalGate() <em>Formal Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> formalGate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicInteractionsPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered() {
		if (covered == null) {
			covered = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(Lifeline.class, this, BasicInteractionsPackage.INTERACTION__COVERED, BasicInteractionsPackage.LIFELINE__COVERED_BY);
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID() != BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND) return null;
		return (InteractionOperand)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosingOperand(InteractionOperand newEnclosingOperand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer() || (eContainerFeatureID() != BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject)newEnclosingOperand).eInverseAdd(this, FragmentsPackage.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
			msgs = basicSetEnclosingOperand(newEnclosingOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment() {
		if (fragment == null) {
			fragment = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, BasicInteractionsPackage.INTERACTION__FRAGMENT);
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getLifeline() {
		if (lifeline == null) {
			lifeline = new EObjectContainmentWithInverseEList<Lifeline>(Lifeline.class, this, BasicInteractionsPackage.INTERACTION__LIFELINE, BasicInteractionsPackage.LIFELINE__INTERACTION);
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, BasicInteractionsPackage.INTERACTION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getFormalGate() {
		if (formalGate == null) {
			formalGate = new EObjectContainmentEList<Gate>(Gate.class, this, BasicInteractionsPackage.INTERACTION__FORMAL_GATE);
		}
		return formalGate;
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
			case BasicInteractionsPackage.INTERACTION__COVERED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCovered()).basicAdd(otherEnd, msgs);
			case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingOperand((InteractionOperand)otherEnd, msgs);
			case BasicInteractionsPackage.INTERACTION__LIFELINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLifeline()).basicAdd(otherEnd, msgs);
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
			case BasicInteractionsPackage.INTERACTION__COVERED:
				return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
			case BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND:
				return basicSetEnclosingOperand(null, msgs);
			case BasicInteractionsPackage.INTERACTION__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
			case BasicInteractionsPackage.INTERACTION__LIFELINE:
				return ((InternalEList<?>)getLifeline()).basicRemove(otherEnd, msgs);
			case BasicInteractionsPackage.INTERACTION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case BasicInteractionsPackage.INTERACTION__FORMAL_GATE:
				return ((InternalEList<?>)getFormalGate()).basicRemove(otherEnd, msgs);
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
			case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND:
				return eInternalContainer().eInverseRemove(this, FragmentsPackage.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
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
			case BasicInteractionsPackage.INTERACTION__COVERED:
				return getCovered();
			case BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING:
				return getGeneralOrdering();
			case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case BasicInteractionsPackage.INTERACTION__FRAGMENT:
				return getFragment();
			case BasicInteractionsPackage.INTERACTION__LIFELINE:
				return getLifeline();
			case BasicInteractionsPackage.INTERACTION__ACTION:
				return getAction();
			case BasicInteractionsPackage.INTERACTION__FORMAL_GATE:
				return getFormalGate();
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
			case BasicInteractionsPackage.INTERACTION__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case BasicInteractionsPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case BasicInteractionsPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				getLifeline().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case BasicInteractionsPackage.INTERACTION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case BasicInteractionsPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
				getFormalGate().addAll((Collection<? extends Gate>)newValue);
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
			case BasicInteractionsPackage.INTERACTION__COVERED:
				getCovered().clear();
				return;
			case BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case BasicInteractionsPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				return;
			case BasicInteractionsPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				return;
			case BasicInteractionsPackage.INTERACTION__ACTION:
				getAction().clear();
				return;
			case BasicInteractionsPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
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
			case BasicInteractionsPackage.INTERACTION__COVERED:
				return covered != null && !covered.isEmpty();
			case BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case BasicInteractionsPackage.INTERACTION__FRAGMENT:
				return fragment != null && !fragment.isEmpty();
			case BasicInteractionsPackage.INTERACTION__LIFELINE:
				return lifeline != null && !lifeline.isEmpty();
			case BasicInteractionsPackage.INTERACTION__ACTION:
				return action != null && !action.isEmpty();
			case BasicInteractionsPackage.INTERACTION__FORMAL_GATE:
				return formalGate != null && !formalGate.isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case BasicInteractionsPackage.INTERACTION__COVERED: return BasicInteractionsPackage.INTERACTION_FRAGMENT__COVERED;
				case BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING: return BasicInteractionsPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND: return BasicInteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case BasicInteractionsPackage.INTERACTION_FRAGMENT__COVERED: return BasicInteractionsPackage.INTERACTION__COVERED;
				case BasicInteractionsPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return BasicInteractionsPackage.INTERACTION__GENERAL_ORDERING;
				case BasicInteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return BasicInteractionsPackage.INTERACTION__ENCLOSING_OPERAND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InteractionImpl
