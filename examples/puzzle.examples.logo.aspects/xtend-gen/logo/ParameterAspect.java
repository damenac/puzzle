package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import kmLogo.Parameter;
import logo.Context;
import logo.ParameterAspectParameterAspectProperties;

@Aspect(className = Parameter.class)
@SuppressWarnings("all")
public class ParameterAspect {
  public static int eval(final Parameter _self, final Context context) {
    logo.ParameterAspectParameterAspectProperties _self_ = logo.ParameterAspectParameterAspectContext.getSelf(_self);
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
