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
              image: "libs/flags/ecore-icon.png",
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
                 image: "libs/flags/ecore-icon.png",
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
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "IntegerLit",
                      desc: ""
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
                   name: "VarDecl",
                   desc: ""
                 },
                 image: "libs/flags/ecore-icon.png",
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
                      name: "LogoProgram",
                      desc: ""
                    },
                    image: "libs/flags/ecore-icon.png",
                    HTMLclass: "first-draw"
                   },
                   {
                    text: {
                      name: "Instruction",
                      desc: ""
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
                desc: ""
              },
              children: [
                {
                 text: {
                   name: "VarReference",
                   desc: ""
                 },
                 image: "libs/flags/ecore-icon.png",
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
                      name: "Clear",
                      desc: ""
                    },
                    image: "libs/flags/ecore-icon.png",
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
                         name: "PenUp",
                         desc: ""
                       },
                       image: "libs/flags/ecore-icon.png",
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
                            name: "PenDown",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
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
                                  name: "Left",
                                  desc: ""
                                },
                                image: "libs/flags/ecore-icon.png",
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
                                   image: "libs/flags/ecore-icon.png",
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
                                      image: "libs/flags/ecore-icon.png",
                                      HTMLclass: "first-draw"
                                     },
                                     {
                                      text: {
                                        name: "ArithmeticExpression",
                                        desc: ""
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
                               desc: ""
                             },
                             children: [
                               {
                                text: {
                                  name: "Right",
                                  desc: ""
                                },
                                image: "libs/flags/ecore-icon.png",
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
                                     name: "Forward",
                                     desc: ""
                                   },
                                   image: "libs/flags/ecore-icon.png",
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
                                        name: "Primitive",
                                        desc: ""
                                      },
                                      image: "libs/flags/ecore-icon.png",
                                      HTMLclass: "first-draw"
                                     },
                                     {
                                      text: {
                                        name: "Back",
                                        desc: ""
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
           ]
          }
        ]
    }



};
