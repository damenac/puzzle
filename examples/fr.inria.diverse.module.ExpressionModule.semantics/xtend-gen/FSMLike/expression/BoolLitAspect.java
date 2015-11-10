package FSMLike.expression;

import ExpressionModule.BoolLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect /* implements LiteralAspect  */{
  @OverrideAspectMethod
  public Object eval(final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type BoolLitAspect"
      + "\nvalue cannot be resolved");
  }
}
