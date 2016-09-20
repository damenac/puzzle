package CompleteDSL;

import CompleteDSLPckg.Block;
import CompleteDSLPckg.Expression;
import CompleteDSLPckg.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.ControlStructureAspect;
import CompleteDSL.WhileAspectWhileAspectProperties;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final While _self, final Hashtable<String, Object> context) {
    CompleteDSL.WhileAspectWhileAspectProperties _self_ = CompleteDSL.WhileAspectWhileAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final While _self, final Hashtable<String, Object> context) {
    CompleteDSL.ControlStructureAspectControlStructureAspectProperties _self_ = CompleteDSL.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     CompleteDSL.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final WhileAspectWhileAspectProperties _self_, final While _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("");
    Expression _guard = _self.getGuard();
    Object _eval = BlockAspect.eval( _guard,context);
    Boolean condition = ((Boolean) _eval);
    while ((condition).booleanValue()) {
      {
        Block _body = _self.getBody();
        BlockAspect.eval( _body,context);
        Expression _guard_1 = _self.getGuard();
        Object _eval_1 = BlockAspect.eval( _guard_1,context);
        condition = ((Boolean) _eval_1);
      }
    }
  }
}
