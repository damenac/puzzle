package semanticsLogoVariables;

import Variables.Expression;
import Variables.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoVariables.VarDeclAspectVarDeclAspectProperties;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect {
  public static void evalInstruction(final VarDecl _self, final Hashtable<String, Object> context) {
    semanticsLogoVariables.VarDeclAspectVarDeclAspectProperties _self_ = semanticsLogoVariables.VarDeclAspectVarDeclAspectContext.getSelf(_self);
    _privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    Object _get = context.get("variables");
    Hashtable<String, Object> variablesTable = ((Hashtable<String, Object>) _get);
    String _name = _self.getName();
    Expression _expr = _self.getExpr();
    Object _eval = _expr.eval(context);
    variablesTable.put(_name, _eval);
  }
}
