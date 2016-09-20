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
             desc: "0.0014534883720930232"
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
                desc: "0.0029069767441860465"
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
                   desc: "0.005813953488372093"
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
                      desc: "0.011627906976744186"
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
                         desc: "0.023255813953488372"
                       },
                       children: [
                         {
                          text: {
                            name: "Literal",
                            desc: "0.023255813953488372"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "Integer",
                            desc: "0.023255813953488372"
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
             desc: "2.7252906976744186E-4"
           },
           children: [
             {
              text: {
                name: "",
                desc: "0.0014534883720930232"
              },
              children: [
                {
                 text: {
                   name: "",
                   desc: "0.00872093023255814"
                 },
                 children: [
                   {
                    text: {
                      name: "",
                      desc: "0.023255813953488372"
                    },
                    children: [
                      {
                       text: {
                         name: "VarDecl",
                         desc: "0.023255813953488372"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "VarReference",
                         desc: "0.023255813953488372"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      }
                    ]
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.011627906976744186"
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
                         desc: "0.023255813953488372"
                       },
                       children: [
                         {
                          text: {
                            name: "LogoProgram",
                            desc: "0.023255813953488372"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "Instruction",
                            desc: "0.023255813953488372"
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
                   desc: "0.0029069767441860465"
                 },
                 children: [
                   {
                    text: {
                      name: "",
                      desc: "0.023255813953488372"
                    },
                    children: [
                      {
                       text: {
                         name: "Procedure",
                         desc: "0.023255813953488372"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "ProcedureCall",
                         desc: "0.023255813953488372"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      }
                    ]
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.01744186046511628"
                    },
                    children: [
                      {
                       text: {
                         name: "",
                         desc: "0.023255813953488372"
                       },
                       children: [
                         {
                          text: {
                            name: "ControlStructure",
                            desc: "0.023255813953488372"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "If",
                            desc: "0.023255813953488372"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         }
                       ]
                      },
                      {
                       text: {
                         name: "",
                         desc: "0.023255813953488372"
                       },
                       children: [
                         {
                          text: {
                            name: "Block",
                            desc: "0.023255813953488372"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "While",
                            desc: "0.023255813953488372"
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
             },
             {
              text: {
                name: "",
                desc: "7.267441860465116E-4"
              },
              children: [
                {
                 text: {
                   name: "BooleanExpr",
                   desc: "-1.0"
                 },
                 image: "libs/flags/ecore-icon.png",
                 HTMLclass: "first-draw"
                },
                {
                 text: {
                   name: "",
                   desc: "0.0014534883720930232"
                 },
                 children: [
                   {
                    text: {
                      name: "ArithmeticExpr",
                      desc: "-1.0"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.005813953488372093"
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
                         desc: "0.007267441860465116"
                       },
                       children: [
                         {
                          text: {
                            name: "",
                            desc: "0.011627906976744186"
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
                               desc: "0.06976744186046512"
                             },
                             children: [
                               {
                                text: {
                                  name: "Expression",
                                  desc: "0.06976744186046512"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "BinaryExpr",
                                  desc: "0.06976744186046512"
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
                            desc: "0.011627906976744186"
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
                               desc: "0.023255813953488372"
                             },
                             children: [
                               {
                                text: {
                                  name: "Primitive",
                                  desc: "0.023255813953488372"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "Forward",
                                  desc: "0.023255813953488372"
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
        ]
    }



};
