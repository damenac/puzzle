google.load('visualization', '1.1', {packages:['table']});
google.setOnLoadCallback(drawTable);

function drawTable() {
  var data = new google.visualization.DataTable();
    data.addColumn('string', 'Group Name');
    data.addColumn('string', 'Group Name');
    data.addColumn('number', 'Coupling');
    data.addRows([      ['Instruction', 'Instruction', 0.0],
      ['Instruction', 'RelationalConstraint', 0.0],
      ['Instruction', 'Trigger', 0.08],
      ['Instruction', 'Flowchart', 0.0],
      ['Instruction', 'ArithmeticExpression', 0.0],
      ['Instruction', 'LogoProgram', 0.0],
      ['Instruction', 'ProcCall', 0.1],
      ['Instruction', 'Constraint', 0.0],
      ['Instruction', 'Decision', 0.0],
      ['Instruction', 'State', 0.0],
      ['Instruction', 'Primitive', 0.12],
      ['Instruction', 'VarReference', 0.0],
      ['Instruction', 'Subflow', 0.0],
      ['Instruction', 'StateMachine', 0.04],
      ['Instruction', 'IntegerLit', 0.0],
      ['Instruction', 'Literal', 0.1],
      ['Instruction', 'Node', 0.4],
      ['Instruction', 'Expression', 0.0],
      ['Instruction', 'AbstractState', 0.2],
      ['RelationalConstraint', 'Instruction', 1.2],
      ['RelationalConstraint', 'RelationalConstraint', 0.0],
      ['RelationalConstraint', 'Trigger', 0.4],
      ['RelationalConstraint', 'Flowchart', 0.0],
      ['RelationalConstraint', 'ArithmeticExpression', 0.0],
      ['RelationalConstraint', 'LogoProgram', 0.0],
      ['RelationalConstraint', 'ProcCall', 0.5],
      ['RelationalConstraint', 'Constraint', 0.0],
      ['RelationalConstraint', 'Decision', 0.0],
      ['RelationalConstraint', 'State', 0.0],
      ['RelationalConstraint', 'Primitive', 0.6],
      ['RelationalConstraint', 'VarReference', 0.0],
      ['RelationalConstraint', 'Subflow', 0.0],
      ['RelationalConstraint', 'StateMachine', 0.2],
      ['RelationalConstraint', 'IntegerLit', 0.0],
      ['RelationalConstraint', 'Literal', 0.5],
      ['RelationalConstraint', 'Node', 2.0],
      ['RelationalConstraint', 'Expression', 0.0],
      ['RelationalConstraint', 'AbstractState', 1.0],
      ['Trigger', 'Instruction', 0.24],
      ['Trigger', 'RelationalConstraint', 0.0],
      ['Trigger', 'Trigger', 0.0],
      ['Trigger', 'Flowchart', 0.0],
      ['Trigger', 'ArithmeticExpression', 0.0],
      ['Trigger', 'LogoProgram', 0.0],
      ['Trigger', 'ProcCall', 0.1],
      ['Trigger', 'Constraint', 0.0],
      ['Trigger', 'Decision', 0.0],
      ['Trigger', 'State', 0.0],
      ['Trigger', 'Primitive', 0.12],
      ['Trigger', 'VarReference', 0.0],
      ['Trigger', 'Subflow', 0.0],
      ['Trigger', 'StateMachine', 0.04],
      ['Trigger', 'IntegerLit', 0.0],
      ['Trigger', 'Literal', 0.1],
      ['Trigger', 'Node', 0.4],
      ['Trigger', 'Expression', 0.0],
      ['Trigger', 'AbstractState', 0.2],
      ['Flowchart', 'Instruction', 0.6],
      ['Flowchart', 'RelationalConstraint', 0.0],
      ['Flowchart', 'Trigger', 0.2],
      ['Flowchart', 'Flowchart', 0.0],
      ['Flowchart', 'ArithmeticExpression', 0.0],
      ['Flowchart', 'LogoProgram', 0.0],
      ['Flowchart', 'ProcCall', 0.25],
      ['Flowchart', 'Constraint', 0.0],
      ['Flowchart', 'Decision', 0.0],
      ['Flowchart', 'State', 0.0],
      ['Flowchart', 'Primitive', 0.3],
      ['Flowchart', 'VarReference', 0.0],
      ['Flowchart', 'Subflow', 0.0],
      ['Flowchart', 'StateMachine', 0.1],
      ['Flowchart', 'IntegerLit', 0.0],
      ['Flowchart', 'Literal', 0.25],
      ['Flowchart', 'Node', 1.0],
      ['Flowchart', 'Expression', 0.0],
      ['Flowchart', 'AbstractState', 0.5],
      ['ArithmeticExpression', 'Instruction', 0.6],
      ['ArithmeticExpression', 'RelationalConstraint', 0.0],
      ['ArithmeticExpression', 'Trigger', 0.2],
      ['ArithmeticExpression', 'Flowchart', 0.0],
      ['ArithmeticExpression', 'ArithmeticExpression', 0.0],
      ['ArithmeticExpression', 'LogoProgram', 0.0],
      ['ArithmeticExpression', 'ProcCall', 0.25],
      ['ArithmeticExpression', 'Constraint', 0.0],
      ['ArithmeticExpression', 'Decision', 0.0],
      ['ArithmeticExpression', 'State', 0.0],
      ['ArithmeticExpression', 'Primitive', 0.3],
      ['ArithmeticExpression', 'VarReference', 0.0],
      ['ArithmeticExpression', 'Subflow', 0.0],
      ['ArithmeticExpression', 'StateMachine', 0.1],
      ['ArithmeticExpression', 'IntegerLit', 0.0],
      ['ArithmeticExpression', 'Literal', 0.25],
      ['ArithmeticExpression', 'Node', 1.0],
      ['ArithmeticExpression', 'Expression', 0.0],
      ['ArithmeticExpression', 'AbstractState', 0.5],
      ['LogoProgram', 'Instruction', 0.24],
      ['LogoProgram', 'RelationalConstraint', 0.0],
      ['LogoProgram', 'Trigger', 0.08],
      ['LogoProgram', 'Flowchart', 0.0],
      ['LogoProgram', 'ArithmeticExpression', 0.0],
      ['LogoProgram', 'LogoProgram', 0.0],
      ['LogoProgram', 'ProcCall', 0.1],
      ['LogoProgram', 'Constraint', 0.0],
      ['LogoProgram', 'Decision', 0.0],
      ['LogoProgram', 'State', 0.0],
      ['LogoProgram', 'Primitive', 0.12],
      ['LogoProgram', 'VarReference', 0.0],
      ['LogoProgram', 'Subflow', 0.0],
      ['LogoProgram', 'StateMachine', 0.04],
      ['LogoProgram', 'IntegerLit', 0.0],
      ['LogoProgram', 'Literal', 0.1],
      ['LogoProgram', 'Node', 0.4],
      ['LogoProgram', 'Expression', 0.0],
      ['LogoProgram', 'AbstractState', 0.2],
      ['ProcCall', 'Instruction', 0.3],
      ['ProcCall', 'RelationalConstraint', 0.0],
      ['ProcCall', 'Trigger', 0.1],
      ['ProcCall', 'Flowchart', 0.0],
      ['ProcCall', 'ArithmeticExpression', 0.0],
      ['ProcCall', 'LogoProgram', 0.0],
      ['ProcCall', 'ProcCall', 0.0],
      ['ProcCall', 'Constraint', 0.0],
      ['ProcCall', 'Decision', 0.0],
      ['ProcCall', 'State', 0.0],
      ['ProcCall', 'Primitive', 0.15],
      ['ProcCall', 'VarReference', 0.0],
      ['ProcCall', 'Subflow', 0.0],
      ['ProcCall', 'StateMachine', 0.05],
      ['ProcCall', 'IntegerLit', 0.0],
      ['ProcCall', 'Literal', 0.125],
      ['ProcCall', 'Node', 0.5],
      ['ProcCall', 'Expression', 0.0],
      ['ProcCall', 'AbstractState', 0.25],
      ['Constraint', 'Instruction', 1.2],
      ['Constraint', 'RelationalConstraint', 0.0],
      ['Constraint', 'Trigger', 0.4],
      ['Constraint', 'Flowchart', 0.0],
      ['Constraint', 'ArithmeticExpression', 0.0],
      ['Constraint', 'LogoProgram', 0.0],
      ['Constraint', 'ProcCall', 0.5],
      ['Constraint', 'Constraint', 0.0],
      ['Constraint', 'Decision', 0.0],
      ['Constraint', 'State', 0.0],
      ['Constraint', 'Primitive', 0.6],
      ['Constraint', 'VarReference', 0.0],
      ['Constraint', 'Subflow', 0.0],
      ['Constraint', 'StateMachine', 0.2],
      ['Constraint', 'IntegerLit', 0.0],
      ['Constraint', 'Literal', 0.5],
      ['Constraint', 'Node', 2.0],
      ['Constraint', 'Expression', 0.0],
      ['Constraint', 'AbstractState', 1.0],
      ['Decision', 'Instruction', 1.2],
      ['Decision', 'RelationalConstraint', 0.0],
      ['Decision', 'Trigger', 0.4],
      ['Decision', 'Flowchart', 0.0],
      ['Decision', 'ArithmeticExpression', 0.0],
      ['Decision', 'LogoProgram', 0.0],
      ['Decision', 'ProcCall', 0.5],
      ['Decision', 'Constraint', 0.0],
      ['Decision', 'Decision', 0.0],
      ['Decision', 'State', 0.0],
      ['Decision', 'Primitive', 0.6],
      ['Decision', 'VarReference', 0.0],
      ['Decision', 'Subflow', 0.0],
      ['Decision', 'StateMachine', 0.2],
      ['Decision', 'IntegerLit', 0.0],
      ['Decision', 'Literal', 0.5],
      ['Decision', 'Node', 2.0],
      ['Decision', 'Expression', 0.0],
      ['Decision', 'AbstractState', 1.0],
      ['State', 'Instruction', 0.3],
      ['State', 'RelationalConstraint', 0.0],
      ['State', 'Trigger', 0.1],
      ['State', 'Flowchart', 0.0],
      ['State', 'ArithmeticExpression', 0.0],
      ['State', 'LogoProgram', 0.0],
      ['State', 'ProcCall', 0.125],
      ['State', 'Constraint', 0.0],
      ['State', 'Decision', 0.0],
      ['State', 'State', 0.0],
      ['State', 'Primitive', 0.15],
      ['State', 'VarReference', 0.0],
      ['State', 'Subflow', 0.0],
      ['State', 'StateMachine', 0.05],
      ['State', 'IntegerLit', 0.0],
      ['State', 'Literal', 0.125],
      ['State', 'Node', 0.5],
      ['State', 'Expression', 0.0],
      ['State', 'AbstractState', 0.25],
      ['Primitive', 'Instruction', 0.24],
      ['Primitive', 'RelationalConstraint', 0.0],
      ['Primitive', 'Trigger', 0.08],
      ['Primitive', 'Flowchart', 0.0],
      ['Primitive', 'ArithmeticExpression', 0.0],
      ['Primitive', 'LogoProgram', 0.0],
      ['Primitive', 'ProcCall', 0.1],
      ['Primitive', 'Constraint', 0.0],
      ['Primitive', 'Decision', 0.0],
      ['Primitive', 'State', 0.0],
      ['Primitive', 'Primitive', 0.0],
      ['Primitive', 'VarReference', 0.0],
      ['Primitive', 'Subflow', 0.0],
      ['Primitive', 'StateMachine', 0.04],
      ['Primitive', 'IntegerLit', 0.0],
      ['Primitive', 'Literal', 0.1],
      ['Primitive', 'Node', 0.4],
      ['Primitive', 'Expression', 0.0],
      ['Primitive', 'AbstractState', 0.2],
      ['VarReference', 'Instruction', 1.2],
      ['VarReference', 'RelationalConstraint', 0.0],
      ['VarReference', 'Trigger', 0.4],
      ['VarReference', 'Flowchart', 0.0],
      ['VarReference', 'ArithmeticExpression', 0.0],
      ['VarReference', 'LogoProgram', 0.0],
      ['VarReference', 'ProcCall', 0.5],
      ['VarReference', 'Constraint', 0.0],
      ['VarReference', 'Decision', 0.0],
      ['VarReference', 'State', 0.0],
      ['VarReference', 'Primitive', 0.6],
      ['VarReference', 'VarReference', 0.0],
      ['VarReference', 'Subflow', 0.0],
      ['VarReference', 'StateMachine', 0.2],
      ['VarReference', 'IntegerLit', 0.0],
      ['VarReference', 'Literal', 0.5],
      ['VarReference', 'Node', 2.0],
      ['VarReference', 'Expression', 0.0],
      ['VarReference', 'AbstractState', 1.0],
      ['Subflow', 'Instruction', 1.2],
      ['Subflow', 'RelationalConstraint', 0.0],
      ['Subflow', 'Trigger', 0.4],
      ['Subflow', 'Flowchart', 0.0],
      ['Subflow', 'ArithmeticExpression', 0.0],
      ['Subflow', 'LogoProgram', 0.0],
      ['Subflow', 'ProcCall', 0.5],
      ['Subflow', 'Constraint', 0.0],
      ['Subflow', 'Decision', 0.0],
      ['Subflow', 'State', 0.0],
      ['Subflow', 'Primitive', 0.6],
      ['Subflow', 'VarReference', 0.0],
      ['Subflow', 'Subflow', 0.0],
      ['Subflow', 'StateMachine', 0.2],
      ['Subflow', 'IntegerLit', 0.0],
      ['Subflow', 'Literal', 0.5],
      ['Subflow', 'Node', 2.0],
      ['Subflow', 'Expression', 0.0],
      ['Subflow', 'AbstractState', 1.0],
      ['StateMachine', 'Instruction', 0.24],
      ['StateMachine', 'RelationalConstraint', 0.0],
      ['StateMachine', 'Trigger', 0.08],
      ['StateMachine', 'Flowchart', 0.0],
      ['StateMachine', 'ArithmeticExpression', 0.0],
      ['StateMachine', 'LogoProgram', 0.0],
      ['StateMachine', 'ProcCall', 0.1],
      ['StateMachine', 'Constraint', 0.0],
      ['StateMachine', 'Decision', 0.0],
      ['StateMachine', 'State', 0.0],
      ['StateMachine', 'Primitive', 0.12],
      ['StateMachine', 'VarReference', 0.0],
      ['StateMachine', 'Subflow', 0.0],
      ['StateMachine', 'StateMachine', 0.0],
      ['StateMachine', 'IntegerLit', 0.0],
      ['StateMachine', 'Literal', 0.1],
      ['StateMachine', 'Node', 0.4],
      ['StateMachine', 'Expression', 0.0],
      ['StateMachine', 'AbstractState', 0.2],
      ['IntegerLit', 'Instruction', 0.6],
      ['IntegerLit', 'RelationalConstraint', 0.0],
      ['IntegerLit', 'Trigger', 0.2],
      ['IntegerLit', 'Flowchart', 0.0],
      ['IntegerLit', 'ArithmeticExpression', 0.0],
      ['IntegerLit', 'LogoProgram', 0.0],
      ['IntegerLit', 'ProcCall', 0.25],
      ['IntegerLit', 'Constraint', 0.0],
      ['IntegerLit', 'Decision', 0.0],
      ['IntegerLit', 'State', 0.0],
      ['IntegerLit', 'Primitive', 0.3],
      ['IntegerLit', 'VarReference', 0.0],
      ['IntegerLit', 'Subflow', 0.0],
      ['IntegerLit', 'StateMachine', 0.1],
      ['IntegerLit', 'IntegerLit', 0.0],
      ['IntegerLit', 'Literal', 0.25],
      ['IntegerLit', 'Node', 1.0],
      ['IntegerLit', 'Expression', 0.0],
      ['IntegerLit', 'AbstractState', 0.5],
      ['Literal', 'Instruction', 0.6],
      ['Literal', 'RelationalConstraint', 0.0],
      ['Literal', 'Trigger', 0.2],
      ['Literal', 'Flowchart', 0.0],
      ['Literal', 'ArithmeticExpression', 0.0],
      ['Literal', 'LogoProgram', 0.0],
      ['Literal', 'ProcCall', 0.25],
      ['Literal', 'Constraint', 0.0],
      ['Literal', 'Decision', 0.0],
      ['Literal', 'State', 0.0],
      ['Literal', 'Primitive', 0.3],
      ['Literal', 'VarReference', 0.0],
      ['Literal', 'Subflow', 0.0],
      ['Literal', 'StateMachine', 0.1],
      ['Literal', 'IntegerLit', 0.0],
      ['Literal', 'Literal', 0.0],
      ['Literal', 'Node', 1.0],
      ['Literal', 'Expression', 0.0],
      ['Literal', 'AbstractState', 0.5],
      ['Node', 'Instruction', 0.6],
      ['Node', 'RelationalConstraint', 0.0],
      ['Node', 'Trigger', 0.2],
      ['Node', 'Flowchart', 0.0],
      ['Node', 'ArithmeticExpression', 0.0],
      ['Node', 'LogoProgram', 0.0],
      ['Node', 'ProcCall', 0.25],
      ['Node', 'Constraint', 0.0],
      ['Node', 'Decision', 0.0],
      ['Node', 'State', 0.0],
      ['Node', 'Primitive', 0.3],
      ['Node', 'VarReference', 0.0],
      ['Node', 'Subflow', 0.0],
      ['Node', 'StateMachine', 0.1],
      ['Node', 'IntegerLit', 0.0],
      ['Node', 'Literal', 0.25],
      ['Node', 'Node', 0.0],
      ['Node', 'Expression', 0.0],
      ['Node', 'AbstractState', 0.5],
      ['Expression', 'Instruction', 0.4],
      ['Expression', 'RelationalConstraint', 0.0],
      ['Expression', 'Trigger', 0.13333333333333333],
      ['Expression', 'Flowchart', 0.0],
      ['Expression', 'ArithmeticExpression', 0.0],
      ['Expression', 'LogoProgram', 0.0],
      ['Expression', 'ProcCall', 0.16666666666666666],
      ['Expression', 'Constraint', 0.0],
      ['Expression', 'Decision', 0.0],
      ['Expression', 'State', 0.0],
      ['Expression', 'Primitive', 0.2],
      ['Expression', 'VarReference', 0.0],
      ['Expression', 'Subflow', 0.0],
      ['Expression', 'StateMachine', 0.06666666666666667],
      ['Expression', 'IntegerLit', 0.0],
      ['Expression', 'Literal', 0.16666666666666666],
      ['Expression', 'Node', 0.6666666666666666],
      ['Expression', 'Expression', 0.0],
      ['Expression', 'AbstractState', 0.3333333333333333],
      ['AbstractState', 'Instruction', 0.24],
      ['AbstractState', 'RelationalConstraint', 0.0],
      ['AbstractState', 'Trigger', 0.08],
      ['AbstractState', 'Flowchart', 0.0],
      ['AbstractState', 'ArithmeticExpression', 0.0],
      ['AbstractState', 'LogoProgram', 0.0],
      ['AbstractState', 'ProcCall', 0.1],
      ['AbstractState', 'Constraint', 0.0],
      ['AbstractState', 'Decision', 0.0],
      ['AbstractState', 'State', 0.0],
      ['AbstractState', 'Primitive', 0.12],
      ['AbstractState', 'VarReference', 0.0],
      ['AbstractState', 'Subflow', 0.0],
      ['AbstractState', 'StateMachine', 0.04],
      ['AbstractState', 'IntegerLit', 0.0],
      ['AbstractState', 'Literal', 0.1],
      ['AbstractState', 'Node', 0.4],
      ['AbstractState', 'Expression', 0.0],
      ['AbstractState', 'AbstractState', 0.0],
  ]);

  var table = new google.visualization.Table(document.getElementById('table_div'));  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});
}
