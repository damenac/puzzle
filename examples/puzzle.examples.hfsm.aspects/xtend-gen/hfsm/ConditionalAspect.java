package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.Conditional;
import hfsm.ConditionalAspectConditionalAspectProperties;
import hfsm.Expression;
import hfsm.ExpressionAspect;
import hfsm.Program;
import hfsm.ProgramAspect;
import hfsm.RelationalExpression;
import hfsm.StatementAspect;
import java.util.Hashtable;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    hfsm.ConditionalAspectConditionalAspectProperties _self_ = hfsm.ConditionalAspectConditionalAspectContext.getSelf(_self);
     if (_self instanceof hfsm.Conditional){
     hfsm.ConditionalAspect._privk3_eval(_self_, (hfsm.Conditional)_self,context);
    } else  if (_self instanceof hfsm.Statement){
     hfsm.StatementAspect.eval((hfsm.Statement)_self,context);
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
