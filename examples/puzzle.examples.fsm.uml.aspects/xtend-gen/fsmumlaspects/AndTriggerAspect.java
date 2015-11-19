package fsmumlaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.AndTrigger;
import fsm.Trigger;
import fsmumlaspects.AndTriggerAspectAndTriggerAspectProperties;
import fsmumlaspects.TriggerAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = AndTrigger.class)
@SuppressWarnings("all")
public class AndTriggerAspect {
  public static boolean evalTrigger(final AndTrigger _self, final EList<String> events) {
    fsmumlaspects.AndTriggerAspectAndTriggerAspectProperties _self_ = fsmumlaspects.AndTriggerAspectAndTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final AndTriggerAspectAndTriggerAspectProperties _self_, final AndTrigger _self, final EList<String> events) {
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
