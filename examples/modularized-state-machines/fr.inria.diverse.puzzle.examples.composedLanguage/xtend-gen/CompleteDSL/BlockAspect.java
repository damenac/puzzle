package CompleteDSL;

import CompleteDSLPckg.Block;
import CompleteDSLPckg.Statement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import CompleteDSL.BlockAspectBlockAspectProperties;
import CompleteDSL.StatementAspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect {
  public static void evalStatement(final Block _self, final Hashtable<String, Object> context) {
    CompleteDSL.BlockAspectBlockAspectProperties _self_ = CompleteDSL.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final BlockAspectBlockAspectProperties _self_, final Block _self, final Hashtable<String, Object> context) {
    EList<Statement> _statements = _self.getStatements();
    for (final Statement _statement : _statements) {
      StatementAspect.evalStatement(_statement, context);
    }
  }
}
