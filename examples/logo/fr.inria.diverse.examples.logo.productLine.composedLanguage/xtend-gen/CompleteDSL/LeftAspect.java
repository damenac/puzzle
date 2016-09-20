package CompleteDSL;

import CompleteDSLPckg.Expression;
import CompleteDSLPckg.Left;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.LeftAspectLeftAspectProperties;
import CompleteDSL.PrimitiveAspect;
import CompleteDSL.Turtle;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static void eval(final Left _self, final Hashtable<String, Object> context) {
    CompleteDSL.LeftAspectLeftAspectProperties _self_ = CompleteDSL.LeftAspectLeftAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Left){
     CompleteDSL.LeftAspect._privk3_eval(_self_, (CompleteDSLPckg.Left)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Left _self, final Hashtable<String, Object> context) {
    CompleteDSL.PrimitiveAspectPrimitiveAspectProperties _self_ = CompleteDSL.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     CompleteDSL.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final LeftAspectLeftAspectProperties _self_, final Left _self, final Hashtable<String, Object> context) {
    Expression _angle = _self.getAngle();
    Object _eval = BlockAspect.eval( _angle,context);
    int _intValue = ((Integer) _eval).intValue();
    int param = ((-1) * _intValue);
    InputOutput.<String>println(("LEFT " + Integer.valueOf(param)));
    Object _get = context.get("turtle");
    ((Turtle) _get).rotate(param);
  }
}
