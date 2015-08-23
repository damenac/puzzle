var color = d3.scale.category20();

jsnx.draw(G, {
          element: '#div-graph',
          withLabels: true,
          layoutAttr: {
          charge: -900,
          linkDistance: 120
          },
          nodeAttr: {
          r: 10,
          title: function(d) { return d.label;}
          },
          nodeStyle: {
          fill: function(d) {
          return color(d.data.group);
          },
          stroke: 'none'
          },
          edgeStyle: {
          fill: '#999'
          }
          });