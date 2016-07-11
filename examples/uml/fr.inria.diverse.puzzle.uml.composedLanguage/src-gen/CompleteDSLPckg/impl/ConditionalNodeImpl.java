/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Clause;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.ConditionalNode;
import CompleteDSLPckg.ExecutableNode;
import CompleteDSLPckg.OutputPin;

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
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.ConditionalNodeImpl#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ConditionalNodeImpl#isIsAssumed <em>Is Assumed</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ConditionalNodeImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ConditionalNodeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ConditionalNodeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ConditionalNodeImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
	/**
	 * The default value of the '{@link #isIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DETERMINATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected boolean isDeterminate = IS_DETERMINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAssumed() <em>Is Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssumed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSUMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAssumed() <em>Is Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssumed()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssumed = IS_ASSUMED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clause;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> test;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> body;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getConditionalNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDeterminate() {
		return isDeterminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeterminate(boolean newIsDeterminate) {
		boolean oldIsDeterminate = isDeterminate;
		isDeterminate = newIsDeterminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate, isDeterminate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssumed() {
		return isAssumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssumed(boolean newIsAssumed) {
		boolean oldIsAssumed = isAssumed;
		isAssumed = newIsAssumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_ASSUMED, oldIsAssumed, isAssumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClause() {
		if (clause == null) {
			clause = new EObjectContainmentEList<Clause>(Clause.class, this, CompleteDSLPckgPackage.CONDITIONAL_NODE__CLAUSE);
		}
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getTest() {
		if (test == null) {
			test = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, CompleteDSLPckgPackage.CONDITIONAL_NODE__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, CompleteDSLPckgPackage.CONDITIONAL_NODE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, CompleteDSLPckgPackage.CONDITIONAL_NODE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__CLAUSE:
				return ((InternalEList<?>)getClause()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				return isIsDeterminate();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_ASSUMED:
				return isIsAssumed();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__CLAUSE:
				return getClause();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__TEST:
				return getTest();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__BODY:
				return getBody();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__RESULT:
				return getResult();
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
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_ASSUMED:
				setIsAssumed((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				getClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
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
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate(IS_DETERMINATE_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_ASSUMED:
				setIsAssumed(IS_ASSUMED_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__TEST:
				getTest().clear();
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__BODY:
				getBody().clear();
				return;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__RESULT:
				getResult().clear();
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
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				return isDeterminate != IS_DETERMINATE_EDEFAULT;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__IS_ASSUMED:
				return isAssumed != IS_ASSUMED_EDEFAULT;
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__CLAUSE:
				return clause != null && !clause.isEmpty();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__TEST:
				return test != null && !test.isEmpty();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__BODY:
				return body != null && !body.isEmpty();
			case CompleteDSLPckgPackage.CONDITIONAL_NODE__RESULT:
				return result != null && !result.isEmpty();
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
		result.append(" (isDeterminate: ");
		result.append(isDeterminate);
		result.append(", isAssumed: ");
		result.append(isAssumed);
		result.append(')');
		return result.toString();
	}

} //ConditionalNodeImpl
