package flowchartaspects;

import flowchartaspects.PrintlnAspectPrintlnAspectProperties;
import flowchartaspects.StatementAspect;
import flowchartpck.Println;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Println.class)
@SuppressWarnings("all")
public class PrintlnAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Println _self, final Hashtable<String, Object> context) {
    flowchartaspects.PrintlnAspectPrintlnAspectProperties _self_ = flowchartaspects.PrintlnAspectPrintlnAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Println _self, final Hashtable<String, Object> context) {
    flowchartaspects.StatementAspectStatementAspectProperties _self_ = flowchartaspects.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartaspects.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final PrintlnAspectPrintlnAspectProperties _self_, final Println _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>println(_input);
  }
}
