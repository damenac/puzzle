/**
 */
package flowchartsemantics.flowchartmt.flowchartpck;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see flowchartsemantics.flowchartmt.flowchartpck.FlowchartpckPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="flowchartsemantics.flowchartmt.flowchartpck.Hashtable"
	 * @generated
	 */
	boolean evalConstraint(Hashtable context);

} // Constraint
