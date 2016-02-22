/**
 */
package LogoProgramModule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LogoProgramModule.While#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see LogoProgramModule.LogoProgramModulePackage#getWhile()
 * @model
 * @generated
 */
public interface While extends ControlStructure {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see LogoProgramModule.LogoProgramModulePackage#getWhile_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link LogoProgramModule.While#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

} // While
