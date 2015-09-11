google.load('visualization', '1.1', {packages:['table']});
google.setOnLoadCallback(drawTable);

function drawTable() {
  var data = new google.visualization.DataTable();
    data.addColumn('string', 'Group Name');
    data.addColumn('string', 'Group Name');
    data.addColumn('number', 'Coupling');
    data.addRows([      ['StateMachine', 'Constraint', 1],
      ['StateMachine', 'Expression', 4],
      ['StateMachine', 'LogoProgram', 0],
      ['StateMachine', 'Flowchart', 0],
      ['Constraint', 'Expression', 2],
      ['Constraint', 'LogoProgram', 0],
      ['Constraint', 'Flowchart', 1],
      ['Expression', 'LogoProgram', 9],
      ['Expression', 'Flowchart', 0],
      ['LogoProgram', 'Flowchart', 0],
      [' ', 'Coupling Sum', 17],
      [' ', 'Coupling Avg', 3.0]
  ]);

  var table = new google.visualization.Table(document.getElementById('table_div'));  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});
}
