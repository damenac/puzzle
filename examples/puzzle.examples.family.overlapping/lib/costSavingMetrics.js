google.load('visualization', '1.1', {packages: ['line', 'corechart']});
google.setOnLoadCallback(drawChart);

    function drawChart() {
      var syntaxChart;
      var syntaxDiv = document.getElementById('chart-maitenance-costs-syntax');
      var data = new google.visualization.DataTable()
      data.addColumn('number', "Amount of constructs");
      data.addColumn('number', "Family approach");
      data.addColumn('number', "Product line approach");

      data.addRows([
        [0,  0.0,  0], 
        [6,  16.5,  12], 
        [12,  33.0,  24], 
        [18,  49.5,  36], 
        [24,  66.0,  48], 
        [30,  82.5,  60], 
        [36,  99.0,  72], 
        [42,  115.5,  84], 
        [48,  132.0,  96], 
        [54,  148.5,  108]      ]);

      var syntaxOptions = {
        title: 'Maintenance costs of the family of DSLs vs. maintenance costs of its corresponding language product line (abstract syntax)',
        titleTextStyle: {fontSize: 10, fontName: "lucida sans unicode" },
        width: 650,
        height: 280,
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
          ticks: [0, 6, 12, 18, 24, 30, 36, 42, 48, 54]
        },
        legend: { position: 'top',
      			  textStyle: {fontSize: 10, fontName: "lucida sans unicode" }
    			}
      	};
      var semanticsChart;
      var semanticsDiv = document.getElementById('chart-maitenance-costs-semantics');
      var semanticsData = new google.visualization.DataTable()
      semanticsData.addColumn('number', "Amount of methods");
      semanticsData.addColumn('number', "Family approach");
      semanticsData.addColumn('number', "Product line approach");

      semanticsData.addRows([
        [0,  0.0,  0],
        [8,  1.28,  16],
        [16,  2.56,  32],
        [24,  3.84,  48],
        [32,  5.12,  64],
        [40,  6.4,  80],
        [48,  7.68,  96],
        [56,  8.96,  112],
        [64,  10.24,  128],
        [72,  11.52,  144],
      ]);

      var semanticsOptions = {
        title: 'Maintenance costs of the family of DSLs vs. maintenance costs of its corresponding language product line (semantics)',
        titleTextStyle: {fontSize: 10, fontName: "lucida sans unicode" },
        width: 650,
        height: 280,
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
          title: 'Amount of Involved Domain-Specific Actions (DSAs)',
          titleTextStyle: {fontSize: 10, fontName: "lucida sans unicode" },
          textStyle: {fontSize: 10, fontName: "lucida sans unicode", bold: true },
          ticks: [0, 8, 16, 24, 32, 40, 48, 56, 64, 72]
        },
        legend: { position: 'top',
      			  textStyle: {fontSize: 10, fontName: "lucida sans unicode" }
    			}
      	};
      syntaxChart = new google.visualization.LineChart(syntaxDiv);
      syntaxChart.draw(data, syntaxOptions);
      syntaxChart = new google.visualization.LineChart(semanticsDiv);
      syntaxChart.draw(semanticsData, semanticsOptions);
    }
