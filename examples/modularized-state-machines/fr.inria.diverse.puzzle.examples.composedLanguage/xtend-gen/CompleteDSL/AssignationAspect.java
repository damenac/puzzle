package CompleteDSL;

import CompleteDSLPckg.Assignation;
import CompleteDSLPckg.Expression;
import CompleteDSLPckg.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.AssignationAspectAssignationAspectProperties;
import CompleteDSL.StatementAspect;
import java.util.Hashtable;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void evalStatement(final Assignation _self, final Hashtable<String, Object> context) {
    CompleteDSL.AssignationAspectAssignationAspectProperties _self_ = CompleteDSL.AssignationAspectAssignationAspectContext.getSelf(_self);
    _privk3_evalStatement(_self_, _self,context);
  }
  
  private static void super_evalStatement(final Assignation _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
     CompleteDSL.StatementAspect._privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    VarDecl _varRef = _self.getVarRef();
    String _name = _varRef.getName();
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval( _expression,context);
    context.put(_name, _eval);
  }
}
