package CompleteDSL;

import CompleteDSLPckg.Assignation;
import CompleteDSLPckg.Block;
import CompleteDSLPckg.Conditional;
import CompleteDSLPckg.Loop;
import CompleteDSLPckg.Print;
import CompleteDSLPckg.Println;
import CompleteDSLPckg.Statement;
import CompleteDSLPckg.VarDecl;
import CompleteDSLPckg.Wait;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import CompleteDSL.AssignationAspect;
import CompleteDSL.BlockAspect;
import CompleteDSL.ConditionalAspect;
import CompleteDSL.LoopAspect;
import CompleteDSL.PrintAspect;
import CompleteDSL.PrintlnAspect;
import CompleteDSL.StatementAspectStatementAspectProperties;
import CompleteDSL.VarDeclAspect;
import CompleteDSL.WaitAspect;
import java.util.Hashtable;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public class StatementAspect {
  @Main
  public static void evalStatement(final Statement _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
    _privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final StatementAspectStatementAspectProperties _self_, final Statement _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Block)) {
      BlockAspect.evalStatement(((Block) _self), context);
    } else {
      if ((_self instanceof Conditional)) {
        ConditionalAspect.evalStatement(((Conditional) _self), context);
      } else {
        if ((_self instanceof Loop)) {
          LoopAspect.evalStatement(((Loop) _self), context);
        } else {
          if ((_self instanceof VarDecl)) {
            VarDeclAspect.evalStatement(((VarDecl) _self), context);
          } else {
            if ((_self instanceof Assignation)) {
              AssignationAspect.evalStatement(((Assignation) _self), context);
            } else {
              if ((_self instanceof Print)) {
                PrintAspect.evalStatement(((Print) _self), context);
              } else {
                if ((_self instanceof Println)) {
                  PrintlnAspect.evalStatement(((Println) _self), context);
                } else {
                  if ((_self instanceof Wait)) {
                    WaitAspect.evalStatement(((Wait) _self), context);
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
