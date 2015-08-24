package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.StatementAspect;
import hfsm.Wait;
import hfsm.WaitAspectWaitAspectProperties;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Wait _self, final Hashtable<String, Object> context) {
    hfsm.WaitAspectWaitAspectProperties _self_ = hfsm.WaitAspectWaitAspectContext.getSelf(_self);
     if (_self instanceof hfsm.Wait){
     hfsm.WaitAspect._privk3_eval(_self_, (hfsm.Wait)_self,context);
    } else  if (_self instanceof hfsm.Statement){
     hfsm.StatementAspect.eval((hfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
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
