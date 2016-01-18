package Logo.logoprogram;

import Logo.Instruction;
import Logo.logoprogram.InstructionAspectInstructionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class InstructionAspectInstructionAspectContext {
  public final static InstructionAspectInstructionAspectContext INSTANCE = new InstructionAspectInstructionAspectContext();
  
  public static InstructionAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.InstructionAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, InstructionAspectInstructionAspectProperties> map = new java.util.WeakHashMap<Logo.Instruction, Logo.logoprogram.InstructionAspectInstructionAspectProperties>();
  
  public Map<Instruction, InstructionAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
