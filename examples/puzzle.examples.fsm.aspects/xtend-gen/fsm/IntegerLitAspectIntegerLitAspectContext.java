package fsm;

import fsm.IntegerLit;
import fsm.IntegerLitAspectIntegerLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntegerLitAspectIntegerLitAspectContext {
  public final static IntegerLitAspectIntegerLitAspectContext INSTANCE = new IntegerLitAspectIntegerLitAspectContext();
  
  public static IntegerLitAspectIntegerLitAspectProperties getSelf(final IntegerLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.IntegerLitAspectIntegerLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> map = new java.util.WeakHashMap<fsm.IntegerLit, fsm.IntegerLitAspectIntegerLitAspectProperties>();
  
  public Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> getMap() {
    return map;
  }
}
