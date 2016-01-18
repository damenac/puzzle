package Logo.logoprogram;

import Logo.ControlStructure;
import Logo.logoprogram.ControlStructureAspectControlStructureAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ControlStructureAspectControlStructureAspectContext {
  public final static ControlStructureAspectControlStructureAspectContext INSTANCE = new ControlStructureAspectControlStructureAspectContext();
  
  public static ControlStructureAspectControlStructureAspectProperties getSelf(final ControlStructure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.ControlStructureAspectControlStructureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> map = new java.util.WeakHashMap<Logo.ControlStructure, Logo.logoprogram.ControlStructureAspectControlStructureAspectProperties>();
  
  public Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> getMap() {
    return map;
  }
}
