package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import rhapsody.IntegerLit;
import rhapsody.IntegerLitAspectIntegerLitAspectProperties;
import rhapsody.LiteralAspect;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    rhapsody.IntegerLitAspectIntegerLitAspectProperties _self_ = rhapsody.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rhapsody.IntegerLit){
    result = rhapsody.IntegerLitAspect._privk3_eval(_self_, (rhapsody.IntegerLit)_self,context);
    } else  if (_self instanceof rhapsody.Literal){
    result = rhapsody.LiteralAspect.eval((rhapsody.Literal)_self,context);
    } else  if (_self instanceof rhapsody.Expression){
    result = rhapsody.ExpressionAspect.eval((rhapsody.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    rhapsody.LiteralAspectLiteralAspectProperties _self_ = rhapsody.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  rhapsody.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
