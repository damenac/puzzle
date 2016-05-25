package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectProperties;
import java.util.Hashtable;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
