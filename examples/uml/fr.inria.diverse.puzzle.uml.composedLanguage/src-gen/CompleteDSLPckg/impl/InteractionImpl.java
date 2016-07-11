/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Action;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Gate;
import CompleteDSLPckg.GeneralOrdering;
import CompleteDSLPckg.Interaction;
import CompleteDSLPckg.InteractionFragment;
import CompleteDSLPckg.InteractionOperand;
import CompleteDSLPckg.Lifeline;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.InteractionImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InteractionImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InteractionImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InteractionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InteractionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.InteractionImpl#getFormalGate <em>Formal Gate</em>}</li>
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
	 * The cached value of the '{@link #getEnclosingOperand() <em>Enclosing Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingOperand()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperand enclosingOperand;

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
		return CompleteDSLPckgPackage.eINSTANCE.getInteraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered() {
		if (covered == null) {
			covered = new EObjectResolvingEList<Lifeline>(Lifeline.class, this, CompleteDSLPckgPackage.INTERACTION__COVERED);
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
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (enclosingOperand != null && enclosingOperand.eIsProxy()) {
			InternalEObject oldEnclosingOperand = (InternalEObject)enclosingOperand;
			enclosingOperand = (InteractionOperand)eResolveProxy(oldEnclosingOperand);
			if (enclosingOperand != oldEnclosingOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
			}
		}
		return enclosingOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand basicGetEnclosingOperand() {
		return enclosingOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		InteractionOperand oldEnclosingOperand = enclosingOperand;
		enclosingOperand = newEnclosingOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment() {
		if (fragment == null) {
			fragment = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, CompleteDSLPckgPackage.INTERACTION__FRAGMENT);
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
			lifeline = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, CompleteDSLPckgPackage.INTERACTION__LIFELINE);
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
			action = new EObjectContainmentEList<Action>(Action.class, this, CompleteDSLPckgPackage.INTERACTION__ACTION);
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
			formalGate = new EObjectContainmentEList<Gate>(Gate.class, this, CompleteDSLPckgPackage.INTERACTION__FORMAL_GATE);
		}
		return formalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.INTERACTION__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.INTERACTION__LIFELINE:
				return ((InternalEList<?>)getLifeline()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.INTERACTION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.INTERACTION__FORMAL_GATE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompleteDSLPckgPackage.INTERACTION__COVERED:
				return getCovered();
			case CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING:
				return getGeneralOrdering();
			case CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND:
				if (resolve) return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case CompleteDSLPckgPackage.INTERACTION__FRAGMENT:
				return getFragment();
			case CompleteDSLPckgPackage.INTERACTION__LIFELINE:
				return getLifeline();
			case CompleteDSLPckgPackage.INTERACTION__ACTION:
				return getAction();
			case CompleteDSLPckgPackage.INTERACTION__FORMAL_GATE:
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
			case CompleteDSLPckgPackage.INTERACTION__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case CompleteDSLPckgPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case CompleteDSLPckgPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				getLifeline().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case CompleteDSLPckgPackage.INTERACTION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case CompleteDSLPckgPackage.INTERACTION__FORMAL_GATE:
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
			case CompleteDSLPckgPackage.INTERACTION__COVERED:
				getCovered().clear();
				return;
			case CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case CompleteDSLPckgPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				return;
			case CompleteDSLPckgPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				return;
			case CompleteDSLPckgPackage.INTERACTION__ACTION:
				getAction().clear();
				return;
			case CompleteDSLPckgPackage.INTERACTION__FORMAL_GATE:
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
			case CompleteDSLPckgPackage.INTERACTION__COVERED:
				return covered != null && !covered.isEmpty();
			case CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND:
				return enclosingOperand != null;
			case CompleteDSLPckgPackage.INTERACTION__FRAGMENT:
				return fragment != null && !fragment.isEmpty();
			case CompleteDSLPckgPackage.INTERACTION__LIFELINE:
				return lifeline != null && !lifeline.isEmpty();
			case CompleteDSLPckgPackage.INTERACTION__ACTION:
				return action != null && !action.isEmpty();
			case CompleteDSLPckgPackage.INTERACTION__FORMAL_GATE:
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
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.INTERACTION__COVERED: return CompleteDSLPckgPackage.INTERACTION_FRAGMENT__COVERED;
				case CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING: return CompleteDSLPckgPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				case CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND: return CompleteDSLPckgPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
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
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.INTERACTION_FRAGMENT__COVERED: return CompleteDSLPckgPackage.INTERACTION__COVERED;
				case CompleteDSLPckgPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return CompleteDSLPckgPackage.INTERACTION__GENERAL_ORDERING;
				case CompleteDSLPckgPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return CompleteDSLPckgPackage.INTERACTION__ENCLOSING_OPERAND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InteractionImpl
