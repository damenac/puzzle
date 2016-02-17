package flowchartpck;

import flowchartpck.IntegerLit;
import flowchartpck.IntegerLitAspectIntegerLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntegerLitAspectIntegerLitAspectContext {
  public final static IntegerLitAspectIntegerLitAspectContext INSTANCE = new IntegerLitAspectIntegerLitAspectContext();
  
  public static IntegerLitAspectIntegerLitAspectProperties getSelf(final IntegerLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartpck.IntegerLitAspectIntegerLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> map = new java.util.WeakHashMap<flowchartpck.IntegerLit, flowchartpck.IntegerLitAspectIntegerLitAspectProperties>();
  
  public Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> getMap() {
    return map;
  }
}
