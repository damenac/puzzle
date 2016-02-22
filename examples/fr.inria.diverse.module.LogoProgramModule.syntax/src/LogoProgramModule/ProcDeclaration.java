/**
 */
package LogoProgramModule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LogoProgramModule.ProcDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link LogoProgramModule.ProcDeclaration#getArgs <em>Args</em>}</li>
 *   <li>{@link LogoProgramModule.ProcDeclaration#getProcCall <em>Proc Call</em>}</li>
 *   <li>{@link LogoProgramModule.ProcDeclaration#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see LogoProgramModule.LogoProgramModulePackage#getProcDeclaration()
 * @model
 * @generated
 */
public interface ProcDeclaration extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see LogoProgramModule.LogoProgramModulePackage#getProcDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LogoProgramModule.ProcDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link LogoProgramModule.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see LogoProgramModule.LogoProgramModulePackage#getProcDeclaration_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getArgs();

	/**
	 * Returns the value of the '<em><b>Proc Call</b></em>' reference list.
	 * The list contents are of type {@link LogoProgramModule.ProcCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proc Call</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proc Call</em>' reference list.
	 * @see LogoProgramModule.LogoProgramModulePackage#getProcDeclaration_ProcCall()
	 * @model
	 * @generated
	 */
	EList<ProcCall> getProcCall();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link LogoProgramModule.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see LogoProgramModule.LogoProgramModulePackage#getProcDeclaration_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // ProcDeclaration
