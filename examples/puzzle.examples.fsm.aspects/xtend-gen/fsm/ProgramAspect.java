package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.Program;
import fsm.ProgramAspectProgramAspectProperties;
import fsm.Statement;
import fsm.StatementAspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class ProgramAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Program _self, final Hashtable<String, Object> context) {
    fsm.ProgramAspectProgramAspectProperties _self_ = fsm.ProgramAspectProgramAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ProgramAspectProgramAspectProperties _self_, final Program _self, final Hashtable<String, Object> context) {
    EList<Statement> _statements = _self.getStatements();
    for (final Statement _statement : _statements) {
      StatementAspect.eval(_statement, context);
    }
  }
}
