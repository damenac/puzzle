package fsmharelaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.FinalState;
import fsmharelaspects.FinalStateAspectFinalStateAspectProperties;
import fsmharelaspects.StateAspect;
import java.util.Hashtable;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void exitState(final FinalState _self, final Hashtable<String, Object> context) {
    fsmharelaspects.FinalStateAspectFinalStateAspectProperties _self_ = fsmharelaspects.FinalStateAspectFinalStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  private static void super_exitState(final FinalState _self, final Hashtable<String, Object> context) {
    fsmharelaspects.StateAspectStateAspectProperties _self_ = fsmharelaspects.StateAspectStateAspectContext.getSelf(_self);
     fsmharelaspects.StateAspect._privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Hashtable<String, Object> context) {
    FinalStateAspect.super_exitState(_self, context);
    System.exit(0);
  }
}
