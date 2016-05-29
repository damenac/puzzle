package CompleteDSL;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import CompleteDSL.TriggerAspectTriggerAspectProperties;
import CompleteDSLPckg.Trigger;
import org.eclipse.emf.common.util.EList;
import CompleteDSLPckg.AndTrigger;
import CompleteDSLPckg.Trigger;
import CompleteDSL.AndTriggerAspectAndTriggerAspectProperties;
import puzzle.annotations.processor.OverrideSuperAspectMethod;
import CompleteDSLPckg.OrTrigger;
import CompleteDSL.OrTriggerAspectOrTriggerAspectProperties;
import CompleteDSLPckg.NotTrigger;
import CompleteDSL.NotTriggerAspectNotTriggerAspectProperties;

@Aspect(className = Trigger.class)
@SuppressWarnings("all")
public class TriggerAspect {
  protected static boolean _privk3_evalTrigger(final TriggerAspectTriggerAspectProperties _self_, final Trigger _self, final EList<String> events) {
    String _expression = _self.getExpression();
    return events.contains(_expression);
  }

public static boolean evalTrigger(final Trigger _self,final EList<String> events){ 
      if (_self instanceof AndTrigger){
         return AndTriggerAspect.evalTrigger((AndTrigger)_self,events);
      } else if (_self instanceof OrTrigger){
         return OrTriggerAspect.evalTrigger((OrTrigger)_self,events);
      } else if (_self instanceof NotTrigger){
         return NotTriggerAspect.evalTrigger((NotTrigger)_self,events);
      } else if (_self instanceof Trigger){
        return super_evalTrigger((Trigger)_self,events);
      }
      else 
        return false;
}

public static boolean super_evalTrigger(final Trigger _self, final EList<String> events) {
    CompleteDSL.TriggerAspectTriggerAspectProperties _self_ = CompleteDSL.TriggerAspectTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }}
