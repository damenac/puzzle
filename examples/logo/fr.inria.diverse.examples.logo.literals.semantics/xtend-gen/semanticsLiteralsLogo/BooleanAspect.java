package semanticsLiteralsLogo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLiteralsLogo.BooleanAspectBooleanAspectProperties;
import semanticsLiteralsLogo.LiteralAspect;

@Aspect(className = LogoLiterals.Boolean.class)
@SuppressWarnings("all")
public class BooleanAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final LogoLiterals.Boolean _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.BooleanAspectBooleanAspectProperties _self_ = semanticsLiteralsLogo.BooleanAspectBooleanAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final LogoLiterals.Boolean _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLiteralsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  semanticsLiteralsLogo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BooleanAspectBooleanAspectProperties _self_, final LogoLiterals.Boolean _self, final Hashtable<String, Object> context) {
    return Boolean.valueOf(_self.isValue());
  }
}
