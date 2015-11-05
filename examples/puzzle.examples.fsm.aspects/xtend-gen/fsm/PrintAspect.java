package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.Print;
import fsm.PrintAspectPrintAspectProperties;
import fsm.StatementAspect;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Print.class)
@SuppressWarnings("all")
public class PrintAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Print _self, final Hashtable<String, Object> context) {
    fsm.PrintAspectPrintAspectProperties _self_ = fsm.PrintAspectPrintAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final PrintAspectPrintAspectProperties _self_, final Print _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>print(_input);
  }
}
