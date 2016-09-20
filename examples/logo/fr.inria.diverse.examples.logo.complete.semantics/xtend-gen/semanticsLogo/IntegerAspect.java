package semanticsLogo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.IntegerAspectIntegerAspectProperties;
import semanticsLogo.LiteralAspect;

@Aspect(className = Logo.Integer.class)
@SuppressWarnings("all")
public class IntegerAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final Logo.Integer _self, final Hashtable<String, Object> context) {
    semanticsLogo.IntegerAspectIntegerAspectProperties _self_ = semanticsLogo.IntegerAspectIntegerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Logo.Integer _self, final Hashtable<String, Object> context) {
    semanticsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  semanticsLogo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerAspectIntegerAspectProperties _self_, final Logo.Integer _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
