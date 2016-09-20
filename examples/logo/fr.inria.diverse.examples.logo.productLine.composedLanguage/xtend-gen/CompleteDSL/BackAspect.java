package CompleteDSL;

import CompleteDSLPckg.Back;
import CompleteDSLPckg.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.BackAspectBackAspectProperties;
import CompleteDSL.PrimitiveAspect;
import CompleteDSL.Turtle;

@Aspect(className = Back.class)
@SuppressWarnings("all")
public class BackAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Back _self, final Hashtable<String, Object> context) {
    CompleteDSL.BackAspectBackAspectProperties _self_ = CompleteDSL.BackAspectBackAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Back){
     CompleteDSL.BackAspect._privk3_eval(_self_, (CompleteDSLPckg.Back)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Back _self, final Hashtable<String, Object> context) {
    CompleteDSL.PrimitiveAspectPrimitiveAspectProperties _self_ = CompleteDSL.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     CompleteDSL.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final BackAspectBackAspectProperties _self_, final Back _self, final Hashtable<String, Object> context) {
    Expression _steps = _self.getSteps();
    Object _eval = BlockAspect.eval( _steps,context);
    int _intValue = ((Integer) _eval).intValue();
    int param = ((-1) * _intValue);
    InputOutput.<String>println(("BACK " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).forward(param);
  }
}
