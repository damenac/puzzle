package CompleteDSL;

import CompleteDSLPckg.Block;
import CompleteDSLPckg.ControlStructure;
import CompleteDSLPckg.If;
import CompleteDSLPckg.While;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.ControlStructureAspectControlStructureAspectProperties;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect {
  public static void eval(final ControlStructure _self, final Hashtable<String, Object> context) {
    CompleteDSL.ControlStructureAspectControlStructureAspectProperties _self_ = CompleteDSL.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Hashtable<String, Object> context) {
    if ((_self instanceof If)) {
      If _if = ((If) _self);
      BlockAspect.eval( _if,context);
    } else {
      if ((_self instanceof While)) {
        While _while = ((While) _self);
        BlockAspect.eval( _while,context);
      } else {
        if ((_self instanceof Block)) {
          Block _block = ((Block) _self);
          BlockAspect.eval( _block,context);
        }
      }
    }
  }
}
