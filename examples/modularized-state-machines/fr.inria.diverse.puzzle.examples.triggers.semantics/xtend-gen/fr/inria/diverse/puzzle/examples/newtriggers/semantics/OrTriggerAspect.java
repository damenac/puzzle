package fr.inria.diverse.puzzle.examples.newtriggers.semantics;

import complextriggers.OrTrigger;
import complextriggers.Trigger;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.examples.newtriggers.semantics.OrTriggerAspectOrTriggerAspectProperties;
import org.eclipse.emf.common.util.EList;
import puzzle.annotations.processor.OverrideSuperAspectMethod;

@Aspect(className = OrTrigger.class)
@SuppressWarnings("all")
public class OrTriggerAspect {
  @OverrideSuperAspectMethod
  public static boolean evalTrigger(final OrTrigger _self, final EList<String> events) {
    fr.inria.diverse.puzzle.examples.newtriggers.semantics.OrTriggerAspectOrTriggerAspectProperties _self_ = fr.inria.diverse.puzzle.examples.newtriggers.semantics.OrTriggerAspectOrTriggerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalTrigger(_self_, _self,events);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalTrigger(final OrTriggerAspectOrTriggerAspectProperties _self_, final OrTrigger _self, final EList<String> events) {
    boolean _or = false;
    Trigger _right = _self.getRight();
    boolean _evalTrigger = _right.evalTrigger(events);
    if (_evalTrigger) {
      _or = true;
    } else {
      Trigger _left = _self.getLeft();
      boolean _evalTrigger_1 = _left.evalTrigger(events);
      _or = _evalTrigger_1;
    }
    return _or;
  }
  
  private static Trigger _requiredSuper;
}
