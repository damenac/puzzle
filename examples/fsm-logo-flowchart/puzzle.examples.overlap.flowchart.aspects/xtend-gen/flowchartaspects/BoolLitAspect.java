package flowchartaspects;

import flowchartaspects.BoolLitAspectBoolLitAspectProperties;
import flowchartaspects.LiteralAspect;
import flowchartpck.BoolLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Hashtable<String, Object> context) {
    flowchartaspects.BoolLitAspectBoolLitAspectProperties _self_ = flowchartaspects.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Hashtable<String, Object> context) {
    flowchartaspects.LiteralAspectLiteralAspectProperties _self_ = flowchartaspects.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  flowchartaspects.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
