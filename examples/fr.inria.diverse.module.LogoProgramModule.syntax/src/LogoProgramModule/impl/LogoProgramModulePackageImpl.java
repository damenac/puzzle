/**
 */
package LogoProgramModule.impl;

import LogoProgramModule.Back;
import LogoProgramModule.Block;
import LogoProgramModule.Clear;
import LogoProgramModule.ControlStructure;
import LogoProgramModule.Expression;
import LogoProgramModule.Forward;
import LogoProgramModule.If;
import LogoProgramModule.Instruction;
import LogoProgramModule.Left;
import LogoProgramModule.LogoProgram;
import LogoProgramModule.LogoProgramModuleFactory;
import LogoProgramModule.LogoProgramModulePackage;
import LogoProgramModule.Parameter;
import LogoProgramModule.ParameterCall;
import LogoProgramModule.PenDown;
import LogoProgramModule.PenUp;
import LogoProgramModule.Primitive;
import LogoProgramModule.ProcCall;
import LogoProgramModule.ProcDeclaration;
import LogoProgramModule.Repeat;
import LogoProgramModule.Right;
import LogoProgramModule.While;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogoProgramModulePackageImpl extends EPackageImpl implements LogoProgramModulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logoProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penDownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penUpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see LogoProgramModule.LogoProgramModulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogoProgramModulePackageImpl() {
		super(eNS_URI, LogoProgramModuleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LogoProgramModulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogoProgramModulePackage init() {
		if (isInited) return (LogoProgramModulePackage)EPackage.Registry.INSTANCE.getEPackage(LogoProgramModulePackage.eNS_URI);

		// Obtain or create and register package
		LogoProgramModulePackageImpl theLogoProgramModulePackage = (LogoProgramModulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogoProgramModulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogoProgramModulePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLogoProgramModulePackage.createPackageContents();

		// Initialize created meta-data
		theLogoProgramModulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogoProgramModulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogoProgramModulePackage.eNS_URI, theLogoProgramModulePackage);
		return theLogoProgramModulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogoProgram() {
		return logoProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogoProgram_Instructions() {
		return (EReference)logoProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitive() {
		return primitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBack() {
		return backEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBack_Steps() {
		return (EReference)backEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForward() {
		return forwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForward_Steps() {
		return (EReference)forwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeft() {
		return leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeft_Angle() {
		return (EReference)leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRight() {
		return rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRight_Angle() {
		return (EReference)rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenDown() {
		return penDownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenUp() {
		return penUpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClear() {
		return clearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcCall() {
		return procCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcCall_ActualArgs() {
		return (EReference)procCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcCall_Declaration() {
		return (EReference)procCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcDeclaration() {
		return procDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcDeclaration_Name() {
		return (EAttribute)procDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcDeclaration_Args() {
		return (EReference)procDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcDeclaration_ProcCall() {
		return (EReference)procDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcDeclaration_Instructions() {
		return (EReference)procDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Instructions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ThenPart() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ElsePart() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlStructure() {
		return controlStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_Condition() {
		return (EReference)controlStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeat_Block() {
		return (EReference)repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Block() {
		return (EReference)whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCall() {
		return parameterCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCall_Parameter() {
		return (EReference)parameterCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoProgramModuleFactory getLogoProgramModuleFactory() {
		return (LogoProgramModuleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		logoProgramEClass = createEClass(LOGO_PROGRAM);
		createEReference(logoProgramEClass, LOGO_PROGRAM__INSTRUCTIONS);

		instructionEClass = createEClass(INSTRUCTION);

		primitiveEClass = createEClass(PRIMITIVE);

		backEClass = createEClass(BACK);
		createEReference(backEClass, BACK__STEPS);

		forwardEClass = createEClass(FORWARD);
		createEReference(forwardEClass, FORWARD__STEPS);

		leftEClass = createEClass(LEFT);
		createEReference(leftEClass, LEFT__ANGLE);

		rightEClass = createEClass(RIGHT);
		createEReference(rightEClass, RIGHT__ANGLE);

		penDownEClass = createEClass(PEN_DOWN);

		penUpEClass = createEClass(PEN_UP);

		clearEClass = createEClass(CLEAR);

		procCallEClass = createEClass(PROC_CALL);
		createEReference(procCallEClass, PROC_CALL__ACTUAL_ARGS);
		createEReference(procCallEClass, PROC_CALL__DECLARATION);

		procDeclarationEClass = createEClass(PROC_DECLARATION);
		createEAttribute(procDeclarationEClass, PROC_DECLARATION__NAME);
		createEReference(procDeclarationEClass, PROC_DECLARATION__ARGS);
		createEReference(procDeclarationEClass, PROC_DECLARATION__PROC_CALL);
		createEReference(procDeclarationEClass, PROC_DECLARATION__INSTRUCTIONS);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__INSTRUCTIONS);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__THEN_PART);
		createEReference(ifEClass, IF__ELSE_PART);

		controlStructureEClass = createEClass(CONTROL_STRUCTURE);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__CONDITION);

		repeatEClass = createEClass(REPEAT);
		createEReference(repeatEClass, REPEAT__BLOCK);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__BLOCK);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		parameterCallEClass = createEClass(PARAMETER_CALL);
		createEReference(parameterCallEClass, PARAMETER_CALL__PARAMETER);

		expressionEClass = createEClass(EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveEClass.getESuperTypes().add(this.getInstruction());
		backEClass.getESuperTypes().add(this.getPrimitive());
		forwardEClass.getESuperTypes().add(this.getPrimitive());
		leftEClass.getESuperTypes().add(this.getPrimitive());
		rightEClass.getESuperTypes().add(this.getPrimitive());
		penDownEClass.getESuperTypes().add(this.getPrimitive());
		penUpEClass.getESuperTypes().add(this.getPrimitive());
		clearEClass.getESuperTypes().add(this.getPrimitive());
		procCallEClass.getESuperTypes().add(this.getExpression());
		procDeclarationEClass.getESuperTypes().add(this.getInstruction());
		blockEClass.getESuperTypes().add(this.getInstruction());
		ifEClass.getESuperTypes().add(this.getControlStructure());
		controlStructureEClass.getESuperTypes().add(this.getInstruction());
		repeatEClass.getESuperTypes().add(this.getControlStructure());
		whileEClass.getESuperTypes().add(this.getControlStructure());
		parameterEClass.getESuperTypes().add(this.getExpression());
		parameterCallEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(logoProgramEClass, LogoProgram.class, "LogoProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogoProgram_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, LogoProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveEClass, Primitive.class, "Primitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backEClass, Back.class, "Back", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBack_Steps(), this.getExpression(), null, "steps", null, 1, 1, Back.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forwardEClass, Forward.class, "Forward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForward_Steps(), this.getExpression(), null, "steps", null, 1, 1, Forward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leftEClass, Left.class, "Left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeft_Angle(), this.getExpression(), null, "angle", null, 0, 1, Left.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightEClass, Right.class, "Right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRight_Angle(), this.getExpression(), null, "angle", null, 0, 1, Right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(penDownEClass, PenDown.class, "PenDown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(penUpEClass, PenUp.class, "PenUp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearEClass, Clear.class, "Clear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procCallEClass, ProcCall.class, "ProcCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcCall_ActualArgs(), this.getExpression(), null, "actualArgs", null, 0, -1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcCall_Declaration(), this.getProcDeclaration(), null, "declaration", null, 1, 1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procDeclarationEClass, ProcDeclaration.class, "ProcDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcDeclaration_Args(), this.getParameter(), null, "args", null, 0, -1, ProcDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcDeclaration_ProcCall(), this.getProcCall(), null, "procCall", null, 0, -1, ProcDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcDeclaration_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, ProcDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_ThenPart(), this.getBlock(), null, "thenPart", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_ElsePart(), this.getBlock(), null, "elsePart", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlStructureEClass, ControlStructure.class, "ControlStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlStructure_Condition(), this.getExpression(), null, "condition", null, 0, 1, ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeat_Block(), this.getBlock(), null, "block", null, 1, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_Block(), this.getBlock(), null, "block", null, 1, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCallEClass, ParameterCall.class, "ParameterCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCall_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Required
		createRequiredAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Required</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRequiredAnnotations() {
		String source = "Required";	
		addAnnotation
		  (expressionEClass, 
		   source, 
		   new String[] {
		   });
	}

} //LogoProgramModulePackageImpl
