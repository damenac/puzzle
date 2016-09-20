package semanticsLogo;

import Logo.Expression;
import Logo.Left;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.LeftAspectLeftAspectProperties;
import semanticsLogo.PrimitiveAspect;
import semanticsLogo.Turtle;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Left _self, final Hashtable<String, Object> context) {
    semanticsLogo.LeftAspectLeftAspectProperties _self_ = semanticsLogo.LeftAspectLeftAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Left _self, final Hashtable<String, Object> context) {
    semanticsLogo.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final LeftAspectLeftAspectProperties _self_, final Left _self, final Hashtable<String, Object> context) {
    Expression _angle = _self.getAngle();
    Object _eval = ExpressionAspect.eval(_angle, context);
    int _intValue = ((Integer) _eval).intValue();
    int param = ((-1) * _intValue);
    InputOutput.<String>println(("LEFT " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).rotate(param);
  }
}
