/**
 */
package Activities.BasicActivities;

import Activities.IntermediateActivities.ParameterEffectKind;
import Activities.IntermediateActivities.ParameterSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.BasicActivities.Parameter#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link Activities.BasicActivities.Parameter#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link Activities.BasicActivities.Parameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link Activities.BasicActivities.Parameter#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.BasicActivities.BasicActivitiesPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getParameter_IsException()
	 * @model
	 * @generated
	 */
	boolean isIsException();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.Parameter#isIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #isIsException()
	 * @generated
	 */
	void setIsException(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getParameter_IsStream()
	 * @model
	 * @generated
	 */
	boolean isIsStream();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.Parameter#isIsStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #isIsStream()
	 * @generated
	 */
	void setIsStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link Activities.IntermediateActivities.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see Activities.IntermediateActivities.ParameterEffectKind
	 * @see #setEffect(ParameterEffectKind)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getParameter_Effect()
	 * @model
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see Activities.IntermediateActivities.ParameterEffectKind
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.ParameterSet}.
	 * It is bidirectional and its opposite is '{@link Activities.IntermediateActivities.ParameterSet#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference list.
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getParameter_ParameterSet()
	 * @see Activities.IntermediateActivities.ParameterSet#getParameter
	 * @model opposite="parameter"
	 * @generated
	 */
	EList<ParameterSet> getParameterSet();

} // Parameter
