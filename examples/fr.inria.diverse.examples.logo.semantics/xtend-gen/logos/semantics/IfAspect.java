package logos.semantics;

import Logo.Block;
import Logo.Expression;
import Logo.If;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.ControlStructureAspect;
import logos.semantics.IfAspectIfAspectProperties;
import logos.semantics.InstructionAspect;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final If _self, final Context context) {
    logos.semantics.IfAspectIfAspectProperties _self_ = logos.semantics.IfAspectIfAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final If _self, final Context context) {
    logos.semantics.ControlStructureAspectControlStructureAspectProperties _self_ = logos.semantics.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    return  logos.semantics.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final IfAspectIfAspectProperties _self_, final If _self, final Context context) {
    Expression _condition = _self.getCondition();
    Object _eval = _condition.eval(context);
    boolean _notEquals = (!Objects.equal(_eval, Integer.valueOf(0)));
    if (_notEquals) {
      Block _thenPart = _self.getThenPart();
      return InstructionAspect.eval(_thenPart, context);
    } else {
      Block _elsePart = _self.getElsePart();
      return InstructionAspect.eval(_elsePart, context);
    }
  }
}
