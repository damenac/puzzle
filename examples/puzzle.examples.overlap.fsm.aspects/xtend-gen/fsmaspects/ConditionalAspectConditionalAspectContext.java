package fsmaspects;

import fsm.Conditional;
import fsmaspects.ConditionalAspectConditionalAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConditionalAspectConditionalAspectContext {
  public final static ConditionalAspectConditionalAspectContext INSTANCE = new ConditionalAspectConditionalAspectContext();
  
  public static ConditionalAspectConditionalAspectProperties getSelf(final Conditional _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.ConditionalAspectConditionalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Conditional, ConditionalAspectConditionalAspectProperties> map = new java.util.WeakHashMap<fsm.Conditional, fsmaspects.ConditionalAspectConditionalAspectProperties>();
  
  public Map<Conditional, ConditionalAspectConditionalAspectProperties> getMap() {
    return map;
  }
}
