package FlowchartLike.flowchart;

import FlowchartLike.flowchart.FlowchartAspectFlowchartAspectProperties;
import FlowchartModule.Flowchart;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Flowchart.class)
@SuppressWarnings("all")
public class FlowchartAspect {
  public static void eval(final Flowchart _self) {
    FlowchartLike.flowchart.FlowchartAspectFlowchartAspectProperties _self_ = FlowchartLike.flowchart.FlowchartAspectFlowchartAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final FlowchartAspectFlowchartAspectProperties _self_, final Flowchart _self) {
  }
}
