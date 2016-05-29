package fr.inria.diverse.puzzle.examples.statemachine.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.examples.statemachine.semantics.TriggerAspectTriggerAspectProperties;
import fsm.Trigger;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Trigger.class)
@SuppressWarnings("all")
public class TriggerAspect {
  public static boolean evalTrigger(final Trigger _self, final EList<String> events) {
    fr.inria.diverse.puzzle.examples.statemachine.semantics.TriggerAspectTriggerAspectProperties _self_ = fr.inria.diverse.puzzle.examples.statemachine.semantics.TriggerAspectTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final TriggerAspectTriggerAspectProperties _self_, final Trigger _self, final EList<String> events) {
    String _expression = _self.getExpression();
    return events.contains(_expression);
  }
}
