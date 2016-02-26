package flowchartpck;

import flowchartpck.Assignation;
import flowchartpck.AssignationAspect;
import flowchartpck.Conditional;
import flowchartpck.ConditionalAspect;
import flowchartpck.Loop;
import flowchartpck.LoopAspect;
import flowchartpck.Print;
import flowchartpck.PrintAspect;
import flowchartpck.Println;
import flowchartpck.PrintlnAspect;
import flowchartpck.Program;
import flowchartpck.Statement;
import flowchartpck.StatementAspectStatementAspectProperties;
import flowchartpck.VarDecl;
import flowchartpck.VarDeclAspect;
import flowchartpck.Wait;
import flowchartpck.WaitAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public class StatementAspect {
  public static void eval(final Statement _self, final Hashtable<String, Object> context) {
    flowchartpck.StatementAspectStatementAspectProperties _self_ = flowchartpck.StatementAspectStatementAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final StatementAspectStatementAspectProperties _self_, final Statement _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Program)) {
      StatementAspect.eval(((Program) _self), context);
    } else {
      if ((_self instanceof Conditional)) {
        ConditionalAspect.eval(((Conditional) _self), context);
      } else {
        if ((_self instanceof Loop)) {
          LoopAspect.eval(((Loop) _self), context);
        } else {
          if ((_self instanceof Println)) {
            PrintlnAspect.eval(((Println) _self), context);
          } else {
            if ((_self instanceof Print)) {
              PrintAspect.eval(((Print) _self), context);
            } else {
              if ((_self instanceof Assignation)) {
                AssignationAspect.eval(((Assignation) _self), context);
              } else {
                if ((_self instanceof Wait)) {
                  WaitAspect.eval(((Wait) _self), context);
                } else {
                  if ((_self instanceof VarDecl)) {
                    VarDeclAspect.eval(((VarDecl) _self), context);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
