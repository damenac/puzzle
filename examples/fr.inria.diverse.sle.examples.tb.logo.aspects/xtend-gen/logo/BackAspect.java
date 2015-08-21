package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Back;
import kmLogo.Expression;
import logo.BackAspectBackAspectProperties;
import logo.Context;
import logo.ExpressionAspect;
import logo.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Back.class)
@SuppressWarnings("all")
public class BackAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Back _self, final Context context) {
    logo.BackAspectBackAspectProperties _self_ = logo.BackAspectBackAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Back){
    result = logo.BackAspect._privk3_eval(_self_, (kmLogo.Back)_self,context);
    } else  if (_self instanceof kmLogo.Primitive){
    result = logo.PrimitiveAspect.eval((kmLogo.Primitive)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Back _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final BackAspectBackAspectProperties _self_, final Back _self, final Context context) {
    Expression _steps = _self.getSteps();
    int _eval = ExpressionAspect.eval(_steps, context);
    int param = ((-1) * _eval);
    InputOutput.<String>println(("BACK " + Integer.valueOf(param)));
    context.turtle.forward(param);
    return 0;
  }
}
