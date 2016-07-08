/**
 */
package Classes.Kernel.impl;

import Classes.Dependencies.DependenciesPackage;
import Classes.Dependencies.Dependency;
import Classes.Dependencies.Substitution;

import Classes.Kernel.Association;
import Classes.Kernel.Classifier;
import Classes.Kernel.Constraint;
import Classes.Kernel.ElementImport;
import Classes.Kernel.Feature;
import Classes.Kernel.Generalization;
import Classes.Kernel.KernelPackage;
import Classes.Kernel.NamedElement;
import Classes.Kernel.Namespace;
import Classes.Kernel.PackageImport;
import Classes.Kernel.PackageableElement;
import Classes.Kernel.Property;
import Classes.Kernel.RedefinableElement;
import Classes.Kernel.Type;
import Classes.Kernel.VisibilityKind;

import Classes.PowerTypes.GeneralizationSet;
import Classes.PowerTypes.PowerTypesPackage;

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
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link Classes.Kernel.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
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
		return KernelPackage.Literals.ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID() != KernelPackage.ASSOCIATION__NAMESPACE) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, KernelPackage.ASSOCIATION__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != KernelPackage.ASSOCIATION__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, KernelPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependency() {
		if (clientDependency == null) {
			clientDependency = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY, DependenciesPackage.DEPENDENCY__CLIENT);
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
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, KernelPackage.ASSOCIATION__REDEFINED_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, KernelPackage.ASSOCIATION__REDEFINITION_CONTEXT);
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
			importedMember = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, KernelPackage.ASSOCIATION__IMPORTED_MEMBER);
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
			member = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, KernelPackage.ASSOCIATION__MEMBER);
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
			ownedMember = new EObjectContainmentWithInverseEList<NamedElement>(NamedElement.class, this, KernelPackage.ASSOCIATION__OWNED_MEMBER, KernelPackage.NAMED_ELEMENT__NAMESPACE);
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
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, KernelPackage.ASSOCIATION__ELEMENT_IMPORT, KernelPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
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
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, KernelPackage.ASSOCIATION__PACKAGE_IMPORT, KernelPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
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
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, KernelPackage.ASSOCIATION__OWNED_RULE, KernelPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classes.Kernel.Package getPackage() {
		if (eContainerFeatureID() != KernelPackage.ASSOCIATION__PACKAGE) return null;
		return (Classes.Kernel.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(Classes.Kernel.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, KernelPackage.ASSOCIATION__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(Classes.Kernel.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != KernelPackage.ASSOCIATION__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, KernelPackage.PACKAGE__OWNED_TYPE, Classes.Kernel.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__PACKAGE, newPackage, newPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		if (inheritedMember == null) {
			inheritedMember = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, KernelPackage.ASSOCIATION__INHERITED_MEMBER);
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
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, KernelPackage.ASSOCIATION__FEATURE, KernelPackage.FEATURE__FEATURING_CLASSIFIER);
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
			attribute = new EObjectResolvingEList<Property>(Property.class, this, KernelPackage.ASSOCIATION__ATTRIBUTE);
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
			redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, KernelPackage.ASSOCIATION__REDEFINED_CLASSIFIER);
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
			general = new EObjectResolvingEList<Classifier>(Classifier.class, this, KernelPackage.ASSOCIATION__GENERAL);
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
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, KernelPackage.ASSOCIATION__GENERALIZATION, KernelPackage.GENERALIZATION__SPECIFIC);
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
			substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, KernelPackage.ASSOCIATION__SUBSTITUTION, DependenciesPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
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
			powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, KernelPackage.ASSOCIATION__POWERTYPE_EXTENT, PowerTypesPackage.GENERALIZATION_SET__POWERTYPE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END);
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
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, KernelPackage.ASSOCIATION__MEMBER_END, KernelPackage.PROPERTY__ASSOCIATION);
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
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, KernelPackage.ASSOCIATION__OWNED_END, KernelPackage.PROPERTY__OWNING_ASSOCIATION);
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
			case KernelPackage.ASSOCIATION__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
			case KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientDependency()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((Classes.Kernel.Package)otherEnd, msgs);
			case KernelPackage.ASSOCIATION__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_END:
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
			case KernelPackage.ASSOCIATION__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return ((InternalEList<?>)getClientDependency()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__PACKAGE:
				return basicSetPackage(null, msgs);
			case KernelPackage.ASSOCIATION__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_END:
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
			case KernelPackage.ASSOCIATION__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, KernelPackage.NAMESPACE__OWNED_MEMBER, Namespace.class, msgs);
			case KernelPackage.ASSOCIATION__PACKAGE:
				return eInternalContainer().eInverseRemove(this, KernelPackage.PACKAGE__OWNED_TYPE, Classes.Kernel.Package.class, msgs);
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
			case KernelPackage.ASSOCIATION__NAME:
				return getName();
			case KernelPackage.ASSOCIATION__QUALIFIED_NAME:
				return getQualifiedName();
			case KernelPackage.ASSOCIATION__VISIBILITY:
				return getVisibility();
			case KernelPackage.ASSOCIATION__NAMESPACE:
				return getNamespace();
			case KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return getClientDependency();
			case KernelPackage.ASSOCIATION__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case KernelPackage.ASSOCIATION__IS_LEAF:
				return isIsLeaf();
			case KernelPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case KernelPackage.ASSOCIATION__IMPORTED_MEMBER:
				return getImportedMember();
			case KernelPackage.ASSOCIATION__MEMBER:
				return getMember();
			case KernelPackage.ASSOCIATION__OWNED_MEMBER:
				return getOwnedMember();
			case KernelPackage.ASSOCIATION__ELEMENT_IMPORT:
				return getElementImport();
			case KernelPackage.ASSOCIATION__PACKAGE_IMPORT:
				return getPackageImport();
			case KernelPackage.ASSOCIATION__OWNED_RULE:
				return getOwnedRule();
			case KernelPackage.ASSOCIATION__PACKAGE:
				return getPackage();
			case KernelPackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract();
			case KernelPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				return isIsFinalSpecialization();
			case KernelPackage.ASSOCIATION__INHERITED_MEMBER:
				return getInheritedMember();
			case KernelPackage.ASSOCIATION__FEATURE:
				return getFeature();
			case KernelPackage.ASSOCIATION__ATTRIBUTE:
				return getAttribute();
			case KernelPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case KernelPackage.ASSOCIATION__GENERAL:
				return getGeneral();
			case KernelPackage.ASSOCIATION__GENERALIZATION:
				return getGeneralization();
			case KernelPackage.ASSOCIATION__SUBSTITUTION:
				return getSubstitution();
			case KernelPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case KernelPackage.ASSOCIATION__IS_DERIVED:
				return isIsDerived();
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return getMemberEnd();
			case KernelPackage.ASSOCIATION__OWNED_END:
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
			case KernelPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case KernelPackage.ASSOCIATION__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case KernelPackage.ASSOCIATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case KernelPackage.ASSOCIATION__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				getClientDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case KernelPackage.ASSOCIATION__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case KernelPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case KernelPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case KernelPackage.ASSOCIATION__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case KernelPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case KernelPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case KernelPackage.ASSOCIATION__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case KernelPackage.ASSOCIATION__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case KernelPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case KernelPackage.ASSOCIATION__PACKAGE:
				setPackage((Classes.Kernel.Package)newValue);
				return;
			case KernelPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case KernelPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization((Boolean)newValue);
				return;
			case KernelPackage.ASSOCIATION__INHERITED_MEMBER:
				getInheritedMember().clear();
				getInheritedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case KernelPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case KernelPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case KernelPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case KernelPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case KernelPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case KernelPackage.ASSOCIATION__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case KernelPackage.ASSOCIATION__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case KernelPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case KernelPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case KernelPackage.ASSOCIATION__OWNED_END:
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
			case KernelPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				return;
			case KernelPackage.ASSOCIATION__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case KernelPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case KernelPackage.ASSOCIATION__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case KernelPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				return;
			case KernelPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case KernelPackage.ASSOCIATION__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case KernelPackage.ASSOCIATION__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case KernelPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case KernelPackage.ASSOCIATION__PACKAGE:
				setPackage((Classes.Kernel.Package)null);
				return;
			case KernelPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__INHERITED_MEMBER:
				getInheritedMember().clear();
				return;
			case KernelPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				return;
			case KernelPackage.ASSOCIATION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case KernelPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case KernelPackage.ASSOCIATION__GENERAL:
				getGeneral().clear();
				return;
			case KernelPackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case KernelPackage.ASSOCIATION__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case KernelPackage.ASSOCIATION__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case KernelPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				return;
			case KernelPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				return;
			case KernelPackage.ASSOCIATION__OWNED_END:
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
			case KernelPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KernelPackage.ASSOCIATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case KernelPackage.ASSOCIATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case KernelPackage.ASSOCIATION__NAMESPACE:
				return getNamespace() != null;
			case KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case KernelPackage.ASSOCIATION__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case KernelPackage.ASSOCIATION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case KernelPackage.ASSOCIATION__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case KernelPackage.ASSOCIATION__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case KernelPackage.ASSOCIATION__MEMBER:
				return member != null && !member.isEmpty();
			case KernelPackage.ASSOCIATION__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case KernelPackage.ASSOCIATION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case KernelPackage.ASSOCIATION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case KernelPackage.ASSOCIATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case KernelPackage.ASSOCIATION__PACKAGE:
				return getPackage() != null;
			case KernelPackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case KernelPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION:
				return isFinalSpecialization != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case KernelPackage.ASSOCIATION__INHERITED_MEMBER:
				return inheritedMember != null && !inheritedMember.isEmpty();
			case KernelPackage.ASSOCIATION__FEATURE:
				return feature != null && !feature.isEmpty();
			case KernelPackage.ASSOCIATION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case KernelPackage.ASSOCIATION__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case KernelPackage.ASSOCIATION__GENERAL:
				return general != null && !general.isEmpty();
			case KernelPackage.ASSOCIATION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case KernelPackage.ASSOCIATION__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case KernelPackage.ASSOCIATION__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case KernelPackage.ASSOCIATION__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case KernelPackage.ASSOCIATION__OWNED_END:
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
				case KernelPackage.ASSOCIATION__NAME: return KernelPackage.NAMED_ELEMENT__NAME;
				case KernelPackage.ASSOCIATION__QUALIFIED_NAME: return KernelPackage.NAMED_ELEMENT__QUALIFIED_NAME;
				case KernelPackage.ASSOCIATION__VISIBILITY: return KernelPackage.NAMED_ELEMENT__VISIBILITY;
				case KernelPackage.ASSOCIATION__NAMESPACE: return KernelPackage.NAMED_ELEMENT__NAMESPACE;
				case KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY: return KernelPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case KernelPackage.ASSOCIATION__REDEFINED_ELEMENT: return KernelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case KernelPackage.ASSOCIATION__IS_LEAF: return KernelPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case KernelPackage.ASSOCIATION__REDEFINITION_CONTEXT: return KernelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case KernelPackage.ASSOCIATION__IMPORTED_MEMBER: return KernelPackage.NAMESPACE__IMPORTED_MEMBER;
				case KernelPackage.ASSOCIATION__MEMBER: return KernelPackage.NAMESPACE__MEMBER;
				case KernelPackage.ASSOCIATION__OWNED_MEMBER: return KernelPackage.NAMESPACE__OWNED_MEMBER;
				case KernelPackage.ASSOCIATION__ELEMENT_IMPORT: return KernelPackage.NAMESPACE__ELEMENT_IMPORT;
				case KernelPackage.ASSOCIATION__PACKAGE_IMPORT: return KernelPackage.NAMESPACE__PACKAGE_IMPORT;
				case KernelPackage.ASSOCIATION__OWNED_RULE: return KernelPackage.NAMESPACE__OWNED_RULE;
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
				case KernelPackage.ASSOCIATION__PACKAGE: return KernelPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case KernelPackage.ASSOCIATION__IS_ABSTRACT: return KernelPackage.CLASSIFIER__IS_ABSTRACT;
				case KernelPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION: return KernelPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION;
				case KernelPackage.ASSOCIATION__INHERITED_MEMBER: return KernelPackage.CLASSIFIER__INHERITED_MEMBER;
				case KernelPackage.ASSOCIATION__FEATURE: return KernelPackage.CLASSIFIER__FEATURE;
				case KernelPackage.ASSOCIATION__ATTRIBUTE: return KernelPackage.CLASSIFIER__ATTRIBUTE;
				case KernelPackage.ASSOCIATION__REDEFINED_CLASSIFIER: return KernelPackage.CLASSIFIER__REDEFINED_CLASSIFIER;
				case KernelPackage.ASSOCIATION__GENERAL: return KernelPackage.CLASSIFIER__GENERAL;
				case KernelPackage.ASSOCIATION__GENERALIZATION: return KernelPackage.CLASSIFIER__GENERALIZATION;
				case KernelPackage.ASSOCIATION__SUBSTITUTION: return KernelPackage.CLASSIFIER__SUBSTITUTION;
				case KernelPackage.ASSOCIATION__POWERTYPE_EXTENT: return KernelPackage.CLASSIFIER__POWERTYPE_EXTENT;
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
				case KernelPackage.NAMED_ELEMENT__NAME: return KernelPackage.ASSOCIATION__NAME;
				case KernelPackage.NAMED_ELEMENT__QUALIFIED_NAME: return KernelPackage.ASSOCIATION__QUALIFIED_NAME;
				case KernelPackage.NAMED_ELEMENT__VISIBILITY: return KernelPackage.ASSOCIATION__VISIBILITY;
				case KernelPackage.NAMED_ELEMENT__NAMESPACE: return KernelPackage.ASSOCIATION__NAMESPACE;
				case KernelPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY: return KernelPackage.ASSOCIATION__CLIENT_DEPENDENCY;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case KernelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return KernelPackage.ASSOCIATION__REDEFINED_ELEMENT;
				case KernelPackage.REDEFINABLE_ELEMENT__IS_LEAF: return KernelPackage.ASSOCIATION__IS_LEAF;
				case KernelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return KernelPackage.ASSOCIATION__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case KernelPackage.NAMESPACE__IMPORTED_MEMBER: return KernelPackage.ASSOCIATION__IMPORTED_MEMBER;
				case KernelPackage.NAMESPACE__MEMBER: return KernelPackage.ASSOCIATION__MEMBER;
				case KernelPackage.NAMESPACE__OWNED_MEMBER: return KernelPackage.ASSOCIATION__OWNED_MEMBER;
				case KernelPackage.NAMESPACE__ELEMENT_IMPORT: return KernelPackage.ASSOCIATION__ELEMENT_IMPORT;
				case KernelPackage.NAMESPACE__PACKAGE_IMPORT: return KernelPackage.ASSOCIATION__PACKAGE_IMPORT;
				case KernelPackage.NAMESPACE__OWNED_RULE: return KernelPackage.ASSOCIATION__OWNED_RULE;
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
				case KernelPackage.TYPE__PACKAGE: return KernelPackage.ASSOCIATION__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case KernelPackage.CLASSIFIER__IS_ABSTRACT: return KernelPackage.ASSOCIATION__IS_ABSTRACT;
				case KernelPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION: return KernelPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION;
				case KernelPackage.CLASSIFIER__INHERITED_MEMBER: return KernelPackage.ASSOCIATION__INHERITED_MEMBER;
				case KernelPackage.CLASSIFIER__FEATURE: return KernelPackage.ASSOCIATION__FEATURE;
				case KernelPackage.CLASSIFIER__ATTRIBUTE: return KernelPackage.ASSOCIATION__ATTRIBUTE;
				case KernelPackage.CLASSIFIER__REDEFINED_CLASSIFIER: return KernelPackage.ASSOCIATION__REDEFINED_CLASSIFIER;
				case KernelPackage.CLASSIFIER__GENERAL: return KernelPackage.ASSOCIATION__GENERAL;
				case KernelPackage.CLASSIFIER__GENERALIZATION: return KernelPackage.ASSOCIATION__GENERALIZATION;
				case KernelPackage.CLASSIFIER__SUBSTITUTION: return KernelPackage.ASSOCIATION__SUBSTITUTION;
				case KernelPackage.CLASSIFIER__POWERTYPE_EXTENT: return KernelPackage.ASSOCIATION__POWERTYPE_EXTENT;
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
