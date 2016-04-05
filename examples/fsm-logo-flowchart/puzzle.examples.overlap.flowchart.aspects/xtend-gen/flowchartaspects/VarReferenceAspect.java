package flowchartaspects;

import flowchartaspects.ExpressionAspect;
import flowchartaspects.VarReferenceAspectVarReferenceAspectProperties;
import flowchartpck.VarReference;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = VarReference.class)
@SuppressWarnings("all")
public class VarReferenceAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarReference _self, final Hashtable<String, Object> context) {
    flowchartaspects.VarReferenceAspectVarReferenceAspectProperties _self_ = flowchartaspects.VarReferenceAspectVarReferenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchartpck.VarReference){
    result = flowchartaspects.VarReferenceAspect._privk3_eval(_self_, (flowchartpck.VarReference)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarReference _self, final Hashtable<String, Object> context) {
    flowchartaspects.ExpressionAspectExpressionAspectProperties _self_ = flowchartaspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  flowchartaspects.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarReferenceAspectVarReferenceAspectProperties _self_, final VarReference _self, final Hashtable<String, Object> context) {
    String _key = _self.getKey();
    return context.get(_key);
  }
}
