package semanticsLogo;

import Logo.Block;
import Logo.Procedure;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.BlockAspect;
import semanticsLogo.InstructionAspect;
import semanticsLogo.ProcedureAspectProcedureAspectProperties;

@Aspect(className = Procedure.class)
@SuppressWarnings("all")
public class ProcedureAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final Procedure _self, final Hashtable<String, Object> context) {
    semanticsLogo.ProcedureAspectProcedureAspectProperties _self_ = semanticsLogo.ProcedureAspectProcedureAspectContext.getSelf(_self);
     if (_self instanceof Logo.Procedure){
     semanticsLogo.ProcedureAspect._privk3_eval(_self_, (Logo.Procedure)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Procedure _self, final Hashtable<String, Object> context) {
    semanticsLogo.InstructionAspectInstructionAspectProperties _self_ = semanticsLogo.InstructionAspectInstructionAspectContext.getSelf(_self);
     semanticsLogo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProcedureAspectProcedureAspectProperties _self_, final Procedure _self, final Hashtable<String, Object> context) {
    Block _body = _self.getBody();
    BlockAspect.eval(_body, context);
  }
}
