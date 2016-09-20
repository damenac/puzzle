package CompleteDSL;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import CompleteDSL.LiteralAspect;
import CompleteDSL.StringAspectStringAspectProperties;

@Aspect(className = CompleteDSLPckg.String.class)
@SuppressWarnings("all")
public class StringAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final CompleteDSLPckg.String _self, final Hashtable<String, Object> context) {
    CompleteDSL.StringAspectStringAspectProperties _self_ = CompleteDSL.StringAspectStringAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof CompleteDSLPckg.String){
    result = CompleteDSL.StringAspect._privk3_eval(_self_, (CompleteDSLPckg.String)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final CompleteDSLPckg.String _self, final Hashtable<String, Object> context) {
    CompleteDSL.LiteralAspectLiteralAspectProperties _self_ = CompleteDSL.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  CompleteDSL.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringAspectStringAspectProperties _self_, final CompleteDSLPckg.String _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
