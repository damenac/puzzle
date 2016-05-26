package fr.inria.diverse.puzzle.examples.expressions.semantics;

import ExpressionPck.IntegerLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.expressions.semantics.IntegerLitAspectIntegerLitAspectProperties;
import fr.inria.diverse.puzzle.examples.expressions.semantics.LiteralAspect;
import java.util.Hashtable;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expressions.semantics.IntegerLitAspectIntegerLitAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expressions.semantics.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expressions.semantics.LiteralAspectLiteralAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expressions.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.expressions.semantics.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
