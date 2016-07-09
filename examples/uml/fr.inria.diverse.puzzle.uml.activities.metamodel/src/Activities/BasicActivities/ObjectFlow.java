/**
 */
package Activities.BasicActivities;

import Activities.FundamentalActivities.Behavior;

import Activities.IntermediateActivities.State;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.BasicActivities.ObjectFlow#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link Activities.BasicActivities.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link Activities.BasicActivities.ObjectFlow#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Activities.BasicActivities.ObjectFlow#getSelection <em>Selection</em>}</li>
 *   <li>{@link Activities.BasicActivities.ObjectFlow#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link Activities.BasicActivities.ObjectFlow#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link Activities.BasicActivities.ObjectFlow#getInState <em>In State</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow()
 * @model
 * @generated
 */
public interface ObjectFlow extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multicast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multicast</em>' attribute.
	 * @see #setIsMulticast(boolean)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow_IsMulticast()
	 * @model
	 * @generated
	 */
	boolean isIsMulticast();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ObjectFlow#isIsMulticast <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multicast</em>' attribute.
	 * @see #isIsMulticast()
	 * @generated
	 */
	void setIsMulticast(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multireceive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multireceive</em>' attribute.
	 * @see #setIsMultireceive(boolean)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow_IsMultireceive()
	 * @model
	 * @generated
	 */
	boolean isIsMultireceive();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multireceive</em>' attribute.
	 * @see #isIsMultireceive()
	 * @generated
	 */
	void setIsMultireceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Behavior)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow_Transformation()
	 * @model
	 * @generated
	 */
	Behavior getTransformation();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ObjectFlow#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Behavior value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow_Selection()
	 * @model
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ObjectFlow#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link Activities.BasicActivities.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see Activities.BasicActivities.ObjectNodeOrderingKind
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow_Ordering()
	 * @model
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ObjectFlow#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see Activities.BasicActivities.ObjectNodeOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow_IsControlType()
	 * @model
	 * @generated
	 */
	boolean isIsControlType();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ObjectFlow#isIsControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isIsControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

	/**
	 * Returns the value of the '<em><b>In State</b></em>' reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In State</em>' reference list.
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getObjectFlow_InState()
	 * @model
	 * @generated
	 */
	EList<State> getInState();

} // ObjectFlow
