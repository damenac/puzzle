package semanticsLogoPrimitives;

import Primitives.Expression;
import Primitives.Right;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogoPrimitives.PrimitiveAspect;
import semanticsLogoPrimitives.RightAspectRightAspectProperties;
import semanticsLogoPrimitives.Turtle;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void evalInstruction(final Right _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.RightAspectRightAspectProperties _self_ = semanticsLogoPrimitives.RightAspectRightAspectContext.getSelf(_self);
    _privk3_evalInstruction(_self_, _self,context);
  }
  
  private static void super_evalInstruction(final Right _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     semanticsLogoPrimitives.PrimitiveAspect._privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final RightAspectRightAspectProperties _self_, final Right _self, final Hashtable<String, Object> context) {
    Expression _angle = _self.getAngle();
    Object _eval = _angle.eval(context);
    int param = ((Integer) _eval).intValue();
    InputOutput.<String>println(("RIGHT " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).rotate(param);
  }
}
