package fsm;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.AbstractState;
import fsm.Constraint;
import fsm.ConstraintAspect;
import fsm.State;
import fsm.StateAspect;
import fsm.Transition;
import fsm.TransitionAspectTransitionAspectProperties;
import java.util.Hashtable;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static void evalTransition(final Transition _self, final Hashtable<String, Object> context) {
    fsm.TransitionAspectTransitionAspectProperties _self_ = fsm.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_evalTransition(_self_, _self,context);
  }
  
  public static boolean validGuard(final Transition _self, final Hashtable<String, Object> context) {
    fsm.TransitionAspectTransitionAspectProperties _self_ = fsm.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_validGuard(_self_, _self,context);
    return (boolean)result;
  }
  
  public static boolean alreadyFired(final Transition _self, final Hashtable<String, Object> context) {
    fsm.TransitionAspectTransitionAspectProperties _self_ = fsm.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_alreadyFired(_self_, _self,context);
    return (boolean)result;
  }
  
  public static void resetFired(final Transition _self) {
    fsm.TransitionAspectTransitionAspectProperties _self_ = fsm.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_resetFired(_self_, _self);
  }
  
  private static boolean fired(final Transition _self) {
    fsm.TransitionAspectTransitionAspectProperties _self_ = fsm.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_fired(_self_, _self);
    return (boolean)result;
  }
  
  private static void fired(final Transition _self, final boolean fired) {
    fsm.TransitionAspectTransitionAspectProperties _self_ = fsm.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_fired(_self_, _self,fired);
  }
  
  protected static void _privk3_evalTransition(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Hashtable<String, Object> context) {
    boolean _validGuard = TransitionAspect.validGuard(_self, context);
    if (_validGuard) {
      TransitionAspect.fired(_self, true);
      AbstractState _target = _self.getTarget();
      if ((_target instanceof State)) {
        AbstractState _target_1 = _self.getTarget();
        StateAspect.entryState(((State) _target_1), context);
        AbstractState _target_2 = _self.getTarget();
        StateAspect.evalState(((State) _target_2), context);
      }
    }
  }
  
  protected static boolean _privk3_validGuard(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Hashtable<String, Object> context) {
    boolean _or = false;
    Constraint _guard = _self.getGuard();
    boolean _equals = Objects.equal(_guard, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _and = false;
      Constraint _guard_1 = _self.getGuard();
      boolean _notEquals = (!Objects.equal(_guard_1, null));
      if (!_notEquals) {
        _and = false;
      } else {
        Constraint _guard_2 = _self.getGuard();
        boolean _evalConstraint = ConstraintAspect.evalConstraint(_guard_2, context);
        boolean _equals_1 = (_evalConstraint == true);
        _and = _equals_1;
      }
      _or = _and;
    }
    return _or;
  }
  
  protected static boolean _privk3_alreadyFired(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Hashtable<String, Object> context) {
    return TransitionAspect.fired(_self);
  }
  
  protected static void _privk3_resetFired(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    TransitionAspect.fired(_self, false);
  }
  
  protected static boolean _privk3_fired(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
     return _self_.fired; 
  }
  
  protected static void _privk3_fired(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final boolean fired) {
    _self_.fired = fired; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Fired")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, fired);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
