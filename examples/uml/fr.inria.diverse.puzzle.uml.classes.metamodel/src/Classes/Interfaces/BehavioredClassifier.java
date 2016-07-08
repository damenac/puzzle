/**
 */
package Classes.Interfaces;

import Classes.Kernel.Classifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Interfaces.BehavioredClassifier#getInterfaceRealization <em>Interface Realization</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Interfaces.InterfacesPackage#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Interface Realization</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Interfaces.InterfaceRealization}.
	 * It is bidirectional and its opposite is '{@link Classes.Interfaces.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Realization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Realization</em>' containment reference list.
	 * @see Classes.Interfaces.InterfacesPackage#getBehavioredClassifier_InterfaceRealization()
	 * @see Classes.Interfaces.InterfaceRealization#getImplementingClassifier
	 * @model opposite="implementingClassifier" containment="true"
	 * @generated
	 */
	EList<InterfaceRealization> getInterfaceRealization();

} // BehavioredClassifier
