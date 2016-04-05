package flowchartaspects;

import flowchartaspects.EndAspectEndAspectProperties;
import flowchartaspects.NodeAspect;
import flowchartpck.End;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = End.class)
@SuppressWarnings("all")
public class EndAspect extends NodeAspect {
  @OverrideAspectMethod
  public static void eval(final End _self, final Hashtable<String, Object> context) {
    flowchartaspects.EndAspectEndAspectProperties _self_ = flowchartaspects.EndAspectEndAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.End){
     flowchartaspects.EndAspect._privk3_eval(_self_, (flowchartpck.End)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final End _self, final Hashtable<String, Object> context) {
    flowchartaspects.NodeAspectNodeAspectProperties _self_ = flowchartaspects.NodeAspectNodeAspectContext.getSelf(_self);
     flowchartaspects.NodeAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final EndAspectEndAspectProperties _self_, final End _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("Finalizing the execution of the flowchart");
    System.exit(0);
  }
}
