package semanticsLiteralsLogo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLiteralsLogo.IntegerAspectIntegerAspectProperties;
import semanticsLiteralsLogo.LiteralAspect;

@Aspect(className = LogoLiterals.Integer.class)
@SuppressWarnings("all")
public class IntegerAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final LogoLiterals.Integer _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.IntegerAspectIntegerAspectProperties _self_ = semanticsLiteralsLogo.IntegerAspectIntegerAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof LogoLiterals.Integer){
    result = semanticsLiteralsLogo.IntegerAspect._privk3_eval(_self_, (LogoLiterals.Integer)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final LogoLiterals.Integer _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLiteralsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  semanticsLiteralsLogo.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerAspectIntegerAspectProperties _self_, final LogoLiterals.Integer _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
