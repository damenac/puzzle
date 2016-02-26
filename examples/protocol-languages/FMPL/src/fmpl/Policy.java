/**
 */
package fmpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fmpl.Policy#getAutomatas <em>Automatas</em>}</li>
 *   <li>{@link fmpl.Policy#getStatements <em>Statements</em>}</li>
 *   <li>{@link fmpl.Policy#getName <em>Name</em>}</li>
 *   <li>{@link fmpl.Policy#getParserURI <em>Parser URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see fmpl.FmplPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject {
	/**
	 * Returns the value of the '<em><b>Automatas</b></em>' containment reference list.
	 * The list contents are of type {@link fmpl.Automata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatas</em>' containment reference list.
	 * @see fmpl.FmplPackage#getPolicy_Automatas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Automata> getAutomatas();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link fmpl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see fmpl.FmplPackage#getPolicy_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getStatements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fmpl.FmplPackage#getPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fmpl.Policy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parser URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser URI</em>' attribute.
	 * @see #setParserURI(String)
	 * @see fmpl.FmplPackage#getPolicy_ParserURI()
	 * @model transient="true"
	 * @generated
	 */
	String getParserURI();

	/**
	 * Sets the value of the '{@link fmpl.Policy#getParserURI <em>Parser URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser URI</em>' attribute.
	 * @see #getParserURI()
	 * @generated
	 */
	void setParserURI(String value);

} // Policy
