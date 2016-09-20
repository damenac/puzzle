package semanticsLogo;

import Logo.VarReference;
import java.util.Map;
import semanticsLogo.VarReferenceVarReferenceAspectProperties;

@SuppressWarnings("all")
public class VarReferenceVarReferenceAspectContext {
  public final static VarReferenceVarReferenceAspectContext INSTANCE = new VarReferenceVarReferenceAspectContext();
  
  public static VarReferenceVarReferenceAspectProperties getSelf(final VarReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.VarReferenceVarReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarReference, VarReferenceVarReferenceAspectProperties> map = new java.util.WeakHashMap<Logo.VarReference, semanticsLogo.VarReferenceVarReferenceAspectProperties>();
  
  public Map<VarReference, VarReferenceVarReferenceAspectProperties> getMap() {
    return map;
  }
}
