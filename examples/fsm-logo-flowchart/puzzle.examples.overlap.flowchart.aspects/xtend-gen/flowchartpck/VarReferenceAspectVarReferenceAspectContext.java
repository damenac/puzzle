package flowchartpck;

import flowchartpck.VarReference;
import flowchartpck.VarReferenceAspectVarReferenceAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class VarReferenceAspectVarReferenceAspectContext {
  public final static VarReferenceAspectVarReferenceAspectContext INSTANCE = new VarReferenceAspectVarReferenceAspectContext();
  
  public static VarReferenceAspectVarReferenceAspectProperties getSelf(final VarReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartpck.VarReferenceAspectVarReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> map = new java.util.WeakHashMap<flowchartpck.VarReference, flowchartpck.VarReferenceAspectVarReferenceAspectProperties>();
  
  public Map<VarReference, VarReferenceAspectVarReferenceAspectProperties> getMap() {
    return map;
  }
}
