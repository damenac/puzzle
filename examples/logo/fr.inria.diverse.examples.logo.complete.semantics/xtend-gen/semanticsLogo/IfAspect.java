package semanticsLogo;

import Logo.Block;
import Logo.Expression;
import Logo.If;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.BlockAspect;
import semanticsLogo.ControlStructureAspect;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.IfAspectIfAspectProperties;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final If _self, final Hashtable<String, Object> context) {
    semanticsLogo.IfAspectIfAspectProperties _self_ = semanticsLogo.IfAspectIfAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final If _self, final Hashtable<String, Object> context) {
    semanticsLogo.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     semanticsLogo.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final IfAspectIfAspectProperties _self_, final If _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("");
    Expression _condition = _self.getCondition();
    Object _eval = ExpressionAspect.eval(_condition, context);
    Boolean condition = ((Boolean) _eval);
    if ((condition).booleanValue()) {
      Block _body = _self.getBody();
      BlockAspect.eval(_body, context);
    }
  }
}
