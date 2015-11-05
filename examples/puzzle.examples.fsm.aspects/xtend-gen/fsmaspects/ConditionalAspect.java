package fsmaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.Conditional;
import fsm.Expression;
import fsm.Program;
import fsm.RelationalExpression;
import fsmaspects.ConditionalAspectConditionalAspectProperties;
import fsmaspects.ExpressionAspect;
import fsmaspects.ProgramAspect;
import fsmaspects.StatementAspect;
import java.util.Hashtable;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    fsmaspects.ConditionalAspectConditionalAspectProperties _self_ = fsmaspects.ConditionalAspectConditionalAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self, final Hashtable<String, Object> context) {
    Expression _condition = _self.getCondition();
    Object _eval = ExpressionAspect.eval(((RelationalExpression) _condition), context);
    if ((((Boolean) _eval)).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
