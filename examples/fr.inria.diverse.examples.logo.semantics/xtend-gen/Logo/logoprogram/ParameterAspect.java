package Logo.logoprogram;

import Logo.Parameter;
import Logo.logoprogram.Context;
import Logo.logoprogram.ParameterAspectParameterAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Parameter.class)
@SuppressWarnings("all")
public class ParameterAspect {
  public static int eval(final Parameter _self, final Context context) {
    Logo.logoprogram.ParameterAspectParameterAspectProperties _self_ = Logo.logoprogram.ParameterAspectParameterAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  protected static int _privk3_eval(final ParameterAspectParameterAspectProperties _self_, final Parameter _self, final Context context) {
    Hashtable<String, Integer> _peek = context.peek();
    String _name = _self.getName();
    return (_peek.get(_name)).intValue();
  }
}
