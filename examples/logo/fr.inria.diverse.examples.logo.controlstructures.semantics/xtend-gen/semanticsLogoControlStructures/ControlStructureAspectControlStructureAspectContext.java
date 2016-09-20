package semanticsLogoControlStructures;

import ControlStructures.ControlStructure;
import java.util.Map;
import semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties;

@SuppressWarnings("all")
public class ControlStructureAspectControlStructureAspectContext {
  public final static ControlStructureAspectControlStructureAspectContext INSTANCE = new ControlStructureAspectControlStructureAspectContext();
  
  public static ControlStructureAspectControlStructureAspectProperties getSelf(final ControlStructure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> map = new java.util.WeakHashMap<ControlStructures.ControlStructure, semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties>();
  
  public Map<ControlStructure, ControlStructureAspectControlStructureAspectProperties> getMap() {
    return map;
  }
}
