package semanticsLogo;

import Logo.Assignation;
import Logo.Expression;
import Logo.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.AssignationAspectAssignationAspectProperties;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.InstructionAspect;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    semanticsLogo.AssignationAspectAssignationAspectProperties _self_ = semanticsLogo.AssignationAspectAssignationAspectContext.getSelf(_self);
     if (_self instanceof Logo.Assignation){
     semanticsLogo.AssignationAspect._privk3_eval(_self_, (Logo.Assignation)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Assignation _self, final Hashtable<String, Object> context) {
    semanticsLogo.InstructionAspectInstructionAspectProperties _self_ = semanticsLogo.InstructionAspectInstructionAspectContext.getSelf(_self);
     semanticsLogo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    Object _get = context.get("variables");
    Hashtable<String, Object> variablesTable = ((Hashtable<String, Object>) _get);
    VarDecl _ref = _self.getRef();
    String _name = _ref.getName();
    Expression _expr = _self.getExpr();
    Object _eval = ExpressionAspect.eval(_expr, context);
    variablesTable.put(_name, _eval);
  }
}
