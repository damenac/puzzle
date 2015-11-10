package Flowchart.expression;

import ExpressionModule.BoolLit;
import FSMFlowchart.expression.LiteralAspect;
import Flowchart.expression.BoolLitAspectBoolLitAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Hashtable<String, Object> context) {
    Flowchart.expression.BoolLitAspectBoolLitAspectProperties _self_ = Flowchart.expression.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Hashtable<String, Object> context) {
    FSMFlowchart.expression.LiteralAspectLiteralAspectProperties _self_ = FSMFlowchart.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  FSMFlowchart.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("coucou!!!");
    return Boolean.valueOf(_self.isValue());
  }
}
