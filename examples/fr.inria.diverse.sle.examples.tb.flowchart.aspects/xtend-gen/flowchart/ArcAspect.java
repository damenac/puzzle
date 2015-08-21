package flowchart;

import flowchart.Arc;
import flowchart.ArcAspectArcAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Arc.class)
@SuppressWarnings("all")
public class ArcAspect {
  public static void eval(final Arc _self) {
    flowchart.ArcAspectArcAspectProperties _self_ = flowchart.ArcAspectArcAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final ArcAspectArcAspectProperties _self_, final Arc _self) {
  }
}
