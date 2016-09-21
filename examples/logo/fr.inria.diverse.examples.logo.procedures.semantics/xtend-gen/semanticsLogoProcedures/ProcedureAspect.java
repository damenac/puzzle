package semanticsLogoProcedures;

import Procedures.Instruction;
import Procedures.Procedure;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import semanticsLogoProcedures.ProcedureAspectProcedureAspectProperties;

@Aspect(className = Procedure.class)
@SuppressWarnings("all")
public class ProcedureAspect {
  public static void evalInstruction(final Procedure _self, final Hashtable<String, Object> context) {
    semanticsLogoProcedures.ProcedureAspectProcedureAspectProperties _self_ = semanticsLogoProcedures.ProcedureAspectProcedureAspectContext.getSelf(_self);
    _privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final ProcedureAspectProcedureAspectProperties _self_, final Procedure _self, final Hashtable<String, Object> context) {
    EList<Instruction> _body = _self.getBody();
    for (final Instruction _instruction : _body) {
      _instruction.evalInstruction(context);
    }
  }
}
