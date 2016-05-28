package fr.inria.diverse.puzzle.examples.triggers.semantics;

import complextriggers.AndTrigger;
import complextriggers.Trigger;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.examples.triggers.semantics.AndTriggerAspectAndTriggerAspectProperties;
import org.eclipse.emf.common.util.EList;
import puzzle.annotations.processor.OverrideSuperAspectMethod;

@Aspect(className = AndTrigger.class)
@SuppressWarnings("all")
public class AndTriggerAspect {
  @OverrideSuperAspectMethod
  public static boolean evalTrigger(final AndTrigger _self, final EList<String> events) {
    fr.inria.diverse.puzzle.examples.triggers.semantics.AndTriggerAspectAndTriggerAspectProperties _self_ = fr.inria.diverse.puzzle.examples.triggers.semantics.AndTriggerAspectAndTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final AndTriggerAspectAndTriggerAspectProperties _self_, final AndTrigger _self, final EList<String> events) {
    boolean _and = false;
    Trigger _right = _self.getRight();
    boolean _evalTrigger = _right.evalTrigger(events);
    if (!_evalTrigger) {
      _and = false;
    } else {
      Trigger _left = _self.getLeft();
      boolean _evalTrigger_1 = _left.evalTrigger(events);
      _and = _evalTrigger_1;
    }
    return _and;
  }
  
  private static Trigger _requiredSuper;
}
