/**
 */
package Components.BasicComponents;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Components.BasicComponents.ComponentRealization#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link Components.BasicComponents.ComponentRealization#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Components.BasicComponents.BasicComponentsPackage#getComponentRealization()
 * @model
 * @generated
 */
public interface ComponentRealization extends Realization {
	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Components.BasicComponents.Component#getRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' container reference.
	 * @see #setAbstraction(Component)
	 * @see Components.BasicComponents.BasicComponentsPackage#getComponentRealization_Abstraction()
	 * @see Components.BasicComponents.Component#getRealization
	 * @model opposite="realization" transient="false"
	 * @generated
	 */
	Component getAbstraction();

	/**
	 * Sets the value of the '{@link Components.BasicComponents.ComponentRealization#getAbstraction <em>Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' container reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(Component value);

	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' reference list.
	 * The list contents are of type {@link Components.BasicComponents.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' reference list.
	 * @see Components.BasicComponents.BasicComponentsPackage#getComponentRealization_RealizingClassifier()
	 * @model required="true"
	 * @generated
	 */
	EList<Classifier> getRealizingClassifier();

} // ComponentRealization
