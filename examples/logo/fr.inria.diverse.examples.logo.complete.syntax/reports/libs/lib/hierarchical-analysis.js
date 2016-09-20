var tree_structure = {
    chart: {
        container: "#OrganiseChart6",
        levelSeparation:    5,
        siblingSeparation:  20,
        subTeeSeparation:   30,
        rootOrientation: "EAST",

        node: {
            HTMLclass: "tennis-draw",
            drawLineThrough: true
        },
        connectors: {
            type: "straight",
            style: {
                "stroke-width": 2,
                "stroke": "#ccc"
            }
        }
    },
    nodeStructure: {
        text: {
          name: "",
          name: "Root",
          desc: "0.0"
        },
        children: [
          {
           text: {
             name: "",
             desc: "0.001524390243902439"
           },
           children: [
             {
              text: {
                name: "Boolean",
                desc: "-1.0"
              },
              image: "libs/flags/ecore-icon.png",
              HTMLclass: "first-draw"
             },
             {
              text: {
                name: "",
                desc: "0.003048780487804878"
              },
              children: [
                {
                 text: {
                   name: "String",
                   desc: "-1.0"
                 },
                 image: "libs/flags/ecore-icon.png",
                 HTMLclass: "first-draw"
                },
                {
                 text: {
                   name: "",
                   desc: "0.006097560975609756"
                 },
                 children: [
                   {
                    text: {
                      name: "Double",
                      desc: "-1.0"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.012195121951219513"
                    },
                    children: [
                      {
                       text: {
                         name: "Void",
                         desc: "-1.0"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "",
                         desc: "0.024390243902439025"
                       },
                       children: [
                         {
                          text: {
                            name: "Literal",
                            desc: "0.024390243902439025"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "Integer",
                            desc: "0.024390243902439025"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         }
                       ]
                      }
                    ]
                   }
                 ]
                }
              ]
             }
           ]
          },
          {
           text: {
             name: "",
             desc: "0.0011432926829268294"
           },
           children: [
             {
              text: {
                name: "",
                desc: "0.003048780487804878"
              },
              children: [
                {
                 text: {
                   name: "",
                   desc: "0.024390243902439025"
                 },
                 children: [
                   {
                    text: {
                      name: "Procedure",
                      desc: "0.024390243902439025"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "ProcedureCall",
                      desc: "0.024390243902439025"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   }
                 ]
                },
                {
                 text: {
                   name: "",
                   desc: "0.01829268292682927"
                 },
                 children: [
                   {
                    text: {
                      name: "",
                      desc: "0.024390243902439025"
                    },
                    children: [
                      {
                       text: {
                         name: "ControlStructure",
                         desc: "0.024390243902439025"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "If",
                         desc: "0.024390243902439025"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      }
                    ]
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.024390243902439025"
                    },
                    children: [
                      {
                       text: {
                         name: "Block",
                         desc: "0.024390243902439025"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "While",
                         desc: "0.024390243902439025"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      }
                    ]
                   }
                 ]
                }
              ]
             },
             {
              text: {
                name: "",
                desc: "0.001524390243902439"
              },
              children: [
                {
                 text: {
                   name: "",
                   desc: "0.009146341463414635"
                 },
                 children: [
                   {
                    text: {
                      name: "",
                      desc: "0.024390243902439025"
                    },
                    children: [
                      {
                       text: {
                         name: "VarDecl",
                         desc: "0.024390243902439025"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "VarReference",
                         desc: "0.024390243902439025"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      }
                    ]
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.012195121951219513"
                    },
                    children: [
                      {
                       text: {
                         name: "Assignation",
                         desc: "-1.0"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "",
                         desc: "0.024390243902439025"
                       },
                       children: [
                         {
                          text: {
                            name: "LogoProgram",
                            desc: "0.024390243902439025"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "Instruction",
                            desc: "0.024390243902439025"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         }
                       ]
                      }
                    ]
                   }
                 ]
                },
                {
                 text: {
                   name: "",
                   desc: "0.006097560975609756"
                 },
                 children: [
                   {
                    text: {
                      name: "Right",
                      desc: "-1.0"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.007621951219512196"
                    },
                    children: [
                      {
                       text: {
                         name: "",
                         desc: "0.012195121951219513"
                       },
                       children: [
                         {
                          text: {
                            name: "Back",
                            desc: "-1.0"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: "0.07317073170731707"
                          },
                          children: [
                            {
                             text: {
                               name: "Expression",
                               desc: "0.07317073170731707"
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "BinaryExpr",
                               desc: "0.07317073170731707"
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            }
                          ]
                         }
                       ]
                      },
                      {
                       text: {
                         name: "",
                         desc: "0.012195121951219513"
                       },
                       children: [
                         {
                          text: {
                            name: "Left",
                            desc: "-1.0"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: "0.024390243902439025"
                          },
                          children: [
                            {
                             text: {
                               name: "Primitive",
                               desc: "0.024390243902439025"
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "Forward",
                               desc: "0.024390243902439025"
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            }
                          ]
                         }
                       ]
                      }
                    ]
                   }
                 ]
                }
              ]
             }
           ]
          }
        ]
    }



};
