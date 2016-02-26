package fr.inria.diverse.puzzle.xyz.semantics;

import fr.inria.diverse.puzzle.xyz.semantics.XAspectXAspectProperties;
import java.util.Map;
import xyz.X;

@SuppressWarnings("all")
public class XAspectXAspectContext {
  public final static XAspectXAspectContext INSTANCE = new XAspectXAspectContext();
  
  public static XAspectXAspectProperties getSelf(final X _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.xyz.semantics.XAspectXAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<X, XAspectXAspectProperties> map = new java.util.WeakHashMap<xyz.X, fr.inria.diverse.puzzle.xyz.semantics.XAspectXAspectProperties>();
  
  public Map<X, XAspectXAspectProperties> getMap() {
    return map;
  }
}
