package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Expression;
import kmLogo.Left;
import logo.Context;
import logo.ExpressionAspect;
import logo.LeftAspectLeftAspectProperties;
import logo.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Left _self, final Context context) {
    logo.LeftAspectLeftAspectProperties _self_ = logo.LeftAspectLeftAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Left){
    result = logo.LeftAspect._privk3_eval(_self_, (kmLogo.Left)_self,context);
    } else  if (_self instanceof kmLogo.Primitive){
    result = logo.PrimitiveAspect.eval((kmLogo.Primitive)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Left _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final LeftAspectLeftAspectProperties _self_, final Left _self, final Context context) {
    Expression _angle = _self.getAngle();
    int _eval = ExpressionAspect.eval(_angle, context);
    int param = ((-1) * _eval);
    InputOutput.<String>println(("LEFT " + Integer.valueOf(param)));
    context.turtle.rotate(param);
    return 0;
  }
}
