/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Association;
import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CollaborationUse;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Constraint;
import CompleteDSLPckg.Dependency;
import CompleteDSLPckg.ElementImport;
import CompleteDSLPckg.Feature;
import CompleteDSLPckg.Generalization;
import CompleteDSLPckg.GeneralizationSet;
import CompleteDSLPckg.NamedElement;
import CompleteDSLPckg.Namespace;
import CompleteDSLPckg.PackageImport;
import CompleteDSLPckg.PackageableElement;
import CompleteDSLPckg.Property;
import CompleteDSLPckg.RedefinableElement;
import CompleteDSLPckg.Substitution;
import CompleteDSLPckg.Type;
import CompleteDSLPckg.VisibilityKind;

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
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
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
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PACKAGE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientDependency() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> clientDependency;

	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RedefinableElement> redefinedElement;

	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinitionContext;

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
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnd;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnd;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getAssociation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID() != CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependency() {
		if (clientDependency == null) {
			clientDependency = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY, CompleteDSLPckgPackage.DEPENDENCY__CLIENT);
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_ELEMENT);
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.ASSOCIATION__REDEFINITION_CONTEXT);
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		if (importedMember == null) {
			importedMember = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, CompleteDSLPckgPackage.ASSOCIATION__IMPORTED_MEMBER);
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
			member = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.ASSOCIATION__MEMBER);
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
			ownedMember = new EObjectContainmentWithInverseEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER, CompleteDSLPckgPackage.NAMED_ELEMENT__NAMESPACE);
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
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT, CompleteDSLPckgPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
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
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT, CompleteDSLPckgPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
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
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE, CompleteDSLPckgPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteDSLPckg.Package getPackage() {
		if (eContainerFeatureID() != CompleteDSLPckgPackage.ASSOCIATION__PACKAGE) return null;
		return (CompleteDSLPckg.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(CompleteDSLPckg.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, CompleteDSLPckgPackage.ASSOCIATION__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(CompleteDSLPckg.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != CompleteDSLPckgPackage.ASSOCIATION__PACKAGE && newPackage != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__PACKAGE, newPackage, newPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		if (inheritedMember == null) {
			inheritedMember = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.ASSOCIATION__INHERITED_MEMBER);
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
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, CompleteDSLPckgPackage.ASSOCIATION__FEATURE, CompleteDSLPckgPackage.FEATURE__FEATURING_CLASSIFIER);
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
			attribute = new EObjectResolvingEList<Property>(Property.class, this, CompleteDSLPckgPackage.ASSOCIATION__ATTRIBUTE);
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
			redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_CLASSIFIER);
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
			general = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.ASSOCIATION__GENERAL);
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
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION, CompleteDSLPckgPackage.GENERALIZATION__SPECIFIC);
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
			substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION, CompleteDSLPckgPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
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
			powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT, CompleteDSLPckgPackage.GENERALIZATION_SET__POWERTYPE);
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
			collaborationUse = new EObjectContainmentEList<CollaborationUse>(CollaborationUse.class, this, CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION, oldRepresentation, representation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, CompleteDSLPckgPackage.ASSOCIATION__NAVIGABLE_OWNED_END);
		}
		return navigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd() {
		if (memberEnd == null) {
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, CompleteDSLPckgPackage.ASSOCIATION__MEMBER_END, CompleteDSLPckgPackage.PROPERTY__ASSOCIATION);
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, CompleteDSLPckgPackage.ASSOCIATION__OWNED_END, CompleteDSLPckgPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnd;
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
			case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientDependency()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((CompleteDSLPckg.Package)otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return ((InternalEList<?>)getClientDependency()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE:
				return basicSetPackage(null, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE:
				return ((InternalEList<?>)getCollaborationUse()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE:
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
			case CompleteDSLPckgPackage.ASSOCIATION__NAME:
				return getName();
			case CompleteDSLPckgPackage.ASSOCIATION__QUALIFIED_NAME:
				return getQualifiedName();
			case CompleteDSLPckgPackage.ASSOCIATION__VISIBILITY:
				return getVisibility();
			case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE:
				return getNamespace();
			case CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return getClientDependency();
			case CompleteDSLPckgPackage.ASSOCIATION__IS_LEAF:
				return isIsLeaf();
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case CompleteDSLPckgPackage.ASSOCIATION__IMPORTED_MEMBER:
				return getImportedMember();
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER:
				return getMember();
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER:
				return getOwnedMember();
			case CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT:
				return getElementImport();
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT:
				return getPackageImport();
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE:
				return getOwnedRule();
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE:
				return getPackage();
			case CompleteDSLPckgPackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract();
			case CompleteDSLPckgPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				return isIsFinalSpecialization();
			case CompleteDSLPckgPackage.ASSOCIATION__INHERITED_MEMBER:
				return getInheritedMember();
			case CompleteDSLPckgPackage.ASSOCIATION__FEATURE:
				return getFeature();
			case CompleteDSLPckgPackage.ASSOCIATION__ATTRIBUTE:
				return getAttribute();
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case CompleteDSLPckgPackage.ASSOCIATION__GENERAL:
				return getGeneral();
			case CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION:
				return getGeneralization();
			case CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION:
				return getSubstitution();
			case CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE:
				return getCollaborationUse();
			case CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case CompleteDSLPckgPackage.ASSOCIATION__IS_DERIVED:
				return isIsDerived();
			case CompleteDSLPckgPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER_END:
				return getMemberEnd();
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_END:
				return getOwnedEnd();
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
			case CompleteDSLPckgPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				getClientDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE:
				setPackage((CompleteDSLPckg.Package)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__INHERITED_MEMBER:
				getInheritedMember().clear();
				getInheritedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE:
				getCollaborationUse().clear();
				getCollaborationUse().addAll((Collection<? extends CollaborationUse>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION:
				setRepresentation((CollaborationUse)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
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
			case CompleteDSLPckgPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE:
				setPackage((CompleteDSLPckg.Package)null);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__INHERITED_MEMBER:
				getInheritedMember().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE:
				getCollaborationUse().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION:
				setRepresentation((CollaborationUse)null);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				return;
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
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
			case CompleteDSLPckgPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CompleteDSLPckgPackage.ASSOCIATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case CompleteDSLPckgPackage.ASSOCIATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE:
				return getNamespace() != null;
			case CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER:
				return member != null && !member.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE:
				return getPackage() != null;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				return isFinalSpecialization != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case CompleteDSLPckgPackage.ASSOCIATION__INHERITED_MEMBER:
				return inheritedMember != null && !inheritedMember.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__FEATURE:
				return feature != null && !feature.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__GENERAL:
				return general != null && !general.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE:
				return collaborationUse != null && !collaborationUse.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION:
				return representation != null;
			case CompleteDSLPckgPackage.ASSOCIATION__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case CompleteDSLPckgPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case CompleteDSLPckgPackage.ASSOCIATION__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.ASSOCIATION__NAME: return CompleteDSLPckgPackage.NAMED_ELEMENT__NAME;
				case CompleteDSLPckgPackage.ASSOCIATION__QUALIFIED_NAME: return CompleteDSLPckgPackage.NAMED_ELEMENT__QUALIFIED_NAME;
				case CompleteDSLPckgPackage.ASSOCIATION__VISIBILITY: return CompleteDSLPckgPackage.NAMED_ELEMENT__VISIBILITY;
				case CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE: return CompleteDSLPckgPackage.NAMED_ELEMENT__NAMESPACE;
				case CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY: return CompleteDSLPckgPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.ASSOCIATION__IS_LEAF: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.ASSOCIATION__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.ASSOCIATION__IMPORTED_MEMBER: return CompleteDSLPckgPackage.NAMESPACE__IMPORTED_MEMBER;
				case CompleteDSLPckgPackage.ASSOCIATION__MEMBER: return CompleteDSLPckgPackage.NAMESPACE__MEMBER;
				case CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER: return CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER;
				case CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT: return CompleteDSLPckgPackage.NAMESPACE__ELEMENT_IMPORT;
				case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT: return CompleteDSLPckgPackage.NAMESPACE__PACKAGE_IMPORT;
				case CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE: return CompleteDSLPckgPackage.NAMESPACE__OWNED_RULE;
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
				case CompleteDSLPckgPackage.ASSOCIATION__PACKAGE: return CompleteDSLPckgPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.ASSOCIATION__IS_ABSTRACT: return CompleteDSLPckgPackage.CLASSIFIER__IS_ABSTRACT;
				case CompleteDSLPckgPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION: return CompleteDSLPckgPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION;
				case CompleteDSLPckgPackage.ASSOCIATION__INHERITED_MEMBER: return CompleteDSLPckgPackage.CLASSIFIER__INHERITED_MEMBER;
				case CompleteDSLPckgPackage.ASSOCIATION__FEATURE: return CompleteDSLPckgPackage.CLASSIFIER__FEATURE;
				case CompleteDSLPckgPackage.ASSOCIATION__ATTRIBUTE: return CompleteDSLPckgPackage.CLASSIFIER__ATTRIBUTE;
				case CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_CLASSIFIER: return CompleteDSLPckgPackage.CLASSIFIER__REDEFINED_CLASSIFIER;
				case CompleteDSLPckgPackage.ASSOCIATION__GENERAL: return CompleteDSLPckgPackage.CLASSIFIER__GENERAL;
				case CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION: return CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION;
				case CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION: return CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION;
				case CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT: return CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT;
				case CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE: return CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE;
				case CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION: return CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.NAMED_ELEMENT__NAME: return CompleteDSLPckgPackage.ASSOCIATION__NAME;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__QUALIFIED_NAME: return CompleteDSLPckgPackage.ASSOCIATION__QUALIFIED_NAME;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__VISIBILITY: return CompleteDSLPckgPackage.ASSOCIATION__VISIBILITY;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__NAMESPACE: return CompleteDSLPckgPackage.ASSOCIATION__NAMESPACE;
				case CompleteDSLPckgPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY: return CompleteDSLPckgPackage.ASSOCIATION__CLIENT_DEPENDENCY;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF: return CompleteDSLPckgPackage.ASSOCIATION__IS_LEAF;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.ASSOCIATION__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.NAMESPACE__IMPORTED_MEMBER: return CompleteDSLPckgPackage.ASSOCIATION__IMPORTED_MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__MEMBER: return CompleteDSLPckgPackage.ASSOCIATION__MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER: return CompleteDSLPckgPackage.ASSOCIATION__OWNED_MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__ELEMENT_IMPORT: return CompleteDSLPckgPackage.ASSOCIATION__ELEMENT_IMPORT;
				case CompleteDSLPckgPackage.NAMESPACE__PACKAGE_IMPORT: return CompleteDSLPckgPackage.ASSOCIATION__PACKAGE_IMPORT;
				case CompleteDSLPckgPackage.NAMESPACE__OWNED_RULE: return CompleteDSLPckgPackage.ASSOCIATION__OWNED_RULE;
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
				case CompleteDSLPckgPackage.TYPE__PACKAGE: return CompleteDSLPckgPackage.ASSOCIATION__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.CLASSIFIER__IS_ABSTRACT: return CompleteDSLPckgPackage.ASSOCIATION__IS_ABSTRACT;
				case CompleteDSLPckgPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION: return CompleteDSLPckgPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION;
				case CompleteDSLPckgPackage.CLASSIFIER__INHERITED_MEMBER: return CompleteDSLPckgPackage.ASSOCIATION__INHERITED_MEMBER;
				case CompleteDSLPckgPackage.CLASSIFIER__FEATURE: return CompleteDSLPckgPackage.ASSOCIATION__FEATURE;
				case CompleteDSLPckgPackage.CLASSIFIER__ATTRIBUTE: return CompleteDSLPckgPackage.ASSOCIATION__ATTRIBUTE;
				case CompleteDSLPckgPackage.CLASSIFIER__REDEFINED_CLASSIFIER: return CompleteDSLPckgPackage.ASSOCIATION__REDEFINED_CLASSIFIER;
				case CompleteDSLPckgPackage.CLASSIFIER__GENERAL: return CompleteDSLPckgPackage.ASSOCIATION__GENERAL;
				case CompleteDSLPckgPackage.CLASSIFIER__GENERALIZATION: return CompleteDSLPckgPackage.ASSOCIATION__GENERALIZATION;
				case CompleteDSLPckgPackage.CLASSIFIER__SUBSTITUTION: return CompleteDSLPckgPackage.ASSOCIATION__SUBSTITUTION;
				case CompleteDSLPckgPackage.CLASSIFIER__POWERTYPE_EXTENT: return CompleteDSLPckgPackage.ASSOCIATION__POWERTYPE_EXTENT;
				case CompleteDSLPckgPackage.CLASSIFIER__COLLABORATION_USE: return CompleteDSLPckgPackage.ASSOCIATION__COLLABORATION_USE;
				case CompleteDSLPckgPackage.CLASSIFIER__REPRESENTATION: return CompleteDSLPckgPackage.ASSOCIATION__REPRESENTATION;
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
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinalSpecialization: ");
		result.append(isFinalSpecialization);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
