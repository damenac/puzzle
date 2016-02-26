package fr.inria.diverse.puzzle.pqr.semantics;

import fr.inria.diverse.puzzle.pqr.semantics.PAspectPAspectProperties;
import java.util.Map;
import pqr.P;

@SuppressWarnings("all")
public class PAspectPAspectContext {
  public final static PAspectPAspectContext INSTANCE = new PAspectPAspectContext();
  
  public static PAspectPAspectProperties getSelf(final P _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.pqr.semantics.PAspectPAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<P, PAspectPAspectProperties> map = new java.util.WeakHashMap<pqr.P, fr.inria.diverse.puzzle.pqr.semantics.PAspectPAspectProperties>();
  
  public Map<P, PAspectPAspectProperties> getMap() {
    return map;
  }
}
