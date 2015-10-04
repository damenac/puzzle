package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import tfsm.Statement;
import tfsm.StatementAspectStatementAspectProperties;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void eval(final Statement _self, final Hashtable<String, Object> context) {
    tfsm.StatementAspectStatementAspectProperties _self_ = tfsm.StatementAspectStatementAspectContext.getSelf(_self);
     if (_self instanceof tfsm.VarDecl){
     tfsm.VarDeclAspect.eval((tfsm.VarDecl)_self,context);
    } else  if (_self instanceof tfsm.Program){
     tfsm.ProgramAspect.eval((tfsm.Program)_self,context);
    } else  if (_self instanceof tfsm.Wait){
     tfsm.WaitAspect.eval((tfsm.Wait)_self,context);
    } else  if (_self instanceof tfsm.Assignation){
     tfsm.AssignationAspect.eval((tfsm.Assignation)_self,context);
    } else  if (_self instanceof tfsm.Loop){
     tfsm.LoopAspect.eval((tfsm.Loop)_self,context);
    } else  if (_self instanceof tfsm.Print){
     tfsm.PrintAspect.eval((tfsm.Print)_self,context);
    } else  if (_self instanceof tfsm.Conditional){
     tfsm.ConditionalAspect.eval((tfsm.Conditional)_self,context);
    } else  if (_self instanceof tfsm.Println){
     tfsm.PrintlnAspect.eval((tfsm.Println)_self,context);
    } else  if (_self instanceof tfsm.Statement){
     tfsm.StatementAspect._privk3_eval(_self_, (tfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final StatementAspectStatementAspectProperties _self_, final Statement _self, final Hashtable<String, Object> context) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
