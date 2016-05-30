package fr.inria.diverse.puzzle.examples.compositestates.semantics;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties;
import hfsm.AbstractState;
import hfsm.Region;
import hfsm.State;
import hfsm.Transition;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import puzzle.annotations.processor.AddExtensionMethod;
import puzzle.annotations.processor.OverrideRequiredAspectMethod;

@Aspect(className = Region.class)
@SuppressWarnings("all")
public class RegionAspect {
  @OverrideRequiredAspectMethod
  public static void findNewActiveStates(final Region _self, final ArrayList<AbstractState> newActiveStates, final Transition selectedTransition, final ArrayList<Transition> currentActiveTransitions, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_findNewActiveStates(_self_, _self,newActiveStates,selectedTransition,currentActiveTransitions,context);
  }
  
  @OverrideRequiredAspectMethod
  public static void findOldActiveStates(final Region _self, final ArrayList<AbstractState> oldActiveStates, final Transition selectedTransition, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_findOldActiveStates(_self_, _self,oldActiveStates,selectedTransition,context);
  }
  
  @OverrideRequiredAspectMethod
  public static void findNewActiveTransitions(final Region _self, final ArrayList<Transition> newActiveTransitions, final Transition selectedTransition, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_findNewActiveTransitions(_self_, _self,newActiveTransitions,selectedTransition,context);
  }
  
  @OverrideRequiredAspectMethod
  public static String getContextPathByRegion(final Region _self) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getContextPathByRegion(_self_, _self);
    return (java.lang.String)result;
  }
  
  @OverrideRequiredAspectMethod
  public static void removeStatesFromContext(final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> toRemove) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_removeStatesFromContext(_self_, _self,context,toRemove);
  }
  
  @OverrideRequiredAspectMethod
  public static void addStatesToContext(final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> newStates) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_addStatesToContext(_self_, _self,context,newStates);
  }
  
  @AddExtensionMethod
  public static void getAllParents(final Region _self, final AbstractState vertex, final ArrayList<AbstractState> parents) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_getAllParents(_self_, _self,vertex,parents);
  }
  
  @AddExtensionMethod
  public static void getAllChildren(final Region _self, final AbstractState vertex, final ArrayList<AbstractState> children) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    _privk3_getAllChildren(_self_, _self,vertex,children);
  }
  
  @AddExtensionMethod
  public static boolean highestConflictingTransition(final Region _self, final ArrayList<Transition> activeTransitions) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_highestConflictingTransition(_self_, _self,activeTransitions);
    return (boolean)result;
  }
  
  @AddExtensionMethod
  public static String getContextPath(final Region _self, final AbstractState _vertex) {
    fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.compositestates.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getContextPath(_self_, _self,_vertex);
    return (java.lang.String)result;
  }
  
  protected static void _privk3_findNewActiveStates(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<AbstractState> newActiveStates, final Transition selectedTransition, final ArrayList<Transition> currentActiveTransitions, final Hashtable<String, Object> context) {
    final ArrayList<AbstractState> targetParents = new ArrayList<AbstractState>();
    AbstractState _target = selectedTransition.getTarget();
    RegionAspect.getAllParents(_self, _target, targetParents);
    final Consumer<AbstractState> _function = (AbstractState _parent) -> {
      boolean _contains = newActiveStates.contains(_parent);
      boolean _not = (!_contains);
      if (_not) {
        newActiveStates.add(_parent);
      }
    };
    targetParents.forEach(_function);
    for (final Transition _currentTransition : currentActiveTransitions) {
      RegionAspect._original_findNewActiveStates(_self, newActiveStates, _currentTransition, currentActiveTransitions, context);
    }
  }
  
  protected static void _privk3_findOldActiveStates(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<AbstractState> oldActiveStates, final Transition selectedTransition, final Hashtable<String, Object> context) {
    RegionAspect._original_findOldActiveStates(_self, oldActiveStates, selectedTransition, context);
    final ArrayList<AbstractState> sourceChildren = new ArrayList<AbstractState>();
    AbstractState _source = selectedTransition.getSource();
    RegionAspect.getAllChildren(_self, _source, sourceChildren);
    final Consumer<AbstractState> _function = (AbstractState _children) -> {
      boolean _contains = oldActiveStates.contains(_children);
      boolean _not = (!_contains);
      if (_not) {
        oldActiveStates.add(_children);
      }
    };
    sourceChildren.forEach(_function);
    final ArrayList<AbstractState> sourceParents = new ArrayList<AbstractState>();
    AbstractState _source_1 = selectedTransition.getSource();
    RegionAspect.getAllParents(_self, _source_1, sourceParents);
    final ArrayList<AbstractState> targetParents = new ArrayList<AbstractState>();
    AbstractState _target = selectedTransition.getTarget();
    RegionAspect.getAllParents(_self, _target, targetParents);
    final Function1<AbstractState, Boolean> _function_1 = (AbstractState _parent) -> {
      boolean _contains = targetParents.contains(_parent);
      return Boolean.valueOf((!_contains));
    };
    Iterable<AbstractState> leavingParents = IterableExtensions.<AbstractState>filter(sourceParents, _function_1);
    Iterables.<AbstractState>addAll(oldActiveStates, leavingParents);
  }
  
  protected static void _privk3_findNewActiveTransitions(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<Transition> newActiveTransitions, final Transition selectedTransition, final Hashtable<String, Object> context) {
    newActiveTransitions.add(selectedTransition);
    ArrayList<Transition> activeTransitions = new ArrayList<Transition>();
    activeTransitions.addAll(newActiveTransitions);
    activeTransitions.add(selectedTransition);
    boolean conflictingTransition = RegionAspect.highestConflictingTransition(_self, activeTransitions);
    if ((!conflictingTransition)) {
      RegionAspect._original_findNewActiveTransitions(_self, newActiveTransitions, selectedTransition, context);
    } else {
      newActiveTransitions.clear();
      newActiveTransitions.addAll(activeTransitions);
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
  
  protected static boolean _privk3_highestConflictingTransition(final RegionAspectRegionAspectProperties _self_, final Region _self, final ArrayList<Transition> activeTransitions) {
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
            toDelete.add(y);
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
  
  private static Region _requiredSuper;
  
  public static void _original_findNewActiveStates(final Region _self, final ArrayList<AbstractState> newActiveStates, final Transition selectedTransition, final ArrayList<Transition> currentActiveTransitions, final Hashtable<String, Object> context) {
    // Required method *.*
  }
  
  public static void _original_findOldActiveStates(final Region _self, final ArrayList<AbstractState> oldActiveStates, final Transition selectedTransition, final Hashtable<String, Object> context) {
    // Required method *.*
  }
  
  public static void _original_findNewActiveTransitions(final Region _self, final ArrayList<Transition> newActiveTransitions, final Transition selectedTransition, final Hashtable<String, Object> context) {
    // Required method *.*
  }
  
  public static String _original_getContextPathByRegion(final Region _self) {
    // Required method *.*
    return null;
  }
  
  public static void _original_removeStatesFromContext(final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> toRemove) {
    // Required method *.*
  }
  
  public static void _original_addStatesToContext(final Region _self, final Hashtable<String, Object> context, final ArrayList<AbstractState> newStates) {
    // Required method *.*
  }
}
