package statemachine;

import StateMachineModule.FinalState;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import statemachine.FinalStateAspectFinalStateAspectProperties;
import statemachine.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void exitState(final FinalState _self, final Hashtable<String, Object> context) {
    statemachine.FinalStateAspectFinalStateAspectProperties _self_ = statemachine.FinalStateAspectFinalStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  private static void super_exitState(final FinalState _self, final Hashtable<String, Object> context) {
    statemachine.StateAspectStateAspectProperties _self_ = statemachine.StateAspectStateAspectContext.getSelf(_self);
     statemachine.StateAspect._privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Hashtable<String, Object> context) {
    System.exit(0);
  }
}
