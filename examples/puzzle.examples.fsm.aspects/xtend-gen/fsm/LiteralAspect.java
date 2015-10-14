package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.ExpressionAspect;
import fsm.Literal;
import fsm.LiteralAspectLiteralAspectProperties;
import java.util.Hashtable;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    fsm.LiteralAspectLiteralAspectProperties _self_ = fsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fsm.StringLit){
    result = fsm.StringLitAspect.eval((fsm.StringLit)_self,context);
    } else  if (_self instanceof fsm.BoolLit){
    result = fsm.BoolLitAspect.eval((fsm.BoolLit)_self,context);
    } else  if (_self instanceof fsm.IntegerLit){
    result = fsm.IntegerLitAspect.eval((fsm.IntegerLit)_self,context);
    } else  if (_self instanceof fsm.Literal){
    result = fsm.LiteralAspect._privk3_eval(_self_, (fsm.Literal)_self,context);
    } else  if (_self instanceof fsm.Expression){
    result = fsm.ExpressionAspect.eval((fsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    fsm.ExpressionAspectExpressionAspectProperties _self_ = fsm.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fsm.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
