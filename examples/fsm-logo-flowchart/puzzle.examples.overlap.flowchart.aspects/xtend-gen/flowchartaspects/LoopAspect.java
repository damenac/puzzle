package flowchartaspects;

import flowchartaspects.ExpressionAspect;
import flowchartaspects.LoopAspectLoopAspectProperties;
import flowchartaspects.ProgramAspect;
import flowchartaspects.StatementAspect;
import flowchartpck.Loop;
import flowchartpck.Program;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self, final Hashtable<String, Object> context) {
    flowchartaspects.LoopAspectLoopAspectProperties _self_ = flowchartaspects.LoopAspectLoopAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.Loop){
     flowchartaspects.LoopAspect._privk3_eval(_self_, (flowchartpck.Loop)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Loop _self, final Hashtable<String, Object> context) {
    flowchartaspects.StatementAspectStatementAspectProperties _self_ = flowchartaspects.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartaspects.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self, final Hashtable<String, Object> context) {
    while ((((Boolean) ExpressionAspect.eval(_self.getGuard(), context))).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
