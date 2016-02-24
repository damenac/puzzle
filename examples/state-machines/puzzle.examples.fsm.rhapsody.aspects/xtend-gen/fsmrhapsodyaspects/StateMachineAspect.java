package fsmrhapsodyaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.AbstractState;
import fsm.Region;
import fsm.StateMachine;
import fsmrhapsodyaspects.RegionAspect;
import fsmrhapsodyaspects.StateMachineAspectStateMachineAspectProperties;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  /**
   * Evaluates the input and sequentially executes the steps in the state machine.
   */
  public static void evalStateMachine(final StateMachine _self) {
    fsmrhapsodyaspects.StateMachineAspectStateMachineAspectProperties _self_ = fsmrhapsodyaspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_evalStateMachine(_self_, _self);
  }
  
  public static String chain(final StateMachine _self) {
    fsmrhapsodyaspects.StateMachineAspectStateMachineAspectProperties _self_ = fsmrhapsodyaspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_chain(_self_, _self);
    return (java.lang.String)result;
  }
  
  public static void chain(final StateMachine _self, final String chain) {
    fsmrhapsodyaspects.StateMachineAspectStateMachineAspectProperties _self_ = fsmrhapsodyaspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_chain(_self_, _self,chain);
  }
  
  public static ArrayList<ArrayList<String>> events(final StateMachine _self) {
    fsmrhapsodyaspects.StateMachineAspectStateMachineAspectProperties _self_ = fsmrhapsodyaspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_events(_self_, _self);
    return (java.util.ArrayList<java.util.ArrayList<java.lang.String>>)result;
  }
  
  public static void events(final StateMachine _self, final ArrayList<ArrayList<String>> events) {
    fsmrhapsodyaspects.StateMachineAspectStateMachineAspectProperties _self_ = fsmrhapsodyaspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_events(_self_, _self,events);
  }
  
  protected static void _privk3_evalStateMachine(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    InputOutput.<String>println("\nExecuting the state machine. Please enter the events to process...\n");
    final Hashtable<String, Object> context = new Hashtable<String, Object>();
    EList<Region> _regions = _self.getRegions();
    final Consumer<Region> _function = (Region _region) -> {
      RegionAspect.initRegion(_region, context);
    };
    _regions.forEach(_function);
    InputOutput.<String>print("    step: ---> current active state (s): ");
    Set<String> _keySet = context.keySet();
    Iterator<String> _it = _keySet.iterator();
    while (_it.hasNext()) {
      {
        String _key = _it.next();
        Object _value = context.get(_key);
        boolean _startsWith = _key.startsWith("currentState");
        if (_startsWith) {
          final Consumer<AbstractState> _function_1 = (AbstractState _vertex) -> {
            String _name = _vertex.getName();
            String _plus = (_name + " ");
            InputOutput.<String>print(_plus);
          };
          ((ArrayList<AbstractState>) _value).forEach(_function_1);
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
            EList<Region> _regions_1 = _self.getRegions();
            final Consumer<Region> _function_1 = (Region _region) -> {
              RegionAspect.step(_region, context, events);
            };
            _regions_1.forEach(_function_1);
            InputOutput.<String>print("    step: ---> current active state (s): ");
            Set<String> _keySet_2 = context.keySet();
            Iterator<String> _iterator_1 = _keySet_2.iterator();
            _it = _iterator_1;
            while (_it.hasNext()) {
              {
                String _key = _it.next();
                Object _value = context.get(_key);
                boolean _startsWith = _key.startsWith("currentState");
                if (_startsWith) {
                  final Consumer<AbstractState> _function_2 = (AbstractState _vertex) -> {
                    String _name = _vertex.getName();
                    String _plus = (_name + " ");
                    InputOutput.<String>print(_plus);
                  };
                  ((ArrayList<AbstractState>) _value).forEach(_function_2);
                }
              }
            }
            Set<String> _keySet_3 = context.keySet();
            Iterator<String> _iterator_2 = _keySet_3.iterator();
            _it = _iterator_2;
            variablesString = "";
            while (_it.hasNext()) {
              {
                String _key = _it.next();
                Object _value = context.get(_key);
                boolean _startsWith = _key.startsWith("currentState");
                boolean _not_1 = (!_startsWith);
                if (_not_1) {
                  String _variablesString = variablesString;
                  variablesString = (_variablesString + (((("              - " + _key) + ": ") + _value) + "\n"));
                }
              }
            }
            boolean _equals_1 = variablesString.equals("");
            boolean _not_1 = (!_equals_1);
            if (_not_1) {
              InputOutput.<String>println("\n          ---> current variables\' values: ");
              InputOutput.<String>println(variablesString);
            }
            InputOutput.println();
          }
        }
      }
    }
  }
  
  protected static String _privk3_chain(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getChain") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.chain;
  }
  
  protected static void _privk3_chain(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final String chain) {
    _self_.chain = chain; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setChain")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, chain);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static ArrayList<ArrayList<String>> _privk3_events(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getEvents") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.ArrayList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.events;
  }
  
  protected static void _privk3_events(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final ArrayList<ArrayList<String>> events) {
    _self_.events = events; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setEvents")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, events);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
