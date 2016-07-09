/**
 */
package Activities.IntermediateActivities;

import Activities.FundamentalActivities.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.BehavioralFeature#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Namespace, Feature {
	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getBehavioralFeature_OwnedParameterSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

} // BehavioralFeature
