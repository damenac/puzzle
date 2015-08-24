package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import rhapsody.ExpressionAspect;
import rhapsody.Literal;
import rhapsody.LiteralAspectLiteralAspectProperties;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    rhapsody.LiteralAspectLiteralAspectProperties _self_ = rhapsody.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rhapsody.StringLit){
    result = rhapsody.StringLitAspect.eval((rhapsody.StringLit)_self,context);
    } else  if (_self instanceof rhapsody.BoolLit){
    result = rhapsody.BoolLitAspect.eval((rhapsody.BoolLit)_self,context);
    } else  if (_self instanceof rhapsody.IntegerLit){
    result = rhapsody.IntegerLitAspect.eval((rhapsody.IntegerLit)_self,context);
    } else  if (_self instanceof rhapsody.Literal){
    result = rhapsody.LiteralAspect._privk3_eval(_self_, (rhapsody.Literal)_self,context);
    } else  if (_self instanceof rhapsody.Expression){
    result = rhapsody.ExpressionAspect.eval((rhapsody.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    rhapsody.ExpressionAspectExpressionAspectProperties _self_ = rhapsody.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  rhapsody.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
