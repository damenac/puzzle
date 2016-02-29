package fsmaspects;

import fsm.VarReference;
import fsmaspects.VarReferenceAspectVarReferenceAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class VarReferenceAspectVarReferenceAspectContext {
  public final static VarReferenceAspectVarReferenceAspectContext INSTANCE = new VarReferenceAspectVarReferenceAspectContext();
  
  public static VarReferenceAspectVarReferenceAspectProperties getSelf(final VarReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.VarReferenceAspectVarReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> map = new java.util.WeakHashMap<fsm.VarReference, fsmaspects.VarReferenceAspectVarReferenceAspectProperties>();
  
  public Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> getMap() {
    return map;
  }
}
