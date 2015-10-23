google.load('visualization', '1.1', {packages:['table']});
google.setOnLoadCallback(drawTable);

function drawTable() {
  var data = new google.visualization.DataTable();
    data.addColumn('string', 'Group Name');
    data.addColumn('number', 'Coupling');
    data.addRows([      ['Instruction', 0.16],
      ['RelationalConstraint', 0.0],
      ['Trigger', 0.08],
      ['Flowchart', 0.0],
      ['ArithmeticExpression', 0.0],
      ['LogoProgram', 0.0],
      ['ProcCall', 0.125],
      ['Constraint', 0.0],
      ['Decision', 0.0],
      ['State', 0.0],
      ['Primitive', 0.12],
      ['VarReference', 0.0],
      ['Subflow', 0.0],
      ['StateMachine', 0.04],
      ['IntegerLit', 0.0],
      ['Literal', 0.25],
      ['Node', 0.5],
      ['Expression', 0.0],
      ['AbstractState', 0.12],
      ['Average', 0.07342105263157894],
  ]);

  var table = new google.visualization.Table(document.getElementById('table_div'));  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});
}
