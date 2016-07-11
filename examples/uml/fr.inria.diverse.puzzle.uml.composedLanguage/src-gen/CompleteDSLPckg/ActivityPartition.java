/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ActivityPartition#getEdge <em>Edge</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityPartition#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityPartition#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityPartition#getRepresents <em>Represents</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityPartition#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityPartition()
 * @model
 * @generated
 */
public interface ActivityPartition extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityPartition_Edge()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Subpartition</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpartition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpartition</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityPartition_Subpartition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityPartition> getSubpartition();

	/**
	 * Returns the value of the '<em><b>Super Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Partition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Partition</em>' reference.
	 * @see #setSuperPartition(ActivityPartition)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityPartition_SuperPartition()
	 * @model
	 * @generated
	 */
	ActivityPartition getSuperPartition();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ActivityPartition#getSuperPartition <em>Super Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Partition</em>' reference.
	 * @see #getSuperPartition()
	 * @generated
	 */
	void setSuperPartition(ActivityPartition value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Element)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityPartition_Represents()
	 * @model
	 * @generated
	 */
	Element getRepresents();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ActivityPartition#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(Element value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityPartition_Node()
	 * @model
	 * @generated
	 */
	EList<ActivityNode> getNode();

} // ActivityPartition
