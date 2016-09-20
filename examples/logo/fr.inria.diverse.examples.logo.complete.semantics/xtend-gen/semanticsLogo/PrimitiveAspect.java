package semanticsLogo;

import Logo.Back;
import Logo.Forward;
import Logo.Left;
import Logo.Primitive;
import Logo.Right;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.BackAspect;
import semanticsLogo.ForwardAspect;
import semanticsLogo.InstructionAspect;
import semanticsLogo.LeftAspect;
import semanticsLogo.PrimitiveAspectPrimitiveAspectProperties;
import semanticsLogo.RightAspect;

@Aspect(className = Primitive.class)
@SuppressWarnings("all")
public class PrimitiveAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void eval(final Primitive _self, final Hashtable<String, Object> context) {
    semanticsLogo.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
     if (_self instanceof Logo.Primitive){
     semanticsLogo.PrimitiveAspect._privk3_eval(_self_, (Logo.Primitive)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Primitive _self, final Hashtable<String, Object> context) {
    semanticsLogo.InstructionAspectInstructionAspectProperties _self_ = semanticsLogo.InstructionAspectInstructionAspectContext.getSelf(_self);
     semanticsLogo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final PrimitiveAspectPrimitiveAspectProperties _self_, final Primitive _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Back)) {
      BackAspect.eval(((Back) _self), context);
    } else {
      if ((_self instanceof Forward)) {
        ForwardAspect.eval(((Forward) _self), context);
      } else {
        if ((_self instanceof Left)) {
          LeftAspect.eval(((Left) _self), context);
        } else {
          if ((_self instanceof Right)) {
            RightAspect.eval(((Right) _self), context);
          }
        }
      }
    }
  }
}
