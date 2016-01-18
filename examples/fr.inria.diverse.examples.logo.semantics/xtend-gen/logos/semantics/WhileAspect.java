package logos.semantics;

import Logo.Block;
import Logo.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.ControlStructureAspect;
import logos.semantics.InstructionAspect;
import logos.semantics.WhileAspectWhileAspectProperties;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final While _self, final Context context) {
    logos.semantics.WhileAspectWhileAspectProperties _self_ = logos.semantics.WhileAspectWhileAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final While _self, final Context context) {
    logos.semantics.ControlStructureAspectControlStructureAspectProperties _self_ = logos.semantics.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    return  logos.semantics.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final WhileAspectWhileAspectProperties _self_, final While _self, final Context context) {
    while (((((Integer) _self.getCondition().eval(context))).intValue() > 0)) {
      Block _block = _self.getBlock();
      InstructionAspect.eval(_block, context);
    }
    return 0;
  }
}
