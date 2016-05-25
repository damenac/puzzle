package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Wait;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.WaitAspectWaitAspectProperties;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Wait _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.WaitAspectWaitAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.WaitAspectWaitAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final WaitAspectWaitAspectProperties _self_, final Wait _self, final Hashtable<String, Object> context) {
    try {
      synchronized (_self) {
        long _miliseconds = _self.getMiliseconds();
        _self.wait(_miliseconds);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
