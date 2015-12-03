package transitioneffects.sequential;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import transitioneffect.Transition;
import transitioneffects.sequential.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  /* @OverrideRequiredAspectMethod
   */public static void evalTransition(final Transition _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nOverrideRequiredAspectMethod cannot be resolved to an annotation type.");
  }
  
  protected static void _privk3_evalTransition(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method _original_evalTransition is undefined for the type TransitionAspect");
  }
}
