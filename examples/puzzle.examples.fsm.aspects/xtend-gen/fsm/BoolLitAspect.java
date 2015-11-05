package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.BoolLit;
import fsm.BoolLitAspectBoolLitAspectProperties;
import fsm.LiteralAspect;
import java.util.Hashtable;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Hashtable<String, Object> context) {
    fsm.BoolLitAspectBoolLitAspectProperties _self_ = fsm.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Hashtable<String, Object> context) {
    fsm.LiteralAspectLiteralAspectProperties _self_ = fsm.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  fsm.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
