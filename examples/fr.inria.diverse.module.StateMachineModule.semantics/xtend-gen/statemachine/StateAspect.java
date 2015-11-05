package statemachine;

import StateMachineModule.State;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import statemachine.StateAspectStateAspectProperties;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void entryState(final State _self, final Hashtable<String, Object> context) {
    statemachine.StateAspectStateAspectProperties _self_ = statemachine.StateAspectStateAspectContext.getSelf(_self);
    _privk3_entryState(_self_, _self,context);
  }
  
  public static void evalState(final State _self, final Hashtable<String, Object> context) {
    statemachine.StateAspectStateAspectProperties _self_ = statemachine.StateAspectStateAspectContext.getSelf(_self);
    _privk3_evalState(_self_, _self,context);
  }
  
  public static void exitState(final State _self, final Hashtable<String, Object> context) {
    statemachine.StateAspectStateAspectProperties _self_ = statemachine.StateAspectStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_entryState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method eval is undefined for the type StateAspect");
  }
  
  protected static void _privk3_evalState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method eval is undefined for the type null");
  }
  
  protected static void _privk3_exitState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method eval is undefined for the type StateAspect");
  }
}
