package fsmaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.VarReference;
import fsmaspects.ExpressionAspect;
import fsmaspects.VarReferenceAspectVarReferenceAspectProperties;
import java.util.Hashtable;

@Aspect(className = VarReference.class)
@SuppressWarnings("all")
public class VarReferenceAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarReference _self, final Hashtable<String, Object> context) {
    fsmaspects.VarReferenceAspectVarReferenceAspectProperties _self_ = fsmaspects.VarReferenceAspectVarReferenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fsm.VarReference){
    result = fsmaspects.VarReferenceAspect._privk3_eval(_self_, (fsm.VarReference)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarReference _self, final Hashtable<String, Object> context) {
    fsmaspects.ExpressionAspectExpressionAspectProperties _self_ = fsmaspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fsmaspects.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarReferenceAspectVarReferenceAspectProperties _self_, final VarReference _self, final Hashtable<String, Object> context) {
    String _key = _self.getKey();
    return context.get(_key);
  }
}
