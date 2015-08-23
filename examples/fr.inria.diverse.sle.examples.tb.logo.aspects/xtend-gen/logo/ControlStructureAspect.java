package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.ControlStructure;
import logo.Context;
import logo.ControlStructureAspectControlStructureAspectProperties;
import logo.InstructionAspect;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final ControlStructure _self, final Context context) {
    logo.ControlStructureAspectControlStructureAspectProperties _self_ = logo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.If){
    result = logo.IfAspect.eval((kmLogo.If)_self,context);
    } else  if (_self instanceof kmLogo.Repeat){
    result = logo.RepeatAspect.eval((kmLogo.Repeat)_self,context);
    } else  if (_self instanceof kmLogo.While){
    result = logo.WhileAspect.eval((kmLogo.While)_self,context);
    } else  if (_self instanceof kmLogo.ControlStructure){
    result = logo.ControlStructureAspect._privk3_eval(_self_, (kmLogo.ControlStructure)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final ControlStructure _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Context context) {
    return 0;
  }
}
