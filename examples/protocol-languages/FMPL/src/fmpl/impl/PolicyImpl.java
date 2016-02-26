/**
 */
package fmpl.impl;

import fmpl.Automata;
import fmpl.Expression;
import fmpl.FmplPackage;
import fmpl.Policy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fmpl.impl.PolicyImpl#getAutomatas <em>Automatas</em>}</li>
 *   <li>{@link fmpl.impl.PolicyImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link fmpl.impl.PolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link fmpl.impl.PolicyImpl#getParserURI <em>Parser URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy {
	/**
	 * The cached value of the '{@link #getAutomatas() <em>Automatas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomatas()
	 * @generated
	 * @ordered
	 */
	protected EList<Automata> automatas;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> statements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParserURI() <em>Parser URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PARSER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParserURI() <em>Parser URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserURI()
	 * @generated
	 * @ordered
	 */
	protected String parserURI = PARSER_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmplPackage.Literals.POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Automata> getAutomatas() {
		if (automatas == null) {
			automatas = new EObjectContainmentEList<Automata>(Automata.class, this, FmplPackage.POLICY__AUTOMATAS);
		}
		return automatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Expression>(Expression.class, this, FmplPackage.POLICY__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmplPackage.POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParserURI() {
		return parserURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParserURI(String newParserURI) {
		String oldParserURI = parserURI;
		parserURI = newParserURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmplPackage.POLICY__PARSER_URI, oldParserURI, parserURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmplPackage.POLICY__AUTOMATAS:
				return ((InternalEList<?>)getAutomatas()).basicRemove(otherEnd, msgs);
			case FmplPackage.POLICY__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case FmplPackage.POLICY__AUTOMATAS:
				return getAutomatas();
			case FmplPackage.POLICY__STATEMENTS:
				return getStatements();
			case FmplPackage.POLICY__NAME:
				return getName();
			case FmplPackage.POLICY__PARSER_URI:
				return getParserURI();
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
			case FmplPackage.POLICY__AUTOMATAS:
				getAutomatas().clear();
				getAutomatas().addAll((Collection<? extends Automata>)newValue);
				return;
			case FmplPackage.POLICY__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Expression>)newValue);
				return;
			case FmplPackage.POLICY__NAME:
				setName((String)newValue);
				return;
			case FmplPackage.POLICY__PARSER_URI:
				setParserURI((String)newValue);
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
			case FmplPackage.POLICY__AUTOMATAS:
				getAutomatas().clear();
				return;
			case FmplPackage.POLICY__STATEMENTS:
				getStatements().clear();
				return;
			case FmplPackage.POLICY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FmplPackage.POLICY__PARSER_URI:
				setParserURI(PARSER_URI_EDEFAULT);
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
			case FmplPackage.POLICY__AUTOMATAS:
				return automatas != null && !automatas.isEmpty();
			case FmplPackage.POLICY__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case FmplPackage.POLICY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FmplPackage.POLICY__PARSER_URI:
				return PARSER_URI_EDEFAULT == null ? parserURI != null : !PARSER_URI_EDEFAULT.equals(parserURI);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", parserURI: ");
		result.append(parserURI);
		result.append(')');
		return result.toString();
	}

} //PolicyImpl
