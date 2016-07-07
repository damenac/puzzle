package CompleteDSL;

import CompleteDSLPckg.NotTrigger;
import CompleteDSLPckg.Trigger;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import CompleteDSL.NotTriggerAspectNotTriggerAspectProperties;
import org.eclipse.emf.common.util.EList;
import puzzle.annotations.processor.OverrideSuperAspectMethod;

@Aspect(className = NotTrigger.class)
@SuppressWarnings("all")
public class NotTriggerAspect {
  @OverrideSuperAspectMethod
  public static boolean evalTrigger(final NotTrigger _self, final EList<String> events) {
    CompleteDSL.NotTriggerAspectNotTriggerAspectProperties _self_ = CompleteDSL.NotTriggerAspectNotTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final NotTriggerAspectNotTriggerAspectProperties _self_, final NotTrigger _self, final EList<String> events) {
    Trigger _trigger = _self.getTrigger();
    boolean _evalTrigger = TriggerAspect.evalTrigger( _trigger,events);
    return (!_evalTrigger);
  }
  
  private static Trigger _requiredSuper;
}
