package CompleteDSL;

import CompleteDSLPckg.Procedure;
import CompleteDSLPckg.ProcedureCall;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.ProcedureAspect;
import CompleteDSL.ProcedureCallAspectProcedureCallAspectProperties;

@Aspect(className = ProcedureCall.class)
@SuppressWarnings("all")
public class ProcedureCallAspect {
  public static void eval(final ProcedureCall _self, final Hashtable<String, Object> context) {
    CompleteDSL.ProcedureCallAspectProcedureCallAspectProperties _self_ = CompleteDSL.ProcedureCallAspectProcedureCallAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProcedureCallAspectProcedureCallAspectProperties _self_, final ProcedureCall _self, final Hashtable<String, Object> context) {
    Procedure _ref = _self.getRef();
    ProcedureAspect.eval(_ref, context);
  }
}
