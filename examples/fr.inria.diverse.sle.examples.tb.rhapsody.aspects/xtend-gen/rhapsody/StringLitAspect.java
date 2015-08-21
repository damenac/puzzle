package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import rhapsody.LiteralAspect;
import rhapsody.StringLit;
import rhapsody.StringLitAspectStringLitAspectProperties;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Hashtable<String, Object> context) {
    rhapsody.StringLitAspectStringLitAspectProperties _self_ = rhapsody.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rhapsody.StringLit){
    result = rhapsody.StringLitAspect._privk3_eval(_self_, (rhapsody.StringLit)_self,context);
    } else  if (_self instanceof rhapsody.Literal){
    result = rhapsody.LiteralAspect.eval((rhapsody.Literal)_self,context);
    } else  if (_self instanceof rhapsody.Expression){
    result = rhapsody.ExpressionAspect.eval((rhapsody.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Hashtable<String, Object> context) {
    rhapsody.LiteralAspectLiteralAspectProperties _self_ = rhapsody.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  rhapsody.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
