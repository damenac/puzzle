package flowchartaspects;

import flowchartaspects.PrintAspectPrintAspectProperties;
import flowchartaspects.StatementAspect;
import flowchartpck.Print;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Print.class)
@SuppressWarnings("all")
public class PrintAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Print _self, final Hashtable<String, Object> context) {
    flowchartaspects.PrintAspectPrintAspectProperties _self_ = flowchartaspects.PrintAspectPrintAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.Print){
     flowchartaspects.PrintAspect._privk3_eval(_self_, (flowchartpck.Print)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Print _self, final Hashtable<String, Object> context) {
    flowchartaspects.StatementAspectStatementAspectProperties _self_ = flowchartaspects.StatementAspectStatementAspectContext.getSelf(_self);
     flowchartaspects.StatementAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final PrintAspectPrintAspectProperties _self_, final Print _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>print(_input);
  }
}
