package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import kmLogo.Expression;
import kmLogo.VarDeclaration;
import logo.ExpressionAspect;
import logo.InstructionAspect;
import logo.VarDeclarationAspectVarDeclarationAspectProperties;

@Aspect(className = VarDeclaration.class)
@SuppressWarnings("all")
public class VarDeclarationAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final VarDeclaration _self, final Hashtable<String, Object> context) {
    logo.VarDeclarationAspectVarDeclarationAspectProperties _self_ = logo.VarDeclarationAspectVarDeclarationAspectContext.getSelf(_self);
     if (_self instanceof kmLogo.VarDeclaration){
     logo.VarDeclarationAspect._privk3_eval(_self_, (kmLogo.VarDeclaration)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final VarDeclaration _self, final Hashtable<String, Object> context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
     logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final VarDeclarationAspectVarDeclarationAspectProperties _self_, final VarDeclaration _self, final Hashtable<String, Object> context) {
    String _key = _self.getKey();
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    context.put(_key, _eval);
  }
}
