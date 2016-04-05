package flowchartaspects;

import flowchartaspects.FlowchartAspectFlowchartAspectProperties;
import flowchartaspects.StartAspect;
import flowchartpck.Flowchart;
import flowchartpck.Node;
import flowchartpck.Start;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = Flowchart.class)
@SuppressWarnings("all")
public class FlowchartAspect {
  @Main
  public static void exec(final Flowchart _self) {
    flowchartaspects.FlowchartAspectFlowchartAspectProperties _self_ = flowchartaspects.FlowchartAspectFlowchartAspectContext.getSelf(_self);
    _privk3_exec(_self_, _self);
  }
  
  protected static void _privk3_exec(final FlowchartAspectFlowchartAspectProperties _self_, final Flowchart _self) {
    Hashtable<String, Object> context = new Hashtable<String, Object>();
    EList<Node> _nodes = _self.getNodes();
    final Function1<Node, Boolean> _function = (Node node) -> {
      return Boolean.valueOf((node instanceof Start));
    };
    Node _findFirst = IterableExtensions.<Node>findFirst(_nodes, _function);
    Start start = ((Start) _findFirst);
    StartAspect.eval(start, context);
  }
}
