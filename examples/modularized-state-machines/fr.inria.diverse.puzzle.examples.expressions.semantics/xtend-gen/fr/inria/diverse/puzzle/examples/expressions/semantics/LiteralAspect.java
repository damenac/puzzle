package fr.inria.diverse.puzzle.examples.expressions.semantics;

import ExpressionPck.Literal;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.expressions.semantics.ExpressionAspect;
import fr.inria.diverse.puzzle.examples.expressions.semantics.LiteralAspectLiteralAspectProperties;
import java.util.Hashtable;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expressions.semantics.LiteralAspectLiteralAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expressions.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expressions.semantics.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expressions.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.expressions.semantics.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
