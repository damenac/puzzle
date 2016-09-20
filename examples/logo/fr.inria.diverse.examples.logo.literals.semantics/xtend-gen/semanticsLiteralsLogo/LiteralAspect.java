package semanticsLiteralsLogo;

import LogoLiterals.Literal;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLiteralsLogo.BooleanAspect;
import semanticsLiteralsLogo.IntegerAspect;
import semanticsLiteralsLogo.LiteralAspectLiteralAspectProperties;
import semanticsLiteralsLogo.StringAspect;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect {
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLiteralsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    if ((_self instanceof LogoLiterals.Integer)) {
      return IntegerAspect.eval(((LogoLiterals.Integer) _self), context);
    } else {
      if ((_self instanceof LogoLiterals.String)) {
        return StringAspect.eval(((LogoLiterals.String) _self), context);
      } else {
        if ((_self instanceof LogoLiterals.Boolean)) {
          return BooleanAspect.eval(((LogoLiterals.Boolean) _self), context);
        } else {
          return Integer.valueOf(0);
        }
      }
    }
  }
}
