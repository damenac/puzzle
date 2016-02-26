/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="flowchartsemantics.flowchartmt.flowchartpck.Object" contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	Object eval(Hashtable context);

} // Expression
