package semanticsLogoProcedures;

import Procedures.Block;
import Procedures.Procedure;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoProcedures.ProcedureAspectProcedureAspectProperties;

@Aspect(className = Procedure.class)
@SuppressWarnings("all")
public class ProcedureAspect {
  public static void eval(final Procedure _self, final Hashtable<String, Object> context) {
    semanticsLogoProcedures.ProcedureAspectProcedureAspectProperties _self_ = semanticsLogoProcedures.ProcedureAspectProcedureAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProcedureAspectProcedureAspectProperties _self_, final Procedure _self, final Hashtable<String, Object> context) {
    Block _body = _self.getBody();
    _body.eval(context);
  }
}
