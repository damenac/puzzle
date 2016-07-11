/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Clause#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link CompleteDSLPckg.Clause#getSucessorClause <em>Sucessor Clause</em>}</li>
 *   <li>{@link CompleteDSLPckg.Clause#getDecider <em>Decider</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends Element {
	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClause_PredecessorClause()
	 * @model
	 * @generated
	 */
	EList<Clause> getPredecessorClause();

	/**
	 * Returns the value of the '<em><b>Sucessor Clause</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucessor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucessor Clause</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClause_SucessorClause()
	 * @model
	 * @generated
	 */
	EList<Clause> getSucessorClause();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClause_Decider()
	 * @model required="true"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Clause#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

} // Clause
