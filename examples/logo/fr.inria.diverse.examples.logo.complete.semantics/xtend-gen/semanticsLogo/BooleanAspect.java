package semanticsLogo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.BooleanAspectBooleanAspectProperties;
import semanticsLogo.LiteralAspect;

@Aspect(className = Logo.Boolean.class)
@SuppressWarnings("all")
public class BooleanAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final Logo.Boolean _self, final Hashtable<String, Object> context) {
    semanticsLogo.BooleanAspectBooleanAspectProperties _self_ = semanticsLogo.BooleanAspectBooleanAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof Logo.Boolean){
    result = semanticsLogo.BooleanAspect._privk3_eval(_self_, (Logo.Boolean)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Logo.Boolean _self, final Hashtable<String, Object> context) {
    semanticsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  semanticsLogo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BooleanAspectBooleanAspectProperties _self_, final Logo.Boolean _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
