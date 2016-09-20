package CompleteDSL;

import CompleteDSLPckg.VarReference;
import java.util.Map;
import CompleteDSL.VarReferenceAspectVarReferenceAspectProperties;

@SuppressWarnings("all")
public class VarReferenceAspectVarReferenceAspectContext {
  public final static VarReferenceAspectVarReferenceAspectContext INSTANCE = new VarReferenceAspectVarReferenceAspectContext();
  
  public static VarReferenceAspectVarReferenceAspectProperties getSelf(final VarReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.VarReferenceAspectVarReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.VarReference, CompleteDSL.VarReferenceAspectVarReferenceAspectProperties>();
  
  public Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> getMap() {
    return map;
  }
}
