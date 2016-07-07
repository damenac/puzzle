package CompleteDSL;

import CompleteDSLPckg.Print;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.PrintAspectPrintAspectProperties;
import CompleteDSL.StatementAspect;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Print.class)
@SuppressWarnings("all")
public class PrintAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void evalStatement(final Print _self, final Hashtable<String, Object> context) {
    CompleteDSL.PrintAspectPrintAspectProperties _self_ = CompleteDSL.PrintAspectPrintAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Print){
     CompleteDSL.PrintAspect._privk3_evalStatement(_self_, (CompleteDSLPckg.Print)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalStatement(final Print _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
     CompleteDSL.StatementAspect._privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final PrintAspectPrintAspectProperties _self_, final Print _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>print(_input);
  }
}
