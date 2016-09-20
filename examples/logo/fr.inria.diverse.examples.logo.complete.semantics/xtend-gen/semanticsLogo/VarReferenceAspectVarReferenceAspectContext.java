package semanticsLogo;

import Logo.VarReference;
import java.util.Map;
import semanticsLogo.VarReferenceAspectVarReferenceAspectProperties;

@SuppressWarnings("all")
public class VarReferenceAspectVarReferenceAspectContext {
  public final static VarReferenceAspectVarReferenceAspectContext INSTANCE = new VarReferenceAspectVarReferenceAspectContext();
  
  public static VarReferenceAspectVarReferenceAspectProperties getSelf(final VarReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.VarReferenceAspectVarReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> map = new java.util.WeakHashMap<Logo.VarReference, semanticsLogo.VarReferenceAspectVarReferenceAspectProperties>();
  
  public Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> getMap() {
    return map;
  }
}
