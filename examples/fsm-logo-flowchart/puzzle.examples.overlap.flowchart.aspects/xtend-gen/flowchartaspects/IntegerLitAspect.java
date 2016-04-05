package flowchartaspects;

import flowchartaspects.IntegerLitAspectIntegerLitAspectProperties;
import flowchartaspects.LiteralAspect;
import flowchartpck.IntegerLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    flowchartaspects.IntegerLitAspectIntegerLitAspectProperties _self_ = flowchartaspects.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    flowchartaspects.LiteralAspectLiteralAspectProperties _self_ = flowchartaspects.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  flowchartaspects.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
