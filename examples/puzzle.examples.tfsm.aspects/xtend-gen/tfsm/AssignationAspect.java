package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.Assignation;
import tfsm.AssignationAspectAssignationAspectProperties;
import tfsm.Expression;
import tfsm.ExpressionAspect;
import tfsm.StatementAspect;
import tfsm.VarDecl;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    tfsm.AssignationAspectAssignationAspectProperties _self_ = tfsm.AssignationAspectAssignationAspectContext.getSelf(_self);
     if (_self instanceof tfsm.Assignation){
     tfsm.AssignationAspect._privk3_eval(_self_, (tfsm.Assignation)_self,context);
    } else  if (_self instanceof tfsm.Statement){
     tfsm.StatementAspect.eval((tfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    VarDecl _varRef = _self.getVarRef();
    String _name = _varRef.getName();
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    context.put(_name, _eval);
  }
}
