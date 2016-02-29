package fsmaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.AbstractState;
import fsm.FinalState;
import fsm.State;
import fsmaspects.AbstractStateAspectAbstractStateAspectProperties;
import fsmaspects.FinalStateAspect;
import fsmaspects.StateAspect;
import java.util.Hashtable;

@Aspect(className = AbstractState.class)
@SuppressWarnings("all")
public class AbstractStateAspect {
  public static void exitState(final AbstractState _self, final Hashtable<String, Object> context) {
    fsmaspects.AbstractStateAspectAbstractStateAspectProperties _self_ = fsmaspects.AbstractStateAspectAbstractStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_exitState(final AbstractStateAspectAbstractStateAspectProperties _self_, final AbstractState _self, final Hashtable<String, Object> context) {
    boolean _and = false;
    if (!(_self instanceof State)) {
      _and = false;
    } else {
      _and = (!(_self instanceof FinalState));
    }
    if (_and) {
      StateAspect.exitState(((State) _self), context);
    } else {
      if ((_self instanceof FinalState)) {
        FinalStateAspect.exitState(((FinalState) _self), context);
      }
    }
  }
}
