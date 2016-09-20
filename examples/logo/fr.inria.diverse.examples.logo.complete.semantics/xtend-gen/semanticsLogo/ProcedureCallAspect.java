package semanticsLogo;

import Logo.Procedure;
import Logo.ProcedureCall;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.InstructionAspect;
import semanticsLogo.ProcedureAspect;
import semanticsLogo.ProcedureCallAspectProcedureCallAspectProperties;

@Aspect(className = ProcedureCall.class)
@SuppressWarnings("all")
public class ProcedureCallAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final ProcedureCall _self, final Hashtable<String, Object> context) {
    semanticsLogo.ProcedureCallAspectProcedureCallAspectProperties _self_ = semanticsLogo.ProcedureCallAspectProcedureCallAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final ProcedureCall _self, final Hashtable<String, Object> context) {
    semanticsLogo.InstructionAspectInstructionAspectProperties _self_ = semanticsLogo.InstructionAspectInstructionAspectContext.getSelf(_self);
     semanticsLogo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProcedureCallAspectProcedureCallAspectProperties _self_, final ProcedureCall _self, final Hashtable<String, Object> context) {
    Procedure _ref = _self.getRef();
    ProcedureAspect.eval(_ref, context);
  }
}
