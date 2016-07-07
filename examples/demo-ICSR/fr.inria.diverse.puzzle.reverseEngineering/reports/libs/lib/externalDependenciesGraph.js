var G = new jsnx.DiGraph();
G.addNodesFrom(["StateMachineModule"], {group: 0 });
G.addNodesFrom(["AndTriggerModule"], {group: 1 });
G.addNodesFrom(["ChoiceModule"], {group: 2 });
G.addNodesFrom(["ConditionalModule"], {group: 3 });
G.addNodesFrom(["NotTriggerModule"], {group: 4 });

G.addEdgesFrom([["AndTriggerModule","StateMachineModule"],["ChoiceModule","StateMachineModule"],["ConditionalModule","StateMachineModule"],["NotTriggerModule","StateMachineModule"]]);
