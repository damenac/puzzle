package CompleteDSL;

import CompleteDSLPckg.VarRef;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.ExpressionAspect;
import CompleteDSL.VarRefAspectVarRefAspectProperties;
import java.util.Hashtable;

@Aspect(className = VarRef.class)
@SuppressWarnings("all")
public class VarRefAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarRef _self, final Hashtable<String, Object> context) {
    CompleteDSL.VarRefAspectVarRefAspectProperties _self_ = CompleteDSL.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarRef _self, final Hashtable<String, Object> context) {
    CompleteDSL.ExpressionAspectExpressionAspectProperties _self_ = CompleteDSL.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  CompleteDSL.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self, final Hashtable<String, Object> context) {
    String _ref = _self.getRef();
    return context.get(_ref);
  }
}
