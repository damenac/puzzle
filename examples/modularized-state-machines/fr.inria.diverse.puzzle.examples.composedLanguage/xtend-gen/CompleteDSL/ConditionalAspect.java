package CompleteDSL;

import CompleteDSLPckg.Conditional;
import CompleteDSLPckg.Expression;
import CompleteDSLPckg.Statement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.ConditionalAspectConditionalAspectProperties;
import CompleteDSL.StatementAspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void evalStatement(final Conditional _self, final Hashtable<String, Object> context) {
    CompleteDSL.ConditionalAspectConditionalAspectProperties _self_ = CompleteDSL.ConditionalAspectConditionalAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Conditional){
     CompleteDSL.ConditionalAspect._privk3_evalStatement(_self_, (CompleteDSLPckg.Conditional)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalStatement(final Conditional _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
     CompleteDSL.StatementAspect._privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self, final Hashtable<String, Object> context) {
    Expression _condition = _self.getCondition();
    Object _eval = ExpressionAspect.eval( _condition,context);
    Boolean conditionEval = ((Boolean) _eval);
    if ((conditionEval).booleanValue()) {
      EList<Statement> _body = _self.getBody();
      for (final Statement _statement : _body) {
        StatementAspect.evalStatement(_statement, context);
      }
    }
  }
}
