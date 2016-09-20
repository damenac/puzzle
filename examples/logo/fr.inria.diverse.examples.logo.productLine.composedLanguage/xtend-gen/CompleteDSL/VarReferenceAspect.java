package CompleteDSL;

import CompleteDSLPckg.VarDecl;
import CompleteDSLPckg.VarReference;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.VarReferenceAspectVarReferenceAspectProperties;

@Aspect(className = VarReference.class)
@SuppressWarnings("all")
public class VarReferenceAspect {
  public static Object eval(final VarReference _self, final Hashtable<String, Object> context) {
    CompleteDSL.VarReferenceAspectVarReferenceAspectProperties _self_ = CompleteDSL.VarReferenceAspectVarReferenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final VarReferenceAspectVarReferenceAspectProperties _self_, final VarReference _self, final Hashtable<String, Object> context) {
    Object _get = context.get("variables");
    Hashtable<String, Object> variablesTable = ((Hashtable<String, Object>) _get);
    VarDecl _ref = _self.getRef();
    String _name = _ref.getName();
    return variablesTable.get(_name);
  }
}
