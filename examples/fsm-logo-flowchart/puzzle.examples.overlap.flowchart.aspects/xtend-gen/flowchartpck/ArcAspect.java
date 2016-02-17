package flowchartpck;

import flowchartpck.Arc;
import flowchartpck.ArcAspectArcAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Arc.class)
@SuppressWarnings("all")
public class ArcAspect {
  public static void eval(final Arc _self, final Hashtable<String, Object> context) {
    flowchartpck.ArcAspectArcAspectProperties _self_ = flowchartpck.ArcAspectArcAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ArcAspectArcAspectProperties _self_, final Arc _self, final Hashtable<String, Object> context) {
  }
}
