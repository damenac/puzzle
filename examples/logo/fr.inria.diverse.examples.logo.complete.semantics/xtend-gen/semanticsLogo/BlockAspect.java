package semanticsLogo;

import Logo.Block;
import Logo.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.BlockAspectBlockAspectProperties;
import semanticsLogo.ControlStructureAspect;
import semanticsLogo.InstructionAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static void eval(final Block _self, final Hashtable<String, Object> context) {
    semanticsLogo.BlockAspectBlockAspectProperties _self_ = semanticsLogo.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Block _self, final Hashtable<String, Object> context) {
    semanticsLogo.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
     semanticsLogo.ControlStructureAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final BlockAspectBlockAspectProperties _self_, final Block _self, final Hashtable<String, Object> context) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction instruction : _instructions) {
      {
        InputOutput.<Instruction>println(instruction);
        InstructionAspect.eval(instruction, context);
      }
    }
  }
}
