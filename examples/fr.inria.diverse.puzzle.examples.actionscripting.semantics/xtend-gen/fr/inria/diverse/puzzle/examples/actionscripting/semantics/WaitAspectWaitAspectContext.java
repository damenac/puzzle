package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Wait;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.WaitAspectWaitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WaitAspectWaitAspectContext {
  public final static WaitAspectWaitAspectContext INSTANCE = new WaitAspectWaitAspectContext();
  
  public static WaitAspectWaitAspectProperties getSelf(final Wait _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.actionscripting.semantics.WaitAspectWaitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Wait, WaitAspectWaitAspectProperties> map = new java.util.WeakHashMap<actionscripting.Wait, fr.inria.diverse.puzzle.examples.actionscripting.semantics.WaitAspectWaitAspectProperties>();
  
  public Map<Wait, WaitAspectWaitAspectProperties> getMap() {
    return map;
  }
}
