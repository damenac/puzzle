package flowchartpck;

import flowchartpck.Println;
import flowchartpck.PrintlnAspectPrintlnAspectProperties;
import flowchartpck.StatementAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Println.class)
@SuppressWarnings("all")
public class PrintlnAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Println _self, final Hashtable<String, Object> context) {
    flowchartpck.PrintlnAspectPrintlnAspectProperties _self_ = flowchartpck.PrintlnAspectPrintlnAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.Println){
     flowchartpck.PrintlnAspect._privk3_eval(_self_, (flowchartpck.Println)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Println _self, final Hashtable<String, Object> context) {
    flowchartpck.StatementAspectStatementAspectProperties _self_ = flowchartpck.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartpck.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final PrintlnAspectPrintlnAspectProperties _self_, final Println _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>println(_input);
  }
}
