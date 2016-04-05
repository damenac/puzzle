package flowchart.semantics;

import flowchart.semantics.EndAspectEndAspectProperties;
import flowchart.semantics.NodeAspect;
import flowchartpck.End;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = End.class)
@SuppressWarnings("all")
public class EndAspect extends NodeAspect {
  @OverrideAspectMethod
  public static void eval(final End _self, final Hashtable<String, Object> context) {
    flowchart.semantics.EndAspectEndAspectProperties _self_ = flowchart.semantics.EndAspectEndAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final EndAspectEndAspectProperties _self_, final End _self, final Hashtable<String, Object> context) {
    System.exit(0);
  }
}
