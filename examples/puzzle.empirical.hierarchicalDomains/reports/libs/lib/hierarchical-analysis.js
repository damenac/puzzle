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
                name: "",
                desc: ""
              },
              children: [
                {
                 text: {
                   name: "Division",
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
                      name: "Multiplication",
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
                         name: "Subtraction",
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
                            name: "ArithmeticExpression",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "Addition",
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
                      name: "GreaterOrEqual",
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
                         name: "LessOrEqual",
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
                            name: "Greater",
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
                               name: "Less",
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
                         name: "Different",
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
                            name: "EqualityExpression",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "Equal",
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
                         name: "",
                         desc: ""
                       },
                       children: [
                         {
                          text: {
                            name: "BinaryExpression",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "CoalescingExpression",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
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
                            name: "And",
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
                               name: "LogicalExpression",
                               desc: ""
                             },
                             image: "libs/flags/ecore-icon.png",
                             HTMLclass: "first-draw"
                            },
                            {
                             text: {
                               name: "Or",
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
                         name: "TargetMetamodel",
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
                            name: "ExplicitMetamodel",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "SourceMetamodel",
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
                         name: "ExtentMetamodel",
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
                            name: "Transformation",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "MetamodelDeclaration",
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
                         name: "OtherwiseClause",
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
                            name: "ConditionalMapping",
                            desc: ""
                          },
                          image: "libs/flags/ecore-icon.png",
                          HTMLclass: "first-draw"
                         },
                         {
                          text: {
                            name: "WhenClause",
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
                         name: "FeatureMapping",
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
                            name: "ResultMapping",
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
                                  name: "AbstractMapping",
                                  desc: ""
                                },
                                image: "libs/flags/ecore-icon.png",
                                HTMLclass: "first-draw"
                               },
                               {
                                text: {
                                  name: "DataTypeMapping",
                                  desc: ""
                                },
                                image: "libs/flags/ecore-icon.png",
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
                                  name: "ClassMapping",
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
                                     name: "ContentMapping",
                                     desc: ""
                                   },
                                   image: "libs/flags/ecore-icon.png",
                                   HTMLclass: "first-draw"
                                  },
                                  {
                                   text: {
                                     name: "CompositeMapping",
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
                      name: "Minus",
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
                         name: "UnaryExpression",
                         desc: ""
                       },
                       image: "libs/flags/ecore-icon.png",
                       HTMLclass: "first-draw"
                      },
                      {
                       text: {
                         name: "Negation",
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
                      name: "StringLiteral",
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
                         name: "RealLiteral",
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
                            name: "IntegerLiteral",
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
                               name: "BooleanLiteral",
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
                                  name: "EnumLiteral",
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
                                     name: "ClassLiteral",
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
                                        name: "Source",
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
                                              name: "VariableUse",
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
                                                 name: "Lambda",
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
                                                    name: "Let",
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
                                                       name: "VariableDefinition",
                                                       desc: ""
                                                     },
                                                     image: "libs/flags/ecore-icon.png",
                                                     HTMLclass: "first-draw"
                                                    },
                                                    {
                                                     text: {
                                                       name: "VariableInitialization",
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
                                        },
                                        {
                                         text: {
                                           name: "",
                                           desc: ""
                                         },
                                         children: [
                                           {
                                            text: {
                                              name: "Map",
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
                                                 name: "TypeOfExpression",
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
                                                    name: "ExtentExpression",
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
                                                       name: "FeatureAccess",
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
                                                          name: "Invocation",
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
                                                             name: "ConditionalExpression",
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
                                                                name: "If",
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
