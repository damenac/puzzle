package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Expression;
import actionscripting.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarDeclAspectVarDeclAspectProperties;
import java.util.Hashtable;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final VarDecl _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarDeclAspectVarDeclAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarDeclAspectVarDeclAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    String _name = _self.getName();
    Expression _expr = _self.getExpr();
    Object _eval = _expr.eval(context);
    context.put(_name, _eval);
  }
}
