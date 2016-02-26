/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	void eval(Hashtable context);

} // Statement
