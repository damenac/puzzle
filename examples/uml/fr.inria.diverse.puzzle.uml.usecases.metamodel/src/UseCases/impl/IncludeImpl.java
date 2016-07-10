/**
 */
package UseCases.impl;

import UseCases.Include;
import UseCases.UseCase;
import UseCases.UseCasesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link UseCases.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 *   <li>{@link UseCases.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends DirectedRelationshipImpl implements Include {
	/**
	 * The cached value of the '{@link #getIncludingCase() <em>Including Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludingCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase includingCase;

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected UseCase addition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasesPackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getIncludingCase() {
		if (includingCase != null && includingCase.eIsProxy()) {
			InternalEObject oldIncludingCase = (InternalEObject)includingCase;
			includingCase = (UseCase)eResolveProxy(oldIncludingCase);
			if (includingCase != oldIncludingCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasesPackage.INCLUDE__INCLUDING_CASE, oldIncludingCase, includingCase));
			}
		}
		return includingCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetIncludingCase() {
		return includingCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludingCase(UseCase newIncludingCase, NotificationChain msgs) {
		UseCase oldIncludingCase = includingCase;
		includingCase = newIncludingCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UseCasesPackage.INCLUDE__INCLUDING_CASE, oldIncludingCase, newIncludingCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(UseCase newIncludingCase) {
		if (newIncludingCase != includingCase) {
			NotificationChain msgs = null;
			if (includingCase != null)
				msgs = ((InternalEObject)includingCase).eInverseRemove(this, UseCasesPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
			if (newIncludingCase != null)
				msgs = ((InternalEObject)newIncludingCase).eInverseAdd(this, UseCasesPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
			msgs = basicSetIncludingCase(newIncludingCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasesPackage.INCLUDE__INCLUDING_CASE, newIncludingCase, newIncludingCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getAddition() {
		if (addition != null && addition.eIsProxy()) {
			InternalEObject oldAddition = (InternalEObject)addition;
			addition = (UseCase)eResolveProxy(oldAddition);
			if (addition != oldAddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasesPackage.INCLUDE__ADDITION, oldAddition, addition));
			}
		}
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(UseCase newAddition) {
		UseCase oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasesPackage.INCLUDE__ADDITION, oldAddition, addition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseCasesPackage.INCLUDE__INCLUDING_CASE:
				if (includingCase != null)
					msgs = ((InternalEObject)includingCase).eInverseRemove(this, UseCasesPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
				return basicSetIncludingCase((UseCase)otherEnd, msgs);
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
			case UseCasesPackage.INCLUDE__INCLUDING_CASE:
				return basicSetIncludingCase(null, msgs);
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
			case UseCasesPackage.INCLUDE__INCLUDING_CASE:
				if (resolve) return getIncludingCase();
				return basicGetIncludingCase();
			case UseCasesPackage.INCLUDE__ADDITION:
				if (resolve) return getAddition();
				return basicGetAddition();
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
			case UseCasesPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)newValue);
				return;
			case UseCasesPackage.INCLUDE__ADDITION:
				setAddition((UseCase)newValue);
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
			case UseCasesPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)null);
				return;
			case UseCasesPackage.INCLUDE__ADDITION:
				setAddition((UseCase)null);
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
			case UseCasesPackage.INCLUDE__INCLUDING_CASE:
				return includingCase != null;
			case UseCasesPackage.INCLUDE__ADDITION:
				return addition != null;
		}
		return super.eIsSet(featureID);
	}

} //IncludeImpl
