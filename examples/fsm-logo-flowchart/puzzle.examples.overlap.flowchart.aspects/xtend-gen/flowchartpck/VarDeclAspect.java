package flowchartpck;

import flowchartpck.Expression;
import flowchartpck.ExpressionAspect;
import flowchartpck.StatementAspect;
import flowchartpck.VarDecl;
import flowchartpck.VarDeclAspectVarDeclAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final VarDecl _self, final Hashtable<String, Object> context) {
    flowchartpck.VarDeclAspectVarDeclAspectProperties _self_ = flowchartpck.VarDeclAspectVarDeclAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final VarDecl _self, final Hashtable<String, Object> context) {
    flowchartpck.StatementAspectStatementAspectProperties _self_ = flowchartpck.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartpck.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    String _name = _self.getName();
    Expression _expr = _self.getExpr();
    Object _eval = ExpressionAspect.eval(_expr, context);
    context.put(_name, _eval);
  }
}
