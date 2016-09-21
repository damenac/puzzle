package semanticsLogoPrimitives;

import Primitives.Back;
import Primitives.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogoPrimitives.BackAspectBackAspectProperties;
import semanticsLogoPrimitives.PrimitiveAspect;
import semanticsLogoPrimitives.Turtle;

@Aspect(className = Back.class)
@SuppressWarnings("all")
public class BackAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void evalInstruction(final Back _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.BackAspectBackAspectProperties _self_ = semanticsLogoPrimitives.BackAspectBackAspectContext.getSelf(_self);
     if (_self instanceof Primitives.Back){
     semanticsLogoPrimitives.BackAspect._privk3_evalInstruction(_self_, (Primitives.Back)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalInstruction(final Back _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogoPrimitives.PrimitiveAspect._privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final BackAspectBackAspectProperties _self_, final Back _self, final Hashtable<String, Object> context) {
    Expression _steps = _self.getSteps();
    Object _eval = _steps.eval(context);
    int _intValue = ((Integer) _eval).intValue();
    int param = ((-1) * _intValue);
    InputOutput.<String>println(("BACK " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).forward(param);
  }
}
