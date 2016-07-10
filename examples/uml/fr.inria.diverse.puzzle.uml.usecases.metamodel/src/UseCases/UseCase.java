/**
 */
package UseCases;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link UseCases.UseCase#getSubject <em>Subject</em>}</li>
 *   <li>{@link UseCases.UseCase#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link UseCases.UseCase#getExtend <em>Extend</em>}</li>
 *   <li>{@link UseCases.UseCase#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 *
 * @see UseCases.UseCasesPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link UseCases.Classifier}.
	 * It is bidirectional and its opposite is '{@link UseCases.Classifier#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see UseCases.UseCasesPackage#getUseCase_Subject()
	 * @see UseCases.Classifier#getUseCase
	 * @model opposite="useCase"
	 * @generated
	 */
	EList<Classifier> getSubject();

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * The list contents are of type {@link UseCases.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link UseCases.ExtensionPoint#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' containment reference list.
	 * @see UseCases.UseCasesPackage#getUseCase_ExtensionPoint()
	 * @see UseCases.ExtensionPoint#getUseCase
	 * @model opposite="useCase" containment="true"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionPoint();

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link UseCases.Extend}.
	 * It is bidirectional and its opposite is '{@link UseCases.Extend#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see UseCases.UseCasesPackage#getUseCase_Extend()
	 * @see UseCases.Extend#getExtension
	 * @model opposite="extension" containment="true"
	 * @generated
	 */
	EList<Extend> getExtend();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference list.
	 * The list contents are of type {@link UseCases.Include}.
	 * It is bidirectional and its opposite is '{@link UseCases.Include#getIncludingCase <em>Including Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference list.
	 * @see UseCases.UseCasesPackage#getUseCase_Include()
	 * @see UseCases.Include#getIncludingCase
	 * @model opposite="includingCase"
	 * @generated
	 */
	EList<Include> getInclude();

} // UseCase
