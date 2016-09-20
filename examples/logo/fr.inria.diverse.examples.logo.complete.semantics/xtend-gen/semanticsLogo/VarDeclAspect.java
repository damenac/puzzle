package semanticsLogo;

import Logo.Expression;
import Logo.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.InstructionAspect;
import semanticsLogo.VarDeclAspectVarDeclAspectProperties;

@Aspect(className = VarDecl.class)
@SuppressWarnings("all")
public class VarDeclAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final VarDecl _self, final Hashtable<String, Object> context) {
    semanticsLogo.VarDeclAspectVarDeclAspectProperties _self_ = semanticsLogo.VarDeclAspectVarDeclAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final VarDecl _self, final Hashtable<String, Object> context) {
    semanticsLogo.InstructionAspectInstructionAspectProperties _self_ = semanticsLogo.InstructionAspectInstructionAspectContext.getSelf(_self);
     semanticsLogo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final VarDeclAspectVarDeclAspectProperties _self_, final VarDecl _self, final Hashtable<String, Object> context) {
    String _name = _self.getName();
    Expression _expr = _self.getExpr();
    Object _eval = ExpressionAspect.eval(_expr, context);
    context.put(_name, _eval);
  }
}
