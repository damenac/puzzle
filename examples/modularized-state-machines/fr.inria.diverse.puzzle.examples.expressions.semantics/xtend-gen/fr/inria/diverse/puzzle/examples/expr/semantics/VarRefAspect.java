package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.VarRef;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspect;
import fr.inria.diverse.puzzle.examples.expr.semantics.VarRefAspectVarRefAspectProperties;
import java.util.Hashtable;

@Aspect(className = VarRef.class)
@SuppressWarnings("all")
public class VarRefAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarRef _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.VarRefAspectVarRefAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionPck.VarRef){
    result = fr.inria.diverse.puzzle.examples.expr.semantics.VarRefAspect._privk3_eval(_self_, (ExpressionPck.VarRef)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarRef _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self, final Hashtable<String, Object> context) {
    String _ref = _self.getRef();
    return context.get(_ref);
  }
}
