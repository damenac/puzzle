package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.IntegerLit;
import tfsm.IntegerLitAspectIntegerLitAspectProperties;
import tfsm.LiteralAspect;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    tfsm.IntegerLitAspectIntegerLitAspectProperties _self_ = tfsm.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof tfsm.IntegerLit){
    result = tfsm.IntegerLitAspect._privk3_eval(_self_, (tfsm.IntegerLit)_self,context);
    } else  if (_self instanceof tfsm.Literal){
    result = tfsm.LiteralAspect.eval((tfsm.Literal)_self,context);
    } else  if (_self instanceof tfsm.Expression){
    result = tfsm.ExpressionAspect.eval((tfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    tfsm.LiteralAspectLiteralAspectProperties _self_ = tfsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  tfsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
