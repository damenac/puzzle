package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Block;
import kmLogo.Expression;
import kmLogo.Repeat;
import logo.BlockAspect;
import logo.Context;
import logo.ControlStructureAspect;
import logo.ExpressionAspect;
import logo.RepeatAspectRepeatAspectProperties;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class RepeatAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final Repeat _self, final Context context) {
    logo.RepeatAspectRepeatAspectProperties _self_ = logo.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Repeat _self, final Context context) {
    logo.ControlStructureAspectControlStructureAspectProperties _self_ = logo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    return  logo.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final Context context) {
    Expression _condition = _self.getCondition();
    Object _eval = ExpressionAspect.eval(_condition, context);
    int time = (((Integer) _eval)).intValue();
    while ((time > 0)) {
      {
        Block _block = _self.getBlock();
        BlockAspect.eval(_block, context);
        time = (time - 1);
      }
    }
    return 0;
  }
}
