package CompleteDSL;

import CompleteDSLPckg.Block;
import CompleteDSLPckg.Expression;
import CompleteDSLPckg.If;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.ControlStructureAspect;
import CompleteDSL.IfAspectIfAspectProperties;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final If _self, final Hashtable<String, Object> context) {
    CompleteDSL.IfAspectIfAspectProperties _self_ = CompleteDSL.IfAspectIfAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.If){
     CompleteDSL.IfAspect._privk3_eval(_self_, (CompleteDSLPckg.If)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final If _self, final Hashtable<String, Object> context) {
    CompleteDSL.ControlStructureAspectControlStructureAspectProperties _self_ = CompleteDSL.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     CompleteDSL.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final IfAspectIfAspectProperties _self_, final If _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("");
    Expression _condition = _self.getCondition();
    Object _eval = BlockAspect.eval( _condition,context);
    Boolean condition = ((Boolean) _eval);
    if ((condition).booleanValue()) {
      Block _body = _self.getBody();
      BlockAspect.eval( _body,context);
    }
  }
}
