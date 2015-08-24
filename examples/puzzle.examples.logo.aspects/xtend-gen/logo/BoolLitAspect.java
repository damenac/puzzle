package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.BoolLit;
import logo.BoolLitAspectBoolLitAspectProperties;
import logo.Context;
import logo.LiteralAspect;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Context context) {
    logo.BoolLitAspectBoolLitAspectProperties _self_ = logo.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.BoolLit){
    result = logo.BoolLitAspect._privk3_eval(_self_, (kmLogo.BoolLit)_self,context);
    } else  if (_self instanceof kmLogo.Literal){
    result = logo.LiteralAspect.eval((kmLogo.Literal)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Context context) {
    logo.LiteralAspectLiteralAspectProperties _self_ = logo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  logo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Context context) {
    return Boolean.valueOf(_self.isValue());
  }
}
