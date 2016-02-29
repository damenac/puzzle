package fr.inria.diverse.k3.examples.abc.semantics;

import ABC.A;
import fr.inria.diverse.k3.examples.abc.semantics.AAspectAAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AAspectAAspectContext {
  public final static AAspectAAspectContext INSTANCE = new AAspectAAspectContext();
  
  public static AAspectAAspectProperties getSelf(final A _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.examples.abc.semantics.AAspectAAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<A, AAspectAAspectProperties> map = new java.util.WeakHashMap<ABC.A, fr.inria.diverse.k3.examples.abc.semantics.AAspectAAspectProperties>();
  
  public Map<A, AAspectAAspectProperties> getMap() {
    return map;
  }
}
