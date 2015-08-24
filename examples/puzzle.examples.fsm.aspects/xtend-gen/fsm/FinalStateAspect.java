package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.FinalState;
import fsm.FinalStateAspectFinalStateAspectProperties;
import fsm.StateAspect;
import java.util.Hashtable;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void exitState(final FinalState _self, final Hashtable<String, Object> context) {
    fsm.FinalStateAspectFinalStateAspectProperties _self_ = fsm.FinalStateAspectFinalStateAspectContext.getSelf(_self);
     if (_self instanceof fsm.FinalState){
     fsm.FinalStateAspect._privk3_exitState(_self_, (fsm.FinalState)_self,context);
    } else  if (_self instanceof fsm.State){
     fsm.StateAspect.exitState((fsm.State)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_exitState(final FinalState _self, final Hashtable<String, Object> context) {
    fsm.StateAspectStateAspectProperties _self_ = fsm.StateAspectStateAspectContext.getSelf(_self);
     fsm.StateAspect._privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Hashtable<String, Object> context) {
    System.exit(0);
  }
}
