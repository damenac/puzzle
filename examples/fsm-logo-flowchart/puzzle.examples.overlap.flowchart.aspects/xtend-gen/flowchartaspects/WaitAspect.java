package flowchartaspects;

import flowchartaspects.StatementAspect;
import flowchartaspects.WaitAspectWaitAspectProperties;
import flowchartpck.Wait;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Wait _self, final Hashtable<String, Object> context) {
    flowchartaspects.WaitAspectWaitAspectProperties _self_ = flowchartaspects.WaitAspectWaitAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.Wait){
     flowchartaspects.WaitAspect._privk3_eval(_self_, (flowchartpck.Wait)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Wait _self, final Hashtable<String, Object> context) {
    flowchartaspects.StatementAspectStatementAspectProperties _self_ = flowchartaspects.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartaspects.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final WaitAspectWaitAspectProperties _self_, final Wait _self, final Hashtable<String, Object> context) {
    try {
      synchronized (_self) {
        long _miliseconds = _self.getMiliseconds();
        _self.wait(_miliseconds);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
