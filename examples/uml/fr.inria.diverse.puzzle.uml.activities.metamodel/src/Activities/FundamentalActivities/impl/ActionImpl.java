/**
 */
package Activities.FundamentalActivities.impl;

import Activities.CompleteStructuredActivities.InputPin;

import Activities.FundamentalActivities.Action;
import Activities.FundamentalActivities.FundamentalActivitiesPackage;

import Activities.IntermediateActivities.Constraint;

import Activities.StructuredActivities.OutputPin;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.impl.ActionImpl#isIsLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActionImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActionImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.impl.ActionImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends ActivityNodeImpl implements Action {
	/**
	 * The default value of the '{@link #isIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCALLY_REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocallyReentrant = IS_LOCALLY_REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPrecondition;

	/**
	 * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPostcondition;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FundamentalActivitiesPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocallyReentrant() {
		return isLocallyReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocallyReentrant(boolean newIsLocallyReentrant) {
		boolean oldIsLocallyReentrant = isLocallyReentrant;
		isLocallyReentrant = newIsLocallyReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FundamentalActivitiesPackage.ACTION__IS_LOCALLY_REENTRANT, oldIsLocallyReentrant, isLocallyReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPrecondition() {
		if (localPrecondition == null) {
			localPrecondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION);
		}
		return localPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPostcondition() {
		if (localPostcondition == null) {
			localPostcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION);
		}
		return localPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<InputPin>(InputPin.class, this, FundamentalActivitiesPackage.ACTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, FundamentalActivitiesPackage.ACTION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION:
				return ((InternalEList<?>)getLocalPrecondition()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList<?>)getLocalPostcondition()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FundamentalActivitiesPackage.ACTION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case FundamentalActivitiesPackage.ACTION__IS_LOCALLY_REENTRANT:
				return isIsLocallyReentrant();
			case FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
			case FundamentalActivitiesPackage.ACTION__INPUT:
				return getInput();
			case FundamentalActivitiesPackage.ACTION__OUTPUT:
				return getOutput();
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
			case FundamentalActivitiesPackage.ACTION__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant((Boolean)newValue);
				return;
			case FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				getLocalPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				getLocalPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case FundamentalActivitiesPackage.ACTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends OutputPin>)newValue);
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
			case FundamentalActivitiesPackage.ACTION__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				return;
			case FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				return;
			case FundamentalActivitiesPackage.ACTION__INPUT:
				getInput().clear();
				return;
			case FundamentalActivitiesPackage.ACTION__OUTPUT:
				getOutput().clear();
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
			case FundamentalActivitiesPackage.ACTION__IS_LOCALLY_REENTRANT:
				return isLocallyReentrant != IS_LOCALLY_REENTRANT_EDEFAULT;
			case FundamentalActivitiesPackage.ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case FundamentalActivitiesPackage.ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case FundamentalActivitiesPackage.ACTION__INPUT:
				return input != null && !input.isEmpty();
			case FundamentalActivitiesPackage.ACTION__OUTPUT:
				return output != null && !output.isEmpty();
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
		result.append(" (isLocallyReentrant: ");
		result.append(isLocallyReentrant);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
