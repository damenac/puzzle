package CompleteDSL;

import CompleteDSLPckg.Assignation;
import CompleteDSLPckg.Expression;
import CompleteDSLPckg.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.AssignationAspectAssignationAspectProperties;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect {
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    CompleteDSL.AssignationAspectAssignationAspectProperties _self_ = CompleteDSL.AssignationAspectAssignationAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    Object _get = context.get("variables");
    Hashtable<String, Object> variablesTable = ((Hashtable<String, Object>) _get);
    VarDecl _ref = _self.getRef();
    String _name = _ref.getName();
    Expression _expr = _self.getExpr();
    Object _eval = BlockAspect.eval( _expr,context);
    variablesTable.put(_name, _eval);
  }
}
