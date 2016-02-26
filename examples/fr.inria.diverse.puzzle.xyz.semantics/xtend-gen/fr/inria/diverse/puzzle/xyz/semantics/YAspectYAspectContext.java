package fr.inria.diverse.puzzle.xyz.semantics;

import fr.inria.diverse.puzzle.xyz.semantics.YAspectYAspectProperties;
import java.util.Map;
import xyz.Y;

@SuppressWarnings("all")
public class YAspectYAspectContext {
  public final static YAspectYAspectContext INSTANCE = new YAspectYAspectContext();
  
  public static YAspectYAspectProperties getSelf(final Y _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.xyz.semantics.YAspectYAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Y, YAspectYAspectProperties> map = new java.util.WeakHashMap<xyz.Y, fr.inria.diverse.puzzle.xyz.semantics.YAspectYAspectProperties>();
  
  public Map<Y, YAspectYAspectProperties> getMap() {
    return map;
  }
}
