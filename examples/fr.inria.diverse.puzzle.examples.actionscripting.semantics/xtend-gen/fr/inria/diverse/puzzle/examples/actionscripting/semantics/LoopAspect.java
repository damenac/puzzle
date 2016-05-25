package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Expression;
import actionscripting.Loop;
import actionscripting.Statement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.LoopAspectLoopAspectProperties;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.LoopAspectLoopAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.LoopAspectLoopAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self, final Hashtable<String, Object> context) {
    Expression _guard = _self.getGuard();
    Object _eval = _guard.eval(context);
    Boolean guardEval = ((Boolean) _eval);
    while ((guardEval).booleanValue()) {
      EList<Statement> _body = _self.getBody();
      for (final Statement _statement : _body) {
        StatementAspect.eval(_statement, context);
      }
    }
  }
}
