package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import rhapsody.BoolLit;
import rhapsody.BoolLitAspectBoolLitAspectProperties;
import rhapsody.LiteralAspect;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Hashtable<String, Object> context) {
    rhapsody.BoolLitAspectBoolLitAspectProperties _self_ = rhapsody.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rhapsody.BoolLit){
    result = rhapsody.BoolLitAspect._privk3_eval(_self_, (rhapsody.BoolLit)_self,context);
    } else  if (_self instanceof rhapsody.Literal){
    result = rhapsody.LiteralAspect.eval((rhapsody.Literal)_self,context);
    } else  if (_self instanceof rhapsody.Expression){
    result = rhapsody.ExpressionAspect.eval((rhapsody.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Hashtable<String, Object> context) {
    rhapsody.LiteralAspectLiteralAspectProperties _self_ = rhapsody.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  rhapsody.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
