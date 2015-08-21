package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import rhapsody.FinalState;
import rhapsody.FinalStateAspectFinalStateAspectProperties;
import rhapsody.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  public static void exitState(final FinalState _self, final Hashtable<String, Object> context) {
    rhapsody.FinalStateAspectFinalStateAspectProperties _self_ = rhapsody.FinalStateAspectFinalStateAspectContext.getSelf(_self);
     if (_self instanceof rhapsody.FinalState){
     rhapsody.FinalStateAspect._privk3_exitState(_self_, (rhapsody.FinalState)_self,context);
    } else  if (_self instanceof rhapsody.State){
     rhapsody.StateAspect.exitState((rhapsody.State)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_exitState(final FinalState _self, final Hashtable<String, Object> context) {
    rhapsody.StateAspectStateAspectProperties _self_ = rhapsody.StateAspectStateAspectContext.getSelf(_self);
     rhapsody.StateAspect._privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Hashtable<String, Object> context) {
    FinalStateAspect.super_exitState(_self, context);
    System.exit(0);
  }
}
