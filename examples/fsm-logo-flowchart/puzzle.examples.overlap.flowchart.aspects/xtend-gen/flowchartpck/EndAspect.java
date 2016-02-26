package flowchartpck;

import flowchartpck.End;
import flowchartpck.EndAspectEndAspectProperties;
import flowchartpck.NodeAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = End.class)
@SuppressWarnings("all")
public class EndAspect extends NodeAspect {
  @OverrideAspectMethod
  public static void eval(final End _self, final Hashtable<String, Object> context) {
    flowchartpck.EndAspectEndAspectProperties _self_ = flowchartpck.EndAspectEndAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final End _self, final Hashtable<String, Object> context) {
    flowchartpck.NodeAspectNodeAspectProperties _self_ = flowchartpck.NodeAspectNodeAspectContext.getSelf(_self);
     flowchartpck.NodeAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final EndAspectEndAspectProperties _self_, final End _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("Finalizing the execution of the flowchart");
    System.exit(0);
  }
}
