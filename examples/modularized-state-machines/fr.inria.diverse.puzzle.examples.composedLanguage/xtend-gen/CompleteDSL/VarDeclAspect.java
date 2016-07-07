package CompleteDSL;

import CompleteDSLPckg.Expression;
import CompleteDSLPckg.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.StatementAspect;
import CompleteDSL.VarDeclAspectVarDeclAspectProperties;
import java.util.Hashtable;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void evalStatement(final VarDecl _self, final Hashtable<String, Object> context) {
    CompleteDSL.VarDeclAspectVarDeclAspectProperties _self_ = CompleteDSL.VarDeclAspectVarDeclAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.VarDecl){
     CompleteDSL.VarDeclAspect._privk3_evalStatement(_self_, (CompleteDSLPckg.VarDecl)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalStatement(final VarDecl _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
     CompleteDSL.StatementAspect._privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    String _name = _self.getName();
    Expression _expr = _self.getExpr();
    Object _eval = ExpressionAspect.eval( _expr,context);
    context.put(_name, _eval);
  }
}
