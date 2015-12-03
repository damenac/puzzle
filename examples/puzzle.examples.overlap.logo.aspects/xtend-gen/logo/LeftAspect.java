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
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Left _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final LeftAspectLeftAspectProperties _self_, final Left _self, final Context context) {
    Expression _angle = _self.getAngle();
    Object _eval = ExpressionAspect.eval(_angle, context);
    int param = ((-1) * (((Integer) _eval)).intValue());
    InputOutput.<String>println(("LEFT " + Integer.valueOf(param)));
    context.turtle.rotate(param);
    return 0;
  }
}
