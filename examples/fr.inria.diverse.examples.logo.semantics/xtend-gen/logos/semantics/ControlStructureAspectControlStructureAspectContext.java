package logos.semantics;

import Logo.ControlStructure;
import java.util.Map;
import logos.semantics.ControlStructureAspectControlStructureAspectProperties;

@SuppressWarnings("all")
public class ControlStructureAspectControlStructureAspectContext {
  public final static ControlStructureAspectControlStructureAspectContext INSTANCE = new ControlStructureAspectControlStructureAspectContext();
  
  public static ControlStructureAspectControlStructureAspectProperties getSelf(final ControlStructure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.ControlStructureAspectControlStructureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> map = new java.util.WeakHashMap<Logo.ControlStructure, logos.semantics.ControlStructureAspectControlStructureAspectProperties>();
  
  public Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> getMap() {
    return map;
  }
}
