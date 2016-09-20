package semanticsLogo;

import Logo.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.VarReferenceVarReferenceAspectProperties;

@Aspect(className = Logo.VarReference.class)
@SuppressWarnings("all")
public class VarReference extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Logo.VarReference _self, final Hashtable<String, Object> context) {
    semanticsLogo.VarReferenceVarReferenceAspectProperties _self_ = semanticsLogo.VarReferenceVarReferenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Logo.VarReference _self, final Hashtable<String, Object> context) {
    semanticsLogo.ExpressionAspectExpressionAspectProperties _self_ = semanticsLogo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  semanticsLogo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarReferenceVarReferenceAspectProperties _self_, final Logo.VarReference _self, final Hashtable<String, Object> context) {
    VarDecl _ref = _self.getRef();
    String _name = _ref.getName();
    return context.get(_name);
  }
}
