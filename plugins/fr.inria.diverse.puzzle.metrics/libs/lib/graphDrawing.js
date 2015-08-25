var color = d3.scale.category10();

jsnx.draw(G, {
          element: '#div-graph',
          withLabels: true,
          layoutAttr: {
          charge: -1000,
          linkDistance: 70
          },
          nodeAttr: {
          r: 7,
          title: function(d) { return d.label;}
          },
          nodeStyle: {
          fill: function(d) {
          return color(d.data.group);
          },
          stroke: 'none'
          },
          edgeStyle: {
          fill: '#E6E6E6'
          }
          });
