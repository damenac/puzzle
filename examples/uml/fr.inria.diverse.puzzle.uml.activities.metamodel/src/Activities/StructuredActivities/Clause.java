/**
 */
package Activities.StructuredActivities;

import Activities.IntermediateActivities.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.StructuredActivities.Clause#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link Activities.StructuredActivities.Clause#getSucessorClause <em>Sucessor Clause</em>}</li>
 *   <li>{@link Activities.StructuredActivities.Clause#getDecider <em>Decider</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends Element {
	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' reference list.
	 * The list contents are of type {@link Activities.StructuredActivities.Clause}.
	 * It is bidirectional and its opposite is '{@link Activities.StructuredActivities.Clause#getSucessorClause <em>Sucessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getClause_PredecessorClause()
	 * @see Activities.StructuredActivities.Clause#getSucessorClause
	 * @model opposite="sucessorClause"
	 * @generated
	 */
	EList<Clause> getPredecessorClause();

	/**
	 * Returns the value of the '<em><b>Sucessor Clause</b></em>' reference list.
	 * The list contents are of type {@link Activities.StructuredActivities.Clause}.
	 * It is bidirectional and its opposite is '{@link Activities.StructuredActivities.Clause#getPredecessorClause <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sucessor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucessor Clause</em>' reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getClause_SucessorClause()
	 * @see Activities.StructuredActivities.Clause#getPredecessorClause
	 * @model opposite="predecessorClause"
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
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getClause_Decider()
	 * @model required="true"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link Activities.StructuredActivities.Clause#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

} // Clause
