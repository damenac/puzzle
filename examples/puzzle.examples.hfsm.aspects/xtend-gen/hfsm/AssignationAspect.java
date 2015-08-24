package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.Assignation;
import hfsm.AssignationAspectAssignationAspectProperties;
import hfsm.Expression;
import hfsm.ExpressionAspect;
import hfsm.StatementAspect;
import hfsm.VarDecl;
import java.util.Hashtable;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    hfsm.AssignationAspectAssignationAspectProperties _self_ = hfsm.AssignationAspectAssignationAspectContext.getSelf(_self);
     if (_self instanceof hfsm.Assignation){
     hfsm.AssignationAspect._privk3_eval(_self_, (hfsm.Assignation)_self,context);
    } else  if (_self instanceof hfsm.Statement){
     hfsm.StatementAspect.eval((hfsm.Statement)_self,context);
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
