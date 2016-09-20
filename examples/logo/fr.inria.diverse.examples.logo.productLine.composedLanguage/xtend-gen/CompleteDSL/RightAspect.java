package CompleteDSL;

import CompleteDSLPckg.Expression;
import CompleteDSLPckg.Right;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.PrimitiveAspect;
import CompleteDSL.RightAspectRightAspectProperties;
import CompleteDSL.Turtle;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Right _self, final Hashtable<String, Object> context) {
    CompleteDSL.RightAspectRightAspectProperties _self_ = CompleteDSL.RightAspectRightAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Right _self, final Hashtable<String, Object> context) {
    CompleteDSL.PrimitiveAspectPrimitiveAspectProperties _self_ = CompleteDSL.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     CompleteDSL.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final RightAspectRightAspectProperties _self_, final Right _self, final Hashtable<String, Object> context) {
    Expression _angle = _self.getAngle();
    Object _eval = ExpressionAspect.eval( _angle,context);
    int param = ((Integer) _eval).intValue();
    InputOutput.<String>println(("RIGHT " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).rotate(param);
  }
}
