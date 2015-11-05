package statemachine;

import StateMachineModule.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import statemachine.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static void evalTransition(final Transition _self, final Hashtable<String, Object> context) {
    statemachine.TransitionAspectTransitionAspectProperties _self_ = statemachine.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_evalTransition(_self_, _self,context);
  }
  
  public static boolean validGuard(final Transition _self, final Hashtable<String, Object> context) {
    statemachine.TransitionAspectTransitionAspectProperties _self_ = statemachine.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_validGuard(_self_, _self,context);
    return (boolean)result;
  }
  
  public static boolean alreadyFired(final Transition _self, final Hashtable<String, Object> context) {
    statemachine.TransitionAspectTransitionAspectProperties _self_ = statemachine.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_alreadyFired(_self_, _self,context);
    return (boolean)result;
  }
  
  public static void resetFired(final Transition _self) {
    statemachine.TransitionAspectTransitionAspectProperties _self_ = statemachine.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_resetFired(_self_, _self);
  }
  
  private static boolean fired(final Transition _self) {
    statemachine.TransitionAspectTransitionAspectProperties _self_ = statemachine.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_fired(_self_, _self);
    return (boolean)result;
  }
  
  private static void fired(final Transition _self, final boolean fired) {
    statemachine.TransitionAspectTransitionAspectProperties _self_ = statemachine.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_fired(_self_, _self,fired);
  }
  
  protected static void _privk3_evalTransition(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method entryState is undefined for the type TransitionAspect"
      + "\nThe method evalState is undefined for the type TransitionAspect");
  }
  
  protected static boolean _privk3_validGuard(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method evalConstraint is undefined for the type TransitionAspect"
      + "\n== cannot be resolved");
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
