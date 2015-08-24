package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.StringLit;
import logo.Context;
import logo.LiteralAspect;
import logo.StringLitAspectStringLitAspectProperties;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Context context) {
    logo.StringLitAspectStringLitAspectProperties _self_ = logo.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.StringLit){
    result = logo.StringLitAspect._privk3_eval(_self_, (kmLogo.StringLit)_self,context);
    } else  if (_self instanceof kmLogo.Literal){
    result = logo.LiteralAspect.eval((kmLogo.Literal)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Context context) {
    logo.LiteralAspectLiteralAspectProperties _self_ = logo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  logo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Context context) {
    return _self.getValue();
  }
}
