package CompleteDSL;

import CompleteDSLPckg.BoolLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.BoolLitAspectBoolLitAspectProperties;
import CompleteDSL.LiteralAspect;
import java.util.Hashtable;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Hashtable<String, Object> context) {
    CompleteDSL.BoolLitAspectBoolLitAspectProperties _self_ = CompleteDSL.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Hashtable<String, Object> context) {
    CompleteDSL.LiteralAspectLiteralAspectProperties _self_ = CompleteDSL.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  CompleteDSL.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
