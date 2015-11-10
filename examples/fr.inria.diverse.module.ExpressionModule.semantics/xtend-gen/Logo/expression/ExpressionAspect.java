package Logo.expression;

import ExpressionModule.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect /* implements InstructionAspect  */{
  @OverrideAspectMethod
  public Object eval(final /* Context */Object context) {
    return Integer.valueOf(0);
  }
}
