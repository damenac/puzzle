/**
 */
package UseCases;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCases.Classifier#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link UseCases.Classifier#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCases.UseCasesPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Namespace {
	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link UseCases.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see UseCases.UseCasesPackage#getClassifier_OwnedUseCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link UseCases.UseCase}.
	 * It is bidirectional and its opposite is '{@link UseCases.UseCase#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see UseCases.UseCasesPackage#getClassifier_UseCase()
	 * @see UseCases.UseCase#getSubject
	 * @model opposite="subject"
	 * @generated
	 */
	EList<UseCase> getUseCase();

} // Classifier
