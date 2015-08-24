package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.FinalState;
import hfsm.FinalStateAspectFinalStateAspectProperties;
import hfsm.StateAspect;
import java.util.Hashtable;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void exitState(final FinalState _self, final Hashtable<String, Object> context) {
    hfsm.FinalStateAspectFinalStateAspectProperties _self_ = hfsm.FinalStateAspectFinalStateAspectContext.getSelf(_self);
     if (_self instanceof hfsm.FinalState){
     hfsm.FinalStateAspect._privk3_exitState(_self_, (hfsm.FinalState)_self,context);
    } else  if (_self instanceof hfsm.State){
     hfsm.StateAspect.exitState((hfsm.State)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_exitState(final FinalState _self, final Hashtable<String, Object> context) {
    hfsm.StateAspectStateAspectProperties _self_ = hfsm.StateAspectStateAspectContext.getSelf(_self);
     hfsm.StateAspect._privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Hashtable<String, Object> context) {
    FinalStateAspect.super_exitState(_self, context);
    System.exit(0);
  }
}
