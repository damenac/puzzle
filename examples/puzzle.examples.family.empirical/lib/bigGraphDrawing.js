var color = d3.scale.category10();

jsnx.draw(G, {
          element: '#div-graph',
          withLabels: true,
          layoutAttr: {
          charge: -350,
          linkDistance: 140
          },
          nodeAttr: {
          r: 25,
          title: function(d) { return d.label;}
          },
          nodeStyle: {
          fill: function(d) {
          return color(d.data.group);
          },
          stroke: 'none'
          },
          edgeStyle: {
          fill: '#6E6E6E'
          }
          });
