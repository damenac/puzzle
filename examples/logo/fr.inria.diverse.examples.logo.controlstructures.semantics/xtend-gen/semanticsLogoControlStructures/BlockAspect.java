package semanticsLogoControlStructures;

import ControlStructures.Block;
import ControlStructures.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogoControlStructures.BlockAspectBlockAspectProperties;
import semanticsLogoControlStructures.ControlStructureAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final Block _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.BlockAspectBlockAspectProperties _self_ = semanticsLogoControlStructures.BlockAspectBlockAspectContext.getSelf(_self);
     if (_self instanceof ControlStructures.Block){
     semanticsLogoControlStructures.BlockAspect._privk3_eval(_self_, (ControlStructures.Block)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Block _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     semanticsLogoControlStructures.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final BlockAspectBlockAspectProperties _self_, final Block _self, final Hashtable<String, Object> context) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction instruction : _instructions) {
      {
        InputOutput.<Instruction>println(instruction);
        instruction.eval(context);
      }
    }
  }
}
