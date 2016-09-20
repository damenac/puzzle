/**
 */
package Primitives;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Primitives.Left#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see Primitives.LogoPackage#getLeft()
 * @model
 * @generated
 */
public interface Left extends Primitive {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Expression)
	 * @see Primitives.LogoPackage#getLeft_Angle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAngle();

	/**
	 * Sets the value of the '{@link Primitives.Left#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Expression value);

} // Left
