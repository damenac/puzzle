package simple.imperative.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import simple.imperative.aspects.ExpressionAspect;
import simple.imperative.aspects.VarRefAspectVarRefAspectProperties;
import simpleimperative.VarRef;

@Aspect(className = VarRef.class)
@SuppressWarnings("all")
public class VarRefAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarRef _self, final Hashtable<String, Object> context) {
    simple.imperative.aspects.VarRefAspectVarRefAspectProperties _self_ = simple.imperative.aspects.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarRef _self, final Hashtable<String, Object> context) {
    simple.imperative.aspects.ExpressionAspectExpressionAspectProperties _self_ = simple.imperative.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  simple.imperative.aspects.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self, final Hashtable<String, Object> context) {
    String _varRef = _self.getVarRef();
    return context.get(_varRef);
  }
}
