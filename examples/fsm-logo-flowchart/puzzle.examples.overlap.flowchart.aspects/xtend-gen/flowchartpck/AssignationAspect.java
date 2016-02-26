package flowchartpck;

import flowchartpck.Assignation;
import flowchartpck.AssignationAspectAssignationAspectProperties;
import flowchartpck.Expression;
import flowchartpck.ExpressionAspect;
import flowchartpck.StatementAspect;
import flowchartpck.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    flowchartpck.AssignationAspectAssignationAspectProperties _self_ = flowchartpck.AssignationAspectAssignationAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Assignation _self, final Hashtable<String, Object> context) {
    flowchartpck.StatementAspectStatementAspectProperties _self_ = flowchartpck.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartpck.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    VarDecl _varRef = _self.getVarRef();
    String _name = _varRef.getName();
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    context.put(_name, _eval);
  }
}
