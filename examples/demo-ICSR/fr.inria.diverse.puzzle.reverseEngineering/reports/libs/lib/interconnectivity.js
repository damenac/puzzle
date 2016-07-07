google.load('visualization', '1.1', {packages:['table']});
google.setOnLoadCallback(drawTable);

function drawTable() {
  var data = new google.visualization.DataTable();
    data.addColumn('string', 'Group Name');
    data.addColumn('string', 'Group Name');
    data.addColumn('number', 'Coupling');
    data.addRows([      ['ChoiceModule', 'ChoiceModule', 0.0],
      ['ChoiceModule', 'AndTriggerModule', 0.0],
      ['ChoiceModule', 'NotTriggerModule', 0.0],
      ['ChoiceModule', 'StateMachineModule', 1.7647058823529411],
      ['ChoiceModule', 'ConditionalModule', 0.0],
      ['AndTriggerModule', 'ChoiceModule', 0.0],
      ['AndTriggerModule', 'AndTriggerModule', 0.0],
      ['AndTriggerModule', 'NotTriggerModule', 0.0],
      ['AndTriggerModule', 'StateMachineModule', 0.8823529411764706],
      ['AndTriggerModule', 'ConditionalModule', 0.0],
      ['NotTriggerModule', 'ChoiceModule', 0.0],
      ['NotTriggerModule', 'AndTriggerModule', 0.0],
      ['NotTriggerModule', 'NotTriggerModule', 0.0],
      ['NotTriggerModule', 'StateMachineModule', 0.8823529411764706],
      ['NotTriggerModule', 'ConditionalModule', 0.0],
      ['StateMachineModule', 'ChoiceModule', 0.0],
      ['StateMachineModule', 'AndTriggerModule', 0.0],
      ['StateMachineModule', 'NotTriggerModule', 0.0],
      ['StateMachineModule', 'StateMachineModule', 0.0],
      ['StateMachineModule', 'ConditionalModule', 0.0],
      ['ConditionalModule', 'ChoiceModule', 0.0],
      ['ConditionalModule', 'AndTriggerModule', 0.0],
      ['ConditionalModule', 'NotTriggerModule', 0.0],
      ['ConditionalModule', 'StateMachineModule', 1.7647058823529411],
      ['ConditionalModule', 'ConditionalModule', 0.0],
  ]);

  var table = new google.visualization.Table(document.getElementById('table_div'));  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});
}
