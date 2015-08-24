package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.Conditional;
import tfsm.ConditionalAspectConditionalAspectProperties;
import tfsm.Expression;
import tfsm.ExpressionAspect;
import tfsm.Program;
import tfsm.ProgramAspect;
import tfsm.RelationalExpression;
import tfsm.StatementAspect;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    tfsm.ConditionalAspectConditionalAspectProperties _self_ = tfsm.ConditionalAspectConditionalAspectContext.getSelf(_self);
     if (_self instanceof tfsm.Conditional){
     tfsm.ConditionalAspect._privk3_eval(_self_, (tfsm.Conditional)_self,context);
    } else  if (_self instanceof tfsm.Statement){
     tfsm.StatementAspect.eval((tfsm.Statement)_self,context);
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
