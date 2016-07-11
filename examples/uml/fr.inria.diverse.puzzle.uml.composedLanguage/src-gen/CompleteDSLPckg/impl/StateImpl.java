/**
 */
package CompleteDSLPckg.impl;

import CompleteDSLPckg.Behavior;
import CompleteDSLPckg.Classifier;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.ConnectionPointReference;
import CompleteDSLPckg.Constraint;
import CompleteDSLPckg.ElementImport;
import CompleteDSLPckg.NamedElement;
import CompleteDSLPckg.Namespace;
import CompleteDSLPckg.PackageImport;
import CompleteDSLPckg.PackageableElement;
import CompleteDSLPckg.Pseudostate;
import CompleteDSLPckg.RedefinableElement;
import CompleteDSLPckg.Region;
import CompleteDSLPckg.State;
import CompleteDSLPckg.StateMachine;
import CompleteDSLPckg.Trigger;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getMember <em>Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link CompleteDSLPckg.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends VertexImpl implements State {
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
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORTHOGONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrthogonal = IS_ORTHOGONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimple = IS_SIMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBMACHINE_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubmachineState = IS_SUBMACHINE_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPointReference> connection;

	/**
	 * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoint;

	/**
	 * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine submachine;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * The cached value of the '{@link #getDeferrableTrigger() <em>Deferrable Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> deferrableTrigger;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint stateInvariant;

	/**
	 * The cached value of the '{@link #getRedefinedState() <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState()
	 * @generated
	 * @ordered
	 */
	protected State redefinedState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteDSLPckgPackage.eINSTANCE.getState();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<RedefinableElement>(RedefinableElement.class, this, CompleteDSLPckgPackage.STATE__REDEFINED_ELEMENT);
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
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, CompleteDSLPckgPackage.STATE__REDEFINITION_CONTEXT);
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
			importedMember = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, CompleteDSLPckgPackage.STATE__IMPORTED_MEMBER);
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
			member = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.STATE__MEMBER);
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
			ownedMember = new EObjectContainmentWithInverseEList<NamedElement>(NamedElement.class, this, CompleteDSLPckgPackage.STATE__OWNED_MEMBER, CompleteDSLPckgPackage.NAMED_ELEMENT__NAMESPACE);
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
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT, CompleteDSLPckgPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
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
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT, CompleteDSLPckgPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
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
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, CompleteDSLPckgPackage.STATE__OWNED_RULE, CompleteDSLPckgPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrthogonal() {
		return isOrthogonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrthogonal(boolean newIsOrthogonal) {
		boolean oldIsOrthogonal = isOrthogonal;
		isOrthogonal = newIsOrthogonal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__IS_ORTHOGONAL, oldIsOrthogonal, isOrthogonal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSimple() {
		return isSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSimple(boolean newIsSimple) {
		boolean oldIsSimple = isSimple;
		isSimple = newIsSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__IS_SIMPLE, oldIsSimple, isSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubmachineState() {
		return isSubmachineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubmachineState(boolean newIsSubmachineState) {
		boolean oldIsSubmachineState = isSubmachineState;
		isSubmachineState = newIsSubmachineState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__IS_SUBMACHINE_STATE, oldIsSubmachineState, isSubmachineState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPointReference> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<ConnectionPointReference>(ConnectionPointReference.class, this, CompleteDSLPckgPackage.STATE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentEList<Pseudostate>(Pseudostate.class, this, CompleteDSLPckgPackage.STATE__CONNECTION_POINT);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getSubmachine() {
		if (submachine != null && submachine.eIsProxy()) {
			InternalEObject oldSubmachine = (InternalEObject)submachine;
			submachine = (StateMachine)eResolveProxy(oldSubmachine);
			if (submachine != oldSubmachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STATE__SUBMACHINE, oldSubmachine, submachine));
			}
		}
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetSubmachine() {
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmachine(StateMachine newSubmachine) {
		StateMachine oldSubmachine = submachine;
		submachine = newSubmachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__SUBMACHINE, oldSubmachine, submachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentEList<Region>(Region.class, this, CompleteDSLPckgPackage.STATE__REGION);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getDeferrableTrigger() {
		if (deferrableTrigger == null) {
			deferrableTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, CompleteDSLPckgPackage.STATE__DEFERRABLE_TRIGGER);
		}
		return deferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Behavior newExit, NotificationChain msgs) {
		Behavior oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Behavior newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Behavior newDoActivity, NotificationChain msgs) {
		Behavior oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(Behavior newDoActivity) {
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject)doActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__DO_ACTIVITY, null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject)newDoActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__DO_ACTIVITY, null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Behavior newEntry, NotificationChain msgs) {
		Behavior oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Behavior newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(Constraint newStateInvariant, NotificationChain msgs) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__STATE_INVARIANT, oldStateInvariant, newStateInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInvariant(Constraint newStateInvariant) {
		if (newStateInvariant != stateInvariant) {
			NotificationChain msgs = null;
			if (stateInvariant != null)
				msgs = ((InternalEObject)stateInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__STATE_INVARIANT, null, msgs);
			if (newStateInvariant != null)
				msgs = ((InternalEObject)newStateInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompleteDSLPckgPackage.STATE__STATE_INVARIANT, null, msgs);
			msgs = basicSetStateInvariant(newStateInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__STATE_INVARIANT, newStateInvariant, newStateInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getRedefinedState() {
		if (redefinedState != null && redefinedState.eIsProxy()) {
			InternalEObject oldRedefinedState = (InternalEObject)redefinedState;
			redefinedState = (State)eResolveProxy(oldRedefinedState);
			if (redefinedState != oldRedefinedState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteDSLPckgPackage.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
			}
		}
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetRedefinedState() {
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedState(State newRedefinedState) {
		State oldRedefinedState = redefinedState;
		redefinedState = newRedefinedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteDSLPckgPackage.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
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
			case CompleteDSLPckgPackage.STATE__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
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
			case CompleteDSLPckgPackage.STATE__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__DEFERRABLE_TRIGGER:
				return ((InternalEList<?>)getDeferrableTrigger()).basicRemove(otherEnd, msgs);
			case CompleteDSLPckgPackage.STATE__EXIT:
				return basicSetExit(null, msgs);
			case CompleteDSLPckgPackage.STATE__DO_ACTIVITY:
				return basicSetDoActivity(null, msgs);
			case CompleteDSLPckgPackage.STATE__ENTRY:
				return basicSetEntry(null, msgs);
			case CompleteDSLPckgPackage.STATE__STATE_INVARIANT:
				return basicSetStateInvariant(null, msgs);
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
			case CompleteDSLPckgPackage.STATE__IS_LEAF:
				return isIsLeaf();
			case CompleteDSLPckgPackage.STATE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case CompleteDSLPckgPackage.STATE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case CompleteDSLPckgPackage.STATE__IMPORTED_MEMBER:
				return getImportedMember();
			case CompleteDSLPckgPackage.STATE__MEMBER:
				return getMember();
			case CompleteDSLPckgPackage.STATE__OWNED_MEMBER:
				return getOwnedMember();
			case CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT:
				return getElementImport();
			case CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT:
				return getPackageImport();
			case CompleteDSLPckgPackage.STATE__OWNED_RULE:
				return getOwnedRule();
			case CompleteDSLPckgPackage.STATE__IS_COMPOSITE:
				return isIsComposite();
			case CompleteDSLPckgPackage.STATE__IS_ORTHOGONAL:
				return isIsOrthogonal();
			case CompleteDSLPckgPackage.STATE__IS_SIMPLE:
				return isIsSimple();
			case CompleteDSLPckgPackage.STATE__IS_SUBMACHINE_STATE:
				return isIsSubmachineState();
			case CompleteDSLPckgPackage.STATE__CONNECTION:
				return getConnection();
			case CompleteDSLPckgPackage.STATE__CONNECTION_POINT:
				return getConnectionPoint();
			case CompleteDSLPckgPackage.STATE__SUBMACHINE:
				if (resolve) return getSubmachine();
				return basicGetSubmachine();
			case CompleteDSLPckgPackage.STATE__REGION:
				return getRegion();
			case CompleteDSLPckgPackage.STATE__DEFERRABLE_TRIGGER:
				return getDeferrableTrigger();
			case CompleteDSLPckgPackage.STATE__EXIT:
				return getExit();
			case CompleteDSLPckgPackage.STATE__DO_ACTIVITY:
				return getDoActivity();
			case CompleteDSLPckgPackage.STATE__ENTRY:
				return getEntry();
			case CompleteDSLPckgPackage.STATE__STATE_INVARIANT:
				return getStateInvariant();
			case CompleteDSLPckgPackage.STATE__REDEFINED_STATE:
				if (resolve) return getRedefinedState();
				return basicGetRedefinedState();
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
			case CompleteDSLPckgPackage.STATE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends RedefinableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__IS_ORTHOGONAL:
				setIsOrthogonal((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__IS_SIMPLE:
				setIsSimple((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__IS_SUBMACHINE_STATE:
				setIsSubmachineState((Boolean)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends ConnectionPointReference>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__SUBMACHINE:
				setSubmachine((StateMachine)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				getDeferrableTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__EXIT:
				setExit((Behavior)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__ENTRY:
				setEntry((Behavior)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)newValue);
				return;
			case CompleteDSLPckgPackage.STATE__REDEFINED_STATE:
				setRedefinedState((State)newValue);
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
			case CompleteDSLPckgPackage.STATE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.STATE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case CompleteDSLPckgPackage.STATE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case CompleteDSLPckgPackage.STATE__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case CompleteDSLPckgPackage.STATE__MEMBER:
				getMember().clear();
				return;
			case CompleteDSLPckgPackage.STATE__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case CompleteDSLPckgPackage.STATE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case CompleteDSLPckgPackage.STATE__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.STATE__IS_ORTHOGONAL:
				setIsOrthogonal(IS_ORTHOGONAL_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.STATE__IS_SIMPLE:
				setIsSimple(IS_SIMPLE_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.STATE__IS_SUBMACHINE_STATE:
				setIsSubmachineState(IS_SUBMACHINE_STATE_EDEFAULT);
				return;
			case CompleteDSLPckgPackage.STATE__CONNECTION:
				getConnection().clear();
				return;
			case CompleteDSLPckgPackage.STATE__CONNECTION_POINT:
				getConnectionPoint().clear();
				return;
			case CompleteDSLPckgPackage.STATE__SUBMACHINE:
				setSubmachine((StateMachine)null);
				return;
			case CompleteDSLPckgPackage.STATE__REGION:
				getRegion().clear();
				return;
			case CompleteDSLPckgPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				return;
			case CompleteDSLPckgPackage.STATE__EXIT:
				setExit((Behavior)null);
				return;
			case CompleteDSLPckgPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)null);
				return;
			case CompleteDSLPckgPackage.STATE__ENTRY:
				setEntry((Behavior)null);
				return;
			case CompleteDSLPckgPackage.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)null);
				return;
			case CompleteDSLPckgPackage.STATE__REDEFINED_STATE:
				setRedefinedState((State)null);
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
			case CompleteDSLPckgPackage.STATE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case CompleteDSLPckgPackage.STATE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case CompleteDSLPckgPackage.STATE__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case CompleteDSLPckgPackage.STATE__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case CompleteDSLPckgPackage.STATE__MEMBER:
				return member != null && !member.isEmpty();
			case CompleteDSLPckgPackage.STATE__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case CompleteDSLPckgPackage.STATE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case CompleteDSLPckgPackage.STATE__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case CompleteDSLPckgPackage.STATE__IS_ORTHOGONAL:
				return isOrthogonal != IS_ORTHOGONAL_EDEFAULT;
			case CompleteDSLPckgPackage.STATE__IS_SIMPLE:
				return isSimple != IS_SIMPLE_EDEFAULT;
			case CompleteDSLPckgPackage.STATE__IS_SUBMACHINE_STATE:
				return isSubmachineState != IS_SUBMACHINE_STATE_EDEFAULT;
			case CompleteDSLPckgPackage.STATE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case CompleteDSLPckgPackage.STATE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
			case CompleteDSLPckgPackage.STATE__SUBMACHINE:
				return submachine != null;
			case CompleteDSLPckgPackage.STATE__REGION:
				return region != null && !region.isEmpty();
			case CompleteDSLPckgPackage.STATE__DEFERRABLE_TRIGGER:
				return deferrableTrigger != null && !deferrableTrigger.isEmpty();
			case CompleteDSLPckgPackage.STATE__EXIT:
				return exit != null;
			case CompleteDSLPckgPackage.STATE__DO_ACTIVITY:
				return doActivity != null;
			case CompleteDSLPckgPackage.STATE__ENTRY:
				return entry != null;
			case CompleteDSLPckgPackage.STATE__STATE_INVARIANT:
				return stateInvariant != null;
			case CompleteDSLPckgPackage.STATE__REDEFINED_STATE:
				return redefinedState != null;
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
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.STATE__IS_LEAF: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case CompleteDSLPckgPackage.STATE__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.STATE__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case CompleteDSLPckgPackage.STATE__IMPORTED_MEMBER: return CompleteDSLPckgPackage.NAMESPACE__IMPORTED_MEMBER;
				case CompleteDSLPckgPackage.STATE__MEMBER: return CompleteDSLPckgPackage.NAMESPACE__MEMBER;
				case CompleteDSLPckgPackage.STATE__OWNED_MEMBER: return CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER;
				case CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT: return CompleteDSLPckgPackage.NAMESPACE__ELEMENT_IMPORT;
				case CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT: return CompleteDSLPckgPackage.NAMESPACE__PACKAGE_IMPORT;
				case CompleteDSLPckgPackage.STATE__OWNED_RULE: return CompleteDSLPckgPackage.NAMESPACE__OWNED_RULE;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__IS_LEAF: return CompleteDSLPckgPackage.STATE__IS_LEAF;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return CompleteDSLPckgPackage.STATE__REDEFINED_ELEMENT;
				case CompleteDSLPckgPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return CompleteDSLPckgPackage.STATE__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CompleteDSLPckgPackage.NAMESPACE__IMPORTED_MEMBER: return CompleteDSLPckgPackage.STATE__IMPORTED_MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__MEMBER: return CompleteDSLPckgPackage.STATE__MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__OWNED_MEMBER: return CompleteDSLPckgPackage.STATE__OWNED_MEMBER;
				case CompleteDSLPckgPackage.NAMESPACE__ELEMENT_IMPORT: return CompleteDSLPckgPackage.STATE__ELEMENT_IMPORT;
				case CompleteDSLPckgPackage.NAMESPACE__PACKAGE_IMPORT: return CompleteDSLPckgPackage.STATE__PACKAGE_IMPORT;
				case CompleteDSLPckgPackage.NAMESPACE__OWNED_RULE: return CompleteDSLPckgPackage.STATE__OWNED_RULE;
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
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isOrthogonal: ");
		result.append(isOrthogonal);
		result.append(", isSimple: ");
		result.append(isSimple);
		result.append(", isSubmachineState: ");
		result.append(isSubmachineState);
		result.append(')');
		return result.toString();
	}

} //StateImpl
