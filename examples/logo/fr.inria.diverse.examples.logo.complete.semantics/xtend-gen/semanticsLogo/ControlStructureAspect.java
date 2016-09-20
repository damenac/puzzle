package semanticsLogo;

import Logo.Block;
import Logo.ControlStructure;
import Logo.If;
import Logo.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.BlockAspect;
import semanticsLogo.ControlStructureAspectControlStructureAspectProperties;
import semanticsLogo.IfAspect;
import semanticsLogo.InstructionAspect;
import semanticsLogo.WhileAspect;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final ControlStructure _self, final Hashtable<String, Object> context) {
    semanticsLogo.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final ControlStructure _self, final Hashtable<String, Object> context) {
    semanticsLogo.InstructionAspectInstructionAspectProperties _self_ = semanticsLogo.InstructionAspectInstructionAspectContext.getSelf(_self);
     semanticsLogo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Hashtable<String, Object> context) {
    if ((_self instanceof If)) {
      IfAspect.eval(((If) _self), context);
    } else {
      if ((_self instanceof While)) {
        WhileAspect.eval(((While) _self), context);
      } else {
        if ((_self instanceof Block)) {
          BlockAspect.eval(((Block) _self), context);
        }
      }
    }
  }
}
