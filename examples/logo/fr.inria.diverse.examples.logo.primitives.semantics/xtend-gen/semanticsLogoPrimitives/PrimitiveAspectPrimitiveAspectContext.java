package semanticsLogoPrimitives;

import Primitives.Primitive;
import java.util.Map;
import semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties;

@SuppressWarnings("all")
public class PrimitiveAspectPrimitiveAspectContext {
  public final static PrimitiveAspectPrimitiveAspectContext INSTANCE = new PrimitiveAspectPrimitiveAspectContext();
  
  public static PrimitiveAspectPrimitiveAspectProperties getSelf(final Primitive _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> map = new java.util.WeakHashMap<Primitives.Primitive, semanticsLogoPrimitives.PrimitiveAspectPrimitiveAspectProperties>();
  
  public Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> getMap() {
    return map;
  }
}
