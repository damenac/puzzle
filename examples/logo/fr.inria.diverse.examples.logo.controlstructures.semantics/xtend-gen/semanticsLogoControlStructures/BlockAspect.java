package semanticsLogoControlStructures;

import ControlStructures.Block;
import ControlStructures.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import semanticsLogoControlStructures.BlockAspectBlockAspectProperties;
import semanticsLogoControlStructures.ControlStructureAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void evalInstruction(final Block _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.BlockAspectBlockAspectProperties _self_ = semanticsLogoControlStructures.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_evalInstruction(_self_, _self,context);
  }
  
  private static void super_evalInstruction(final Block _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     semanticsLogoControlStructures.ControlStructureAspect._privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final BlockAspectBlockAspectProperties _self_, final Block _self, final Hashtable<String, Object> context) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction instruction : _instructions) {
      instruction.evalInstruction(context);
    }
  }
}
