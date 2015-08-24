package fsm;

import fsm.Conditional;
import fsm.ConditionalAspectConditionalAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConditionalAspectConditionalAspectContext {
  public final static ConditionalAspectConditionalAspectContext INSTANCE = new ConditionalAspectConditionalAspectContext();
  
  public static ConditionalAspectConditionalAspectProperties getSelf(final Conditional _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.ConditionalAspectConditionalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Conditional, ConditionalAspectConditionalAspectProperties> map = new java.util.WeakHashMap<fsm.Conditional, fsm.ConditionalAspectConditionalAspectProperties>();
  
  public Map<Conditional, ConditionalAspectConditionalAspectProperties> getMap() {
    return map;
  }
}
