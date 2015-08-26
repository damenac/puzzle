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
        [4,  21.11111111111111,  8], 
        [8,  42.22222222222222,  16], 
        [12,  63.33333333333333,  24], 
        [16,  84.44444444444444,  32], 
        [20,  105.55555555555556,  40], 
        [24,  126.66666666666666,  48], 
        [28,  147.77777777777777,  56], 
        [32,  168.88888888888889,  64], 
        [36,  190.0,  72]      ]);

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
          ticks: [0, 4, 8, 12, 16, 20, 24, 28, 32, 36]
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
        [5,  24.901960784313726,  10],
        [10,  49.80392156862745,  20],
        [15,  74.70588235294117,  30],
        [20,  99.6078431372549,  40],
        [25,  124.50980392156863,  50],
        [30,  149.41176470588235,  60],
        [35,  174.31372549019608,  70],
        [40,  199.2156862745098,  80],
        [45,  224.11764705882354,  90],
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
          title: 'Amount of Involved Methods',
          titleTextStyle: {fontSize: 10, fontName: "lucida sans unicode" },
          textStyle: {fontSize: 10, fontName: "lucida sans unicode", bold: true },
          ticks: [0, 5, 10, 15, 20, 25, 30, 35, 40, 45]
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
