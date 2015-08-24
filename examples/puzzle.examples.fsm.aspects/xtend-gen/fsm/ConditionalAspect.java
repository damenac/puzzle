package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.Conditional;
import fsm.ConditionalAspectConditionalAspectProperties;
import fsm.Expression;
import fsm.ExpressionAspect;
import fsm.Program;
import fsm.ProgramAspect;
import fsm.RelationalExpression;
import fsm.StatementAspect;
import java.util.Hashtable;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    fsm.ConditionalAspectConditionalAspectProperties _self_ = fsm.ConditionalAspectConditionalAspectContext.getSelf(_self);
     if (_self instanceof fsm.Conditional){
     fsm.ConditionalAspect._privk3_eval(_self_, (fsm.Conditional)_self,context);
    } else  if (_self instanceof fsm.Statement){
     fsm.StatementAspect.eval((fsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
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
