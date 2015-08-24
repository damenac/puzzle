package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import kmLogo.Expression;
import kmLogo.Lower;
import logo.BinaryExpAspect;
import logo.Context;
import logo.ExpressionAspect;
import logo.LowerAspectLowerAspectProperties;

@Aspect(className = Lower.class)
@SuppressWarnings("all")
public class LowerAspect extends BinaryExpAspect {
  public static int eval(final Lower _self, final Context context) {
    logo.LowerAspectLowerAspectProperties _self_ = logo.LowerAspectLowerAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Lower){
    result = logo.LowerAspect._privk3_eval(_self_, (kmLogo.Lower)_self,context);
    } else  if (_self instanceof kmLogo.BinaryExp){
    result = logo.BinaryExpAspect.eval((kmLogo.BinaryExp)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  protected static int _privk3_eval(final LowerAspectLowerAspectProperties _self_, final Lower _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    boolean _lessThan = (_eval < _eval_1);
    if (_lessThan) {
      return 1;
    } else {
      return 0;
    }
  }
}
