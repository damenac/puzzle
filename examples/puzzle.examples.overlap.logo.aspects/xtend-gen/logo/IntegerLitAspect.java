package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.IntegerLit;
import logo.Context;
import logo.IntegerLitAspectIntegerLitAspectProperties;
import logo.LiteralAspect;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Context context) {
    logo.IntegerLitAspectIntegerLitAspectProperties _self_ = logo.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Context context) {
    logo.LiteralAspectLiteralAspectProperties _self_ = logo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  logo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Context context) {
    return Integer.valueOf(_self.getValue());
  }
}
