package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import java.util.function.Consumer;
import kmLogo.Expression;
import kmLogo.Instruction;
import kmLogo.Parameter;
import kmLogo.ProcCall;
import kmLogo.ProcDeclaration;
import logo.Context;
import logo.ExpressionAspect;
import logo.InstructionAspect;
import logo.ProcCallAspectProcCallAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = ProcCall.class)
@SuppressWarnings("all")
public class ProcCallAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static int eval(final ProcCall _self, final Context context) {
    logo.ProcCallAspectProcCallAspectProperties _self_ = logo.ProcCallAspectProcCallAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.ProcCall){
    result = logo.ProcCallAspect._privk3_eval(_self_, (kmLogo.ProcCall)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int res(final ProcCall _self) {
    logo.ProcCallAspectProcCallAspectProperties _self_ = logo.ProcCallAspectProcCallAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_res(_self_, _self);
    return (int)result;
  }
  
  private static void res(final ProcCall _self, final int res) {
    logo.ProcCallAspectProcCallAspectProperties _self_ = logo.ProcCallAspectProcCallAspectContext.getSelf(_self);
    _privk3_res(_self_, _self,res);
  }
  
  private static int super_eval(final ProcCall _self, final Context context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  logo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ProcCallAspectProcCallAspectProperties _self_, final ProcCall _self, final Context context) {
    ProcDeclaration _declaration = _self.getDeclaration();
    String _name = _declaration.getName();
    String _plus = ("Calling of : " + _name);
    InputOutput.<String>println(_plus);
    Hashtable<String, Integer> params = new Hashtable<String, Integer>();
    int i = 0;
    EList<Expression> _actualArgs = _self.getActualArgs();
    for (final Expression exp : _actualArgs) {
      {
        int currentArg = ExpressionAspect.eval(exp, context);
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
    return ProcCallAspect.res(_self);
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
