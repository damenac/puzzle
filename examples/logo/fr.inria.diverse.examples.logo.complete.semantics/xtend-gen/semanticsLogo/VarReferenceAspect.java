package semanticsLogo;

import Logo.VarDecl;
import Logo.VarReference;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.VarReferenceAspectVarReferenceAspectProperties;

@Aspect(className = VarReference.class)
@SuppressWarnings("all")
public class VarReferenceAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarReference _self, final Hashtable<String, Object> context) {
    semanticsLogo.VarReferenceAspectVarReferenceAspectProperties _self_ = semanticsLogo.VarReferenceAspectVarReferenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarReference _self, final Hashtable<String, Object> context) {
    semanticsLogo.ExpressionAspectExpressionAspectProperties _self_ = semanticsLogo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  semanticsLogo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarReferenceAspectVarReferenceAspectProperties _self_, final VarReference _self, final Hashtable<String, Object> context) {
    Object _get = context.get("variables");
    Hashtable<String, Object> variablesTable = ((Hashtable<String, Object>) _get);
    VarDecl _ref = _self.getRef();
    String _name = _ref.getName();
    return variablesTable.get(_name);
  }
}
