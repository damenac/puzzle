package semanticsLogo;

import Logo.Block;
import Logo.Expression;
import Logo.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.BlockAspect;
import semanticsLogo.ControlStructureAspect;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.WhileAspectWhileAspectProperties;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final While _self, final Hashtable<String, Object> context) {
    semanticsLogo.WhileAspectWhileAspectProperties _self_ = semanticsLogo.WhileAspectWhileAspectContext.getSelf(_self);
     if (_self instanceof Logo.While){
     semanticsLogo.WhileAspect._privk3_eval(_self_, (Logo.While)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final While _self, final Hashtable<String, Object> context) {
    semanticsLogo.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     semanticsLogo.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final WhileAspectWhileAspectProperties _self_, final While _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("");
    Expression _guard = _self.getGuard();
    Object _eval = ExpressionAspect.eval(_guard, context);
    Boolean condition = ((Boolean) _eval);
    while ((condition).booleanValue()) {
      {
        Block _body = _self.getBody();
        BlockAspect.eval(_body, context);
        Expression _guard_1 = _self.getGuard();
        Object _eval_1 = ExpressionAspect.eval(_guard_1, context);
        condition = ((Boolean) _eval_1);
      }
    }
  }
}
