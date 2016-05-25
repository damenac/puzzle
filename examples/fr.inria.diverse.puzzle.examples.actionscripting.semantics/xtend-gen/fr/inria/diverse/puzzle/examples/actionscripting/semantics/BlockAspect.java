package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Block;
import actionscripting.Statement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.BlockAspectBlockAspectProperties;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect {
  @Main
  public static void eval(final Block _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.BlockAspectBlockAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final BlockAspectBlockAspectProperties _self_, final Block _self, final Hashtable<String, Object> context) {
    EList<Statement> _statements = _self.getStatements();
    for (final Statement _statement : _statements) {
      StatementAspect.eval(_statement, context);
    }
  }
}
