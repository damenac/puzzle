/**
 */
package Interactions.Fragments;

import Interactions.BasicInteractions.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consider Ignore Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.Fragments.ConsiderIgnoreFragment#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.Fragments.FragmentsPackage#getConsiderIgnoreFragment()
 * @model
 * @generated
 */
public interface ConsiderIgnoreFragment extends CombinedFragment {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see Interactions.Fragments.FragmentsPackage#getConsiderIgnoreFragment_Message()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getMessage();

} // ConsiderIgnoreFragment
