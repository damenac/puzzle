package CompleteDSL;

import CompleteDSLPckg.Block;
import CompleteDSLPckg.Procedure;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.ProcedureAspectProcedureAspectProperties;

@Aspect(className = Procedure.class)
@SuppressWarnings("all")
public class ProcedureAspect {
  public static void eval(final Procedure _self, final Hashtable<String, Object> context) {
    CompleteDSL.ProcedureAspectProcedureAspectProperties _self_ = CompleteDSL.ProcedureAspectProcedureAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProcedureAspectProcedureAspectProperties _self_, final Procedure _self, final Hashtable<String, Object> context) {
    Block _body = _self.getBody();
    BlockAspect.eval( _body,context);
  }
}
