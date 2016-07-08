/**
 */
package CompositeStructures.impl;

import CompositeStructures.Collaboration;
import CompositeStructures.CompositeStructuresPackage;
import CompositeStructures.ConnectableElement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompositeStructures.impl.CollaborationImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends StructuredClassifierImpl implements Collaboration {
	/**
	 * The cached value of the '{@link #getCollaborationRole() <em>Collaboration Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableElement> collaborationRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositeStructuresPackage.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getCollaborationRole() {
		if (collaborationRole == null) {
			collaborationRole = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, CompositeStructuresPackage.COLLABORATION__COLLABORATION_ROLE);
		}
		return collaborationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositeStructuresPackage.COLLABORATION__COLLABORATION_ROLE:
				return getCollaborationRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompositeStructuresPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				getCollaborationRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompositeStructuresPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompositeStructuresPackage.COLLABORATION__COLLABORATION_ROLE:
				return collaborationRole != null && !collaborationRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollaborationImpl
