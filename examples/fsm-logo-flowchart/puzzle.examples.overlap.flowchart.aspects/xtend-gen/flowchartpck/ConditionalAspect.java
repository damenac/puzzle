package flowchartpck;

import flowchartpck.Conditional;
import flowchartpck.ConditionalAspectConditionalAspectProperties;
import flowchartpck.Expression;
import flowchartpck.ExpressionAspect;
import flowchartpck.Program;
import flowchartpck.ProgramAspect;
import flowchartpck.StatementAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    flowchartpck.ConditionalAspectConditionalAspectProperties _self_ = flowchartpck.ConditionalAspectConditionalAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Conditional _self, final Hashtable<String, Object> context) {
    flowchartpck.StatementAspectStatementAspectProperties _self_ = flowchartpck.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartpck.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self, final Hashtable<String, Object> context) {
    Expression _condition = _self.getCondition();
    Object _eval = ExpressionAspect.eval(_condition, context);
    if ((((Boolean) _eval)).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
