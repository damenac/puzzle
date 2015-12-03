var treeData = [
          {
          "name": "Family",
          "parent": "null",
          "children": [
          {
          "name": "StateMachineAspect",
          "parent": "Family",
          "children": [
          {
          "name": "evalStateMachine [from: UML, Rhapsody, Harel]",
          "parent": "StateMachineAspect"    }
,
          {
          "name": "chain [from: UML, Rhapsody, Harel]",
          "parent": "StateMachineAspect"    }
,
          {
          "name": "events [from: UML, Rhapsody, Harel]",
          "parent": "StateMachineAspect"    }
              ]
    }
,
          {
          "name": "RegionAspect",
          "parent": "Family",
          "children": [
          {
          "name": "initRegion [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "getContextPathByRegion [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "step [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "removeStatesFromContext [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "addStatesToContext [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "getCurrentState [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "getActiveTransitions [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "findOldActiveStates [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "findNewActiveStates [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "findNewActiveTransitions [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "getAllParents [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "getAllChildren [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "deepestConflictingTransition [from: UML, Rhapsody]",
          "parent": "RegionAspect"    }
,
          {
          "name": "getContextPath [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "saveDeepHistoryState [from: UML, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "getAllSubstates [from: UML, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "saveHistoryState [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "deepHistory [from: UML, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "history [from: UML, Rhapsody, Harel]",
          "parent": "RegionAspect"    }
,
          {
          "name": "highestConflictingTransition [from: Harel]",
          "parent": "RegionAspect"    }
              ]
    }
,
          {
          "name": "StateAspect",
          "parent": "Family",
          "children": [
          {
          "name": "+entryState",
          "parent": "StateAspect",
          "children": [
          {
          "name": "entryState [from: UML]",
          "parent": "+entryState"    }
,
          {
          "name": "entryState [from: Rhapsody]",
          "parent": "+entryState"    }
,
          {
          "name": "entryState [from: Harel]",
          "parent": "+entryState"    }
              ]
    }
,
          {
          "name": "+evalState",
          "parent": "StateAspect",
          "children": [
          {
          "name": "evalState [from: UML]",
          "parent": "+evalState"    }
,
          {
          "name": "evalState [from: Rhapsody]",
          "parent": "+evalState"    }
,
          {
          "name": "evalState [from: Harel]",
          "parent": "+evalState"    }
              ]
    }
,
          {
          "name": "+exitState",
          "parent": "StateAspect",
          "children": [
          {
          "name": "exitState [from: UML]",
          "parent": "+exitState"    }
,
          {
          "name": "exitState [from: Rhapsody]",
          "parent": "+exitState"    }
,
          {
          "name": "exitState [from: Harel]",
          "parent": "+exitState"    }
              ]
    }
              ]
    }
,
          {
          "name": "TransitionAspect",
          "parent": "Family",
          "children": [
          {
          "name": "evalTransition [from: UML, Rhapsody, Harel]",
          "parent": "TransitionAspect"    }
,
          {
          "name": "validGuard [from: UML, Rhapsody, Harel]",
          "parent": "TransitionAspect"    }
,
          {
          "name": "alreadyFired [from: UML, Rhapsody, Harel]",
          "parent": "TransitionAspect"    }
,
          {
          "name": "resetFired [from: UML, Rhapsody, Harel]",
          "parent": "TransitionAspect"    }
,
          {
          "name": "fired [from: UML, Rhapsody, Harel]",
          "parent": "TransitionAspect"    }
              ]
    }
,
          {
          "name": "TriggerAspect",
          "parent": "Family",
          "children": [
          {
          "name": "evalTrigger [from: UML, Rhapsody, Harel]",
          "parent": "TriggerAspect"    }
              ]
    }
,
          {
          "name": "AndTriggerAspect",
          "parent": "Family",
          "children": [
          {
          "name": "evalTrigger [from: UML, Harel]",
          "parent": "AndTriggerAspect"    }
              ]
    }
,
          {
          "name": "FinalStateAspect",
          "parent": "Family",
          "children": [
          {
          "name": "+exitState",
          "parent": "FinalStateAspect",
          "children": [
          {
          "name": "exitState [from: UML]",
          "parent": "+exitState"    }
,
          {
          "name": "exitState [from: Rhapsody]",
          "parent": "+exitState"    }
,
          {
          "name": "exitState [from: Harel]",
          "parent": "+exitState"    }
              ]
    }
              ]
    }
,
          {
          "name": "ConstraintAspect",
          "parent": "Family",
          "children": [
          {
          "name": "evalConstraint [from: UML, Rhapsody, Harel]",
          "parent": "ConstraintAspect"    }
              ]
    }
,
          {
          "name": "StatementAspect",
          "parent": "Family",
          "children": [
          {
          "name": "+eval",
          "parent": "StatementAspect",
          "children": [
          {
          "name": "eval [from: UML]",
          "parent": "+eval"    }
,
          {
          "name": "eval [from: Rhapsody]",
          "parent": "+eval"    }
,
          {
          "name": "eval [from: Harel]",
          "parent": "+eval"    }
              ]
    }
              ]
    }
,
          {
          "name": "ProgramAspect",
          "parent": "Family",
          "children": [
          {
          "name": "+eval",
          "parent": "ProgramAspect",
          "children": [
          {
          "name": "eval [from: UML]",
          "parent": "+eval"    }
,
          {
          "name": "eval [from: Rhapsody]",
          "parent": "+eval"    }
,
          {
          "name": "eval [from: Harel]",
          "parent": "+eval"    }
              ]
    }
              ]
    }
,
          {
          "name": "OrTriggerAspect",
          "parent": "Family",
          "children": [
          {
          "name": "evalTrigger [from: Harel]",
          "parent": "OrTriggerAspect"    }
              ]
    }
,
          {
          "name": "NotTriggerAspect",
          "parent": "Family",
          "children": [
          {
          "name": "evalTrigger [from: Harel]",
          "parent": "NotTriggerAspect"    }
              ]
    }
              ]
    }
];
