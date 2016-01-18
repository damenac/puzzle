package logos.semantics;

import Logo.Expression;
import Logo.Left;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.LeftAspectLeftAspectProperties;
import logos.semantics.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Left _self, final Context context) {
    logos.semantics.LeftAspectLeftAspectProperties _self_ = logos.semantics.LeftAspectLeftAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Left _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logos.semantics.PrimitiveAspect._privk3_eval(_self_, _self,context);
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
