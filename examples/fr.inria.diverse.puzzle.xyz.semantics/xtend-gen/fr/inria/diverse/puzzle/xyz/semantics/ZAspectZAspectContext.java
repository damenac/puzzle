package fr.inria.diverse.puzzle.xyz.semantics;

import fr.inria.diverse.puzzle.xyz.semantics.ZAspectZAspectProperties;
import java.util.Map;
import xyz.Z;

@SuppressWarnings("all")
public class ZAspectZAspectContext {
  public final static ZAspectZAspectContext INSTANCE = new ZAspectZAspectContext();
  
  public static ZAspectZAspectProperties getSelf(final Z _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.xyz.semantics.ZAspectZAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Z, ZAspectZAspectProperties> map = new java.util.WeakHashMap<xyz.Z, fr.inria.diverse.puzzle.xyz.semantics.ZAspectZAspectProperties>();
  
  public Map<Z, ZAspectZAspectProperties> getMap() {
    return map;
  }
}
