package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;
import tfsm.Print;
import tfsm.PrintAspectPrintAspectProperties;
import tfsm.StatementAspect;

@Aspect(className = Print.class)
@SuppressWarnings("all")
public class PrintAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Print _self, final Hashtable<String, Object> context) {
    tfsm.PrintAspectPrintAspectProperties _self_ = tfsm.PrintAspectPrintAspectContext.getSelf(_self);
     if (_self instanceof tfsm.Print){
     tfsm.PrintAspect._privk3_eval(_self_, (tfsm.Print)_self,context);
    } else  if (_self instanceof tfsm.Statement){
     tfsm.StatementAspect.eval((tfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final PrintAspectPrintAspectProperties _self_, final Print _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>print(_input);
  }
}
