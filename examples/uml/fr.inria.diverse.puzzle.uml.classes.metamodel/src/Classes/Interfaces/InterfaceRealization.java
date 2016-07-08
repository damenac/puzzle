/**
 */
package Classes.Interfaces;

import Classes.Dependencies.Realization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Interfaces.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 *   <li>{@link Classes.Interfaces.InterfaceRealization#getContract <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Interfaces.InterfacesPackage#getInterfaceRealization()
 * @model
 * @generated
 */
public interface InterfaceRealization extends Realization {
	/**
	 * Returns the value of the '<em><b>Implementing Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Classes.Interfaces.BehavioredClassifier#getInterfaceRealization <em>Interface Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementing Classifier</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #setImplementingClassifier(BehavioredClassifier)
	 * @see Classes.Interfaces.InterfacesPackage#getInterfaceRealization_ImplementingClassifier()
	 * @see Classes.Interfaces.BehavioredClassifier#getInterfaceRealization
	 * @model opposite="interfaceRealization" required="true" transient="false"
	 * @generated
	 */
	BehavioredClassifier getImplementingClassifier();

	/**
	 * Sets the value of the '{@link Classes.Interfaces.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #getImplementingClassifier()
	 * @generated
	 */
	void setImplementingClassifier(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Interface)
	 * @see Classes.Interfaces.InterfacesPackage#getInterfaceRealization_Contract()
	 * @model required="true"
	 * @generated
	 */
	Interface getContract();

	/**
	 * Sets the value of the '{@link Classes.Interfaces.InterfaceRealization#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Interface value);

} // InterfaceRealization
