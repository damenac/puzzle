package fsmharelaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.NotTrigger;
import fsm.Trigger;
import fsmharelaspects.NotTriggerAspectNotTriggerAspectProperties;
import fsmharelaspects.TriggerAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = NotTrigger.class)
@SuppressWarnings("all")
public class NotTriggerAspect {
  public static boolean evalTrigger(final NotTrigger _self, final EList<String> events) {
    fsmharelaspects.NotTriggerAspectNotTriggerAspectProperties _self_ = fsmharelaspects.NotTriggerAspectNotTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final NotTriggerAspectNotTriggerAspectProperties _self_, final NotTrigger _self, final EList<String> events) {
    Trigger _trigger = _self.getTrigger();
    boolean _evalTrigger = TriggerAspect.evalTrigger(_trigger, events);
    return (!_evalTrigger);
  }
}
