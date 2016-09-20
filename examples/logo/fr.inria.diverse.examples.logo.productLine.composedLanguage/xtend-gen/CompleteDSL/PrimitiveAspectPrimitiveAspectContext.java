package CompleteDSL;

import CompleteDSLPckg.Primitive;
import java.util.Map;
import CompleteDSL.PrimitiveAspectPrimitiveAspectProperties;

@SuppressWarnings("all")
public class PrimitiveAspectPrimitiveAspectContext {
  public final static PrimitiveAspectPrimitiveAspectContext INSTANCE = new PrimitiveAspectPrimitiveAspectContext();
  
  public static PrimitiveAspectPrimitiveAspectProperties getSelf(final Primitive _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.PrimitiveAspectPrimitiveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.Primitive, CompleteDSL.PrimitiveAspectPrimitiveAspectProperties>();
  
  public Map<Primitive, PrimitiveAspectPrimitiveAspectProperties> getMap() {
    return map;
  }
}
