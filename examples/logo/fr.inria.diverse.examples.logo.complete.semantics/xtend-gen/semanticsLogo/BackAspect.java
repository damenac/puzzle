package semanticsLogo;

import Logo.Back;
import Logo.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.BackAspectBackAspectProperties;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.PrimitiveAspect;
import semanticsLogo.Turtle;

@Aspect(className = Back.class)
@SuppressWarnings("all")
public class BackAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Back _self, final Hashtable<String, Object> context) {
    semanticsLogo.BackAspectBackAspectProperties _self_ = semanticsLogo.BackAspectBackAspectContext.getSelf(_self);
     if (_self instanceof Logo.Back){
     semanticsLogo.BackAspect._privk3_eval(_self_, (Logo.Back)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Back _self, final Hashtable<String, Object> context) {
    semanticsLogo.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final BackAspectBackAspectProperties _self_, final Back _self, final Hashtable<String, Object> context) {
    Expression _steps = _self.getSteps();
    Object _eval = ExpressionAspect.eval(_steps, context);
    int _intValue = ((Integer) _eval).intValue();
    int param = ((-1) * _intValue);
    InputOutput.<String>println(("BACK " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).forward(param);
  }
}
