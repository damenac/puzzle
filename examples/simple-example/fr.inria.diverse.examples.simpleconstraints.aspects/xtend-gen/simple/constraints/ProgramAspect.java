package simple.constraints;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import simple.constraints.ConstraintAspect;
import simple.constraints.ProgramAspectProgramAspectProperties;
import simpleconstraints.Constraint;
import simpleconstraints.Program;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class ProgramAspect {
  public static boolean eval(final Program _self, final Hashtable<String, Object> context) {
    simple.constraints.ProgramAspectProgramAspectProperties _self_ = simple.constraints.ProgramAspectProgramAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final ProgramAspectProgramAspectProperties _self_, final Program _self, final Hashtable<String, Object> context) {
    EList<Constraint> _constraints = _self.getConstraints();
    for (final Constraint constraint : _constraints) {
      boolean _eval = ConstraintAspect.eval(constraint, context);
      boolean _equals = (_eval == false);
      if (_equals) {
        return false;
      }
    }
    return true;
  }
}
