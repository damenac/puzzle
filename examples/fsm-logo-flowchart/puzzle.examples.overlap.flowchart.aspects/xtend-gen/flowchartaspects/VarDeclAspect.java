package flowchartaspects;

import flowchartaspects.ExpressionAspect;
import flowchartaspects.StatementAspect;
import flowchartaspects.VarDeclAspectVarDeclAspectProperties;
import flowchartpck.Expression;
import flowchartpck.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final VarDecl _self, final Hashtable<String, Object> context) {
    flowchartaspects.VarDeclAspectVarDeclAspectProperties _self_ = flowchartaspects.VarDeclAspectVarDeclAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.VarDecl){
     flowchartaspects.VarDeclAspect._privk3_eval(_self_, (flowchartpck.VarDecl)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final VarDecl _self, final Hashtable<String, Object> context) {
    flowchartaspects.StatementAspectStatementAspectProperties _self_ = flowchartaspects.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartaspects.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    String _key = _self.getKey();
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    context.put(_key, _eval);
  }
}
