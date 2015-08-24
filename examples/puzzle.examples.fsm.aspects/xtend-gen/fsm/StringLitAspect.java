package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.LiteralAspect;
import fsm.StringLit;
import fsm.StringLitAspectStringLitAspectProperties;
import java.util.Hashtable;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Hashtable<String, Object> context) {
    fsm.StringLitAspectStringLitAspectProperties _self_ = fsm.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fsm.StringLit){
    result = fsm.StringLitAspect._privk3_eval(_self_, (fsm.StringLit)_self,context);
    } else  if (_self instanceof fsm.Literal){
    result = fsm.LiteralAspect.eval((fsm.Literal)_self,context);
    } else  if (_self instanceof fsm.Expression){
    result = fsm.ExpressionAspect.eval((fsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Hashtable<String, Object> context) {
    fsm.LiteralAspectLiteralAspectProperties _self_ = fsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  fsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
