package flowchart;

import flowchart.AssignationAspectAssignationAspectProperties;
import flowchart.ExpressionAspect;
import flowchart.StatementAspect;
import flowchartpck.Assignation;
import flowchartpck.Expression;
import flowchartpck.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    flowchart.AssignationAspectAssignationAspectProperties _self_ = flowchart.AssignationAspectAssignationAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    VarDecl _varRef = _self.getVarRef();
    String _name = _varRef.getName();
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    context.put(_name, _eval);
  }
}
