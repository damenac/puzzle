package flowchartaspects;

import flowchartaspects.LiteralAspectLiteralAspectProperties;
import flowchartpck.Literal;
import java.util.Map;

@SuppressWarnings("all")
public class LiteralAspectLiteralAspectContext {
  public final static LiteralAspectLiteralAspectContext INSTANCE = new LiteralAspectLiteralAspectContext();
  
  public static LiteralAspectLiteralAspectProperties getSelf(final Literal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.LiteralAspectLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Literal, LiteralAspectLiteralAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Literal, flowchartaspects.LiteralAspectLiteralAspectProperties>();
  
  public Map<Literal, LiteralAspectLiteralAspectProperties> getMap() {
    return map;
  }
}
