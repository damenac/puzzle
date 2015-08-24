package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.FinalState;
import tfsm.FinalStateAspectFinalStateAspectProperties;
import tfsm.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void exitState(final FinalState _self, final Hashtable<String, Object> context) {
    tfsm.FinalStateAspectFinalStateAspectProperties _self_ = tfsm.FinalStateAspectFinalStateAspectContext.getSelf(_self);
     if (_self instanceof tfsm.FinalState){
     tfsm.FinalStateAspect._privk3_exitState(_self_, (tfsm.FinalState)_self,context);
    } else  if (_self instanceof tfsm.State){
     tfsm.StateAspect.exitState((tfsm.State)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_exitState(final FinalState _self, final Hashtable<String, Object> context) {
    tfsm.StateAspectStateAspectProperties _self_ = tfsm.StateAspectStateAspectContext.getSelf(_self);
     tfsm.StateAspect._privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Hashtable<String, Object> context) {
    FinalStateAspect.super_exitState(_self, context);
    System.exit(0);
  }
}
