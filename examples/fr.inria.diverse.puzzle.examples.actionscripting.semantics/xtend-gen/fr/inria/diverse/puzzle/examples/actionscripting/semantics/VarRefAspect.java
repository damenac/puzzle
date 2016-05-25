package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.VarRef;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspect;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarRefAspectVarRefAspectProperties;
import java.util.Hashtable;

@Aspect(className = VarRef.class)
@SuppressWarnings("all")
public class VarRefAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final VarRef _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarRefAspectVarRefAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final VarRef _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self, final Hashtable<String, Object> context) {
    String _varRef = _self.getVarRef();
    return context.get(_varRef);
  }
}
