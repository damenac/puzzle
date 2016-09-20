package CompleteDSL;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import CompleteDSL.IntegerAspectIntegerAspectProperties;
import CompleteDSL.LiteralAspect;

@Aspect(className = CompleteDSLPckg.Integer.class)
@SuppressWarnings("all")
public class IntegerAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final CompleteDSLPckg.Integer _self, final Hashtable<String, Object> context) {
    CompleteDSL.IntegerAspectIntegerAspectProperties _self_ = CompleteDSL.IntegerAspectIntegerAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof CompleteDSLPckg.Integer){
    result = CompleteDSL.IntegerAspect._privk3_eval(_self_, (CompleteDSLPckg.Integer)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final CompleteDSLPckg.Integer _self, final Hashtable<String, Object> context) {
    CompleteDSL.LiteralAspectLiteralAspectProperties _self_ = CompleteDSL.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  CompleteDSL.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerAspectIntegerAspectProperties _self_, final CompleteDSLPckg.Integer _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
