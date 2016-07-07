/**
 */
package StateMachineModuleProv.impl;

import StateMachineModuleProv.AbstractState;
import StateMachineModuleProv.Region;
import StateMachineModuleProv.State;
import StateMachineModuleProv.StateMachineModuleProvPackage;
import StateMachineModuleProv.Transition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link StateMachineModuleProv.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link StateMachineModuleProv.impl.RegionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link StateMachineModuleProv.impl.RegionImpl#getOwnerState <em>Owner State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamedElementImpl implements Region {
	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractState> subvertex;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getOwnerState() <em>Owner State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerState()
	 * @generated
	 * @ordered
	 */
	protected State ownerState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachineModuleProvPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentEList<AbstractState>(AbstractState.class, this, StateMachineModuleProvPackage.REGION__SUBVERTEX);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, StateMachineModuleProvPackage.REGION__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getOwnerState() {
		if (ownerState != null && ownerState.eIsProxy()) {
			InternalEObject oldOwnerState = (InternalEObject)ownerState;
			ownerState = (State)eResolveProxy(oldOwnerState);
			if (ownerState != oldOwnerState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachineModuleProvPackage.REGION__OWNER_STATE, oldOwnerState, ownerState));
			}
		}
		return ownerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetOwnerState() {
		return ownerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerState(State newOwnerState) {
		State oldOwnerState = ownerState;
		ownerState = newOwnerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachineModuleProvPackage.REGION__OWNER_STATE, oldOwnerState, ownerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initRegion(Object context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextPathByRegion() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void step(Object context, Object events) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeStatesFromContext(Object context, Object toRemove) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addStatesToContext(Object context, Object newStates) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCurrentState(Object context, Object events) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getActiveTransitions(AbstractState vertex, Object events) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findOldActiveStates(Object oldActiveStates, Transition selectedTransition, Object context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findNewActiveStates(Object newActiveStates, Transition selectedTransition, Object currentActiveTransitions, Object context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findNewActiveTransitions(Object newActiveTransitions, Transition selectedTransition, Object context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllParents(AbstractState vertex, Object parents) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllChildren(AbstractState vertex, Object children) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deepestConflictingTransition(Object activeTransitions) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextPath(AbstractState _vertex) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllSubstates(AbstractState vertex, Object children) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveHistoryState(Object context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object deepHistory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deepHistory(Object deepHistory) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State history() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void history(State history) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachineModuleProvPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case StateMachineModuleProvPackage.REGION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case StateMachineModuleProvPackage.REGION__SUBVERTEX:
				return getSubvertex();
			case StateMachineModuleProvPackage.REGION__TRANSITIONS:
				return getTransitions();
			case StateMachineModuleProvPackage.REGION__OWNER_STATE:
				if (resolve) return getOwnerState();
				return basicGetOwnerState();
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
			case StateMachineModuleProvPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends AbstractState>)newValue);
				return;
			case StateMachineModuleProvPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StateMachineModuleProvPackage.REGION__OWNER_STATE:
				setOwnerState((State)newValue);
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
			case StateMachineModuleProvPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case StateMachineModuleProvPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				return;
			case StateMachineModuleProvPackage.REGION__OWNER_STATE:
				setOwnerState((State)null);
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
			case StateMachineModuleProvPackage.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case StateMachineModuleProvPackage.REGION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case StateMachineModuleProvPackage.REGION__OWNER_STATE:
				return ownerState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StateMachineModuleProvPackage.REGION___INIT_REGION__OBJECT:
				initRegion(arguments.get(0));
				return null;
			case StateMachineModuleProvPackage.REGION___GET_CONTEXT_PATH_BY_REGION:
				return getContextPathByRegion();
			case StateMachineModuleProvPackage.REGION___STEP__OBJECT_OBJECT:
				step(arguments.get(0), arguments.get(1));
				return null;
			case StateMachineModuleProvPackage.REGION___REMOVE_STATES_FROM_CONTEXT__OBJECT_OBJECT:
				removeStatesFromContext(arguments.get(0), arguments.get(1));
				return null;
			case StateMachineModuleProvPackage.REGION___ADD_STATES_TO_CONTEXT__OBJECT_OBJECT:
				addStatesToContext(arguments.get(0), arguments.get(1));
				return null;
			case StateMachineModuleProvPackage.REGION___GET_CURRENT_STATE__OBJECT_OBJECT:
				return getCurrentState(arguments.get(0), arguments.get(1));
			case StateMachineModuleProvPackage.REGION___GET_ACTIVE_TRANSITIONS__ABSTRACTSTATE_OBJECT:
				return getActiveTransitions((AbstractState)arguments.get(0), arguments.get(1));
			case StateMachineModuleProvPackage.REGION___FIND_OLD_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT:
				findOldActiveStates(arguments.get(0), (Transition)arguments.get(1), arguments.get(2));
				return null;
			case StateMachineModuleProvPackage.REGION___FIND_NEW_ACTIVE_STATES__OBJECT_TRANSITION_OBJECT_OBJECT:
				findNewActiveStates(arguments.get(0), (Transition)arguments.get(1), arguments.get(2), arguments.get(3));
				return null;
			case StateMachineModuleProvPackage.REGION___FIND_NEW_ACTIVE_TRANSITIONS__OBJECT_TRANSITION_OBJECT:
				findNewActiveTransitions(arguments.get(0), (Transition)arguments.get(1), arguments.get(2));
				return null;
			case StateMachineModuleProvPackage.REGION___GET_ALL_PARENTS__ABSTRACTSTATE_OBJECT:
				getAllParents((AbstractState)arguments.get(0), arguments.get(1));
				return null;
			case StateMachineModuleProvPackage.REGION___GET_ALL_CHILDREN__ABSTRACTSTATE_OBJECT:
				getAllChildren((AbstractState)arguments.get(0), arguments.get(1));
				return null;
			case StateMachineModuleProvPackage.REGION___DEEPEST_CONFLICTING_TRANSITION__OBJECT:
				return deepestConflictingTransition(arguments.get(0));
			case StateMachineModuleProvPackage.REGION___GET_CONTEXT_PATH__ABSTRACTSTATE:
				return getContextPath((AbstractState)arguments.get(0));
			case StateMachineModuleProvPackage.REGION___GET_ALL_SUBSTATES__ABSTRACTSTATE_OBJECT:
				getAllSubstates((AbstractState)arguments.get(0), arguments.get(1));
				return null;
			case StateMachineModuleProvPackage.REGION___SAVE_HISTORY_STATE__OBJECT:
				saveHistoryState(arguments.get(0));
				return null;
			case StateMachineModuleProvPackage.REGION___DEEP_HISTORY:
				return deepHistory();
			case StateMachineModuleProvPackage.REGION___DEEP_HISTORY__OBJECT:
				deepHistory(arguments.get(0));
				return null;
			case StateMachineModuleProvPackage.REGION___HISTORY:
				return history();
			case StateMachineModuleProvPackage.REGION___HISTORY__STATE:
				history((State)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RegionImpl
