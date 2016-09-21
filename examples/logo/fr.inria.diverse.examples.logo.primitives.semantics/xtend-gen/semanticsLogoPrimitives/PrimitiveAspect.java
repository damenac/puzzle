package semanticsLogoPrimitives;

import Primitives.Back;
import Primitives.Forward;
import Primitives.Left;
import Primitives.Primitive;
import Primitives.Right;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogoPrimitives.BackAspect;
import semanticsLogoPrimitives.ForwardAspect;
import semanticsLogoPrimitives.InstructionAspect;
import semanticsLogoPrimitives.LeftAspect;
import semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties;
import semanticsLogoPrimitives.RightAspect;

@Aspect(className = Primitive.class)
@SuppressWarnings("all")
public class PrimitiveAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static void evalInstruction(final Primitive _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    _privk3_evalInstruction(_self_, _self,context);
  }
  
  private static void super_evalInstruction(final Primitive _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.InstructionAspectInstructionAspectProperties _self_ = semanticsLogoPrimitives.InstructionAspectInstructionAspectContext.getSelf(_self);
     semanticsLogoPrimitives.InstructionAspect._privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final PrimitiveAspectPrimitiveAspectProperties _self_, final Primitive _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Back)) {
      BackAspect.evalInstruction(((Back) _self), context);
    } else {
      if ((_self instanceof Forward)) {
        ForwardAspect.evalInstruction(((Forward) _self), context);
      } else {
        if ((_self instanceof Left)) {
          LeftAspect.evalInstruction(((Left) _self), context);
        } else {
          if ((_self instanceof Right)) {
            RightAspect.evalInstruction(((Right) _self), context);
          }
        }
      }
    }
  }
}
