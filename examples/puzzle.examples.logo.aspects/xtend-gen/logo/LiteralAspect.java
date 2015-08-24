package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Literal;
import logo.Context;
import logo.ExpressionAspect;
import logo.LiteralAspectLiteralAspectProperties;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Context context) {
    logo.LiteralAspectLiteralAspectProperties _self_ = logo.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.StringLit){
    result = logo.StringLitAspect.eval((kmLogo.StringLit)_self,context);
    } else  if (_self instanceof kmLogo.IntegerLit){
    result = logo.IntegerLitAspect.eval((kmLogo.IntegerLit)_self,context);
    } else  if (_self instanceof kmLogo.BoolLit){
    result = logo.BoolLitAspect.eval((kmLogo.BoolLit)_self,context);
    } else  if (_self instanceof kmLogo.Literal){
    result = logo.LiteralAspect._privk3_eval(_self_, (kmLogo.Literal)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Context context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  logo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Context context) {
    return Integer.valueOf(0);
  }
}
