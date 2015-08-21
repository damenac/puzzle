package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.PenUp;
import logo.Context;
import logo.PenUpAspectPenUpAspectProperties;
import logo.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenUp.class)
@SuppressWarnings("all")
public class PenUpAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenUp _self, final Context context) {
    logo.PenUpAspectPenUpAspectProperties _self_ = logo.PenUpAspectPenUpAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.PenUp){
    result = logo.PenUpAspect._privk3_eval(_self_, (kmLogo.PenUp)_self,context);
    } else  if (_self instanceof kmLogo.Primitive){
    result = logo.PrimitiveAspect.eval((kmLogo.Primitive)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final PenUp _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PenUpAspectPenUpAspectProperties _self_, final PenUp _self, final Context context) {
    InputOutput.<String>println("PENUP");
    context.turtle.setPenUp(true);
    return 0;
  }
}
