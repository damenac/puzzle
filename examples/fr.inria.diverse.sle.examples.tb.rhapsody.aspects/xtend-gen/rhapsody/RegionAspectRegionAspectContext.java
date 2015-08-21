package rhapsody;

import java.util.Map;
import rhapsody.Region;
import rhapsody.RegionAspectRegionAspectProperties;

@SuppressWarnings("all")
public class RegionAspectRegionAspectContext {
  public final static RegionAspectRegionAspectContext INSTANCE = new RegionAspectRegionAspectContext();
  
  public static RegionAspectRegionAspectProperties getSelf(final Region _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rhapsody.RegionAspectRegionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Region, RegionAspectRegionAspectProperties> map = new java.util.WeakHashMap<rhapsody.Region, rhapsody.RegionAspectRegionAspectProperties>();
  
  public Map<Region, RegionAspectRegionAspectProperties> getMap() {
    return map;
  }
}
