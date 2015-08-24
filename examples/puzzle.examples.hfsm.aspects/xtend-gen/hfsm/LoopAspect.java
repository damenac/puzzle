package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.ExpressionAspect;
import hfsm.Loop;
import hfsm.LoopAspectLoopAspectProperties;
import hfsm.Program;
import hfsm.ProgramAspect;
import hfsm.RelationalExpression;
import hfsm.StatementAspect;
import java.util.Hashtable;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self, final Hashtable<String, Object> context) {
    hfsm.LoopAspectLoopAspectProperties _self_ = hfsm.LoopAspectLoopAspectContext.getSelf(_self);
     if (_self instanceof hfsm.Loop){
     hfsm.LoopAspect._privk3_eval(_self_, (hfsm.Loop)_self,context);
    } else  if (_self instanceof hfsm.Statement){
     hfsm.StatementAspect.eval((hfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self, final Hashtable<String, Object> context) {
    while ((((Boolean) ExpressionAspect.eval(((RelationalExpression) _self.getGuard()), context))).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
