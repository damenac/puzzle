package fsmharelaspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.AbstractState;
import fsm.Constraint;
import fsm.State;
import fsm.Statement;
import fsm.Transition;
import fsmharelaspects.ConstraintAspect;
import fsmharelaspects.StateAspect;
import fsmharelaspects.StatementAspect;
import fsmharelaspects.TransitionAspectTransitionAspectProperties;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static void evalTransition(final Transition _self, final Hashtable<String, Object> context) {
    fsmharelaspects.TransitionAspectTransitionAspectProperties _self_ = fsmharelaspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_evalTransition(_self_, _self,context);
  }
  
  public static boolean validGuard(final Transition _self, final Hashtable<String, Object> context) {
    fsmharelaspects.TransitionAspectTransitionAspectProperties _self_ = fsmharelaspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_validGuard(_self_, _self,context);
    return (boolean)result;
  }
  
  public static boolean alreadyFired(final Transition _self, final Hashtable<String, Object> context) {
    fsmharelaspects.TransitionAspectTransitionAspectProperties _self_ = fsmharelaspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_alreadyFired(_self_, _self,context);
    return (boolean)result;
  }
  
  public static void resetFired(final Transition _self) {
    fsmharelaspects.TransitionAspectTransitionAspectProperties _self_ = fsmharelaspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_resetFired(_self_, _self);
  }
  
  private static boolean fired(final Transition _self) {
    fsmharelaspects.TransitionAspectTransitionAspectProperties _self_ = fsmharelaspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_fired(_self_, _self);
    return (boolean)result;
  }
  
  private static void fired(final Transition _self, final boolean fired) {
    fsmharelaspects.TransitionAspectTransitionAspectProperties _self_ = fsmharelaspects.TransitionAspectTransitionAspectContext.getSelf(_self);
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
    final ArrayList<Hashtable<String, Object>> parallelContexts = new ArrayList<Hashtable<String, Object>>();
    EList<Statement> _effect = _self.getEffect();
    for (final Statement _statement : _effect) {
      {
        Hashtable<String, Object> _newContext = new Hashtable<String, Object>(context);
        StatementAspect.eval(_statement, _newContext);
        parallelContexts.add(_newContext);
      }
    }
    for (final Hashtable<String, Object> _context : parallelContexts) {
      {
        Set<String> _keySet = _context.keySet();
        Iterator<String> _it = _keySet.iterator();
        while (_it.hasNext()) {
          {
            String _key = _it.next();
            Object _value = _context.get(_key);
            boolean _startsWith = _key.startsWith("currentState");
            boolean _not = (!_startsWith);
            if (_not) {
              context.put(_key, _value);
            }
          }
        }
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
