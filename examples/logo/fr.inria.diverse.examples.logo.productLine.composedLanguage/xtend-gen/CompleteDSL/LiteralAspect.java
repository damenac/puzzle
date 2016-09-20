package CompleteDSL;

import CompleteDSLPckg.Literal;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.BooleanAspect;
import CompleteDSL.IntegerAspect;
import CompleteDSL.LiteralAspectLiteralAspectProperties;
import CompleteDSL.StringAspect;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect {
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    CompleteDSL.LiteralAspectLiteralAspectProperties _self_ = CompleteDSL.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    if ((_self instanceof CompleteDSLPckg.Integer)) {
      return IntegerAspect.eval(((CompleteDSLPckg.Integer) _self), context);
    } else {
      if ((_self instanceof CompleteDSLPckg.String)) {
        return StringAspect.eval(((CompleteDSLPckg.String) _self), context);
      } else {
        if ((_self instanceof CompleteDSLPckg.Boolean)) {
          return BooleanAspect.eval(((CompleteDSLPckg.Boolean) _self), context);
        } else {
          return Integer.valueOf(0);
        }
      }
    }
  }
}
