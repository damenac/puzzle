package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.Println;
import hfsm.PrintlnAspectPrintlnAspectProperties;
import hfsm.StatementAspect;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Println.class)
@SuppressWarnings("all")
public class PrintlnAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Println _self, final Hashtable<String, Object> context) {
    hfsm.PrintlnAspectPrintlnAspectProperties _self_ = hfsm.PrintlnAspectPrintlnAspectContext.getSelf(_self);
     if (_self instanceof hfsm.Println){
     hfsm.PrintlnAspect._privk3_eval(_self_, (hfsm.Println)_self,context);
    } else  if (_self instanceof hfsm.Statement){
     hfsm.StatementAspect.eval((hfsm.Statement)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final PrintlnAspectPrintlnAspectProperties _self_, final Println _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>println(_input);
  }
}
