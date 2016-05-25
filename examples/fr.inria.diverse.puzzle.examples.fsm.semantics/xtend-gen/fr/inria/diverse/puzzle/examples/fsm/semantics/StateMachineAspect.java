package fr.inria.diverse.puzzle.examples.fsm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.puzzle.examples.fsm.semantics.RegionAspect;
import fr.inria.diverse.puzzle.examples.fsm.semantics.StateMachineAspectStateMachineAspectProperties;
import fsm.AbstractState;
import fsm.Region;
import fsm.StateMachine;
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
  @Main
  public static void eval(final StateMachine _self) {
    fr.inria.diverse.puzzle.examples.fsm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = fr.inria.diverse.puzzle.examples.fsm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    InputOutput.<String>println("\nExecuting the state machine. Please enter the events to process...\n");
    final Hashtable<String, Object> context = new Hashtable<String, Object>();
    EList<Region> _regions = _self.getRegions();
    final Consumer<Region> _function = (Region _region) -> {
      RegionAspect.initRegion(_region, context);
    };
    _regions.forEach(_function);
    InputOutput.<String>println("");
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
        InputOutput.<String>print(" \n\n INPUT ---> Next event: ");
        String _nextLine = in.nextLine();
        String[] eventsChain = _nextLine.split(",");
        final EList<String> events = new BasicEList<String>();
        for (final String _event : eventsChain) {
          events.add(_event);
        }
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
