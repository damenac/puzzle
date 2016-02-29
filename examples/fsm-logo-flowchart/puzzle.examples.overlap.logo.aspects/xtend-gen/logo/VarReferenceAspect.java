package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import kmLogo.VarReference;
import logo.ExpressionAspect;
import logo.VarReferenceAspectVarReferenceAspectProperties;

@Aspect(className = VarReference.class)
@SuppressWarnings("all")
public class VarReferenceAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarReference _self, final Hashtable<String, Object> context) {
    logo.VarReferenceAspectVarReferenceAspectProperties _self_ = logo.VarReferenceAspectVarReferenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.VarReference){
    result = logo.VarReferenceAspect._privk3_eval(_self_, (kmLogo.VarReference)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarReference _self, final Hashtable<String, Object> context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  logo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarReferenceAspectVarReferenceAspectProperties _self_, final VarReference _self, final Hashtable<String, Object> context) {
    String _key = _self.getKey();
    return context.get(_key);
  }
}
