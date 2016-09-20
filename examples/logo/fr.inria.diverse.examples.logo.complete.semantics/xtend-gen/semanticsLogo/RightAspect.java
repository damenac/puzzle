package semanticsLogo;

import Logo.Expression;
import Logo.Right;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.PrimitiveAspect;
import semanticsLogo.RightAspectRightAspectProperties;
import semanticsLogo.Turtle;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Right _self, final Hashtable<String, Object> context) {
    semanticsLogo.RightAspectRightAspectProperties _self_ = semanticsLogo.RightAspectRightAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Right _self, final Hashtable<String, Object> context) {
    semanticsLogo.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final RightAspectRightAspectProperties _self_, final Right _self, final Hashtable<String, Object> context) {
    Expression _angle = _self.getAngle();
    Object _eval = ExpressionAspect.eval(_angle, context);
    int param = ((Integer) _eval).intValue();
    InputOutput.<String>println(("RIGHT " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).rotate(param);
  }
}
