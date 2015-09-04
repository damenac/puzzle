google.load('visualization', '1.1', {packages:['table']});
google.setOnLoadCallback(drawTable);

function drawTable() {
  var data = new google.visualization.DataTable();
    data.addColumn('string', 'Group Name');
    data.addColumn('string', 'Group Name');
    data.addColumn('number', 'Coupling');
    data.addRows([      ['Group 0', 'Group 1', 1],
      ['Group 0', 'Group 2', 4],
      ['Group 0', 'Group 3', 0],
      ['Group 0', 'Group 4', 0],
      ['Group 1', 'Group 2', 2],
      ['Group 1', 'Group 3', 0],
      ['Group 1', 'Group 4', 1],
      ['Group 2', 'Group 3', 9],
      ['Group 2', 'Group 4', 0],
      ['Group 3', 'Group 4', 0],
      [' ', 'Coupling Sum', 17],
      [' ', 'Coupling Avg', 3.0]
  ]);

  var table = new google.visualization.Table(document.getElementById('table_div'));  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});
}
