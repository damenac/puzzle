package CompleteDSL;

import CompleteDSLPckg.OrTrigger;
import CompleteDSLPckg.Trigger;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import CompleteDSL.OrTriggerAspectOrTriggerAspectProperties;
import org.eclipse.emf.common.util.EList;
import puzzle.annotations.processor.OverrideSuperAspectMethod;

@Aspect(className = OrTrigger.class)
@SuppressWarnings("all")
public class OrTriggerAspect {
  @OverrideSuperAspectMethod
  public static boolean evalTrigger(final OrTrigger _self, final EList<String> events) {
    CompleteDSL.OrTriggerAspectOrTriggerAspectProperties _self_ = CompleteDSL.OrTriggerAspectOrTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final OrTriggerAspectOrTriggerAspectProperties _self_, final OrTrigger _self, final EList<String> events) {
    boolean _or = false;
    Trigger _right = _self.getRight();
    boolean _evalTrigger = TriggerAspect.evalTrigger( _right,events);
    if (_evalTrigger) {
      _or = true;
    } else {
      Trigger _left = _self.getLeft();
      boolean _evalTrigger_1 = TriggerAspect.evalTrigger( _left,events);
      _or = _evalTrigger_1;
    }
    return _or;
  }
  
  private static Trigger _requiredSuper;
}
