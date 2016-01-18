package fsmrhapsodyaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.Trigger;
import fsmrhapsodyaspects.TriggerAspectTriggerAspectProperties;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Trigger.class)
@SuppressWarnings("all")
public class TriggerAspect {
  public static boolean evalTrigger(final Trigger _self, final EList<String> events) {
    fsmrhapsodyaspects.TriggerAspectTriggerAspectProperties _self_ = fsmrhapsodyaspects.TriggerAspectTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final TriggerAspectTriggerAspectProperties _self_, final Trigger _self, final EList<String> events) {
    String _expression = _self.getExpression();
    return events.contains(_expression);
  }
}
