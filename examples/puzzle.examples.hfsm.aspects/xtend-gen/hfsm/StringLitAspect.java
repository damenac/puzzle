package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.LiteralAspect;
import hfsm.StringLit;
import hfsm.StringLitAspectStringLitAspectProperties;
import java.util.Hashtable;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Hashtable<String, Object> context) {
    hfsm.StringLitAspectStringLitAspectProperties _self_ = hfsm.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof hfsm.StringLit){
    result = hfsm.StringLitAspect._privk3_eval(_self_, (hfsm.StringLit)_self,context);
    } else  if (_self instanceof hfsm.Literal){
    result = hfsm.LiteralAspect.eval((hfsm.Literal)_self,context);
    } else  if (_self instanceof hfsm.Expression){
    result = hfsm.ExpressionAspect.eval((hfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Hashtable<String, Object> context) {
    hfsm.LiteralAspectLiteralAspectProperties _self_ = hfsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  hfsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
