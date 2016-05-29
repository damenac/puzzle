package CompleteDSL;

import CompleteDSLPckg.Println;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import CompleteDSL.PrintlnAspectPrintlnAspectProperties;
import CompleteDSL.StatementAspect;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Println.class)
@SuppressWarnings("all")
public class PrintlnAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void evalStatement(final Println _self, final Hashtable<String, Object> context) {
    CompleteDSL.PrintlnAspectPrintlnAspectProperties _self_ = CompleteDSL.PrintlnAspectPrintlnAspectContext.getSelf(_self);
     if (_self instanceof CompleteDSLPckg.Println){
     CompleteDSL.PrintlnAspect._privk3_evalStatement(_self_, (CompleteDSLPckg.Println)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_evalStatement(final Println _self, final Hashtable<String, Object> context) {
    CompleteDSL.StatementAspectStatementAspectProperties _self_ = CompleteDSL.StatementAspectStatementAspectContext.getSelf(_self);
     CompleteDSL.StatementAspect._privk3_evalStatement(_self_, _self,context);
  }
  
  protected static void _privk3_evalStatement(final PrintlnAspectPrintlnAspectProperties _self_, final Println _self, final Hashtable<String, Object> context) {
    String _input = _self.getInput();
    InputOutput.<String>println(_input);
  }
}
