package Logo.logoprogram;

import Logo.Block;
import Logo.Instruction;
import Logo.logoprogram.BlockAspectBlockAspectProperties;
import Logo.logoprogram.Context;
import Logo.logoprogram.InstructionAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final Block _self, final Context context) {
    Logo.logoprogram.BlockAspectBlockAspectProperties _self_ = Logo.logoprogram.BlockAspectBlockAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int res(final Block _self) {
    Logo.logoprogram.BlockAspectBlockAspectProperties _self_ = Logo.logoprogram.BlockAspectBlockAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_res(_self_, _self);
    return (int)result;
  }
  
  private static void res(final Block _self, final int res) {
    Logo.logoprogram.BlockAspectBlockAspectProperties _self_ = Logo.logoprogram.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_res(_self_, _self,res);
  }
  
  private static int super_eval(final Block _self, final Context context) {
    Logo.logoprogram.InstructionAspectInstructionAspectProperties _self_ = Logo.logoprogram.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  Logo.logoprogram.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final BlockAspectBlockAspectProperties _self_, final Block _self, final Context context) {
    EList<Instruction> _instructions = _self.getInstructions();
    final Consumer<Instruction> _function = (Instruction instruction) -> {
      int _eval = InstructionAspect.eval(instruction, context);
      BlockAspect.res(_self, _eval);
    };
    _instructions.forEach(_function);
    return 0;
  }
  
  protected static int _privk3_res(final BlockAspectBlockAspectProperties _self_, final Block _self) {
     return _self_.res; 
  }
  
  protected static void _privk3_res(final BlockAspectBlockAspectProperties _self_, final Block _self, final int res) {
    _self_.res = res; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Res")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, res);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
