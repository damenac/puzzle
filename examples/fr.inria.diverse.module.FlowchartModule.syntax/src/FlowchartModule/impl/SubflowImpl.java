/**
 */
package FlowchartModule.impl;

import FlowchartModule.Arc;
import FlowchartModule.FlowchartModulePackage;
import FlowchartModule.Node;
import FlowchartModule.Subflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FlowchartModule.impl.SubflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link FlowchartModule.impl.SubflowImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link FlowchartModule.impl.SubflowImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubflowImpl extends FlowchartImpl implements Subflow {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowchartModulePackage.Literals.SUBFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowchartModulePackage.SUBFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<Arc>(Arc.class, this, FlowchartModulePackage.SUBFLOW__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<Arc>(Arc.class, this, FlowchartModulePackage.SUBFLOW__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowchartModulePackage.SUBFLOW__NAME:
				return getName();
			case FlowchartModulePackage.SUBFLOW__OUTGOING:
				return getOutgoing();
			case FlowchartModulePackage.SUBFLOW__INCOMING:
				return getIncoming();
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
			case FlowchartModulePackage.SUBFLOW__NAME:
				setName((String)newValue);
				return;
			case FlowchartModulePackage.SUBFLOW__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Arc>)newValue);
				return;
			case FlowchartModulePackage.SUBFLOW__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Arc>)newValue);
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
			case FlowchartModulePackage.SUBFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FlowchartModulePackage.SUBFLOW__OUTGOING:
				getOutgoing().clear();
				return;
			case FlowchartModulePackage.SUBFLOW__INCOMING:
				getIncoming().clear();
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
			case FlowchartModulePackage.SUBFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FlowchartModulePackage.SUBFLOW__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case FlowchartModulePackage.SUBFLOW__INCOMING:
				return incoming != null && !incoming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case FlowchartModulePackage.SUBFLOW__NAME: return FlowchartModulePackage.NODE__NAME;
				case FlowchartModulePackage.SUBFLOW__OUTGOING: return FlowchartModulePackage.NODE__OUTGOING;
				case FlowchartModulePackage.SUBFLOW__INCOMING: return FlowchartModulePackage.NODE__INCOMING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case FlowchartModulePackage.NODE__NAME: return FlowchartModulePackage.SUBFLOW__NAME;
				case FlowchartModulePackage.NODE__OUTGOING: return FlowchartModulePackage.SUBFLOW__OUTGOING;
				case FlowchartModulePackage.NODE__INCOMING: return FlowchartModulePackage.SUBFLOW__INCOMING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubflowImpl
