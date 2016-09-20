package CompleteDSL;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import CompleteDSL.BooleanAspectBooleanAspectProperties;
import CompleteDSL.LiteralAspect;

@Aspect(className = CompleteDSLPckg.Boolean.class)
@SuppressWarnings("all")
public class BooleanAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final CompleteDSLPckg.Boolean _self, final Hashtable<String, Object> context) {
    CompleteDSL.BooleanAspectBooleanAspectProperties _self_ = CompleteDSL.BooleanAspectBooleanAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final CompleteDSLPckg.Boolean _self, final Hashtable<String, Object> context) {
    CompleteDSL.LiteralAspectLiteralAspectProperties _self_ = CompleteDSL.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  CompleteDSL.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BooleanAspectBooleanAspectProperties _self_, final CompleteDSLPckg.Boolean _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
