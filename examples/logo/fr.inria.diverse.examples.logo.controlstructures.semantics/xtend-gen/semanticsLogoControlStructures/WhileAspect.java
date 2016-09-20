package semanticsLogoControlStructures;

import ControlStructures.Block;
import ControlStructures.Expression;
import ControlStructures.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogoControlStructures.ControlStructureAspect;
import semanticsLogoControlStructures.WhileAspectWhileAspectProperties;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final While _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.WhileAspectWhileAspectProperties _self_ = semanticsLogoControlStructures.WhileAspectWhileAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final While _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     semanticsLogoControlStructures.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final WhileAspectWhileAspectProperties _self_, final While _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("");
    Expression _guard = _self.getGuard();
    Object _eval = _guard.eval(context);
    Boolean condition = ((Boolean) _eval);
    while ((condition).booleanValue()) {
      {
        Block _body = _self.getBody();
        _body.eval(context);
        Expression _guard_1 = _self.getGuard();
        Object _eval_1 = _guard_1.eval(context);
        condition = ((Boolean) _eval_1);
      }
    }
  }
}
