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
             desc: "2.7412280701754384E-4"
           },
           children: [
             {
              text: {
                name: "Condition",
                desc: "-1.0"
              },
              image: "libs/flags/ecore-icon.png",
              HTMLclass: "first-draw"
             },
             {
              text: {
                name: "",
                desc: "5.482456140350877E-4"
              },
              children: [
                {
                 text: {
                   name: "Junction",
                   desc: "-1.0"
                 },
                 image: "libs/flags/ecore-icon.png",
                 HTMLclass: "first-draw"
                },
                {
                 text: {
                   name: "",
                   desc: "0.0010964912280701754"
                 },
                 children: [
                   {
                    text: {
                      name: "ShallowHistory",
                      desc: "-1.0"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.0021929824561403508"
                    },
                    children: [
                      {
                       text: {
                         name: "DeepHistory",
                         desc: "-1.0"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "",
                         desc: "0.0043859649122807015"
                       },
                       children: [
                         {
                          text: {
                            name: "Join",
                            desc: "-1.0"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: "0.008771929824561403"
                          },
                          children: [
                            {
                             text: {
                               name: "Fork",
                               desc: "-1.0"
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "",
                               desc: "0.017543859649122806"
                             },
                             children: [
                               {
                                text: {
                                  name: "Pseudostate",
                                  desc: "0.017543859649122806"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "InitialState",
                                  desc: "0.017543859649122806"
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
          },
          {
           text: {
             name: "",
             desc: "8.566337719298245E-6"
           },
           children: [
             {
              text: {
                name: "",
                desc: "6.853070175438596E-5"
              },
              children: [
                {
                 text: {
                   name: "",
                   desc: "0.008771929824561403"
                 },
                 children: [
                   {
                    text: {
                      name: "NotTrigger",
                      desc: "-1.0"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.02631578947368421"
                    },
                    children: [
                      {
                       text: {
                         name: "OrTrigger",
                         desc: "-1.0"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "",
                         desc: "0.05263157894736842"
                       },
                       children: [
                         {
                          text: {
                            name: "Trigger",
                            desc: "0.05263157894736842"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "AndTrigger",
                            desc: "0.05263157894736842"
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
                   desc: "5.482456140350877E-4"
                 },
                 children: [
                   {
                    text: {
                      name: "",
                      desc: "0.017543859649122806"
                    },
                    children: [
                      {
                       text: {
                         name: "Constraint",
                         desc: "0.017543859649122806"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "Context",
                         desc: "0.017543859649122806"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      }
                    ]
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.0021929824561403508"
                    },
                    children: [
                      {
                       text: {
                         name: "FinalState",
                         desc: "-1.0"
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "",
                         desc: "0.0043859649122807015"
                       },
                       children: [
                         {
                          text: {
                            name: "StateMachine",
                            desc: "-1.0"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: "0.017543859649122806"
                          },
                          children: [
                            {
                             text: {
                               name: "",
                               desc: "0.07017543859649122"
                             },
                             children: [
                               {
                                text: {
                                  name: "AbstractState",
                                  desc: "0.07017543859649122"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "Transition",
                                  desc: "0.07017543859649122"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               }
                             ]
                            },
                            {
                             text: {
                               name: "",
                               desc: "0.03508771929824561"
                             },
                             children: [
                               {
                                text: {
                                  name: "Region",
                                  desc: "0.03508771929824561"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "State",
                                  desc: "0.03508771929824561"
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
             },
             {
              text: {
                name: "",
                desc: "1.713267543859649E-5"
              },
              children: [
                {
                 text: {
                   name: "",
                   desc: "0.0021929824561403508"
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
                      desc: "0.0027412280701754384"
                    },
                    children: [
                      {
                       text: {
                         name: "",
                         desc: "0.008771929824561403"
                       },
                       children: [
                         {
                          text: {
                            name: "Conditional",
                            desc: "-1.0"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: "0.017543859649122806"
                          },
                          children: [
                            {
                             text: {
                               name: "Loop",
                               desc: "-1.0"
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "",
                               desc: "0.03508771929824561"
                             },
                             children: [
                               {
                                text: {
                                  name: "Statement",
                                  desc: "0.03508771929824561"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "Block",
                                  desc: "0.03508771929824561"
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
                         desc: "0.0043859649122807015"
                       },
                       children: [
                         {
                          text: {
                            name: "VarDecl",
                            desc: "-1.0"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: "0.02631578947368421"
                          },
                          children: [
                            {
                             text: {
                               name: "ArithmeticExpression",
                               desc: "-1.0"
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "",
                               desc: "0.05263157894736842"
                             },
                             children: [
                               {
                                text: {
                                  name: "Expression",
                                  desc: "0.05263157894736842"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "RelationalExpression",
                                  desc: "0.05263157894736842"
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
                   desc: "0.0010964912280701754"
                 },
                 children: [
                   {
                    text: {
                      name: "VarRef",
                      desc: "-1.0"
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "",
                      desc: "0.0021929824561403508"
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
                         desc: "0.0043859649122807015"
                       },
                       children: [
                         {
                          text: {
                            name: "Real",
                            desc: "-1.0"
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "",
                            desc: "0.008771929824561403"
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
                               desc: "0.017543859649122806"
                             },
                             children: [
                               {
                                text: {
                                  name: "Literal",
                                  desc: "0.017543859649122806"
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "Integer",
                                  desc: "0.017543859649122806"
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
