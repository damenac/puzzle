google.load('visualization', '1.1', {packages: ['line', 'corechart']});
google.setOnLoadCallback(drawChart);

    function drawChart() {
      var classicChart;
      var classicDiv = document.getElementById('chart-maitenance-costs-syntax');

      var data = new google.visualization.DataTable();
      data.addColumn('number', "Month");
      data.addColumn('number', "Family approach");
      data.addColumn('number', "Product line approach");

      data.addRows([
        [10,  -.5,  5.7],
        [20,   .4,  8.7],
        [30,   .5,   12],
        [40,  2.9, 15.3],
        [50,  6.3, 18.6],
        [60,    9, 20.9],
        [70, 10.6, 19.8],
        [80, 10.3, 16.6]
      ]);

      var classicOptions = {
        title: 'Maintenance costs of the family of DSLs vs. maintenance costs of its corresponding language product line (abstract syntax)',
        titleTextStyle: {fontSize: 10, fontName: "lucida sans unicode" },
        width: 650,
        height: 300,
        series: {
          0: {targetAxisIndex: 0}
        },
        vAxes: {
          0: {title: 'Maintenance Costs (Man-Hour)',
              titleTextStyle: {fontSize: 10, fontName: "lucida sans unicode" },
              textStyle: {fontSize: 10, fontName: "lucida sans unicode", bold: true }
             }
        },
        hAxis: {
          title: 'Amount of Involved Constructs',
          titleTextStyle: {fontSize: 10, fontName: "lucida sans unicode" },
          textStyle: {fontSize: 10, fontName: "lucida sans unicode", bold: true },
          ticks: [10, 20, 30, 40, 50, 60, 70, 80]
        },
        
        legend: { position: 'top',
      			  textStyle: {fontSize: 10, fontName: "lucida sans unicode" }
    			}
      	};

      classicChart = new google.visualization.LineChart(classicDiv);
      classicChart.draw(data, classicOptions);

    }
