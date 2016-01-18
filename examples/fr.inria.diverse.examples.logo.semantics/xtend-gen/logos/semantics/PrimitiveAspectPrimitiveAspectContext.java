package logos.semantics;

import Logo.Primitive;
import java.util.Map;
import logos.semantics.PrimitiveAspectPrimitiveAspectProperties;

@SuppressWarnings("all")
public class PrimitiveAspectPrimitiveAspectContext {
  public final static PrimitiveAspectPrimitiveAspectContext INSTANCE = new PrimitiveAspectPrimitiveAspectContext();
  
  public static PrimitiveAspectPrimitiveAspectProperties getSelf(final Primitive _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.PrimitiveAspectPrimitiveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> map = new java.util.WeakHashMap<Logo.Primitive, logos.semantics.PrimitiveAspectPrimitiveAspectProperties>();
  
  public Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> getMap() {
    return map;
  }
}
