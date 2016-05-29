package fr.inria.diverse.puzzle.examples.newtriggers.semantics;

import complextriggers.NotTrigger;
import complextriggers.Trigger;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.examples.newtriggers.semantics.NotTriggerAspectNotTriggerAspectProperties;
import org.eclipse.emf.common.util.EList;
import puzzle.annotations.processor.OverrideSuperAspectMethod;

@Aspect(className = NotTrigger.class)
@SuppressWarnings("all")
public class NotTriggerAspect {
  @OverrideSuperAspectMethod
  public static boolean evalTrigger(final NotTrigger _self, final EList<String> events) {
    fr.inria.diverse.puzzle.examples.newtriggers.semantics.NotTriggerAspectNotTriggerAspectProperties _self_ = fr.inria.diverse.puzzle.examples.newtriggers.semantics.NotTriggerAspectNotTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final NotTriggerAspectNotTriggerAspectProperties _self_, final NotTrigger _self, final EList<String> events) {
    Trigger _trigger = _self.getTrigger();
    boolean _evalTrigger = _trigger.evalTrigger(events);
    return (!_evalTrigger);
  }
  
  private static Trigger _requiredSuper;
}
