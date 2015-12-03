package logo;

import java.util.Map;
import kmLogo.ControlStructure;
import logo.ControlStructureAspectControlStructureAspectProperties;

@SuppressWarnings("all")
public class ControlStructureAspectControlStructureAspectContext {
  public final static ControlStructureAspectControlStructureAspectContext INSTANCE = new ControlStructureAspectControlStructureAspectContext();
  
  public static ControlStructureAspectControlStructureAspectProperties getSelf(final ControlStructure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.ControlStructureAspectControlStructureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> map = new java.util.WeakHashMap<kmLogo.ControlStructure, logo.ControlStructureAspectControlStructureAspectProperties>();
  
  public Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> getMap() {
    return map;
  }
}
