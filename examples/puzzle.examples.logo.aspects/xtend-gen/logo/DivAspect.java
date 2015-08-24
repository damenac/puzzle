package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Div;
import kmLogo.Expression;
import logo.BinaryExpAspect;
import logo.Context;
import logo.DivAspectDivAspectProperties;
import logo.ExpressionAspect;

@Aspect(className = Div.class)
@SuppressWarnings("all")
public class DivAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Div _self, final Context context) {
    logo.DivAspectDivAspectProperties _self_ = logo.DivAspectDivAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Div){
    result = logo.DivAspect._privk3_eval(_self_, (kmLogo.Div)_self,context);
    } else  if (_self instanceof kmLogo.BinaryExp){
    result = logo.BinaryExpAspect.eval((kmLogo.BinaryExp)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Div _self, final Context context) {
    logo.BinaryExpAspectBinaryExpAspectProperties _self_ = logo.BinaryExpAspectBinaryExpAspectContext.getSelf(_self);
    return  logo.BinaryExpAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final DivAspectDivAspectProperties _self_, final Div _self, final Context context) {
    Expression _rhs = _self.getRhs();
    int _eval = ExpressionAspect.eval(_rhs, context);
    boolean _notEquals = (_eval != 0);
    if (_notEquals) {
      Expression _lhs = _self.getLhs();
      int _eval_1 = ExpressionAspect.eval(_lhs, context);
      Expression _rhs_1 = _self.getRhs();
      int _eval_2 = ExpressionAspect.eval(_rhs_1, context);
      return (_eval_1 / _eval_2);
    } else {
      return 0;
    }
  }
}
