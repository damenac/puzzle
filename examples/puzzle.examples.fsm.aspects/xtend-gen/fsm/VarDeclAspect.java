package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.Expression;
import fsm.ExpressionAspect;
import fsm.StatementAspect;
import fsm.VarDecl;
import fsm.VarDeclAspectVarDeclAspectProperties;
import java.util.Hashtable;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final VarDecl _self, final Hashtable<String, Object> context) {
    fsm.VarDeclAspectVarDeclAspectProperties _self_ = fsm.VarDeclAspectVarDeclAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    String _name = _self.getName();
    Expression _expr = _self.getExpr();
    Object _eval = ExpressionAspect.eval(_expr, context);
    context.put(_name, _eval);
  }
}
