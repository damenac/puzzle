package fr.inria.diverse.puzzle.examples.fsm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.examples.fsm.semantics.StateAspectStateAspectProperties;
import fsm.State;
import java.util.Hashtable;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void entryState(final State _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.fsm.semantics.StateAspectStateAspectProperties _self_ = fr.inria.diverse.puzzle.examples.fsm.semantics.StateAspectStateAspectContext.getSelf(_self);
    _privk3_entryState(_self_, _self,context);
  }
  
  public static void evalState(final State _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.fsm.semantics.StateAspectStateAspectProperties _self_ = fr.inria.diverse.puzzle.examples.fsm.semantics.StateAspectStateAspectContext.getSelf(_self);
    _privk3_evalState(_self_, _self,context);
  }
  
  public static void exitState(final State _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.fsm.semantics.StateAspectStateAspectProperties _self_ = fr.inria.diverse.puzzle.examples.fsm.semantics.StateAspectStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_entryState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
  }
  
  protected static void _privk3_evalState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
  }
  
  protected static void _privk3_exitState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
  }
}
