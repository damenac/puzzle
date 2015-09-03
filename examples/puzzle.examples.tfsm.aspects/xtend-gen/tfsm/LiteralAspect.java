package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.ExpressionAspect;
import tfsm.Literal;
import tfsm.LiteralAspectLiteralAspectProperties;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    tfsm.LiteralAspectLiteralAspectProperties _self_ = tfsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof tfsm.IntegerLit){
    result = tfsm.IntegerLitAspect.eval((tfsm.IntegerLit)_self,context);
    } else  if (_self instanceof tfsm.StringLit){
    result = tfsm.StringLitAspect.eval((tfsm.StringLit)_self,context);
    } else  if (_self instanceof tfsm.BoolLit){
    result = tfsm.BoolLitAspect.eval((tfsm.BoolLit)_self,context);
    } else  if (_self instanceof tfsm.Literal){
    result = tfsm.LiteralAspect._privk3_eval(_self_, (tfsm.Literal)_self,context);
    } else  if (_self instanceof tfsm.Expression){
    result = tfsm.ExpressionAspect.eval((tfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    tfsm.ExpressionAspectExpressionAspectProperties _self_ = tfsm.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  tfsm.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
