package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.ExpressionAspect;
import hfsm.Literal;
import hfsm.LiteralAspectLiteralAspectProperties;
import java.util.Hashtable;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    hfsm.LiteralAspectLiteralAspectProperties _self_ = hfsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof hfsm.IntegerLit){
    result = hfsm.IntegerLitAspect.eval((hfsm.IntegerLit)_self,context);
    } else  if (_self instanceof hfsm.BoolLit){
    result = hfsm.BoolLitAspect.eval((hfsm.BoolLit)_self,context);
    } else  if (_self instanceof hfsm.StringLit){
    result = hfsm.StringLitAspect.eval((hfsm.StringLit)_self,context);
    } else  if (_self instanceof hfsm.Literal){
    result = hfsm.LiteralAspect._privk3_eval(_self_, (hfsm.Literal)_self,context);
    } else  if (_self instanceof hfsm.Expression){
    result = hfsm.ExpressionAspect.eval((hfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    hfsm.ExpressionAspectExpressionAspectProperties _self_ = hfsm.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  hfsm.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
