package semanticsLiteralsLogo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLiteralsLogo.LiteralAspect;
import semanticsLiteralsLogo.StringAspectStringAspectProperties;

@Aspect(className = LogoLiterals.String.class)
@SuppressWarnings("all")
public class StringAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final LogoLiterals.String _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.StringAspectStringAspectProperties _self_ = semanticsLiteralsLogo.StringAspectStringAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof LogoLiterals.String){
    result = semanticsLiteralsLogo.StringAspect._privk3_eval(_self_, (LogoLiterals.String)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final LogoLiterals.String _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLiteralsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  semanticsLiteralsLogo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringAspectStringAspectProperties _self_, final LogoLiterals.String _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
