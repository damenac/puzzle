package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Block;
import kmLogo.While;
import logo.BlockAspect;
import logo.Context;
import logo.ControlStructureAspect;
import logo.ExpressionAspect;
import logo.WhileAspectWhileAspectProperties;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final While _self, final Context context) {
    logo.WhileAspectWhileAspectProperties _self_ = logo.WhileAspectWhileAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.While){
    result = logo.WhileAspect._privk3_eval(_self_, (kmLogo.While)_self,context);
    } else  if (_self instanceof kmLogo.ControlStructure){
    result = logo.ControlStructureAspect.eval((kmLogo.ControlStructure)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final While _self, final Context context) {
    logo.ControlStructureAspectControlStructureAspectProperties _self_ = logo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    return  logo.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final WhileAspectWhileAspectProperties _self_, final While _self, final Context context) {
    while (((((Integer) ExpressionAspect.eval(_self.getCondition(), context))).intValue() > 0)) {
      Block _block = _self.getBlock();
      BlockAspect.eval(_block, context);
    }
    return 0;
  }
}
