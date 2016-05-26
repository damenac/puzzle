package fr.inria.diverse.k3.examples.abc.semantics;

import ABC.C;
import fr.inria.diverse.k3.examples.abc.semantics.CAspectCAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CAspectCAspectContext {
  public final static CAspectCAspectContext INSTANCE = new CAspectCAspectContext();
  
  public static CAspectCAspectProperties getSelf(final C _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.examples.abc.semantics.CAspectCAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<C, CAspectCAspectProperties> map = new java.util.WeakHashMap<ABC.C, fr.inria.diverse.k3.examples.abc.semantics.CAspectCAspectProperties>();
  
  public Map<C, CAspectCAspectProperties> getMap() {
    return map;
  }
}
