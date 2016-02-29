package flowchartpck;

import flowchartpck.ExpressionAspect;
import flowchartpck.VarReference;
import flowchartpck.VarReferenceAspectVarReferenceAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = VarReference.class)
@SuppressWarnings("all")
public class VarReferenceAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarReference _self, final Hashtable<String, Object> context) {
    flowchartpck.VarReferenceAspectVarReferenceAspectProperties _self_ = flowchartpck.VarReferenceAspectVarReferenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchartpck.VarReference){
    result = flowchartpck.VarReferenceAspect._privk3_eval(_self_, (flowchartpck.VarReference)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarReference _self, final Hashtable<String, Object> context) {
    flowchartpck.ExpressionAspectExpressionAspectProperties _self_ = flowchartpck.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  flowchartpck.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarReferenceAspectVarReferenceAspectProperties _self_, final VarReference _self, final Hashtable<String, Object> context) {
    String _key = _self.getKey();
    return context.get(_key);
  }
}
