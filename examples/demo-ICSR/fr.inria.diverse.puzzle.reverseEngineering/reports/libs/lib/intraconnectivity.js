google.load('visualization', '1.1', {packages:['table']});
google.setOnLoadCallback(drawTable);

function drawTable() {
  var data = new google.visualization.DataTable();
    data.addColumn('string', 'Group Name');
    data.addColumn('number', 'Coupling');
    data.addRows([      ['ChoiceModule', 0.0],
      ['AndTriggerModule', 0.0],
      ['NotTriggerModule', 0.0],
      ['StateMachineModule', 0.08650519031141868],
      ['ConditionalModule', 0.0],
      ['Average', 0.017301038062283735],
  ]);

  var table = new google.visualization.Table(document.getElementById('table_div'));  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});
}
