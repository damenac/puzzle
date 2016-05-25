package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Conditional;
import actionscripting.Expression;
import actionscripting.Statement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.ConditionalAspectConditionalAspectProperties;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.ConditionalAspectConditionalAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.ConditionalAspectConditionalAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self, final Hashtable<String, Object> context) {
    Expression _condition = _self.getCondition();
    Object _eval = _condition.eval(context);
    Boolean conditionEval = ((Boolean) _eval);
    if ((conditionEval).booleanValue()) {
      EList<Statement> _body = _self.getBody();
      for (final Statement _statement : _body) {
        StatementAspect.eval(_statement, context);
      }
    }
  }
}
