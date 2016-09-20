package semanticsLogo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.LiteralAspect;
import semanticsLogo.StringAspectStringAspectProperties;

@Aspect(className = Logo.String.class)
@SuppressWarnings("all")
public class StringAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final Logo.String _self, final Hashtable<String, Object> context) {
    semanticsLogo.StringAspectStringAspectProperties _self_ = semanticsLogo.StringAspectStringAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Logo.String _self, final Hashtable<String, Object> context) {
    semanticsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  semanticsLogo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringAspectStringAspectProperties _self_, final Logo.String _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
