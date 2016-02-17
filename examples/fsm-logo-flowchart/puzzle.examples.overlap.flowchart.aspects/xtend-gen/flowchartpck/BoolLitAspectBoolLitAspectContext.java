package flowchartpck;

import flowchartpck.BoolLit;
import flowchartpck.BoolLitAspectBoolLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolLitAspectBoolLitAspectContext {
  public final static BoolLitAspectBoolLitAspectContext INSTANCE = new BoolLitAspectBoolLitAspectContext();
  
  public static BoolLitAspectBoolLitAspectProperties getSelf(final BoolLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartpck.BoolLitAspectBoolLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolLit, BoolLitAspectBoolLitAspectProperties> map = new java.util.WeakHashMap<flowchartpck.BoolLit, flowchartpck.BoolLitAspectBoolLitAspectProperties>();
  
  public Map<BoolLit, BoolLitAspectBoolLitAspectProperties> getMap() {
    return map;
  }
}
