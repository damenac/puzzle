// source: 
// http://www.atpworldtour.com/Share/Event-Draws.aspx?EventId=410&Year=2013

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
          desc: ""
        },
        children: [
          {
           text: {
             name: "",
             desc: ""
           },
           children: [
             {
              text: {
                name: "BoolLit",
                desc: ""
              },
              image: "flags/ecore-icon.png",
              HTMLclass: "first-draw"
             },
             {
              text: {
                name: "",
                desc: ""
              },
              children: [
                {
                 text: {
                   name: "StringLit",
                   desc: ""
                 },
                 image: "flags/ecore-icon.png",
                 HTMLclass: "first-draw"
                },
                {
                 text: {
                   name: "",
                   desc: ""
                 },
                 children: [
                   {
                    text: {
                      name: "Literal",
                      desc: ""
                    },
                    image: "flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "IntegerLit",
                      desc: ""
                    },
                    image: "flags/ecore-icon.png",
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
             desc: ""
           },
           children: [
             {
              text: {
                name: "",
                desc: ""
              },
              children: [
                {
                 text: {
                   name: "Print",
                   desc: ""
                 },
                 image: "flags/ecore-icon.png",
                 HTMLclass: "first-draw"
                },
                {
                 text: {
                   name: "",
                   desc: ""
                 },
                 children: [
                   {
                    text: {
                      name: "ConsoleOutput",
                      desc: ""
                    },
                    image: "flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "Println",
                      desc: ""
                    },
                    image: "flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   }
                 ]
                }
              ]
             },
             {
              text: {
                name: "",
                desc: ""
              },
              children: [
                {
                 text: {
                   name: "",
                   desc: ""
                 },
                 children: [
                   {
                    text: {
                      name: "End",
                      desc: ""
                    },
                    image: "flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "",
                      desc: ""
                    },
                    children: [
                      {
                       text: {
                         name: "Start",
                         desc: ""
                       },
                       image: "flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "",
                         desc: ""
                       },
                       children: [
                         {
                          text: {
                            name: "Action",
                            desc: ""
                          },
                          image: "flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: ""
                          },
                          children: [
                            {
                             text: {
                               name: "",
                               desc: ""
                             },
                             children: [
                               {
                                text: {
                                  name: "Node",
                                  desc: ""
                                },
                                image: "flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "Arc",
                                  desc: ""
                                },
                                image: "flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               }
                             ]
                            },
                            {
                             text: {
                               name: "",
                               desc: ""
                             },
                             children: [
                               {
                                text: {
                                  name: "NamedElement",
                                  desc: ""
                                },
                                image: "flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "Flowchart",
                                  desc: ""
                                },
                                image: "flags/ecore-icon.png",
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
                   desc: ""
                 },
                 children: [
                   {
                    text: {
                      name: "",
                      desc: ""
                    },
                    children: [
                      {
                       text: {
                         name: "RelationalConstraint",
                         desc: ""
                       },
                       image: "flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "",
                         desc: ""
                       },
                       children: [
                         {
                          text: {
                            name: "Decision",
                            desc: ""
                          },
                          image: "flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "Constraint",
                            desc: ""
                          },
                          image: "flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         }
                       ]
                      }
                    ]
                   },
                   {
                    text: {
                      name: "",
                      desc: ""
                    },
                    children: [
                      {
                       text: {
                         name: "",
                         desc: ""
                       },
                       children: [
                         {
                          text: {
                            name: "Wait",
                            desc: ""
                          },
                          image: "flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: ""
                          },
                          children: [
                            {
                             text: {
                               name: "Loop",
                               desc: ""
                             },
                             image: "flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "",
                               desc: ""
                             },
                             children: [
                               {
                                text: {
                                  name: "Conditional",
                                  desc: ""
                                },
                                image: "flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "",
                                  desc: ""
                                },
                                children: [
                                  {
                                   text: {
                                     name: "Statement",
                                     desc: ""
                                   },
                                   image: "flags/ecore-icon.png",
                                   HTMLclass: "first-draw"
                                  },
                                  {
                                   text: {
                                     name: "Program",
                                     desc: ""
                                   },
                                   image: "flags/ecore-icon.png",
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
                         desc: ""
                       },
                       children: [
                         {
                          text: {
                            name: "",
                            desc: ""
                          },
                          children: [
                            {
                             text: {
                               name: "Assignation",
                               desc: ""
                             },
                             image: "flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "VarDecl",
                               desc: ""
                             },
                             image: "flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            }
                          ]
                         },
                         {
                          text: {
                            name: "",
                            desc: ""
                          },
                          children: [
                            {
                             text: {
                               name: "VarReference",
                               desc: ""
                             },
                             image: "flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "",
                               desc: ""
                             },
                             children: [
                               {
                                text: {
                                  name: "RelationalExpression",
                                  desc: ""
                                },
                                image: "flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "",
                                  desc: ""
                                },
                                children: [
                                  {
                                   text: {
                                     name: "Expression",
                                     desc: ""
                                   },
                                   image: "flags/ecore-icon.png",
                                   HTMLclass: "first-draw"
                                  },
                                  {
                                   text: {
                                     name: "ArithmeticExpression",
                                     desc: ""
                                   },
                                   image: "flags/ecore-icon.png",
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
        ]
    }



};
