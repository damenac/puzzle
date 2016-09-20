package semanticsLogo;

import Logo.Instruction;
import java.util.Map;
import semanticsLogo.InstructionAspectInstructionAspectProperties;

@SuppressWarnings("all")
public class InstructionAspectInstructionAspectContext {
  public final static InstructionAspectInstructionAspectContext INSTANCE = new InstructionAspectInstructionAspectContext();
  
  public static InstructionAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.InstructionAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, InstructionAspectInstructionAspectProperties> map = new java.util.WeakHashMap<Logo.Instruction, semanticsLogo.InstructionAspectInstructionAspectProperties>();
  
  public Map<Instruction, InstructionAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
