package fsmharelaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.OrTrigger;
import fsm.Trigger;
import fsmharelaspects.OrTriggerAspectOrTriggerAspectProperties;
import fsmharelaspects.TriggerAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = OrTrigger.class)
@SuppressWarnings("all")
public class OrTriggerAspect {
  public static boolean evalTrigger(final OrTrigger _self, final EList<String> events) {
    fsmharelaspects.OrTriggerAspectOrTriggerAspectProperties _self_ = fsmharelaspects.OrTriggerAspectOrTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final OrTriggerAspectOrTriggerAspectProperties _self_, final OrTrigger _self, final EList<String> events) {
    boolean _and = false;
    Trigger _right = _self.getRight();
    boolean _evalTrigger = TriggerAspect.evalTrigger(_right, events);
    if (!_evalTrigger) {
      _and = false;
    } else {
      Trigger _left = _self.getLeft();
      boolean _evalTrigger_1 = TriggerAspect.evalTrigger(_left, events);
      _and = _evalTrigger_1;
    }
    return _and;
  }
}
