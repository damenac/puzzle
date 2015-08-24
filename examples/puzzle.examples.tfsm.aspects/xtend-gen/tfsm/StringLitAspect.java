package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.LiteralAspect;
import tfsm.StringLit;
import tfsm.StringLitAspectStringLitAspectProperties;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Hashtable<String, Object> context) {
    tfsm.StringLitAspectStringLitAspectProperties _self_ = tfsm.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof tfsm.StringLit){
    result = tfsm.StringLitAspect._privk3_eval(_self_, (tfsm.StringLit)_self,context);
    } else  if (_self instanceof tfsm.Literal){
    result = tfsm.LiteralAspect.eval((tfsm.Literal)_self,context);
    } else  if (_self instanceof tfsm.Expression){
    result = tfsm.ExpressionAspect.eval((tfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Hashtable<String, Object> context) {
    tfsm.LiteralAspectLiteralAspectProperties _self_ = tfsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  tfsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
