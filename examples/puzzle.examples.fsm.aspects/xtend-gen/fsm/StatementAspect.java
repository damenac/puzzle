package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.Statement;
import fsm.StatementAspectStatementAspectProperties;
import java.util.Hashtable;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void eval(final Statement _self, final Hashtable<String, Object> context) {
    fsm.StatementAspectStatementAspectProperties _self_ = fsm.StatementAspectStatementAspectContext.getSelf(_self);
     if (_self instanceof fsm.Print){
     fsm.PrintAspect.eval((fsm.Print)_self,context);
    } else  if (_self instanceof fsm.Assignation){
     fsm.AssignationAspect.eval((fsm.Assignation)_self,context);
    } else  if (_self instanceof fsm.Wait){
     fsm.WaitAspect.eval((fsm.Wait)_self,context);
    } else  if (_self instanceof fsm.Println){
     fsm.PrintlnAspect.eval((fsm.Println)_self,context);
    } else  if (_self instanceof fsm.Loop){
     fsm.LoopAspect.eval((fsm.Loop)_self,context);
    } else  if (_self instanceof fsm.Program){
     fsm.ProgramAspect.eval((fsm.Program)_self,context);
    } else  if (_self instanceof fsm.VarDecl){
     fsm.VarDeclAspect.eval((fsm.VarDecl)_self,context);
    } else  if (_self instanceof fsm.Conditional){
     fsm.ConditionalAspect.eval((fsm.Conditional)_self,context);
    } else  if (_self instanceof fsm.Statement){
     fsm.StatementAspect._privk3_eval(_self_, (fsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final StatementAspectStatementAspectProperties _self_, final Statement _self, final Hashtable<String, Object> context) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
