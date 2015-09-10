package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Primitive;
import logo.Context;
import logo.InstructionAspect;
import logo.PrimitiveAspectPrimitiveAspectProperties;

@Aspect(className = Primitive.class)
@SuppressWarnings("all")
public class PrimitiveAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final Primitive _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.PenDown){
    result = logo.PenDownAspect.eval((kmLogo.PenDown)_self,context);
    } else  if (_self instanceof kmLogo.Right){
    result = logo.RightAspect.eval((kmLogo.Right)_self,context);
    } else  if (_self instanceof kmLogo.Clear){
    result = logo.ClearAspect.eval((kmLogo.Clear)_self,context);
    } else  if (_self instanceof kmLogo.Back){
    result = logo.BackAspect.eval((kmLogo.Back)_self,context);
    } else  if (_self instanceof kmLogo.Forward){
    result = logo.ForwardAspect.eval((kmLogo.Forward)_self,context);
    } else  if (_self instanceof kmLogo.Left){
    result = logo.LeftAspect.eval((kmLogo.Left)_self,context);
    } else  if (_self instanceof kmLogo.PenUp){
    result = logo.PenUpAspect.eval((kmLogo.PenUp)_self,context);
    } else  if (_self instanceof kmLogo.Primitive){
    result = logo.PrimitiveAspect._privk3_eval(_self_, (kmLogo.Primitive)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Primitive _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PrimitiveAspectPrimitiveAspectProperties _self_, final Primitive _self, final Context context) {
    return 0;
  }
}
