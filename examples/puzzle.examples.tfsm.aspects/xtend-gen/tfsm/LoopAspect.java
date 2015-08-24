package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.ExpressionAspect;
import tfsm.Loop;
import tfsm.LoopAspectLoopAspectProperties;
import tfsm.Program;
import tfsm.ProgramAspect;
import tfsm.RelationalExpression;
import tfsm.StatementAspect;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self, final Hashtable<String, Object> context) {
    tfsm.LoopAspectLoopAspectProperties _self_ = tfsm.LoopAspectLoopAspectContext.getSelf(_self);
     if (_self instanceof tfsm.Loop){
     tfsm.LoopAspect._privk3_eval(_self_, (tfsm.Loop)_self,context);
    } else  if (_self instanceof tfsm.Statement){
     tfsm.StatementAspect.eval((tfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self, final Hashtable<String, Object> context) {
    while ((((Boolean) ExpressionAspect.eval(((RelationalExpression) _self.getGuard()), context))).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
