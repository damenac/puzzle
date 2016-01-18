package Logo.logoprogram;

import Logo.Primitive;
import Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PrimitiveAspectPrimitiveAspectContext {
  public final static PrimitiveAspectPrimitiveAspectContext INSTANCE = new PrimitiveAspectPrimitiveAspectContext();
  
  public static PrimitiveAspectPrimitiveAspectProperties getSelf(final Primitive _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> map = new java.util.WeakHashMap<Logo.Primitive, Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties>();
  
  public Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> getMap() {
    return map;
  }
}
