package semanticsLogoPrimitives;

import Primitives.Back;
import Primitives.Forward;
import Primitives.Left;
import Primitives.Primitive;
import Primitives.Right;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoPrimitives.BackAspect;
import semanticsLogoPrimitives.ForwardAspect;
import semanticsLogoPrimitives.LeftAspect;
import semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties;
import semanticsLogoPrimitives.RightAspect;

@Aspect(className = Primitive.class)
@SuppressWarnings("all")
public class PrimitiveAspect {
  public static void eval(final Primitive _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties _self_ = semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
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
