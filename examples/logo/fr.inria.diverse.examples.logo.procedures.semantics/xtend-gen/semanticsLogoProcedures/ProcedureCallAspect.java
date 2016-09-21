package semanticsLogoProcedures;

import Procedures.Procedure;
import Procedures.ProcedureCall;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoProcedures.ProcedureCallAspectProcedureCallAspectProperties;

@Aspect(className = ProcedureCall.class)
@SuppressWarnings("all")
public class ProcedureCallAspect {
  public static void eval(final ProcedureCall _self, final Hashtable<String, Object> context) {
    semanticsLogoProcedures.ProcedureCallAspectProcedureCallAspectProperties _self_ = semanticsLogoProcedures.ProcedureCallAspectProcedureCallAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProcedureCallAspectProcedureCallAspectProperties _self_, final ProcedureCall _self, final Hashtable<String, Object> context) {
    Procedure _ref = _self.getRef();
    _ref.evalInstruction(context);
  }
}
