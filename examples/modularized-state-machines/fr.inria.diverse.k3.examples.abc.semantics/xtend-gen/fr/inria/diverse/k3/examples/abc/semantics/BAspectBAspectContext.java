package fr.inria.diverse.k3.examples.abc.semantics;

import ABC.B;
import fr.inria.diverse.k3.examples.abc.semantics.BAspectBAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BAspectBAspectContext {
  public final static BAspectBAspectContext INSTANCE = new BAspectBAspectContext();
  
  public static BAspectBAspectProperties getSelf(final B _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.examples.abc.semantics.BAspectBAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<B, BAspectBAspectProperties> map = new java.util.WeakHashMap<ABC.B, fr.inria.diverse.k3.examples.abc.semantics.BAspectBAspectProperties>();
  
  public Map<B, BAspectBAspectProperties> getMap() {
    return map;
  }
}
