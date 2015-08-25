package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import hfsm.Statement;
import hfsm.StatementAspectStatementAspectProperties;
import java.util.Hashtable;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void eval(final Statement _self, final Hashtable<String, Object> context) {
    hfsm.StatementAspectStatementAspectProperties _self_ = hfsm.StatementAspectStatementAspectContext.getSelf(_self);
     if (_self instanceof hfsm.Loop){
     hfsm.LoopAspect.eval((hfsm.Loop)_self,context);
    } else  if (_self instanceof hfsm.Conditional){
     hfsm.ConditionalAspect.eval((hfsm.Conditional)_self,context);
    } else  if (_self instanceof hfsm.Print){
     hfsm.PrintAspect.eval((hfsm.Print)_self,context);
    } else  if (_self instanceof hfsm.Assignation){
     hfsm.AssignationAspect.eval((hfsm.Assignation)_self,context);
    } else  if (_self instanceof hfsm.Println){
     hfsm.PrintlnAspect.eval((hfsm.Println)_self,context);
    } else  if (_self instanceof hfsm.Program){
     hfsm.ProgramAspect.eval((hfsm.Program)_self,context);
    } else  if (_self instanceof hfsm.VarDecl){
     hfsm.VarDeclAspect.eval((hfsm.VarDecl)_self,context);
    } else  if (_self instanceof hfsm.Wait){
     hfsm.WaitAspect.eval((hfsm.Wait)_self,context);
    } else  if (_self instanceof hfsm.Statement){
     hfsm.StatementAspect._privk3_eval(_self_, (hfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final StatementAspectStatementAspectProperties _self_, final Statement _self, final Hashtable<String, Object> context) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
