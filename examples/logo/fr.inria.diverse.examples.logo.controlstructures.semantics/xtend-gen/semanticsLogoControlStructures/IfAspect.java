package semanticsLogoControlStructures;

import ControlStructures.Block;
import ControlStructures.Expression;
import ControlStructures.If;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogoControlStructures.ControlStructureAspect;
import semanticsLogoControlStructures.IfAspectIfAspectProperties;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final If _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.IfAspectIfAspectProperties _self_ = semanticsLogoControlStructures.IfAspectIfAspectContext.getSelf(_self);
     if (_self instanceof ControlStructures.If){
     semanticsLogoControlStructures.IfAspect._privk3_eval(_self_, (ControlStructures.If)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final If _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     semanticsLogoControlStructures.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final IfAspectIfAspectProperties _self_, final If _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("");
    Expression _condition = _self.getCondition();
    Object _eval = _condition.eval(context);
    Boolean condition = ((Boolean) _eval);
    if ((condition).booleanValue()) {
      Block _body = _self.getBody();
      _body.eval(context);
    }
  }
}
