/**
 */
package ExpressionsPackProv;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ExpressionsPackProv.ExpressionsPackProvPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object eval(Map<?, ?> context);
} // Expression
