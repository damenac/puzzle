package semanticsLogoPrimitives;

import Primitives.Expression;
import Primitives.Forward;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogoPrimitives.ForwardAspectForwardAspectProperties;
import semanticsLogoPrimitives.PrimitiveAspect;
import semanticsLogoPrimitives.Turtle;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Forward _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.ForwardAspectForwardAspectProperties _self_ = semanticsLogoPrimitives.ForwardAspectForwardAspectContext.getSelf(_self);
     if (_self instanceof Primitives.Forward){
     semanticsLogoPrimitives.ForwardAspect._privk3_eval(_self_, (Primitives.Forward)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Forward _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogoPrimitives.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ForwardAspectForwardAspectProperties _self_, final Forward _self, final Hashtable<String, Object> context) {
    Expression _steps = _self.getSteps();
    Object _eval = _steps.eval(context);
    int param = ((Integer) _eval).intValue();
    InputOutput.<String>println(("FORWARD " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).forward(param);
  }
}
