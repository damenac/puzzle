package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import kmLogo.ProcDeclaration;
import logo.InstructionAspect;
import logo.ProcDeclarationAspectProcDeclarationAspectProperties;

@Aspect(className = ProcDeclaration.class)
@SuppressWarnings("all")
public class ProcDeclarationAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final ProcDeclaration _self, final Hashtable<String, Object> context) {
    logo.ProcDeclarationAspectProcDeclarationAspectProperties _self_ = logo.ProcDeclarationAspectProcDeclarationAspectContext.getSelf(_self);
     if (_self instanceof kmLogo.ProcDeclaration){
     logo.ProcDeclarationAspect._privk3_eval(_self_, (kmLogo.ProcDeclaration)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final ProcDeclaration _self, final Hashtable<String, Object> context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
     logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProcDeclarationAspectProcDeclarationAspectProperties _self_, final ProcDeclaration _self, final Hashtable<String, Object> context) {
  }
}
