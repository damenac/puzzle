package Logo.logoprogram;

import Logo.Expression;
import Logo.Left;
import Logo.logoprogram.Context;
import Logo.logoprogram.LeftAspectLeftAspectProperties;
import Logo.logoprogram.PrimitiveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Left _self, final Context context) {
    Logo.logoprogram.LeftAspectLeftAspectProperties _self_ = Logo.logoprogram.LeftAspectLeftAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Left _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  Logo.logoprogram.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final LeftAspectLeftAspectProperties _self_, final Left _self, final Context context) {
    Expression _angle = _self.getAngle();
    Object _eval = _angle.eval(context);
    int param = ((-1) * (((Integer) _eval)).intValue());
    InputOutput.<String>println(("LEFT " + Integer.valueOf(param)));
    context.turtle.rotate(param);
    return 0;
  }
}
