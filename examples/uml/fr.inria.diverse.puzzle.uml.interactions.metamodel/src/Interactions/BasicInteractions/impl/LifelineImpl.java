/**
 */
package Interactions.BasicInteractions.impl;

import Interactions.BasicInteractions.BasicInteractionsPackage;
import Interactions.BasicInteractions.ConnectableElement;
import Interactions.BasicInteractions.Interaction;
import Interactions.BasicInteractions.InteractionFragment;
import Interactions.BasicInteractions.Lifeline;
import Interactions.BasicInteractions.ValueSpecification;

import Interactions.Fragments.PartDecomposition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.impl.LifelineImpl#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.LifelineImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.LifelineImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.impl.LifelineImpl#getDecomposedAs <em>Decomposed As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends NamedElementImpl implements Lifeline {
	/**
	 * The cached value of the '{@link #getCoveredBy() <em>Covered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> coveredBy;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement represents;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification selector;

	/**
	 * The cached value of the '{@link #getDecomposedAs() <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedAs()
	 * @generated
	 * @ordered
	 */
	protected PartDecomposition decomposedAs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicInteractionsPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getCoveredBy() {
		if (coveredBy == null) {
			coveredBy = new EObjectWithInverseResolvingEList.ManyInverse<InteractionFragment>(InteractionFragment.class, this, BasicInteractionsPackage.LIFELINE__COVERED_BY, BasicInteractionsPackage.INTERACTION_FRAGMENT__COVERED);
		}
		return coveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID() != BasicInteractionsPackage.LIFELINE__INTERACTION) return null;
		return (Interaction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInteraction, BasicInteractionsPackage.LIFELINE__INTERACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eInternalContainer() || (eContainerFeatureID() != BasicInteractionsPackage.LIFELINE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, BasicInteractionsPackage.INTERACTION__LIFELINE, Interaction.class, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.LIFELINE__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (ConnectableElement)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicInteractionsPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(ConnectableElement newRepresents) {
		ConnectableElement oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(ValueSpecification newSelector, NotificationChain msgs) {
		ValueSpecification oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.LIFELINE__SELECTOR, oldSelector, newSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(ValueSpecification newSelector) {
		if (newSelector != selector) {
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicInteractionsPackage.LIFELINE__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicInteractionsPackage.LIFELINE__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.LIFELINE__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition getDecomposedAs() {
		if (decomposedAs != null && decomposedAs.eIsProxy()) {
			InternalEObject oldDecomposedAs = (InternalEObject)decomposedAs;
			decomposedAs = (PartDecomposition)eResolveProxy(oldDecomposedAs);
			if (decomposedAs != oldDecomposedAs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicInteractionsPackage.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
			}
		}
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition basicGetDecomposedAs() {
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposedAs(PartDecomposition newDecomposedAs) {
		PartDecomposition oldDecomposedAs = decomposedAs;
		decomposedAs = newDecomposedAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicInteractionsPackage.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicInteractionsPackage.LIFELINE__COVERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoveredBy()).basicAdd(otherEnd, msgs);
			case BasicInteractionsPackage.LIFELINE__INTERACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInteraction((Interaction)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicInteractionsPackage.LIFELINE__COVERED_BY:
				return ((InternalEList<?>)getCoveredBy()).basicRemove(otherEnd, msgs);
			case BasicInteractionsPackage.LIFELINE__INTERACTION:
				return basicSetInteraction(null, msgs);
			case BasicInteractionsPackage.LIFELINE__SELECTOR:
				return basicSetSelector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BasicInteractionsPackage.LIFELINE__INTERACTION:
				return eInternalContainer().eInverseRemove(this, BasicInteractionsPackage.INTERACTION__LIFELINE, Interaction.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicInteractionsPackage.LIFELINE__COVERED_BY:
				return getCoveredBy();
			case BasicInteractionsPackage.LIFELINE__INTERACTION:
				return getInteraction();
			case BasicInteractionsPackage.LIFELINE__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case BasicInteractionsPackage.LIFELINE__SELECTOR:
				return getSelector();
			case BasicInteractionsPackage.LIFELINE__DECOMPOSED_AS:
				if (resolve) return getDecomposedAs();
				return basicGetDecomposedAs();
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
			case BasicInteractionsPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
				getCoveredBy().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case BasicInteractionsPackage.LIFELINE__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case BasicInteractionsPackage.LIFELINE__REPRESENTS:
				setRepresents((ConnectableElement)newValue);
				return;
			case BasicInteractionsPackage.LIFELINE__SELECTOR:
				setSelector((ValueSpecification)newValue);
				return;
			case BasicInteractionsPackage.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)newValue);
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
			case BasicInteractionsPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
				return;
			case BasicInteractionsPackage.LIFELINE__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case BasicInteractionsPackage.LIFELINE__REPRESENTS:
				setRepresents((ConnectableElement)null);
				return;
			case BasicInteractionsPackage.LIFELINE__SELECTOR:
				setSelector((ValueSpecification)null);
				return;
			case BasicInteractionsPackage.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)null);
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
			case BasicInteractionsPackage.LIFELINE__COVERED_BY:
				return coveredBy != null && !coveredBy.isEmpty();
			case BasicInteractionsPackage.LIFELINE__INTERACTION:
				return getInteraction() != null;
			case BasicInteractionsPackage.LIFELINE__REPRESENTS:
				return represents != null;
			case BasicInteractionsPackage.LIFELINE__SELECTOR:
				return selector != null;
			case BasicInteractionsPackage.LIFELINE__DECOMPOSED_AS:
				return decomposedAs != null;
		}
		return super.eIsSet(featureID);
	}

} //LifelineImpl
