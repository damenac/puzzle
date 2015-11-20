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
        [2,  10.434782608695652,  4], 
        [4,  20.869565217391305,  8], 
        [6,  31.304347826086957,  12], 
        [8,  41.73913043478261,  16], 
        [10,  52.173913043478265,  20], 
        [12,  62.608695652173914,  24], 
        [14,  73.04347826086956,  28], 
        [16,  83.47826086956522,  32], 
        [18,  93.91304347826087,  36]      ]);

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
          ticks: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
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
        [6,  13.714285714285714,  12],
        [12,  27.428571428571427,  24],
        [18,  41.14285714285714,  36],
        [24,  54.857142857142854,  48],
        [30,  68.57142857142857,  60],
        [36,  82.28571428571428,  72],
        [42,  96.0,  84],
        [48,  109.71428571428571,  96],
        [54,  123.42857142857142,  108],
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
          ticks: [0, 6, 12, 18, 24, 30, 36, 42, 48, 54]
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
