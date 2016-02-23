/**
 */
package PuzzleADL.impl;

import PuzzleADL.InterfaceBinding;
import PuzzleADL.LanguageArchitecture;
import PuzzleADL.LanguageModule;
import PuzzleADL.PuzzleADLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PuzzleADL.impl.LanguageArchitectureImpl#getLanguageModules <em>Language Modules</em>}</li>
 *   <li>{@link PuzzleADL.impl.LanguageArchitectureImpl#getInterfaceBindings <em>Interface Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageArchitectureImpl extends NamedElementImpl implements LanguageArchitecture {
	/**
	 * The cached value of the '{@link #getLanguageModules() <em>Language Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageModules()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageModule> languageModules;

	/**
	 * The cached value of the '{@link #getInterfaceBindings() <em>Interface Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceBinding> interfaceBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzleADLPackage.Literals.LANGUAGE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageModule> getLanguageModules() {
		if (languageModules == null) {
			languageModules = new EObjectContainmentEList<LanguageModule>(LanguageModule.class, this, PuzzleADLPackage.LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES);
		}
		return languageModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceBinding> getInterfaceBindings() {
		if (interfaceBindings == null) {
			interfaceBindings = new EObjectContainmentEList<InterfaceBinding>(InterfaceBinding.class, this, PuzzleADLPackage.LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS);
		}
		return interfaceBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES:
				return ((InternalEList<?>)getLanguageModules()).basicRemove(otherEnd, msgs);
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS:
				return ((InternalEList<?>)getInterfaceBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES:
				return getLanguageModules();
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS:
				return getInterfaceBindings();
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
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES:
				getLanguageModules().clear();
				getLanguageModules().addAll((Collection<? extends LanguageModule>)newValue);
				return;
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS:
				getInterfaceBindings().clear();
				getInterfaceBindings().addAll((Collection<? extends InterfaceBinding>)newValue);
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
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES:
				getLanguageModules().clear();
				return;
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS:
				getInterfaceBindings().clear();
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
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__LANGUAGE_MODULES:
				return languageModules != null && !languageModules.isEmpty();
			case PuzzleADLPackage.LANGUAGE_ARCHITECTURE__INTERFACE_BINDINGS:
				return interfaceBindings != null && !interfaceBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LanguageArchitectureImpl
