package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.BoolLit;
import hfsm.BoolLitAspectBoolLitAspectProperties;
import hfsm.LiteralAspect;
import java.util.Hashtable;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Hashtable<String, Object> context) {
    hfsm.BoolLitAspectBoolLitAspectProperties _self_ = hfsm.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof hfsm.BoolLit){
    result = hfsm.BoolLitAspect._privk3_eval(_self_, (hfsm.BoolLit)_self,context);
    } else  if (_self instanceof hfsm.Literal){
    result = hfsm.LiteralAspect.eval((hfsm.Literal)_self,context);
    } else  if (_self instanceof hfsm.Expression){
    result = hfsm.ExpressionAspect.eval((hfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Hashtable<String, Object> context) {
    hfsm.LiteralAspectLiteralAspectProperties _self_ = hfsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  hfsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
