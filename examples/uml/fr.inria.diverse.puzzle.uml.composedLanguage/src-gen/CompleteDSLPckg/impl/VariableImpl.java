/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.MultiplicityElement;
import CompleteDSLPckg.ValueSpecification;
import CompleteDSLPckg.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.VariableImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.VariableImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.VariableImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.VariableImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.VariableImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.VariableImpl#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ConnectableElementImpl implements Variable {
	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getVariable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, CompleteDSLPckgPackage.VALUE_SPECIFICATION__OWNING_UPPER, ValueSpecification.class, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, CompleteDSLPckgPackage.VALUE_SPECIFICATION__OWNING_UPPER, ValueSpecification.class, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, CompleteDSLPckgPackage.VALUE_SPECIFICATION__OWNING_LOWER, ValueSpecification.class, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, CompleteDSLPckgPackage.VALUE_SPECIFICATION__OWNING_LOWER, ValueSpecification.class, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE:
				if (upperValue != null)
					msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE, null, msgs);
				return basicSetUpperValue((ValueSpecification)otherEnd, msgs);
			case CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE:
				if (lowerValue != null)
					msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE, null, msgs);
				return basicSetLowerValue((ValueSpecification)otherEnd, msgs);
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
			case CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
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
			case CompleteDSLPckgPackage.VARIABLE__IS_ORDERED:
				return isIsOrdered();
			case CompleteDSLPckgPackage.VARIABLE__IS_UNIQUE:
				return isIsUnique();
			case CompleteDSLPckgPackage.VARIABLE__UPPER:
				return getUpper();
			case CompleteDSLPckgPackage.VARIABLE__LOWER:
				return getLower();
			case CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE:
				return getUpperValue();
			case CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE:
				return getLowerValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompleteDSLPckgPackage.VARIABLE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.VARIABLE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.VARIABLE__UPPER:
				setUpper((Integer)newValue);
				return;
			case CompleteDSLPckgPackage.VARIABLE__LOWER:
				setLower((Integer)newValue);
				return;
			case CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
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
			case CompleteDSLPckgPackage.VARIABLE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.VARIABLE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.VARIABLE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.VARIABLE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
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
			case CompleteDSLPckgPackage.VARIABLE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case CompleteDSLPckgPackage.VARIABLE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case CompleteDSLPckgPackage.VARIABLE__UPPER:
				return upper != UPPER_EDEFAULT;
			case CompleteDSLPckgPackage.VARIABLE__LOWER:
				return lower != LOWER_EDEFAULT;
			case CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE:
				return upperValue != null;
			case CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE:
				return lowerValue != null;
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
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.VARIABLE__IS_ORDERED: return CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case CompleteDSLPckgPackage.VARIABLE__IS_UNIQUE: return CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case CompleteDSLPckgPackage.VARIABLE__UPPER: return CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__UPPER;
				case CompleteDSLPckgPackage.VARIABLE__LOWER: return CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__LOWER;
				case CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE: return CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE: return CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return CompleteDSLPckgPackage.VARIABLE__IS_ORDERED;
				case CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return CompleteDSLPckgPackage.VARIABLE__IS_UNIQUE;
				case CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__UPPER: return CompleteDSLPckgPackage.VARIABLE__UPPER;
				case CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__LOWER: return CompleteDSLPckgPackage.VARIABLE__LOWER;
				case CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return CompleteDSLPckgPackage.VARIABLE__UPPER_VALUE;
				case CompleteDSLPckgPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return CompleteDSLPckgPackage.VARIABLE__LOWER_VALUE;
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", upper: ");
		result.append(upper);
		result.append(", lower: ");
		result.append(lower);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
