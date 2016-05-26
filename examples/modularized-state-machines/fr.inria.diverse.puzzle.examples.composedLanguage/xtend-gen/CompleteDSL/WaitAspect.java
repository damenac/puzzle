package CompleteDSL;

import CompleteDSLPckg.Wait;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.StatementAspect;
import CompleteDSL.WaitAspectWaitAspectProperties;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void evalStatement(final Wait _self, final Hashtable<String, Object> context) {
    CompleteDSL.WaitAspectWaitAspectProperties _self_ = CompleteDSL.WaitAspectWaitAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Wait){
     CompleteDSL.WaitAspect._privk3_evalStatement(_self_, (CompleteDSLPckg.Wait)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalStatement(final Wait _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
     CompleteDSL.StatementAspect._privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final WaitAspectWaitAspectProperties _self_, final Wait _self, final Hashtable<String, Object> context) {
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
