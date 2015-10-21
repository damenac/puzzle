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
        [7,  5.352941176470588,  14], 
        [14,  10.705882352941176,  28], 
        [21,  16.058823529411764,  42], 
        [28,  21.41176470588235,  56], 
        [35,  26.76470588235294,  70], 
        [42,  32.11764705882353,  84], 
        [49,  37.470588235294116,  98], 
        [56,  42.8235294117647,  112], 
        [63,  48.17647058823529,  126]      ]);

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
          ticks: [0, 7, 14, 21, 28, 35, 42, 49, 56, 63]
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
