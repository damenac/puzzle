package statemachine;

import StateMachineModule.AbstractState;
import StateMachineModule.Pseudostate;
import StateMachineModule.PseudostateKind;
import StateMachineModule.State;
import StateMachineModule.StateMachine;
import StateMachineModule.Transition;
import StateMachineModule.Trigger;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import statemachine.StateAspect;
import statemachine.StateMachineAspectStateMachineAspectProperties;
import statemachine.TransitionAspect;
import statemachine.TriggerAspect;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  /**
   * Reads the input events from the console and performs the corresponding steps in the state machine.
   */
  public static void evalStateMachine(final StateMachine _self) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_evalStateMachine(_self_, _self);
  }
  
  /**
   * Finds the initial pseudo-state and starts the execution of the state machine.
   */
  public static void initStateMachine(final StateMachine _self, final Hashtable<String, Object> context) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_initStateMachine(_self_, _self,context);
  }
  
  /**
   * Performs a step in the state machine i.e., reads an entry of the input stack and executes it.
   * If there are several events in the same step they are executed sequentially.
   */
  public static void step(final StateMachine _self, final Hashtable<String, Object> context, final EList<String> events) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_step(_self_, _self,context,events);
  }
  
  /**
   * Returns the current state of the machine. It corresponds to the current set of active states.
   */
  public static ArrayList<AbstractState> getCurrentState(final StateMachine _self, final Hashtable<String, Object> context, final EList<String> events) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getCurrentState(_self_, _self,context,events);
    return (java.util.ArrayList<StateMachineModule.AbstractState>)result;
  }
  
  /**
   * Returns the active transitions of a vertex
   */
  public static EList<Transition> getActiveTransitions(final StateMachine _self, final AbstractState vertex, final EList<String> events) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getActiveTransitions(_self_, _self,vertex,events);
    return (org.eclipse.emf.common.util.EList<StateMachineModule.Transition>)result;
  }
  
  /**
   * Finds the set of states that are active before the step and that will be left after the step.
   */
  public static void findOldActiveStates(final StateMachine _self, final ArrayList<AbstractState> oldActiveStates, final Transition selectedTransition, final Hashtable<String, Object> context) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_findOldActiveStates(_self_, _self,oldActiveStates,selectedTransition,context);
  }
  
  /**
   * Finds the set of states that will be active after the step.
   */
  public static void findNewActiveStates(final StateMachine _self, final ArrayList<AbstractState> newActiveStates, final Transition selectedTransition, final ArrayList<Transition> currentActiveTransitions, final Hashtable<String, Object> context) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_findNewActiveStates(_self_, _self,newActiveStates,selectedTransition,currentActiveTransitions,context);
  }
  
  /**
   * Finds the transitions that will be fired during the step.
   */
  public static void findNewActiveTransitions(final StateMachine _self, final ArrayList<Transition> newActiveTransitions, final Transition selectedTransition, final Hashtable<String, Object> context) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_findNewActiveTransitions(_self_, _self,newActiveTransitions,selectedTransition,context);
  }
  
  public static ArrayList<ArrayList<String>> events(final StateMachine _self) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_events(_self_, _self);
    return (java.util.ArrayList<java.util.ArrayList<java.lang.String>>)result;
  }
  
  public static void events(final StateMachine _self, final ArrayList<ArrayList<String>> events) {
    statemachine.StateMachineAspectStateMachineAspectProperties _self_ = statemachine.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_events(_self_, _self,events);
  }
  
  protected static void _privk3_evalStateMachine(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    final Hashtable<String, Object> context = new Hashtable<String, Object>();
    InputOutput.<String>println("Executing the state machine. Please enter the input events:\n");
    StateMachineAspect.initStateMachine(_self, context);
    InputOutput.<String>print("    step: ---> current active state (s): ");
    Set<String> _keySet = context.keySet();
    Iterator<String> _it = _keySet.iterator();
    while (_it.hasNext()) {
      {
        String _key = _it.next();
        Object _value = context.get(_key);
        boolean _startsWith = _key.startsWith("currentState");
        if (_startsWith) {
          final Consumer<AbstractState> _function = (AbstractState _vertex) -> {
            String _name = _vertex.getName();
            String _plus = (_name + " ");
            InputOutput.<String>print(_plus);
          };
          ((ArrayList<AbstractState>) _value).forEach(_function);
        }
      }
    }
    Set<String> _keySet_1 = context.keySet();
    Iterator<String> _iterator = _keySet_1.iterator();
    _it = _iterator;
    String variablesString = "";
    while (_it.hasNext()) {
      {
        String _key = _it.next();
        Object _value = context.get(_key);
        boolean _startsWith = _key.startsWith("currentState");
        boolean _not = (!_startsWith);
        if (_not) {
          String _variablesString = variablesString;
          variablesString = (_variablesString + ((((" - " + _key) + ": ") + _value) + "\n"));
        }
      }
    }
    boolean _equals = variablesString.equals("");
    boolean _not = (!_equals);
    if (_not) {
      InputOutput.<String>println("\n ---> current variables\' values: ");
      InputOutput.<String>println(variablesString);
    }
    while (true) {
      {
        Scanner in = new Scanner(System.in);
        InputOutput.<String>print(" \n\n *INPUT ---> Next event: ");
        String _nextLine = in.nextLine();
        String[] eventsChain = _nextLine.split(",");
        for (final String _event : eventsChain) {
          {
            final EList<String> events = new BasicEList<String>();
            events.add(_event);
            StateMachineAspect.step(_self, context, events);
          }
        }
      }
    }
  }
  
  protected static void _privk3_initStateMachine(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Hashtable<String, Object> context) {
    ArrayList<AbstractState> initialState = new ArrayList<AbstractState>();
    context.put("currentState", initialState);
    EList<AbstractState> _subvertex = _self.getSubvertex();
    final Function1<AbstractState, Boolean> _function = (AbstractState _vertex) -> {
      boolean _and = false;
      if (!(_vertex instanceof Pseudostate)) {
        _and = false;
      } else {
        PseudostateKind _kind = ((Pseudostate) _vertex).getKind();
        boolean _equals = Objects.equal(_kind, PseudostateKind.INITIAL);
        _and = _equals;
      }
      return Boolean.valueOf(_and);
    };
    AbstractState _findFirst = IterableExtensions.<AbstractState>findFirst(_subvertex, _function);
    Pseudostate initialPseudostate = ((Pseudostate) _findFirst);
    ArrayList<AbstractState> initialCurrentState = new ArrayList<AbstractState>();
    ArrayList<Transition> initialCurrentTransitions = new ArrayList<Transition>();
    EList<Transition> _outgoing = initialPseudostate.getOutgoing();
    for (final Transition _transition : _outgoing) {
      {
        initialCurrentTransitions.add(_transition);
        AbstractState _target = _transition.getTarget();
        initialCurrentState.add(_target);
      }
    }
    ((ArrayList<AbstractState>) initialState).addAll(initialCurrentState);
    final Consumer<Transition> _function_1 = (Transition transition) -> {
      TransitionAspect.evalTransition(transition, context);
    };
    initialCurrentTransitions.forEach(_function_1);
  }
  
  protected static void _privk3_step(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Hashtable<String, Object> context, final EList<String> events) {
    ArrayList<AbstractState> currentState = StateMachineAspect.getCurrentState(_self, context, events);
    ArrayList<Transition> currentTransitions = new ArrayList<Transition>();
    ArrayList<AbstractState> attendedStates = new ArrayList<AbstractState>();
    ArrayList<AbstractState> newStates = new ArrayList<AbstractState>();
    EList<Transition> activeTransitions = new BasicEList<Transition>();
    for (final AbstractState _state : currentState) {
      EList<Transition> _activeTransitions = StateMachineAspect.getActiveTransitions(_self, _state, events);
      activeTransitions.addAll(_activeTransitions);
    }
    for (final Transition transition : activeTransitions) {
      {
        StateMachineAspect.findOldActiveStates(_self, attendedStates, transition, context);
        StateMachineAspect.findNewActiveTransitions(_self, currentTransitions, transition, context);
        StateMachineAspect.findNewActiveStates(_self, newStates, transition, currentTransitions, context);
      }
    }
    for (final AbstractState _attendedState : attendedStates) {
      if ((_attendedState instanceof State)) {
        StateAspect.exitState(((State) _attendedState), context);
      }
    }
    Object _get = context.get("currentState");
    ((ArrayList<AbstractState>) _get).removeAll(attendedStates);
    for (final AbstractState _newState : newStates) {
      Object _get_1 = context.get("currentState");
      boolean _contains = ((ArrayList<AbstractState>) _get_1).contains(_newState);
      boolean _not = (!_contains);
      if (_not) {
        Object _get_2 = context.get("currentState");
        ((ArrayList<AbstractState>) _get_2).add(_newState);
      }
    }
    final Consumer<Transition> _function = (Transition transition_1) -> {
      TransitionAspect.evalTransition(transition_1, context);
    };
    activeTransitions.forEach(_function);
    final Consumer<Transition> _function_1 = (Transition transition_1) -> {
      boolean _alreadyFired = TransitionAspect.alreadyFired(transition_1, context);
      boolean _not_1 = (!_alreadyFired);
      if (_not_1) {
        TransitionAspect.evalTransition(transition_1, context);
      }
    };
    currentTransitions.forEach(_function_1);
    final Consumer<AbstractState> _function_2 = (AbstractState state) -> {
      EList<Transition> _outgoing = state.getOutgoing();
      final Consumer<Transition> _function_3 = (Transition transition_1) -> {
        TransitionAspect.resetFired(transition_1);
      };
      _outgoing.forEach(_function_3);
    };
    newStates.forEach(_function_2);
  }
  
  protected static ArrayList<AbstractState> _privk3_getCurrentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Hashtable<String, Object> context, final EList<String> events) {
    final ArrayList<AbstractState> currentState = new ArrayList<AbstractState>();
    Set<String> _keySet = context.keySet();
    Iterator<String> _it = _keySet.iterator();
    while (_it.hasNext()) {
      {
        String _key = _it.next();
        Object _value = context.get(_key);
        String _name = _self.getName();
        String _plus = ("currentState-" + _name);
        boolean _startsWith = _key.startsWith(_plus);
        if (_startsWith) {
          final Consumer<AbstractState> _function = (AbstractState _vertex) -> {
            currentState.add(_vertex);
          };
          ((ArrayList<AbstractState>) _value).forEach(_function);
        }
      }
    }
    return currentState;
  }
  
  protected static EList<Transition> _privk3_getActiveTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final AbstractState vertex, final EList<String> events) {
    final BasicEList<Transition> res = new BasicEList<Transition>();
    EList<Transition> _outgoing = vertex.getOutgoing();
    for (final Transition transition : _outgoing) {
      boolean _or = false;
      Trigger _trigger = transition.getTrigger();
      boolean _equals = Objects.equal(_trigger, null);
      if (_equals) {
        _or = true;
      } else {
        boolean _and = false;
        Trigger _trigger_1 = transition.getTrigger();
        boolean _notEquals = (!Objects.equal(_trigger_1, null));
        if (!_notEquals) {
          _and = false;
        } else {
          Trigger _trigger_2 = transition.getTrigger();
          boolean _evalTrigger = TriggerAspect.evalTrigger(_trigger_2, events);
          _and = _evalTrigger;
        }
        _or = _and;
      }
      if (_or) {
        res.add(transition);
      }
    }
    return res;
  }
  
  protected static void _privk3_findOldActiveStates(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final ArrayList<AbstractState> oldActiveStates, final Transition selectedTransition, final Hashtable<String, Object> context) {
    AbstractState _source = selectedTransition.getSource();
    boolean _contains = oldActiveStates.contains(_source);
    boolean _not = (!_contains);
    if (_not) {
      AbstractState _source_1 = selectedTransition.getSource();
      oldActiveStates.add(_source_1);
    }
  }
  
  protected static void _privk3_findNewActiveStates(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final ArrayList<AbstractState> newActiveStates, final Transition selectedTransition, final ArrayList<Transition> currentActiveTransitions, final Hashtable<String, Object> context) {
    boolean _and = false;
    AbstractState _target = selectedTransition.getTarget();
    boolean _contains = newActiveStates.contains(_target);
    boolean _not = (!_contains);
    if (!_not) {
      _and = false;
    } else {
      boolean _alreadyFired = TransitionAspect.alreadyFired(selectedTransition, context);
      boolean _not_1 = (!_alreadyFired);
      _and = _not_1;
    }
    if (_and) {
      AbstractState _target_1 = selectedTransition.getTarget();
      newActiveStates.add(_target_1);
    }
  }
  
  protected static void _privk3_findNewActiveTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final ArrayList<Transition> newActiveTransitions, final Transition selectedTransition, final Hashtable<String, Object> context) {
    newActiveTransitions.add(selectedTransition);
  }
  
  protected static ArrayList<ArrayList<String>> _privk3_events(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
     return _self_.events; 
  }
  
  protected static void _privk3_events(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final ArrayList<ArrayList<String>> events) {
    _self_.events = events; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Events")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, events);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
