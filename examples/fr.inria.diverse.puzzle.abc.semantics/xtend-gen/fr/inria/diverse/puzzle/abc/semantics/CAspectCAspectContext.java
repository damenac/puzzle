package fr.inria.diverse.puzzle.abc.semantics;

import abc.C;
import fr.inria.diverse.puzzle.abc.semantics.CAspectCAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CAspectCAspectContext {
  public final static CAspectCAspectContext INSTANCE = new CAspectCAspectContext();
  
  public static CAspectCAspectProperties getSelf(final C _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.abc.semantics.CAspectCAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<C, CAspectCAspectProperties> map = new java.util.WeakHashMap<abc.C, fr.inria.diverse.puzzle.abc.semantics.CAspectCAspectProperties>();
  
  public Map<C, CAspectCAspectProperties> getMap() {
    return map;
  }
}
