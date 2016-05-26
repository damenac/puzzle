package CompleteDSL;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import CompleteDSL.TriggerAspectTriggerAspectProperties;
import CompleteDSLPckg.Trigger;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Trigger.class)
@SuppressWarnings("all")
public class TriggerAspect {
  public static boolean evalTrigger(final Trigger _self, final EList<String> events) {
    CompleteDSL.TriggerAspectTriggerAspectProperties _self_ = CompleteDSL.TriggerAspectTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final TriggerAspectTriggerAspectProperties _self_, final Trigger _self, final EList<String> events) {
    String _expression = _self.getExpression();
    return events.contains(_expression);
  }
}
