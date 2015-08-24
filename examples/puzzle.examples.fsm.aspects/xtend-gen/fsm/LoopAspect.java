package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.ExpressionAspect;
import fsm.Loop;
import fsm.LoopAspectLoopAspectProperties;
import fsm.Program;
import fsm.ProgramAspect;
import fsm.RelationalExpression;
import fsm.StatementAspect;
import java.util.Hashtable;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self, final Hashtable<String, Object> context) {
    fsm.LoopAspectLoopAspectProperties _self_ = fsm.LoopAspectLoopAspectContext.getSelf(_self);
     if (_self instanceof fsm.Loop){
     fsm.LoopAspect._privk3_eval(_self_, (fsm.Loop)_self,context);
    } else  if (_self instanceof fsm.Statement){
     fsm.StatementAspect.eval((fsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self, final Hashtable<String, Object> context) {
    while ((((Boolean) ExpressionAspect.eval(((RelationalExpression) _self.getGuard()), context))).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
