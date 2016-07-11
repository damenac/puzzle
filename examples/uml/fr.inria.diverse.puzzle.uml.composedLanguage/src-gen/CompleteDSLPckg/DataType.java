/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.DataType#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.DataType#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Property}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Property#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDataType_OwnedAttribute()
	 * @see CompleteDSLPckg.Property#getDataType
	 * @model opposite="dataType" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Operation}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Operation#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDataType_OwnedOperation()
	 * @see CompleteDSLPckg.Operation#getDataType
	 * @model opposite="dataType" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

} // DataType
