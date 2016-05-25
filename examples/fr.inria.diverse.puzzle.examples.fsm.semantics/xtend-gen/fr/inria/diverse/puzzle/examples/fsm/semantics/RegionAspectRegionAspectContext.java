package fr.inria.diverse.puzzle.examples.fsm.semantics;

import fr.inria.diverse.puzzle.examples.fsm.semantics.RegionAspectRegionAspectProperties;
import fsm.Region;
import java.util.Map;

@SuppressWarnings("all")
public class RegionAspectRegionAspectContext {
  public final static RegionAspectRegionAspectContext INSTANCE = new RegionAspectRegionAspectContext();
  
  public static RegionAspectRegionAspectProperties getSelf(final Region _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.fsm.semantics.RegionAspectRegionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Region, RegionAspectRegionAspectProperties> map = new java.util.WeakHashMap<fsm.Region, fr.inria.diverse.puzzle.examples.fsm.semantics.RegionAspectRegionAspectProperties>();
  
  public Map<Region, RegionAspectRegionAspectProperties> getMap() {
    return map;
  }
}
