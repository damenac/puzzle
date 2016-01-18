package Logo.logoprogram;

import Logo.Parameter;
import Logo.ParameterCall;
import Logo.logoprogram.Context;
import Logo.logoprogram.ParameterCallAspectParameterCallAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = ParameterCall.class)
@SuppressWarnings("all")
public class ParameterCallAspect {
  public static Object eval(final ParameterCall _self, final Context context) {
    Logo.logoprogram.ParameterCallAspectParameterCallAspectProperties _self_ = Logo.logoprogram.ParameterCallAspectParameterCallAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ParameterCallAspectParameterCallAspectProperties _self_, final ParameterCall _self, final Context context) {
    Parameter _parameter = _self.getParameter();
    return _parameter.eval(context);
  }
}
