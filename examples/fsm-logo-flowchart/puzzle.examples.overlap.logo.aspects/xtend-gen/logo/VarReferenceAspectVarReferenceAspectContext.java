package logo;

import java.util.Map;
import kmLogo.VarReference;
import logo.VarReferenceAspectVarReferenceAspectProperties;

@SuppressWarnings("all")
public class VarReferenceAspectVarReferenceAspectContext {
  public final static VarReferenceAspectVarReferenceAspectContext INSTANCE = new VarReferenceAspectVarReferenceAspectContext();
  
  public static VarReferenceAspectVarReferenceAspectProperties getSelf(final VarReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.VarReferenceAspectVarReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> map = new java.util.WeakHashMap<kmLogo.VarReference, logo.VarReferenceAspectVarReferenceAspectProperties>();
  
  public Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> getMap() {
    return map;
  }
}
