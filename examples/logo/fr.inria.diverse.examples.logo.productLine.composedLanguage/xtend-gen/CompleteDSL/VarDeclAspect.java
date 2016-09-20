package CompleteDSL;

import CompleteDSLPckg.Expression;
import CompleteDSLPckg.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.VarDeclAspectVarDeclAspectProperties;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect {
  public static void eval(final VarDecl _self, final Hashtable<String, Object> context) {
    CompleteDSL.VarDeclAspectVarDeclAspectProperties _self_ = CompleteDSL.VarDeclAspectVarDeclAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    Object _get = context.get("variables");
    Hashtable<String, Object> variablesTable = ((Hashtable<String, Object>) _get);
    String _name = _self.getName();
    Expression _expr = _self.getExpr();
    Object _eval = BlockAspect.eval( _expr,context);
    variablesTable.put(_name, _eval);
  }
}
