package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Conditional;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.ConditionalAspectConditionalAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConditionalAspectConditionalAspectContext {
  public final static ConditionalAspectConditionalAspectContext INSTANCE = new ConditionalAspectConditionalAspectContext();
  
  public static ConditionalAspectConditionalAspectProperties getSelf(final Conditional _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.actionscripting.semantics.ConditionalAspectConditionalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Conditional, ConditionalAspectConditionalAspectProperties> map = new java.util.WeakHashMap<actionscripting.Conditional, fr.inria.diverse.puzzle.examples.actionscripting.semantics.ConditionalAspectConditionalAspectProperties>();
  
  public Map<Conditional, ConditionalAspectConditionalAspectProperties> getMap() {
    return map;
  }
}
