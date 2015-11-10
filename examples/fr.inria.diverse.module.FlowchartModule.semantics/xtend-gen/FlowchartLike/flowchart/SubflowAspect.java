package FlowchartLike.flowchart;

import FlowchartLike.flowchart.SubflowAspectSubflowAspectProperties;
import FlowchartModule.Subflow;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Subflow.class)
@SuppressWarnings("all")
public class SubflowAspect {
  public static void eval(final Subflow _self, final Hashtable<String, Object> context) {
    FlowchartLike.flowchart.SubflowAspectSubflowAspectProperties _self_ = FlowchartLike.flowchart.SubflowAspectSubflowAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final SubflowAspectSubflowAspectProperties _self_, final Subflow _self, final Hashtable<String, Object> context) {
  }
}
