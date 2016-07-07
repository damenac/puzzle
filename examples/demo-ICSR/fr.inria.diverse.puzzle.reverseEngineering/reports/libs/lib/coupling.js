google.load('visualization', '1.1', {packages:['table']});
google.setOnLoadCallback(drawTable);

function drawTable() {
  var data = new google.visualization.DataTable();
    data.addColumn('string', 'Group Name');
    data.addColumn('string', 'Group Name');
    data.addColumn('number', 'Coupling');
    data.addRows([      ['StateMachineModule', 'AndTriggerModule', 4],
      ['StateMachineModule', 'ChoiceModule', 1],
      ['StateMachineModule', 'ConditionalModule', 1],
      ['StateMachineModule', 'NotTriggerModule', 5],
      ['AndTriggerModule', 'ChoiceModule', 0],
      ['AndTriggerModule', 'ConditionalModule', 0],
      ['AndTriggerModule', 'NotTriggerModule', 0],
      ['ChoiceModule', 'ConditionalModule', 0],
      ['ChoiceModule', 'NotTriggerModule', 0],
      ['ConditionalModule', 'NotTriggerModule', 0],
      [' ', 'Coupling Sum', 11],
      [' ', 'Coupling Avg', 2.0]
  ]);

  var table = new google.visualization.Table(document.getElementById('table_div'));  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});
}
