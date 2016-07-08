/**
 */
package Classes.impl;

import Classes.Association;
import Classes.ClassesPackage;
import Classes.Classifier;
import Classes.Constraint;
import Classes.Dependency;
import Classes.ElementImport;
import Classes.Feature;
import Classes.Generalization;
import Classes.GeneralizationSet;
import Classes.NamedElement;
import Classes.Namespace;
import Classes.PackageImport;
import Classes.PackageableElement;
import Classes.Property;
import Classes.RedefinableElement;
import Classes.Substitution;
import Classes.Type;
import Classes.VisibilityKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link Classes.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link Classes.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
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
	 * The cached value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RedefinableElement> redefinedElement;

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
		return ClassesPackage.Literals.ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID() != ClassesPackage.ASSOCIATION__NAMESPACE) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, ClassesPackage.ASSOCIATION__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != ClassesPackage.ASSOCIATION__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, ClassesPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependency() {
		if (clientDependency == null) {
			clientDependency = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY, ClassesPackage.DEPENDENCY__CLIENT);
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, ClassesPackage.ASSOCIATION__REDEFINED_ELEMENT);
		}
		return redefinedElement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, ClassesPackage.ASSOCIATION__REDEFINITION_CONTEXT);
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
			importedMember = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, ClassesPackage.ASSOCIATION__IMPORTED_MEMBER);
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
			member = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, ClassesPackage.ASSOCIATION__MEMBER);
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
			ownedMember = new EObjectContainmentWithInverseEList<NamedElement>(NamedElement.class, this, ClassesPackage.ASSOCIATION__OWNED_MEMBER, ClassesPackage.NAMED_ELEMENT__NAMESPACE);
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
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, ClassesPackage.ASSOCIATION__ELEMENT_IMPORT, ClassesPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
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
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, ClassesPackage.ASSOCIATION__PACKAGE_IMPORT, ClassesPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
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
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, ClassesPackage.ASSOCIATION__OWNED_RULE, ClassesPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classes.Package getPackage() {
		if (eContainerFeatureID() != ClassesPackage.ASSOCIATION__PACKAGE) return null;
		return (Classes.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(Classes.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, ClassesPackage.ASSOCIATION__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(Classes.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != ClassesPackage.ASSOCIATION__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, ClassesPackage.PACKAGE__OWNED_TYPE, Classes.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__PACKAGE, newPackage, newPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		if (inheritedMember == null) {
			inheritedMember = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, ClassesPackage.ASSOCIATION__INHERITED_MEMBER);
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
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, ClassesPackage.ASSOCIATION__FEATURE, ClassesPackage.FEATURE__FEATURING_CLASSIFIER);
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
			attribute = new EObjectResolvingEList<Property>(Property.class, this, ClassesPackage.ASSOCIATION__ATTRIBUTE);
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
			redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, ClassesPackage.ASSOCIATION__REDEFINED_CLASSIFIER);
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
			general = new EObjectResolvingEList<Classifier>(Classifier.class, this, ClassesPackage.ASSOCIATION__GENERAL);
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
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, ClassesPackage.ASSOCIATION__GENERALIZATION, ClassesPackage.GENERALIZATION__SPECIFIC);
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
			substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, ClassesPackage.ASSOCIATION__SUBSTITUTION, ClassesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
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
			powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT, ClassesPackage.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtent;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, ClassesPackage.ASSOCIATION__NAVIGABLE_OWNED_END);
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
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, ClassesPackage.ASSOCIATION__MEMBER_END, ClassesPackage.PROPERTY__ASSOCIATION);
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
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, ClassesPackage.ASSOCIATION__OWNED_END, ClassesPackage.PROPERTY__OWNING_ASSOCIATION);
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
			case ClassesPackage.ASSOCIATION__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientDependency()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((Classes.Package)otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__OWNED_END:
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
			case ClassesPackage.ASSOCIATION__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return ((InternalEList<?>)getClientDependency()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__PACKAGE:
				return basicSetPackage(null, msgs);
			case ClassesPackage.ASSOCIATION__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case ClassesPackage.ASSOCIATION__OWNED_END:
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
			case ClassesPackage.ASSOCIATION__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, ClassesPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
			case ClassesPackage.ASSOCIATION__PACKAGE:
				return eInternalContainer().eInverseRemove(this, ClassesPackage.PACKAGE__OWNED_TYPE, Classes.Package.class, msgs);
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
			case ClassesPackage.ASSOCIATION__NAME:
				return getName();
			case ClassesPackage.ASSOCIATION__QUALIFIED_NAME:
				return getQualifiedName();
			case ClassesPackage.ASSOCIATION__VISIBILITY:
				return getVisibility();
			case ClassesPackage.ASSOCIATION__NAMESPACE:
				return getNamespace();
			case ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return getClientDependency();
			case ClassesPackage.ASSOCIATION__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case ClassesPackage.ASSOCIATION__IS_LEAF:
				return isIsLeaf();
			case ClassesPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case ClassesPackage.ASSOCIATION__IMPORTED_MEMBER:
				return getImportedMember();
			case ClassesPackage.ASSOCIATION__MEMBER:
				return getMember();
			case ClassesPackage.ASSOCIATION__OWNED_MEMBER:
				return getOwnedMember();
			case ClassesPackage.ASSOCIATION__ELEMENT_IMPORT:
				return getElementImport();
			case ClassesPackage.ASSOCIATION__PACKAGE_IMPORT:
				return getPackageImport();
			case ClassesPackage.ASSOCIATION__OWNED_RULE:
				return getOwnedRule();
			case ClassesPackage.ASSOCIATION__PACKAGE:
				return getPackage();
			case ClassesPackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract();
			case ClassesPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				return isIsFinalSpecialization();
			case ClassesPackage.ASSOCIATION__INHERITED_MEMBER:
				return getInheritedMember();
			case ClassesPackage.ASSOCIATION__FEATURE:
				return getFeature();
			case ClassesPackage.ASSOCIATION__ATTRIBUTE:
				return getAttribute();
			case ClassesPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case ClassesPackage.ASSOCIATION__GENERAL:
				return getGeneral();
			case ClassesPackage.ASSOCIATION__GENERALIZATION:
				return getGeneralization();
			case ClassesPackage.ASSOCIATION__SUBSTITUTION:
				return getSubstitution();
			case ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case ClassesPackage.ASSOCIATION__IS_DERIVED:
				return isIsDerived();
			case ClassesPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
			case ClassesPackage.ASSOCIATION__MEMBER_END:
				return getMemberEnd();
			case ClassesPackage.ASSOCIATION__OWNED_END:
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
			case ClassesPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case ClassesPackage.ASSOCIATION__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case ClassesPackage.ASSOCIATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case ClassesPackage.ASSOCIATION__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				getClientDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case ClassesPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__PACKAGE:
				setPackage((Classes.Package)newValue);
				return;
			case ClassesPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ClassesPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization((Boolean)newValue);
				return;
			case ClassesPackage.ASSOCIATION__INHERITED_MEMBER:
				getInheritedMember().clear();
				getInheritedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case ClassesPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case ClassesPackage.ASSOCIATION__OWNED_END:
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
			case ClassesPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassesPackage.ASSOCIATION__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case ClassesPackage.ASSOCIATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case ClassesPackage.ASSOCIATION__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				return;
			case ClassesPackage.ASSOCIATION__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case ClassesPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case ClassesPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case ClassesPackage.ASSOCIATION__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case ClassesPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				return;
			case ClassesPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case ClassesPackage.ASSOCIATION__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case ClassesPackage.ASSOCIATION__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case ClassesPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case ClassesPackage.ASSOCIATION__PACKAGE:
				setPackage((Classes.Package)null);
				return;
			case ClassesPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ClassesPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case ClassesPackage.ASSOCIATION__INHERITED_MEMBER:
				getInheritedMember().clear();
				return;
			case ClassesPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				return;
			case ClassesPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case ClassesPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case ClassesPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				return;
			case ClassesPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case ClassesPackage.ASSOCIATION__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case ClassesPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case ClassesPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				return;
			case ClassesPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				return;
			case ClassesPackage.ASSOCIATION__OWNED_END:
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
			case ClassesPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassesPackage.ASSOCIATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case ClassesPackage.ASSOCIATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case ClassesPackage.ASSOCIATION__NAMESPACE:
				return getNamespace() != null;
			case ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case ClassesPackage.ASSOCIATION__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case ClassesPackage.ASSOCIATION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case ClassesPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case ClassesPackage.ASSOCIATION__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case ClassesPackage.ASSOCIATION__MEMBER:
				return member != null && !member.isEmpty();
			case ClassesPackage.ASSOCIATION__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case ClassesPackage.ASSOCIATION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case ClassesPackage.ASSOCIATION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case ClassesPackage.ASSOCIATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case ClassesPackage.ASSOCIATION__PACKAGE:
				return getPackage() != null;
			case ClassesPackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ClassesPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				return isFinalSpecialization != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case ClassesPackage.ASSOCIATION__INHERITED_MEMBER:
				return inheritedMember != null && !inheritedMember.isEmpty();
			case ClassesPackage.ASSOCIATION__FEATURE:
				return feature != null && !feature.isEmpty();
			case ClassesPackage.ASSOCIATION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case ClassesPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case ClassesPackage.ASSOCIATION__GENERAL:
				return general != null && !general.isEmpty();
			case ClassesPackage.ASSOCIATION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case ClassesPackage.ASSOCIATION__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case ClassesPackage.ASSOCIATION__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case ClassesPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
			case ClassesPackage.ASSOCIATION__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case ClassesPackage.ASSOCIATION__OWNED_END:
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
				case ClassesPackage.ASSOCIATION__NAME: return ClassesPackage.NAMED_ELEMENT__NAME;
				case ClassesPackage.ASSOCIATION__QUALIFIED_NAME: return ClassesPackage.NAMED_ELEMENT__QUALIFIED_NAME;
				case ClassesPackage.ASSOCIATION__VISIBILITY: return ClassesPackage.NAMED_ELEMENT__VISIBILITY;
				case ClassesPackage.ASSOCIATION__NAMESPACE: return ClassesPackage.NAMED_ELEMENT__NAMESPACE;
				case ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY: return ClassesPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case ClassesPackage.ASSOCIATION__REDEFINED_ELEMENT: return ClassesPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case ClassesPackage.ASSOCIATION__IS_LEAF: return ClassesPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case ClassesPackage.ASSOCIATION__REDEFINITION_CONTEXT: return ClassesPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case ClassesPackage.ASSOCIATION__IMPORTED_MEMBER: return ClassesPackage.NAMESPACE__IMPORTED_MEMBER;
				case ClassesPackage.ASSOCIATION__MEMBER: return ClassesPackage.NAMESPACE__MEMBER;
				case ClassesPackage.ASSOCIATION__OWNED_MEMBER: return ClassesPackage.NAMESPACE__OWNED_MEMBER;
				case ClassesPackage.ASSOCIATION__ELEMENT_IMPORT: return ClassesPackage.NAMESPACE__ELEMENT_IMPORT;
				case ClassesPackage.ASSOCIATION__PACKAGE_IMPORT: return ClassesPackage.NAMESPACE__PACKAGE_IMPORT;
				case ClassesPackage.ASSOCIATION__OWNED_RULE: return ClassesPackage.NAMESPACE__OWNED_RULE;
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
				case ClassesPackage.ASSOCIATION__PACKAGE: return ClassesPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case ClassesPackage.ASSOCIATION__IS_ABSTRACT: return ClassesPackage.CLASSIFIER__IS_ABSTRACT;
				case ClassesPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION: return ClassesPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION;
				case ClassesPackage.ASSOCIATION__INHERITED_MEMBER: return ClassesPackage.CLASSIFIER__INHERITED_MEMBER;
				case ClassesPackage.ASSOCIATION__FEATURE: return ClassesPackage.CLASSIFIER__FEATURE;
				case ClassesPackage.ASSOCIATION__ATTRIBUTE: return ClassesPackage.CLASSIFIER__ATTRIBUTE;
				case ClassesPackage.ASSOCIATION__REDEFINED_CLASSIFIER: return ClassesPackage.CLASSIFIER__REDEFINED_CLASSIFIER;
				case ClassesPackage.ASSOCIATION__GENERAL: return ClassesPackage.CLASSIFIER__GENERAL;
				case ClassesPackage.ASSOCIATION__GENERALIZATION: return ClassesPackage.CLASSIFIER__GENERALIZATION;
				case ClassesPackage.ASSOCIATION__SUBSTITUTION: return ClassesPackage.CLASSIFIER__SUBSTITUTION;
				case ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT: return ClassesPackage.CLASSIFIER__POWERTYPE_EXTENT;
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
				case ClassesPackage.NAMED_ELEMENT__NAME: return ClassesPackage.ASSOCIATION__NAME;
				case ClassesPackage.NAMED_ELEMENT__QUALIFIED_NAME: return ClassesPackage.ASSOCIATION__QUALIFIED_NAME;
				case ClassesPackage.NAMED_ELEMENT__VISIBILITY: return ClassesPackage.ASSOCIATION__VISIBILITY;
				case ClassesPackage.NAMED_ELEMENT__NAMESPACE: return ClassesPackage.ASSOCIATION__NAMESPACE;
				case ClassesPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY: return ClassesPackage.ASSOCIATION__CLIENT_DEPENDENCY;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case ClassesPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return ClassesPackage.ASSOCIATION__REDEFINED_ELEMENT;
				case ClassesPackage.REDEFINABLE_ELEMENT__IS_LEAF: return ClassesPackage.ASSOCIATION__IS_LEAF;
				case ClassesPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return ClassesPackage.ASSOCIATION__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case ClassesPackage.NAMESPACE__IMPORTED_MEMBER: return ClassesPackage.ASSOCIATION__IMPORTED_MEMBER;
				case ClassesPackage.NAMESPACE__MEMBER: return ClassesPackage.ASSOCIATION__MEMBER;
				case ClassesPackage.NAMESPACE__OWNED_MEMBER: return ClassesPackage.ASSOCIATION__OWNED_MEMBER;
				case ClassesPackage.NAMESPACE__ELEMENT_IMPORT: return ClassesPackage.ASSOCIATION__ELEMENT_IMPORT;
				case ClassesPackage.NAMESPACE__PACKAGE_IMPORT: return ClassesPackage.ASSOCIATION__PACKAGE_IMPORT;
				case ClassesPackage.NAMESPACE__OWNED_RULE: return ClassesPackage.ASSOCIATION__OWNED_RULE;
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
				case ClassesPackage.TYPE__PACKAGE: return ClassesPackage.ASSOCIATION__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case ClassesPackage.CLASSIFIER__IS_ABSTRACT: return ClassesPackage.ASSOCIATION__IS_ABSTRACT;
				case ClassesPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION: return ClassesPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION;
				case ClassesPackage.CLASSIFIER__INHERITED_MEMBER: return ClassesPackage.ASSOCIATION__INHERITED_MEMBER;
				case ClassesPackage.CLASSIFIER__FEATURE: return ClassesPackage.ASSOCIATION__FEATURE;
				case ClassesPackage.CLASSIFIER__ATTRIBUTE: return ClassesPackage.ASSOCIATION__ATTRIBUTE;
				case ClassesPackage.CLASSIFIER__REDEFINED_CLASSIFIER: return ClassesPackage.ASSOCIATION__REDEFINED_CLASSIFIER;
				case ClassesPackage.CLASSIFIER__GENERAL: return ClassesPackage.ASSOCIATION__GENERAL;
				case ClassesPackage.CLASSIFIER__GENERALIZATION: return ClassesPackage.ASSOCIATION__GENERALIZATION;
				case ClassesPackage.CLASSIFIER__SUBSTITUTION: return ClassesPackage.ASSOCIATION__SUBSTITUTION;
				case ClassesPackage.CLASSIFIER__POWERTYPE_EXTENT: return ClassesPackage.ASSOCIATION__POWERTYPE_EXTENT;
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
