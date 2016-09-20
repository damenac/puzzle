package CompleteDSL;

import CompleteDSLPckg.Block;
import CompleteDSLPckg.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import CompleteDSL.BlockAspectBlockAspectProperties;
import CompleteDSL.ControlStructureAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final Block _self, final Hashtable<String, Object> context) {
    CompleteDSL.BlockAspectBlockAspectProperties _self_ = CompleteDSL.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Block _self, final Hashtable<String, Object> context) {
    CompleteDSL.ControlStructureAspectControlStructureAspectProperties _self_ = CompleteDSL.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     CompleteDSL.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final BlockAspectBlockAspectProperties _self_, final Block _self, final Hashtable<String, Object> context) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction instruction : _instructions) {
      BlockAspect.eval( instruction,context);
    }
  }
}
