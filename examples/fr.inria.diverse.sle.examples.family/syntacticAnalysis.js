var treeData = [
    {
    "name": "Family",
    "parent": "null",
    "children": [
          {
          "name": "StateMachine",
          "parent": "Family",
          "children": [
                {
                "name": "void eval(int, int, String) [from Rhapsody]",
                "parent": "StateMachine"
                },
                {
                "name": "void eval(int, int, String) [from UML]",
                "parent": "StateMachine"
                },
                {
                "name": "void eval(int, int, String) [from Stateflow]",
                "parent": "StateMachine"
                }
            ]
          },
          {
          "name": "State",
          "parent": "Family",
           "children": [
                {
                "name": "void eval(int, int, String) [from Rhapsody]",
                "parent": "State"
                },
                {
                "name": "void eval(int, int, String) [from UML, Stateflow]",
                "parent": "State"
                }
                ]
          },
          {
          "name": "Transition",
          "parent": "Family",
          "children": [
                {
                "name": "void eval(int, int, String) [from Rhapsody]",
                "parent": "Transition"
                },
                {
                "name": "void eval(int, int, String) [from UML, Stateflow]",
                "parent": "Transition"
                }
                ]
           }
        ]
    }
    ];