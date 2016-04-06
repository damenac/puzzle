package fsmumlaspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.AbstractState;
import fsm.Fork;
import fsm.InitialState;
import fsm.Join;
import fsm.Junction;
import fsm.Pseudostate;
import fsm.Region;
import fsm.ShallowHistory;
import fsm.State;
import fsm.Transition;
import fsm.Trigger;
import fsmumlaspects.RegionAspectRegionAspectProperties;
import fsmumlaspects.StateAspect;
import fsmumlaspects.TransitionAspect;
import fsmumlaspects.TriggerAspect;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = Region.class)
@SuppressWarnings("all")
public class RegionAspect {
  public static void initRegion(final Region _self, final Hashtable<String, Object> context) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_initRegion(_self_, _self,context);
  }
  
  public static String getContextPathByRegion(final Region _self) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getContextPathByRegion(_self_, _self);
    return (java.lang.String)result;
  }
  
  /**
   * Performs a step in the state machine i.e., reads an entry of the input stack and executes it.
   * If there are several events in the same step they are executed sequentially.
   */
  public static void step(final Region _self, final Hashtable<String, Object> context, final EList<String> events) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_step(_self_, _self,context,events);
  }
  
  public static void removeStatesFromContext(final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> toRemove) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_removeStatesFromContext(_self_, _self,context,toRemove);
  }
  
  public static void addStatesToContext(final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> newStates) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_addStatesToContext(_self_, _self,context,newStates);
  }
  
  /**
   * Returns the current state of the machine. It corresponds to the current set of active states.
   */
  public static ArrayList<AbstractState> getCurrentState(final Region _self, final Hashtable<String, Object> context, final EList<String> events) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getCurrentState(_self_, _self,context,events);
    return (java.util.ArrayList<fsm.AbstractState>)result;
  }
  
  /**
   * Returns the active transitions of a vertex
   */
  public static EList<Transition> getActiveTransitions(final Region _self, final AbstractState vertex, final EList<String> events) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getActiveTransitions(_self_, _self,vertex,events);
    return (org.eclipse.emf.common.util.EList<fsm.Transition>)result;
  }
  
  /**
   * Finds the set of states that are active before the step and that will be left after the step.
   */
  public static void findOldActiveStates(final Region _self, final ArrayList<AbstractState> oldActiveStates, final Transition selectedTransition, final Hashtable<String, Object> context) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_findOldActiveStates(_self_, _self,oldActiveStates,selectedTransition,context);
  }
  
  /**
   * Finds the set of states that will be active after the step.
   */
  public static void findNewActiveStates(final Region _self, final ArrayList<AbstractState> newActiveStates, final Transition selectedTransition, final ArrayList<Transition> currentActiveTransitions, final Hashtable<String, Object> context) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_findNewActiveStates(_self_, _self,newActiveStates,selectedTransition,currentActiveTransitions,context);
  }
  
  /**
   * Finds the transitions that will be fired during the step.
   */
  public static void findNewActiveTransitions(final Region _self, final ArrayList<Transition> newActiveTransitions, final Transition selectedTransition, final Hashtable<String, Object> context) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_findNewActiveTransitions(_self_, _self,newActiveTransitions,selectedTransition,context);
  }
  
  public static void getAllParents(final Region _self, final AbstractState vertex, final ArrayList<AbstractState> parents) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_getAllParents(_self_, _self,vertex,parents);
  }
  
  public static void getAllChildren(final Region _self, final AbstractState vertex, final ArrayList<AbstractState> children) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_getAllChildren(_self_, _self,vertex,children);
  }
  
  public static boolean deepestConflictingTransition(final Region _self, final ArrayList<Transition> activeTransitions) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_deepestConflictingTransition(_self_, _self,activeTransitions);
    return (boolean)result;
  }
  
  public static String getContextPath(final Region _self, final AbstractState _vertex) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getContextPath(_self_, _self,_vertex);
    return (java.lang.String)result;
  }
  
  public static void getAllSubstates(final Region _self, final AbstractState vertex, final ArrayList<AbstractState> children) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_getAllSubstates(_self_, _self,vertex,children);
  }
  
  public static void saveHistoryState(final Region _self, final Hashtable<String, Object> context) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_saveHistoryState(_self_, _self,context);
  }
  
  private static ArrayList<AbstractState> deepHistory(final Region _self) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_deepHistory(_self_, _self);
    return (java.util.ArrayList<fsm.AbstractState>)result;
  }
  
  private static void deepHistory(final Region _self, final ArrayList<AbstractState> deepHistory) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_deepHistory(_self_, _self,deepHistory);
  }
  
  private static State history(final Region _self) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_history(_self_, _self);
    return (fsm.State)result;
  }
  
  private static void history(final Region _self, final State history) {
    fsmumlaspects.RegionAspectRegionAspectProperties _self_ = fsmumlaspects.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_history(_self_, _self,history);
  }
  
  protected static void _privk3_initRegion(final RegionAspectRegionAspectProperties _self_, final Region _self, final Hashtable<String, Object> context) {
    State _history = RegionAspect.history(_self);
    boolean _equals = Objects.equal(_history, null);
    if (_equals) {
      ArrayList<AbstractState> _deepHistory = RegionAspect.deepHistory(_self);
      boolean _equals_1 = Objects.equal(_deepHistory, null);
      if (_equals_1) {
        ArrayList<AbstractState> regionCurrentState = new ArrayList<AbstractState>();
        String _contextPathByRegion = RegionAspect.getContextPathByRegion(_self);
        context.put(_contextPathByRegion, regionCurrentState);
        EList<AbstractState> _subvertex = _self.getSubvertex();
        final Function1<AbstractState, Boolean> _function = (AbstractState _vertex) -> {
          boolean _and = false;
          if (!(_vertex instanceof Pseudostate)) {
            _and = false;
          } else {
            _and = (_vertex instanceof InitialState);
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
        ((ArrayList<AbstractState>) regionCurrentState).addAll(initialCurrentState);
        final Consumer<Transition> _function_1 = (Transition transition) -> {
          TransitionAspect.evalTransition(transition, context);
        };
        initialCurrentTransitions.forEach(_function_1);
      } else {
        String _name = _self.getName();
        String _plus = ("currentState-" + _name);
        Object _get = context.get(_plus);
        ArrayList<AbstractState> _deepHistory_1 = RegionAspect.deepHistory(_self);
        ((ArrayList<AbstractState>) _get).addAll(_deepHistory_1);
      }
    } else {
      String _name_1 = _self.getName();
      String _plus_1 = ("currentState-" + _name_1);
      Object _get_1 = context.get(_plus_1);
      State _history_1 = RegionAspect.history(_self);
      ((ArrayList<AbstractState>) _get_1).add(_history_1);
    }
  }
  
  protected static String _privk3_getContextPathByRegion(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    String root = "currentState";
    ArrayList<Region> parentRegions = new ArrayList<Region>();
    Region currentRegion = _self;
    while (((!Objects.equal(currentRegion.getOwnerState(), null)) && (!Objects.equal(currentRegion.getOwnerState().getOwnerRegion(), null)))) {
      {
        State _ownerState = _self.getOwnerState();
        Region _ownerRegion = _ownerState.getOwnerRegion();
        parentRegions.add(_ownerRegion);
        State _ownerState_1 = currentRegion.getOwnerState();
        Region _ownerRegion_1 = _ownerState_1.getOwnerRegion();
        currentRegion = _ownerRegion_1;
      }
    }
    for (int i = (parentRegions.size() - 1); (i >= 0); i--) {
      String _root = root;
      Region _get = parentRegions.get(i);
      String _name = _get.getName();
      String _plus = ("-" + _name);
      root = (_root + _plus);
    }
    String _name = _self.getName();
    return ((root + "-") + _name);
  }
  
  protected static void _privk3_step(final RegionAspectRegionAspectProperties _self_, final Region _self, final Hashtable<String, Object> context, final EList<String> events) {
    InputOutput.<String>println("");
    boolean allJunctionsAttended = false;
    while ((!allJunctionsAttended)) {
      {
        ArrayList<AbstractState> currentState = RegionAspect.getCurrentState(_self, context, events);
        ArrayList<Transition> currentTransitions = new ArrayList<Transition>();
        ArrayList<AbstractState> attendedStates = new ArrayList<AbstractState>();
        ArrayList<AbstractState> newStates = new ArrayList<AbstractState>();
        EList<Transition> activeTransitions = new BasicEList<Transition>();
        for (final AbstractState _state : currentState) {
          EList<Transition> _activeTransitions = RegionAspect.getActiveTransitions(_self, _state, events);
          activeTransitions.addAll(_activeTransitions);
        }
        for (final Transition transition : activeTransitions) {
          {
            RegionAspect.findOldActiveStates(_self, attendedStates, transition, context);
            RegionAspect.findNewActiveTransitions(_self, currentTransitions, transition, context);
            RegionAspect.findNewActiveStates(_self, newStates, transition, currentTransitions, context);
          }
        }
        for (final AbstractState _attendedState : attendedStates) {
          if ((_attendedState instanceof State)) {
            StateAspect.exitState(((State) _attendedState), context);
          }
        }
        RegionAspect.removeStatesFromContext(_self, context, attendedStates);
        RegionAspect.addStatesToContext(_self, context, newStates);
        final Consumer<Transition> _function = (Transition transition_1) -> {
          TransitionAspect.evalTransition(transition_1, context);
        };
        activeTransitions.forEach(_function);
        final Consumer<Transition> _function_1 = (Transition transition_1) -> {
          boolean _alreadyFired = TransitionAspect.alreadyFired(transition_1, context);
          boolean _not = (!_alreadyFired);
          if (_not) {
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
        String _name = _self.getName();
        String _plus = ("currentState-" + _name);
        Object _get = context.get(_plus);
        ArrayList<AbstractState> currentJunctionState = ((ArrayList<AbstractState>) _get);
        final Function1<AbstractState, Boolean> _function_3 = (AbstractState _vertex) -> {
          EList<Transition> _outgoing = _vertex.getOutgoing();
          final Function1<Transition, Boolean> _function_4 = (Transition _outgoing_1) -> {
            boolean _and = false;
            AbstractState _target = _outgoing_1.getTarget();
            if (!(_target instanceof Pseudostate)) {
              _and = false;
            } else {
              AbstractState _target_1 = _outgoing_1.getTarget();
              _and = (_target_1 instanceof Junction);
            }
            return Boolean.valueOf(_and);
          };
          return Boolean.valueOf(IterableExtensions.<Transition>exists(_outgoing, _function_4));
        };
        boolean _exists = IterableExtensions.<AbstractState>exists(currentJunctionState, _function_3);
        boolean _not = (!_exists);
        allJunctionsAttended = _not;
      }
    }
  }
  
  protected static void _privk3_removeStatesFromContext(final RegionAspectRegionAspectProperties _self_, final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> toRemove) {
    for (final AbstractState _oldState : toRemove) {
      String _contextPath = RegionAspect.getContextPath(_self, _oldState);
      Object _get = context.get(_contextPath);
      ((ArrayList<AbstractState>) _get).remove(_oldState);
    }
  }
  
  protected static void _privk3_addStatesToContext(final RegionAspectRegionAspectProperties _self_, final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> newStates) {
    for (final AbstractState _newState : newStates) {
      {
        String path = RegionAspect.getContextPath(_self, _newState);
        Object _get = context.get(path);
        boolean _equals = Objects.equal(_get, null);
        if (_equals) {
          ArrayList<AbstractState> _arrayList = new ArrayList<AbstractState>();
          context.put(path, _arrayList);
        }
        Object _get_1 = context.get(path);
        boolean _contains = ((ArrayList<AbstractState>) _get_1).contains(_newState);
        boolean _not = (!_contains);
        if (_not) {
          Object _get_2 = context.get(path);
          ((ArrayList<AbstractState>) _get_2).add(_newState);
        }
      }
    }
  }
  
  protected static ArrayList<AbstractState> _privk3_getCurrentState(final RegionAspectRegionAspectProperties _self_, final Region _self, final Hashtable<String, Object> context, final EList<String> events) {
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
  
  protected static EList<Transition> _privk3_getActiveTransitions(final RegionAspectRegionAspectProperties _self_, final Region _self, final AbstractState vertex, final EList<String> events) {
    final BasicEList<Transition> res = new BasicEList<Transition>();
    EList<Transition> _outgoing = vertex.getOutgoing();
    for (final Transition transition : _outgoing) {
      boolean _or = false;
      Trigger _trigger = transition.getTrigger();
      boolean _equals = Objects.equal(_trigger, null);
      if (_equals) {
        _or = true;
      } else {
        boolean _or_1 = false;
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
        if (_and) {
          _or_1 = true;
        } else {
          boolean _and_1 = false;
          AbstractState _target = transition.getTarget();
          if (!(_target instanceof Pseudostate)) {
            _and_1 = false;
          } else {
            AbstractState _target_1 = transition.getTarget();
            _and_1 = (_target_1 instanceof Junction);
          }
          _or_1 = _and_1;
        }
        _or = _or_1;
      }
      if (_or) {
        res.add(transition);
      }
    }
    return res;
  }
  
  protected static void _privk3_findOldActiveStates(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<AbstractState> oldActiveStates, final Transition selectedTransition, final Hashtable<String, Object> context) {
    boolean _and = false;
    AbstractState _source = selectedTransition.getSource();
    if (!(_source instanceof Pseudostate)) {
      _and = false;
    } else {
      AbstractState _source_1 = selectedTransition.getSource();
      _and = (_source_1 instanceof Junction);
    }
    boolean sourceIsJunction = _and;
    if (sourceIsJunction) {
      AbstractState _source_2 = selectedTransition.getSource();
      EList<Transition> _outgoing = _source_2.getOutgoing();
      final Function1<Transition, Boolean> _function = (Transition _transition) -> {
        boolean _alreadyFired = TransitionAspect.alreadyFired(_transition, context);
        return Boolean.valueOf((!_alreadyFired));
      };
      boolean _exists = IterableExtensions.<Transition>exists(_outgoing, _function);
      boolean allOutputFired = (!_exists);
      boolean junctionComplete = (sourceIsJunction && allOutputFired);
      boolean _and_1 = false;
      AbstractState _source_3 = selectedTransition.getSource();
      boolean _contains = oldActiveStates.contains(_source_3);
      boolean _not = (!_contains);
      if (!_not) {
        _and_1 = false;
      } else {
        _and_1 = junctionComplete;
      }
      if (_and_1) {
        AbstractState _source_4 = selectedTransition.getSource();
        oldActiveStates.add(_source_4);
      }
    } else {
      AbstractState _source_5 = selectedTransition.getSource();
      boolean _contains_1 = oldActiveStates.contains(_source_5);
      boolean _not_1 = (!_contains_1);
      if (_not_1) {
        AbstractState _source_6 = selectedTransition.getSource();
        oldActiveStates.add(_source_6);
      }
      final ArrayList<AbstractState> sourceChildren = new ArrayList<AbstractState>();
      AbstractState _source_7 = selectedTransition.getSource();
      RegionAspect.getAllChildren(_self, _source_7, sourceChildren);
      final Consumer<AbstractState> _function_1 = (AbstractState _children) -> {
        boolean _contains_2 = oldActiveStates.contains(_children);
        boolean _not_2 = (!_contains_2);
        if (_not_2) {
          oldActiveStates.add(_children);
        }
      };
      sourceChildren.forEach(_function_1);
      final ArrayList<AbstractState> sourceParents = new ArrayList<AbstractState>();
      AbstractState _source_8 = selectedTransition.getSource();
      RegionAspect.getAllParents(_self, _source_8, sourceParents);
      final ArrayList<AbstractState> targetParents = new ArrayList<AbstractState>();
      AbstractState _target = selectedTransition.getTarget();
      RegionAspect.getAllParents(_self, _target, targetParents);
      final Function1<AbstractState, Boolean> _function_2 = (AbstractState _parent) -> {
        boolean _contains_2 = targetParents.contains(_parent);
        return Boolean.valueOf((!_contains_2));
      };
      Iterable<AbstractState> leavingParents = IterableExtensions.<AbstractState>filter(sourceParents, _function_2);
      Iterables.<AbstractState>addAll(oldActiveStates, leavingParents);
      AbstractState _target_1 = selectedTransition.getTarget();
      EList<Transition> _outgoing_1 = _target_1.getOutgoing();
      for (final Transition _candidate : _outgoing_1) {
        boolean _and_2 = false;
        AbstractState _target_2 = _candidate.getTarget();
        if (!(_target_2 instanceof Pseudostate)) {
          _and_2 = false;
        } else {
          AbstractState _target_3 = _candidate.getTarget();
          _and_2 = (_target_3 instanceof Join);
        }
        if (_and_2) {
          AbstractState _source_9 = _candidate.getSource();
          boolean _contains_2 = oldActiveStates.contains(_source_9);
          boolean _not_2 = (!_contains_2);
          if (_not_2) {
            AbstractState _source_10 = _candidate.getSource();
            oldActiveStates.add(_source_10);
          }
        }
      }
    }
  }
  
  protected static void _privk3_findNewActiveStates(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<AbstractState> newActiveStates, final Transition selectedTransition, final ArrayList<Transition> currentActiveTransitions, final Hashtable<String, Object> context) {
    boolean _and = false;
    AbstractState _target = selectedTransition.getTarget();
    if (!(_target instanceof Pseudostate)) {
      _and = false;
    } else {
      AbstractState _target_1 = selectedTransition.getTarget();
      _and = (_target_1 instanceof Fork);
    }
    if (_and) {
      AbstractState _target_2 = selectedTransition.getTarget();
      EList<Transition> _outgoing = ((Pseudostate) _target_2).getOutgoing();
      for (final Transition _transition : _outgoing) {
        AbstractState _target_3 = _transition.getTarget();
        newActiveStates.add(_target_3);
      }
    } else {
      final ArrayList<AbstractState> targetParents = new ArrayList<AbstractState>();
      AbstractState _target_4 = selectedTransition.getTarget();
      RegionAspect.getAllParents(_self, _target_4, targetParents);
      final Consumer<AbstractState> _function = (AbstractState _parent) -> {
        boolean _contains = newActiveStates.contains(_parent);
        boolean _not = (!_contains);
        if (_not) {
          newActiveStates.add(_parent);
        }
      };
      targetParents.forEach(_function);
      for (final Transition _currentTransition : currentActiveTransitions) {
        boolean _and_1 = false;
        AbstractState _target_5 = selectedTransition.getTarget();
        boolean _contains = newActiveStates.contains(_target_5);
        boolean _not = (!_contains);
        if (!_not) {
          _and_1 = false;
        } else {
          boolean _alreadyFired = TransitionAspect.alreadyFired(selectedTransition, context);
          boolean _not_1 = (!_alreadyFired);
          _and_1 = _not_1;
        }
        if (_and_1) {
          AbstractState _target_6 = selectedTransition.getTarget();
          newActiveStates.add(_target_6);
        }
      }
      ArrayList<AbstractState> toDelete = new ArrayList<AbstractState>();
      final ArrayList<AbstractState> targetChildren = new ArrayList<AbstractState>();
      AbstractState _source = selectedTransition.getSource();
      RegionAspect.getAllChildren(_self, _source, targetChildren);
      for (final AbstractState _newState : newActiveStates) {
        {
          boolean delete = true;
          List<Transition> transitions = new ArrayList<Transition>();
          EList<Transition> _incoming = _newState.getIncoming();
          transitions.addAll(_incoming);
          for (final AbstractState _children : targetChildren) {
            EList<Transition> _incoming_1 = _children.getIncoming();
            transitions.addAll(_incoming_1);
          }
          for (final Transition _incoming_2 : transitions) {
            {
              if ((_newState instanceof State)) {
                ArrayList<AbstractState> children = CollectionLiterals.<AbstractState>newArrayList();
                RegionAspect.getAllChildren(_self, _newState, children);
                final Function1<AbstractState, Boolean> _function_1 = (AbstractState child) -> {
                  return Boolean.valueOf(newActiveStates.contains(child));
                };
                AbstractState _findFirst = IterableExtensions.<AbstractState>findFirst(children, _function_1);
                boolean _notEquals = (!Objects.equal(_findFirst, null));
                if (_notEquals) {
                  delete = false;
                }
              }
              boolean _contains_1 = currentActiveTransitions.contains(_incoming_2);
              if (_contains_1) {
                delete = false;
              }
            }
          }
          if (delete) {
            toDelete.add(_newState);
          }
        }
      }
      final ArrayList<AbstractState> moreToDelete = new ArrayList<AbstractState>();
      final Consumer<AbstractState> _function_1 = (AbstractState _state) -> {
        final ArrayList<AbstractState> child = new ArrayList<AbstractState>();
        RegionAspect.getAllChildren(_self, _state, child);
        boolean _and_2 = false;
        EList<Transition> _incoming = _state.getIncoming();
        final Function1<Transition, Boolean> _function_2 = (Transition t) -> {
          return Boolean.valueOf(currentActiveTransitions.contains(t));
        };
        boolean _exists = IterableExtensions.<Transition>exists(_incoming, _function_2);
        boolean _not_2 = (!_exists);
        if (!_not_2) {
          _and_2 = false;
        } else {
          final Function1<AbstractState, Boolean> _function_3 = (AbstractState s) -> {
            EList<Transition> _incoming_1 = s.getIncoming();
            final Function1<Transition, Boolean> _function_4 = (Transition t) -> {
              return Boolean.valueOf(currentActiveTransitions.contains(t));
            };
            return Boolean.valueOf(IterableExtensions.<Transition>exists(_incoming_1, _function_4));
          };
          boolean _exists_1 = IterableExtensions.<AbstractState>exists(child, _function_3);
          boolean _not_3 = (!_exists_1);
          _and_2 = _not_3;
        }
        if (_and_2) {
          moreToDelete.add(_state);
        }
      };
      newActiveStates.forEach(_function_1);
      toDelete.addAll(moreToDelete);
      newActiveStates.removeAll(toDelete);
    }
    AbstractState _target_7 = selectedTransition.getTarget();
    EList<Transition> _outgoing_1 = _target_7.getOutgoing();
    for (final Transition _candidate : _outgoing_1) {
      boolean _and_2 = false;
      AbstractState _target_8 = _candidate.getTarget();
      if (!(_target_8 instanceof Pseudostate)) {
        _and_2 = false;
      } else {
        AbstractState _target_9 = _candidate.getTarget();
        _and_2 = (_target_9 instanceof Join);
      }
      if (_and_2) {
        AbstractState _target_10 = _candidate.getTarget();
        boolean _contains_1 = newActiveStates.contains(_target_10);
        boolean _not_2 = (!_contains_1);
        if (_not_2) {
          AbstractState _target_11 = _candidate.getTarget();
          newActiveStates.add(_target_11);
        }
      }
    }
  }
  
  protected static void _privk3_findNewActiveTransitions(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<Transition> newActiveTransitions, final Transition selectedTransition, final Hashtable<String, Object> context) {
    boolean _and = false;
    AbstractState _target = selectedTransition.getTarget();
    if (!(_target instanceof Pseudostate)) {
      _and = false;
    } else {
      AbstractState _target_1 = selectedTransition.getTarget();
      _and = (_target_1 instanceof Fork);
    }
    if (_and) {
      AbstractState _target_2 = selectedTransition.getTarget();
      EList<Transition> _outgoing = ((Pseudostate) _target_2).getOutgoing();
      newActiveTransitions.addAll(_outgoing);
    } else {
      newActiveTransitions.add(selectedTransition);
      ArrayList<Transition> activeTransitions = new ArrayList<Transition>();
      activeTransitions.addAll(newActiveTransitions);
      activeTransitions.add(selectedTransition);
      boolean conflictingTransition = RegionAspect.deepestConflictingTransition(_self, activeTransitions);
      if ((!conflictingTransition)) {
        newActiveTransitions.add(selectedTransition);
      } else {
        newActiveTransitions.clear();
        newActiveTransitions.addAll(activeTransitions);
      }
    }
    AbstractState _target_3 = selectedTransition.getTarget();
    EList<Transition> _outgoing_1 = _target_3.getOutgoing();
    for (final Transition _candidate : _outgoing_1) {
      boolean _and_1 = false;
      AbstractState _target_4 = _candidate.getTarget();
      if (!(_target_4 instanceof Pseudostate)) {
        _and_1 = false;
      } else {
        AbstractState _target_5 = _candidate.getTarget();
        _and_1 = (_target_5 instanceof Join);
      }
      if (_and_1) {
        newActiveTransitions.add(_candidate);
      }
    }
  }
  
  protected static void _privk3_getAllParents(final RegionAspectRegionAspectProperties _self_, final Region _self, final AbstractState vertex, final ArrayList<AbstractState> parents) {
    if ((vertex instanceof State)) {
      Region _ownerRegion = ((State) vertex).getOwnerRegion();
      State superState = _ownerRegion.getOwnerState();
      while ((!Objects.equal(superState, null))) {
        {
          boolean _contains = parents.contains(superState);
          boolean _not = (!_contains);
          if (_not) {
            parents.add(superState);
          }
          Region _ownerRegion_1 = superState.getOwnerRegion();
          State _ownerState = _ownerRegion_1.getOwnerState();
          superState = _ownerState;
        }
      }
    }
  }
  
  protected static void _privk3_getAllChildren(final RegionAspectRegionAspectProperties _self_, final Region _self, final AbstractState vertex, final ArrayList<AbstractState> children) {
    if ((vertex instanceof State)) {
      EList<Region> _ownedRegions = ((State) vertex).getOwnedRegions();
      boolean _notEquals = (!Objects.equal(_ownedRegions, null));
      if (_notEquals) {
        EList<Region> _ownedRegions_1 = ((State) vertex).getOwnedRegions();
        final Consumer<Region> _function = (Region _region) -> {
          EList<AbstractState> _subvertex = _region.getSubvertex();
          children.addAll(_subvertex);
          EList<AbstractState> _subvertex_1 = _region.getSubvertex();
          final Consumer<AbstractState> _function_1 = (AbstractState _vertex) -> {
            RegionAspect.getAllChildren(_self, _vertex, children);
          };
          _subvertex_1.forEach(_function_1);
        };
        _ownedRegions_1.forEach(_function);
      }
    }
  }
  
  protected static boolean _privk3_deepestConflictingTransition(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<Transition> activeTransitions) {
    final int res = activeTransitions.size();
    final ArrayList<Transition> toDelete = new ArrayList<Transition>();
    final Consumer<Transition> _function = (Transition x) -> {
      final Consumer<Transition> _function_1 = (Transition y) -> {
        AbstractState _source = x.getSource();
        if ((_source instanceof State)) {
          ArrayList<AbstractState> children = new ArrayList<AbstractState>();
          AbstractState _source_1 = x.getSource();
          RegionAspect.getAllChildren(_self, ((State) _source_1), children);
          AbstractState _source_2 = y.getSource();
          boolean _contains = children.contains(_source_2);
          if (_contains) {
            toDelete.add(x);
          }
        }
      };
      activeTransitions.forEach(_function_1);
    };
    activeTransitions.forEach(_function);
    activeTransitions.removeAll(toDelete);
    int _size = activeTransitions.size();
    return (res != _size);
  }
  
  protected static String _privk3_getContextPath(final RegionAspectRegionAspectProperties _self_, final Region _self, final AbstractState _vertex) {
    String root = "currentState";
    ArrayList<Region> parentRegions = new ArrayList<Region>();
    Region currentRegion = _vertex.getOwnerRegion();
    while ((!Objects.equal(currentRegion, null))) {
      {
        parentRegions.add(currentRegion);
        State _ownerState = currentRegion.getOwnerState();
        boolean _notEquals = (!Objects.equal(_ownerState, null));
        if (_notEquals) {
          State _ownerState_1 = currentRegion.getOwnerState();
          Region _ownerRegion = _ownerState_1.getOwnerRegion();
          currentRegion = _ownerRegion;
        } else {
          currentRegion = null;
        }
      }
    }
    for (int i = (parentRegions.size() - 1); (i >= 0); i--) {
      String _root = root;
      Region _get = parentRegions.get(i);
      String _name = _get.getName();
      String _plus = ("-" + _name);
      root = (_root + _plus);
    }
    return root;
  }
  
  protected static void _privk3_getAllSubstates(final RegionAspectRegionAspectProperties _self_, final Region _self, final AbstractState vertex, final ArrayList<AbstractState> children) {
    if ((vertex instanceof State)) {
      EList<Region> _ownedRegions = ((State) vertex).getOwnedRegions();
      boolean _notEquals = (!Objects.equal(_ownedRegions, null));
      if (_notEquals) {
        EList<Region> _ownedRegions_1 = ((State) vertex).getOwnedRegions();
        final Consumer<Region> _function = (Region _region) -> {
          EList<AbstractState> _subvertex = _region.getSubvertex();
          children.addAll(_subvertex);
          EList<AbstractState> _subvertex_1 = _region.getSubvertex();
          final Consumer<AbstractState> _function_1 = (AbstractState _vertex) -> {
            RegionAspect.getAllSubstates(_self, _vertex, children);
          };
          _subvertex_1.forEach(_function_1);
        };
        _ownedRegions_1.forEach(_function);
      }
    }
  }
  
  protected static void _privk3_saveHistoryState(final RegionAspectRegionAspectProperties _self_, final Region _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("saving the history state");
    EList<AbstractState> _subvertex = _self.getSubvertex();
    final Function1<AbstractState, Boolean> _function = (AbstractState _vertex) -> {
      boolean _and = false;
      if (!(_vertex instanceof Pseudostate)) {
        _and = false;
      } else {
        _and = (_vertex instanceof ShallowHistory);
      }
      return Boolean.valueOf(_and);
    };
    boolean _exists = IterableExtensions.<AbstractState>exists(_subvertex, _function);
    if (_exists) {
      String _name = _self.getName();
      String _plus = ("currentState-" + _name);
      Object _get = context.get(_plus);
      final Function1<AbstractState, Boolean> _function_1 = (AbstractState _state) -> {
        boolean _and = false;
        if (!(_state instanceof State)) {
          _and = false;
        } else {
          Region _ownerRegion = ((State) _state).getOwnerRegion();
          boolean _equals = Objects.equal(_ownerRegion, _self);
          _and = _equals;
        }
        return Boolean.valueOf(_and);
      };
      AbstractState _findFirst = IterableExtensions.<AbstractState>findFirst(((ArrayList<AbstractState>) _get), _function_1);
      RegionAspect.history(_self, ((State) _findFirst));
    }
  }
  
  protected static ArrayList<AbstractState> _privk3_deepHistory(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDeepHistory") &&
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
    return _self_.deepHistory;
  }
  
  protected static void _privk3_deepHistory(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<AbstractState> deepHistory) {
    _self_.deepHistory = deepHistory; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDeepHistory")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, deepHistory);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static State _privk3_history(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHistory") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fsm.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.history;
  }
  
  protected static void _privk3_history(final RegionAspectRegionAspectProperties _self_, final Region _self, final State history) {
    _self_.history = history; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHistory")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, history);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
