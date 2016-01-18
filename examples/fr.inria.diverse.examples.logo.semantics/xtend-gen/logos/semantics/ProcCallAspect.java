package logos.semantics;

import Logo.Expression;
import Logo.Instruction;
import Logo.Parameter;
import Logo.ProcCall;
import Logo.ProcDeclaration;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import java.util.function.Consumer;
import logos.semantics.Context;
import logos.semantics.InstructionAspect;
import logos.semantics.ProcCallAspectProcCallAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = ProcCall.class)
@SuppressWarnings("all")
public class ProcCallAspect {
  public static Object eval(final ProcCall _self, final Context context) {
    logos.semantics.ProcCallAspectProcCallAspectProperties _self_ = logos.semantics.ProcCallAspectProcCallAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static int res(final ProcCall _self) {
    logos.semantics.ProcCallAspectProcCallAspectProperties _self_ = logos.semantics.ProcCallAspectProcCallAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_res(_self_, _self);
    return (int)result;
  }
  
  private static void res(final ProcCall _self, final int res) {
    logos.semantics.ProcCallAspectProcCallAspectProperties _self_ = logos.semantics.ProcCallAspectProcCallAspectContext.getSelf(_self);
    _privk3_res(_self_, _self,res);
  }
  
  protected static Object _privk3_eval(final ProcCallAspectProcCallAspectProperties _self_, final ProcCall _self, final Context context) {
    ProcDeclaration _declaration = _self.getDeclaration();
    String _name = _declaration.getName();
    String _plus = ("Calling of : " + _name);
    InputOutput.<String>println(_plus);
    Hashtable<String, Integer> params = new Hashtable<String, Integer>();
    int i = 0;
    EList<Expression> _actualArgs = _self.getActualArgs();
    for (final Expression exp : _actualArgs) {
      {
        Object _eval = exp.eval(context);
        int currentArg = (((Integer) _eval)).intValue();
        ProcDeclaration _declaration_1 = _self.getDeclaration();
        EList<Parameter> _args = _declaration_1.getArgs();
        Parameter _get = _args.get(i);
        String _name_1 = _get.getName();
        params.put(_name_1, Integer.valueOf(currentArg));
        i = (i + 1);
      }
    }
    context.push(params);
    ProcCallAspect.res(_self, 0);
    ProcDeclaration _declaration_1 = _self.getDeclaration();
    EList<Instruction> _instructions = _declaration_1.getInstructions();
    final Consumer<Instruction> _function = (Instruction instr) -> {
      int _eval = InstructionAspect.eval(instr, context);
      ProcCallAspect.res(_self, _eval);
    };
    _instructions.forEach(_function);
    context.pop();
    return Integer.valueOf(ProcCallAspect.res(_self));
  }
  
  protected static int _privk3_res(final ProcCallAspectProcCallAspectProperties _self_, final ProcCall _self) {
     return _self_.res; 
  }
  
  protected static void _privk3_res(final ProcCallAspectProcCallAspectProperties _self_, final ProcCall _self, final int res) {
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
