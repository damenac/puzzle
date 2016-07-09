/**
 */
package CommonBehavior.SimpleTime.impl;

import CommonBehavior.Communications.NamedElement;

import CommonBehavior.SimpleTime.DurationObservation;
import CommonBehavior.SimpleTime.SimpleTimePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.impl.DurationObservationImpl#getFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.impl.DurationObservationImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationObservationImpl extends ObservationImpl implements DurationObservation {
	/**
	 * The cached value of the '{@link #getFirstEvent() <em>First Event</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> firstEvent;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleTimePackage.Literals.DURATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getFirstEvent() {
		if (firstEvent == null) {
			firstEvent = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, SimpleTimePackage.DURATION_OBSERVATION__FIRST_EVENT);
		}
		return firstEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getEvent() {
		if (event == null) {
			event = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, SimpleTimePackage.DURATION_OBSERVATION__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleTimePackage.DURATION_OBSERVATION__FIRST_EVENT:
				return getFirstEvent();
			case SimpleTimePackage.DURATION_OBSERVATION__EVENT:
				return getEvent();
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
			case SimpleTimePackage.DURATION_OBSERVATION__FIRST_EVENT:
				getFirstEvent().clear();
				getFirstEvent().addAll((Collection<? extends Boolean>)newValue);
				return;
			case SimpleTimePackage.DURATION_OBSERVATION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends NamedElement>)newValue);
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
			case SimpleTimePackage.DURATION_OBSERVATION__FIRST_EVENT:
				getFirstEvent().clear();
				return;
			case SimpleTimePackage.DURATION_OBSERVATION__EVENT:
				getEvent().clear();
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
			case SimpleTimePackage.DURATION_OBSERVATION__FIRST_EVENT:
				return firstEvent != null && !firstEvent.isEmpty();
			case SimpleTimePackage.DURATION_OBSERVATION__EVENT:
				return event != null && !event.isEmpty();
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
		result.append(" (firstEvent: ");
		result.append(firstEvent);
		result.append(')');
		return result.toString();
	}

} //DurationObservationImpl
