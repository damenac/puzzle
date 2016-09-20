package CompleteDSL;

import CompleteDSLPckg.Expression;
import CompleteDSLPckg.Forward;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.ForwardAspectForwardAspectProperties;
import CompleteDSL.PrimitiveAspect;
import CompleteDSL.Turtle;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Forward _self, final Hashtable<String, Object> context) {
    CompleteDSL.ForwardAspectForwardAspectProperties _self_ = CompleteDSL.ForwardAspectForwardAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Forward){
     CompleteDSL.ForwardAspect._privk3_eval(_self_, (CompleteDSLPckg.Forward)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Forward _self, final Hashtable<String, Object> context) {
    CompleteDSL.PrimitiveAspectPrimitiveAspectProperties _self_ = CompleteDSL.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     CompleteDSL.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ForwardAspectForwardAspectProperties _self_, final Forward _self, final Hashtable<String, Object> context) {
    Expression _steps = _self.getSteps();
    Object _eval = BlockAspect.eval( _steps,context);
    int param = ((Integer) _eval).intValue();
    InputOutput.<String>println(("FORWARD " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).forward(param);
  }
}
