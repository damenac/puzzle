package fsmaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.FinalState;
import fsmaspects.FinalStateAspectFinalStateAspectProperties;
import fsmaspects.StateAspect;
import java.util.Hashtable;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void exitState(final FinalState _self, final Hashtable<String, Object> context) {
    fsmaspects.FinalStateAspectFinalStateAspectProperties _self_ = fsmaspects.FinalStateAspectFinalStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  private static void super_exitState(final FinalState _self, final Hashtable<String, Object> context) {
    fsmaspects.StateAspectStateAspectProperties _self_ = fsmaspects.StateAspectStateAspectContext.getSelf(_self);
     fsmaspects.StateAspect._privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Hashtable<String, Object> context) {
    System.exit(0);
  }
}
