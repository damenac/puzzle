var G = new jsnx.DiGraph();
G.addNodesFrom(["StateMachine"], {group: 0 });
G.addNodesFrom(["Constraint"], {group: 1 });
G.addNodesFrom(["Expression"], {group: 2 });
G.addNodesFrom(["LogoProgram"], {group: 3 });
G.addNodesFrom(["Flowchart"], {group: 4 });

G.addEdgesFrom([["StateMachine","Constraint"],["StateMachine","Expression"],["Constraint","Expression"],["LogoProgram","Expression"],["Flowchart","Constraint"]]);
