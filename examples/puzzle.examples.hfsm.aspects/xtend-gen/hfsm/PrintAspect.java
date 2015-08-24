package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.Print;
import hfsm.PrintAspectPrintAspectProperties;
import hfsm.StatementAspect;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Print.class)
@SuppressWarnings("all")
public class PrintAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Print _self, final Hashtable<String, Object> context) {
    hfsm.PrintAspectPrintAspectProperties _self_ = hfsm.PrintAspectPrintAspectContext.getSelf(_self);
     if (_self instanceof hfsm.Print){
     hfsm.PrintAspect._privk3_eval(_self_, (hfsm.Print)_self,context);
    } else  if (_self instanceof hfsm.Statement){
     hfsm.StatementAspect.eval((hfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final PrintAspectPrintAspectProperties _self_, final Print _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>print(_input);
  }
}
