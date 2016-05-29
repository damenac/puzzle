package CompleteDSL;

import CompleteDSLPckg.Expression;
import CompleteDSLPckg.Loop;
import CompleteDSLPckg.Statement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.LoopAspectLoopAspectProperties;
import CompleteDSL.StatementAspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void evalStatement(final Loop _self, final Hashtable<String, Object> context) {
    CompleteDSL.LoopAspectLoopAspectProperties _self_ = CompleteDSL.LoopAspectLoopAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Loop){
     CompleteDSL.LoopAspect._privk3_evalStatement(_self_, (CompleteDSLPckg.Loop)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalStatement(final Loop _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
     CompleteDSL.StatementAspect._privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final LoopAspectLoopAspectProperties _self_, final Loop _self, final Hashtable<String, Object> context) {
    Expression _guard = _self.getGuard();
    Object _eval = ExpressionAspect.eval( _guard,context);
    Boolean guardEval = ((Boolean) _eval);
    while ((guardEval).booleanValue()) {
      EList<Statement> _body = _self.getBody();
      for (final Statement _statement : _body) {
        StatementAspect.evalStatement(_statement, context);
      }
    }
  }
}
