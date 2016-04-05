package flowchartaspects;

import flowchartaspects.AssignationAspect;
import flowchartaspects.ConditionalAspect;
import flowchartaspects.LoopAspect;
import flowchartaspects.PrintAspect;
import flowchartaspects.PrintlnAspect;
import flowchartaspects.StatementAspectStatementAspectProperties;
import flowchartaspects.VarDeclAspect;
import flowchartaspects.WaitAspect;
import flowchartpck.Assignation;
import flowchartpck.Conditional;
import flowchartpck.Loop;
import flowchartpck.Print;
import flowchartpck.Println;
import flowchartpck.Program;
import flowchartpck.Statement;
import flowchartpck.VarDecl;
import flowchartpck.Wait;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public class StatementAspect {
  public static void eval(final Statement _self, final Hashtable<String, Object> context) {
    flowchartaspects.StatementAspectStatementAspectProperties _self_ = flowchartaspects.StatementAspectStatementAspectContext.getSelf(_self);
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
