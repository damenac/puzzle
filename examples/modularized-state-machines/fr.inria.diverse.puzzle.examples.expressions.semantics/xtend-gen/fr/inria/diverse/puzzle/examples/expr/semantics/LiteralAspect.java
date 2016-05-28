package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.Literal;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspect;
import fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectProperties;
import java.util.Hashtable;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionPck.Literal){
    result = fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspect._privk3_eval(_self_, (ExpressionPck.Literal)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
