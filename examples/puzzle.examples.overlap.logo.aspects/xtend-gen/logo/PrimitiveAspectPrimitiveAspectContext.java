package logo;

import java.util.Map;
import kmLogo.Primitive;
import logo.PrimitiveAspectPrimitiveAspectProperties;

@SuppressWarnings("all")
public class PrimitiveAspectPrimitiveAspectContext {
  public final static PrimitiveAspectPrimitiveAspectContext INSTANCE = new PrimitiveAspectPrimitiveAspectContext();
  
  public static PrimitiveAspectPrimitiveAspectProperties getSelf(final Primitive _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.PrimitiveAspectPrimitiveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> map = new java.util.WeakHashMap<kmLogo.Primitive, logo.PrimitiveAspectPrimitiveAspectProperties>();
  
  public Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> getMap() {
    return map;
  }
}
