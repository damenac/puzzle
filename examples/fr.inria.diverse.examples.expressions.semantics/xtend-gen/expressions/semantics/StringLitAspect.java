package expressions.semantics;

import ExpressionPck.StringLit;
import expressions.semantics.Context;
import expressions.semantics.LiteralAspect;
import expressions.semantics.StringLitAspectStringLitAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Context context) {
    expressions.semantics.StringLitAspectStringLitAspectProperties _self_ = expressions.semantics.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Context context) {
    expressions.semantics.LiteralAspectLiteralAspectProperties _self_ = expressions.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  expressions.semantics.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Context context) {
    return _self.getValue();
  }
}
