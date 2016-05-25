package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Assignation;
import actionscripting.Expression;
import actionscripting.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.AssignationAspectAssignationAspectProperties;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect;
import java.util.Hashtable;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.AssignationAspectAssignationAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.AssignationAspectAssignationAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    VarDecl _varRef = _self.getVarRef();
    String _name = _varRef.getName();
    Expression _expression = _self.getExpression();
    Object _eval = _expression.eval(context);
    context.put(_name, _eval);
  }
}
