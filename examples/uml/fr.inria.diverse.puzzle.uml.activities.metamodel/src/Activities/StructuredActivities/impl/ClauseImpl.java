/**
 */
package Activities.StructuredActivities.impl;

import Activities.IntermediateActivities.impl.ElementImpl;

import Activities.StructuredActivities.Clause;
import Activities.StructuredActivities.OutputPin;
import Activities.StructuredActivities.StructuredActivitiesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Activities.StructuredActivities.impl.ClauseImpl#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.ClauseImpl#getSucessorClause <em>Sucessor Clause</em>}</li>
 *   <li>{@link Activities.StructuredActivities.impl.ClauseImpl#getDecider <em>Decider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseImpl extends ElementImpl implements Clause {
	/**
	 * The cached value of the '{@link #getPredecessorClause() <em>Predecessor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> predecessorClause;

	/**
	 * The cached value of the '{@link #getSucessorClause() <em>Sucessor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucessorClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> sucessorClause;

	/**
	 * The cached value of the '{@link #getDecider() <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider()
	 * @generated
	 * @ordered
	 */
	protected OutputPin decider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredActivitiesPackage.Literals.CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getPredecessorClause() {
		if (predecessorClause == null) {
			predecessorClause = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(Clause.class, this, StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE, StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE);
		}
		return predecessorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getSucessorClause() {
		if (sucessorClause == null) {
			sucessorClause = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(Clause.class, this, StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE, StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE);
		}
		return sucessorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		if (decider != null && decider.eIsProxy()) {
			InternalEObject oldDecider = (InternalEObject)decider;
			decider = (OutputPin)eResolveProxy(oldDecider);
			if (decider != oldDecider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredActivitiesPackage.CLAUSE__DECIDER, oldDecider, decider));
			}
		}
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetDecider() {
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin oldDecider = decider;
		decider = newDecider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredActivitiesPackage.CLAUSE__DECIDER, oldDecider, decider));
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
			case StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessorClause()).basicAdd(otherEnd, msgs);
			case StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSucessorClause()).basicAdd(otherEnd, msgs);
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
			case StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return ((InternalEList<?>)getPredecessorClause()).basicRemove(otherEnd, msgs);
			case StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE:
				return ((InternalEList<?>)getSucessorClause()).basicRemove(otherEnd, msgs);
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
			case StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return getPredecessorClause();
			case StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE:
				return getSucessorClause();
			case StructuredActivitiesPackage.CLAUSE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
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
			case StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				getPredecessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE:
				getSucessorClause().clear();
				getSucessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case StructuredActivitiesPackage.CLAUSE__DECIDER:
				setDecider((OutputPin)newValue);
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
			case StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				return;
			case StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE:
				getSucessorClause().clear();
				return;
			case StructuredActivitiesPackage.CLAUSE__DECIDER:
				setDecider((OutputPin)null);
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
			case StructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return predecessorClause != null && !predecessorClause.isEmpty();
			case StructuredActivitiesPackage.CLAUSE__SUCESSOR_CLAUSE:
				return sucessorClause != null && !sucessorClause.isEmpty();
			case StructuredActivitiesPackage.CLAUSE__DECIDER:
				return decider != null;
		}
		return super.eIsSet(featureID);
	}

} //ClauseImpl
