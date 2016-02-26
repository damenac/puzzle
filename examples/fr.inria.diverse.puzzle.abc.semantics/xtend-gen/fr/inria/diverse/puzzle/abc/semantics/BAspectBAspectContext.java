package fr.inria.diverse.puzzle.abc.semantics;

import abc.B;
import fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BAspectBAspectContext {
  public final static BAspectBAspectContext INSTANCE = new BAspectBAspectContext();
  
  public static BAspectBAspectProperties getSelf(final B _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<B, BAspectBAspectProperties> map = new java.util.WeakHashMap<abc.B, fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectProperties>();
  
  public Map<B, BAspectBAspectProperties> getMap() {
    return map;
  }
}
