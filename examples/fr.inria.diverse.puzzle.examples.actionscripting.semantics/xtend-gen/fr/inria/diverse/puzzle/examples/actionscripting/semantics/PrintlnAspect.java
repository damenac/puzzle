package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Println;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.PrintlnAspectPrintlnAspectProperties;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.StatementAspect;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Println.class)
@SuppressWarnings("all")
public class PrintlnAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Println _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.actionscripting.semantics.PrintlnAspectPrintlnAspectProperties _self_ = fr.inria.diverse.puzzle.examples.actionscripting.semantics.PrintlnAspectPrintlnAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final PrintlnAspectPrintlnAspectProperties _self_, final Println _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>println(_input);
  }
}
