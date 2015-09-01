var G = new jsnx.DiGraph();
G.addNodesFrom(["StateMachine: [fsm]","AbstractState: [fsm]","Transition: [fsm]","State: [fsm, hfsm, tfsm]","Trigger: [fsm, hfsm, tfsm]","Pseudostate: [fsm, hfsm, tfsm]","PseudostateKind: [fsm, hfsm, tfsm]","FinalState: [fsm, hfsm, tfsm]","Constraint: [fsm, hfsm, tfsm]","RelationalConstraint: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]","Program: [fsm, hfsm, tfsm]","Conditional: [fsm, hfsm, tfsm]","Loop: [fsm, hfsm, tfsm]","VarDecl: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]","Literal: [fsm, hfsm, tfsm]","IntegerLit: [fsm, hfsm, tfsm]","StringLit: [fsm, hfsm, tfsm]","BoolLit: [fsm, hfsm, tfsm]","ArithmeticExpression: [fsm, hfsm, tfsm]","ArithmeticOperator: [fsm, hfsm, tfsm]","RelationalExpression: [fsm, hfsm, tfsm]","RelationalOperator: [fsm, hfsm, tfsm]","VarReference: [fsm, hfsm, tfsm]","ConsoleOutput: [fsm, hfsm, tfsm]","Println: [fsm, hfsm, tfsm]","Print: [fsm, hfsm, tfsm]","Assignation: [fsm, hfsm, tfsm]","Wait: [fsm, hfsm, tfsm]","NamedElement: [fsm, hfsm, tfsm]","StateMachine: [hfsm, tfsm]","Region: [hfsm, tfsm]","AbstractState: [hfsm, tfsm]","Transition: [hfsm]","Transition: [tfsm]"], {group:0});

G.addEdgesFrom([["StateMachine: [fsm]","AbstractState: [fsm]"],["StateMachine: [fsm]","Transition: [fsm]"],["AbstractState: [fsm]","Transition: [fsm]"],["AbstractState: [fsm]","Transition: [fsm]"],["Transition: [fsm]","Trigger: [fsm, hfsm, tfsm]"],["Transition: [fsm]","AbstractState: [fsm]"],["Transition: [fsm]","AbstractState: [fsm]"],["Transition: [fsm]","Statement: [fsm, hfsm, tfsm]"],["Transition: [fsm]","Constraint: [fsm, hfsm, tfsm]"],["State: [fsm, hfsm, tfsm]","Program: [fsm, hfsm, tfsm]"],["State: [fsm, hfsm, tfsm]","Program: [fsm, hfsm, tfsm]"],["State: [fsm, hfsm, tfsm]","Program: [fsm, hfsm, tfsm]"],["Pseudostate: [fsm, hfsm, tfsm]","PseudostateKind: [fsm, hfsm, tfsm]"],["RelationalConstraint: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["Program: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["Conditional: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["Conditional: [fsm, hfsm, tfsm]","Program: [fsm, hfsm, tfsm]"],["Loop: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["Loop: [fsm, hfsm, tfsm]","Program: [fsm, hfsm, tfsm]"],["VarDecl: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["ArithmeticExpression: [fsm, hfsm, tfsm]","ArithmeticOperator: [fsm, hfsm, tfsm]"],["ArithmeticExpression: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["ArithmeticExpression: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["RelationalExpression: [fsm, hfsm, tfsm]","RelationalOperator: [fsm, hfsm, tfsm]"],["RelationalExpression: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["RelationalExpression: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["Assignation: [fsm, hfsm, tfsm]","VarDecl: [fsm, hfsm, tfsm]"],["Assignation: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["StateMachine: [hfsm, tfsm]","Region: [hfsm, tfsm]"],["Region: [hfsm, tfsm]","AbstractState: [hfsm, tfsm]"],["Region: [hfsm, tfsm]","Transition: [hfsm]"],["AbstractState: [hfsm, tfsm]","Transition: [hfsm]"],["AbstractState: [hfsm, tfsm]","Transition: [hfsm]"],["AbstractState: [hfsm, tfsm]","Region: [hfsm, tfsm]"],["Transition: [hfsm]","Trigger: [fsm, hfsm, tfsm]"],["Transition: [hfsm]","AbstractState: [hfsm, tfsm]"],["Transition: [hfsm]","AbstractState: [hfsm, tfsm]"],["Transition: [hfsm]","Constraint: [fsm, hfsm, tfsm]"],["Transition: [hfsm]","Statement: [fsm, hfsm, tfsm]"],["Transition: [tfsm]","Trigger: [fsm, hfsm, tfsm]"],["Transition: [tfsm]","AbstractState: [hfsm, tfsm]"],["Transition: [tfsm]","AbstractState: [hfsm, tfsm]"],["Transition: [tfsm]","Constraint: [fsm, hfsm, tfsm]"],["StateMachine: [fsm]","NamedElement: [fsm, hfsm, tfsm]"],["AbstractState: [fsm]","NamedElement: [fsm, hfsm, tfsm]"],["Transition: [fsm]","NamedElement: [fsm, hfsm, tfsm]"],["State: [fsm, hfsm, tfsm]","AbstractState: [fsm]"],["Pseudostate: [fsm, hfsm, tfsm]","AbstractState: [fsm]"],["FinalState: [fsm, hfsm, tfsm]","State: [fsm, hfsm, tfsm]"],["RelationalConstraint: [fsm, hfsm, tfsm]","Constraint: [fsm, hfsm, tfsm]"],["Program: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["Conditional: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["Loop: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["VarDecl: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["Literal: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["IntegerLit: [fsm, hfsm, tfsm]","Literal: [fsm, hfsm, tfsm]"],["StringLit: [fsm, hfsm, tfsm]","Literal: [fsm, hfsm, tfsm]"],["BoolLit: [fsm, hfsm, tfsm]","Literal: [fsm, hfsm, tfsm]"],["ArithmeticExpression: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["RelationalExpression: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["VarReference: [fsm, hfsm, tfsm]","Expression: [fsm, hfsm, tfsm]"],["ConsoleOutput: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["Println: [fsm, hfsm, tfsm]","ConsoleOutput: [fsm, hfsm, tfsm]"],["Print: [fsm, hfsm, tfsm]","ConsoleOutput: [fsm, hfsm, tfsm]"],["Assignation: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["Wait: [fsm, hfsm, tfsm]","Statement: [fsm, hfsm, tfsm]"],["StateMachine: [hfsm, tfsm]","NamedElement: [fsm, hfsm, tfsm]"],["Region: [hfsm, tfsm]","NamedElement: [fsm, hfsm, tfsm]"],["AbstractState: [hfsm, tfsm]","NamedElement: [fsm, hfsm, tfsm]"],["Transition: [hfsm]","NamedElement: [fsm, hfsm, tfsm]"],["Transition: [tfsm]","NamedElement: [fsm, hfsm, tfsm]"]]);
