package Logo.logoprogram;

import Logo.Block;
import Logo.While;
import Logo.logoprogram.Context;
import Logo.logoprogram.ControlStructureAspect;
import Logo.logoprogram.InstructionAspect;
import Logo.logoprogram.WhileAspectWhileAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final While _self, final Context context) {
    Logo.logoprogram.WhileAspectWhileAspectProperties _self_ = Logo.logoprogram.WhileAspectWhileAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final While _self, final Context context) {
    Logo.logoprogram.ControlStructureAspectControlStructureAspectProperties _self_ = Logo.logoprogram.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    return  Logo.logoprogram.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final WhileAspectWhileAspectProperties _self_, final While _self, final Context context) {
    while (((((Integer) _self.getCondition().eval(context))).intValue() > 0)) {
      Block _block = _self.getBlock();
      InstructionAspect.eval(_block, context);
    }
    return 0;
  }
}
