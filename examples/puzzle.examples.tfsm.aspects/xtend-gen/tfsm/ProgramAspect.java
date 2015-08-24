package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import tfsm.Program;
import tfsm.ProgramAspectProgramAspectProperties;
import tfsm.Statement;
import tfsm.StatementAspect;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class ProgramAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Program _self, final Hashtable<String, Object> context) {
    tfsm.ProgramAspectProgramAspectProperties _self_ = tfsm.ProgramAspectProgramAspectContext.getSelf(_self);
     if (_self instanceof tfsm.Program){
     tfsm.ProgramAspect._privk3_eval(_self_, (tfsm.Program)_self,context);
    } else  if (_self instanceof tfsm.Statement){
     tfsm.StatementAspect.eval((tfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final ProgramAspectProgramAspectProperties _self_, final Program _self, final Hashtable<String, Object> context) {
    EList<Statement> _statements = _self.getStatements();
    for (final Statement _statement : _statements) {
      StatementAspect.eval(_statement, context);
    }
  }
}
