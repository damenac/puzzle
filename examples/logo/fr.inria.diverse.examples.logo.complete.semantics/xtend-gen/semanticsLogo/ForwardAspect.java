package semanticsLogo;

import Logo.Expression;
import Logo.Forward;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.ForwardAspectForwardAspectProperties;
import semanticsLogo.PrimitiveAspect;
import semanticsLogo.Turtle;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Forward _self, final Hashtable<String, Object> context) {
    semanticsLogo.ForwardAspectForwardAspectProperties _self_ = semanticsLogo.ForwardAspectForwardAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Forward _self, final Hashtable<String, Object> context) {
    semanticsLogo.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ForwardAspectForwardAspectProperties _self_, final Forward _self, final Hashtable<String, Object> context) {
    Expression _steps = _self.getSteps();
    Object _eval = ExpressionAspect.eval(_steps, context);
    int param = ((Integer) _eval).intValue();
    InputOutput.<String>println(("FORWARD " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).forward(param);
  }
}
