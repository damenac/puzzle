/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CollaborationUse;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Constraint;
import CompleteDSLPckg.ElementImport;
import CompleteDSLPckg.Feature;
import CompleteDSLPckg.Generalization;
import CompleteDSLPckg.GeneralizationSet;
import CompleteDSLPckg.NamedElement;
import CompleteDSLPckg.Namespace;
import CompleteDSLPckg.PackageImport;
import CompleteDSLPckg.PackageableElement;
import CompleteDSLPckg.Property;
import CompleteDSLPckg.Substitution;
import CompleteDSLPckg.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getMember <em>Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends RedefinableElementImpl implements Classifier {
	/**
	 * The cached value of the '{@link #getImportedMember() <em>Imported Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> importedMember;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> member;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> ownedMember;

	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_SPECIALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinalSpecialization = IS_FINAL_SPECIALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInheritedMember() <em>Inherited Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> inheritedMember;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> attribute;

	/**
	 * The cached value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinedClassifier;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> general;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitution;

	/**
	 * The cached value of the '{@link #getPowertypeExtent() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> powertypeExtent;

	/**
	 * The cached value of the '{@link #getCollaborationUse() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUse()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationUse> collaborationUse;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		if (importedMember == null) {
			importedMember = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, CompleteDSLPckgPackage.CLASSIFIER__IMPORTED_MEMBER);
		}
		return importedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.CLASSIFIER__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentWithInverseEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER, CompleteDSLPckgPackage.NAMED_ELEMENT__NAMESPACE);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT, CompleteDSLPckgPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT, CompleteDSLPckgPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE, CompleteDSLPckgPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteDSLPckg.Package getPackage() {
		if (eContainerFeatureID() != CompleteDSLPckgPackage.CLASSIFIER__PACKAGE) return null;
		return (CompleteDSLPckg.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(CompleteDSLPckg.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, CompleteDSLPckgPackage.CLASSIFIER__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(CompleteDSLPckg.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != CompleteDSLPckgPackage.CLASSIFIER__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, CompleteDSLPckgPackage.PACKAGE__OWNED_TYPE, CompleteDSLPckg.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.CLASSIFIER__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinalSpecialization() {
		return isFinalSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalSpecialization(boolean newIsFinalSpecialization) {
		boolean oldIsFinalSpecialization = isFinalSpecialization;
		isFinalSpecialization = newIsFinalSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		if (inheritedMember == null) {
			inheritedMember = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.CLASSIFIER__INHERITED_MEMBER);
		}
		return inheritedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, CompleteDSLPckgPackage.CLASSIFIER__FEATURE, CompleteDSLPckgPackage.FEATURE__FEATURING_CLASSIFIER);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList<Property>(Property.class, this, CompleteDSLPckgPackage.CLASSIFIER__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinedClassifier() {
		if (redefinedClassifier == null) {
			redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		if (general == null) {
			general = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.CLASSIFIER__GENERAL);
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION, CompleteDSLPckgPackage.GENERALIZATION__SPECIFIC);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitution() {
		if (substitution == null) {
			substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION, CompleteDSLPckgPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getPowertypeExtent() {
		if (powertypeExtent == null) {
			powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT, CompleteDSLPckgPackage.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationUse> getCollaborationUse() {
		if (collaborationUse == null) {
			collaborationUse = new EObjectContainmentEList<CollaborationUse>(CollaborationUse.class, this, CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE);
		}
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (CollaborationUse)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		CollaborationUse oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
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
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((CompleteDSLPckg.Package)otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE:
				return basicSetPackage(null, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE:
				return ((InternalEList<?>)getCollaborationUse()).basicRemove(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE:
				return eInternalContainer().eInverseRemove(this, CompleteDSLPckgPackage.PACKAGE__OWNED_TYPE, CompleteDSLPckg.Package.class, msgs);
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
			case CompleteDSLPckgPackage.CLASSIFIER__IMPORTED_MEMBER:
				return getImportedMember();
			case CompleteDSLPckgPackage.CLASSIFIER__MEMBER:
				return getMember();
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER:
				return getOwnedMember();
			case CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT:
				return getElementImport();
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT:
				return getPackageImport();
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE:
				return getOwnedRule();
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE:
				return getPackage();
			case CompleteDSLPckgPackage.CLASSIFIER__IS_ABSTRACT:
				return isIsAbstract();
			case CompleteDSLPckgPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				return isIsFinalSpecialization();
			case CompleteDSLPckgPackage.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMember();
			case CompleteDSLPckgPackage.CLASSIFIER__FEATURE:
				return getFeature();
			case CompleteDSLPckgPackage.CLASSIFIER__ATTRIBUTE:
				return getAttribute();
			case CompleteDSLPckgPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case CompleteDSLPckgPackage.CLASSIFIER__GENERAL:
				return getGeneral();
			case CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION:
				return getSubstitution();
			case CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE:
				return getCollaborationUse();
			case CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
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
			case CompleteDSLPckgPackage.CLASSIFIER__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE:
				setPackage((CompleteDSLPckg.Package)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__INHERITED_MEMBER:
				getInheritedMember().clear();
				getInheritedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				getCollaborationUse().addAll((Collection<? extends CollaborationUse>)newValue);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)newValue);
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
			case CompleteDSLPckgPackage.CLASSIFIER__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__MEMBER:
				getMember().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE:
				setPackage((CompleteDSLPckg.Package)null);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__INHERITED_MEMBER:
				getInheritedMember().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				return;
			case CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)null);
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
			case CompleteDSLPckgPackage.CLASSIFIER__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__MEMBER:
				return member != null && !member.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE:
				return getPackage() != null;
			case CompleteDSLPckgPackage.CLASSIFIER__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case CompleteDSLPckgPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				return isFinalSpecialization != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case CompleteDSLPckgPackage.CLASSIFIER__INHERITED_MEMBER:
				return inheritedMember != null && !inheritedMember.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__FEATURE:
				return feature != null && !feature.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__GENERAL:
				return general != null && !general.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE:
				return collaborationUse != null && !collaborationUse.isEmpty();
			case CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION:
				return representation != null;
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
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.CLASSIFIER__IMPORTED_MEMBER: return CompleteDSLPckgPackage.NAMESPACE__IMPORTED_MEMBER;
				case CompleteDSLPckgPackage.CLASSIFIER__MEMBER: return CompleteDSLPckgPackage.NAMESPACE__MEMBER;
				case CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER: return CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER;
				case CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT: return CompleteDSLPckgPackage.NAMESPACE__ELEMENT_IMPORT;
				case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT: return CompleteDSLPckgPackage.NAMESPACE__PACKAGE_IMPORT;
				case CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE: return CompleteDSLPckgPackage.NAMESPACE__OWNED_RULE;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.CLASSIFIER__PACKAGE: return CompleteDSLPckgPackage.TYPE__PACKAGE;
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
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.NAMESPACE__IMPORTED_MEMBER: return CompleteDSLPckgPackage.CLASSIFIER__IMPORTED_MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__MEMBER: return CompleteDSLPckgPackage.CLASSIFIER__MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER: return CompleteDSLPckgPackage.CLASSIFIER__OWNED_MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__ELEMENT_IMPORT: return CompleteDSLPckgPackage.CLASSIFIER__ELEMENT_IMPORT;
				case CompleteDSLPckgPackage.NAMESPACE__PACKAGE_IMPORT: return CompleteDSLPckgPackage.CLASSIFIER__PACKAGE_IMPORT;
				case CompleteDSLPckgPackage.NAMESPACE__OWNED_RULE: return CompleteDSLPckgPackage.CLASSIFIER__OWNED_RULE;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.TYPE__PACKAGE: return CompleteDSLPckgPackage.CLASSIFIER__PACKAGE;
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinalSpecialization: ");
		result.append(isFinalSpecialization);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
