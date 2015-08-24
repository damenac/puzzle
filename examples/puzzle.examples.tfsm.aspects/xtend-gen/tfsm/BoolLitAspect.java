package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.BoolLit;
import tfsm.BoolLitAspectBoolLitAspectProperties;
import tfsm.LiteralAspect;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Hashtable<String, Object> context) {
    tfsm.BoolLitAspectBoolLitAspectProperties _self_ = tfsm.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof tfsm.BoolLit){
    result = tfsm.BoolLitAspect._privk3_eval(_self_, (tfsm.BoolLit)_self,context);
    } else  if (_self instanceof tfsm.Literal){
    result = tfsm.LiteralAspect.eval((tfsm.Literal)_self,context);
    } else  if (_self instanceof tfsm.Expression){
    result = tfsm.ExpressionAspect.eval((tfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Hashtable<String, Object> context) {
    tfsm.LiteralAspectLiteralAspectProperties _self_ = tfsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  tfsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
