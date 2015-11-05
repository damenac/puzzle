package statemachine;

import StateMachineModule.AbstractState;
import StateMachineModule.StateMachine;
import StateMachineModule.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import statemachine.StateMachineAspectStateMachineAspectProperties;

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
    throw new Error("Unresolved compilation problems:"
      + "\nPseudostate cannot be resolved to a type."
      + "\nPseudostate cannot be resolved to a type."
      + "\nPseudostate cannot be resolved to a type."
      + "\nPseudostate cannot be resolved to a type."
      + "\nThe method INITIAL is undefined for the type StateMachineAspect"
      + "\nThe method evalTransition is undefined for the type StateMachineAspect"
      + "\nkind cannot be resolved"
      + "\n== cannot be resolved"
      + "\noutgoing cannot be resolved");
  }
  
  protected static void _privk3_step(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Hashtable<String, Object> context, final EList<String> events) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method exitState is undefined for the type StateMachineAspect"
      + "\nThe method evalTransition is undefined for the type StateMachineAspect"
      + "\nThe method alreadyFired is undefined for the type StateMachineAspect"
      + "\nThe method evalTransition is undefined for the type StateMachineAspect"
      + "\nThe method resetFired is undefined for the type StateMachineAspect"
      + "\n! cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method evalTrigger is undefined for the type StateMachineAspect");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method alreadyFired is undefined for the type StateMachineAspect"
      + "\n! cannot be resolved");
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
