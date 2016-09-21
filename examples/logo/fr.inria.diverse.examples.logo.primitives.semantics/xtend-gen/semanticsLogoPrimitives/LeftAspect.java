package semanticsLogoPrimitives;

import Primitives.Expression;
import Primitives.Left;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogoPrimitives.LeftAspectLeftAspectProperties;
import semanticsLogoPrimitives.PrimitiveAspect;
import semanticsLogoPrimitives.Turtle;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void evalInstruction(final Left _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.LeftAspectLeftAspectProperties _self_ = semanticsLogoPrimitives.LeftAspectLeftAspectContext.getSelf(_self);
     if (_self instanceof Primitives.Left){
     semanticsLogoPrimitives.LeftAspect._privk3_evalInstruction(_self_, (Primitives.Left)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalInstruction(final Left _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogoPrimitives.PrimitiveAspect._privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final LeftAspectLeftAspectProperties _self_, final Left _self, final Hashtable<String, Object> context) {
    Expression _angle = _self.getAngle();
    Object _eval = _angle.eval(context);
    int _intValue = ((Integer) _eval).intValue();
    int param = ((-1) * _intValue);
    InputOutput.<String>println(("LEFT " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).rotate(param);
  }
}
