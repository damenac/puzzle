/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 *   <li>{@link Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndDestructionData()
 * @model
 * @generated
 */
public interface LinkEndDestructionData extends LinkEndData {
	/**
	 * Returns the value of the '<em><b>Is Destroy Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Destroy Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #setIsDestroyDuplicates(boolean)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndDestructionData_IsDestroyDuplicates()
	 * @model
	 * @generated
	 */
	boolean isIsDestroyDuplicates();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #isIsDestroyDuplicates()
	 * @generated
	 */
	void setIsDestroyDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Destroy At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destroy At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destroy At</em>' containment reference.
	 * @see #setDestroyAt(InputPin)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndDestructionData_DestroyAt()
	 * @model containment="true"
	 * @generated
	 */
	InputPin getDestroyAt();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy At</em>' containment reference.
	 * @see #getDestroyAt()
	 * @generated
	 */
	void setDestroyAt(InputPin value);

} // LinkEndDestructionData
