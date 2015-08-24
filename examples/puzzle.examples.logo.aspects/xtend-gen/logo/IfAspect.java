package logo;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Block;
import kmLogo.Expression;
import kmLogo.If;
import logo.BlockAspect;
import logo.Context;
import logo.ControlStructureAspect;
import logo.ExpressionAspect;
import logo.IfAspectIfAspectProperties;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final If _self, final Context context) {
    logo.IfAspectIfAspectProperties _self_ = logo.IfAspectIfAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.If){
    result = logo.IfAspect._privk3_eval(_self_, (kmLogo.If)_self,context);
    } else  if (_self instanceof kmLogo.ControlStructure){
    result = logo.ControlStructureAspect.eval((kmLogo.ControlStructure)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final If _self, final Context context) {
    logo.ControlStructureAspectControlStructureAspectProperties _self_ = logo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    return  logo.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final IfAspectIfAspectProperties _self_, final If _self, final Context context) {
    Expression _condition = _self.getCondition();
    Object _eval = ExpressionAspect.eval(_condition, context);
    boolean _notEquals = (!Objects.equal(_eval, Integer.valueOf(0)));
    if (_notEquals) {
      Block _thenPart = _self.getThenPart();
      return BlockAspect.eval(_thenPart, context);
    } else {
      Block _elsePart = _self.getElsePart();
      return BlockAspect.eval(_elsePart, context);
    }
  }
}
