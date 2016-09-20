package semanticsLogoControlStructures;

import ControlStructures.Block;
import ControlStructures.ControlStructure;
import ControlStructures.If;
import ControlStructures.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect {
  public static void eval(final ControlStructure _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Hashtable<String, Object> context) {
    if ((_self instanceof If)) {
      If _if = ((If) _self);
      _if.eval(context);
    } else {
      if ((_self instanceof While)) {
        While _while = ((While) _self);
        _while.eval(context);
      } else {
        if ((_self instanceof Block)) {
          Block _block = ((Block) _self);
          _block.eval(context);
        }
      }
    }
  }
}
