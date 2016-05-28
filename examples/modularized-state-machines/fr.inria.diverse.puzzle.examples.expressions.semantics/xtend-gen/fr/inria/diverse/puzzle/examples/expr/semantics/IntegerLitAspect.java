package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.IntegerLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspectIntegerLitAspectProperties;
import fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspect;
import java.util.Hashtable;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspectIntegerLitAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionPck.IntegerLit){
    result = fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspect._privk3_eval(_self_, (ExpressionPck.IntegerLit)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.expr.semantics.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
