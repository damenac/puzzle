package logo;

import java.util.Map;
import kmLogo.BinaryExp;
import logo.BinaryExpAspectBinaryExpAspectProperties;

@SuppressWarnings("all")
public class BinaryExpAspectBinaryExpAspectContext {
  public final static BinaryExpAspectBinaryExpAspectContext INSTANCE = new BinaryExpAspectBinaryExpAspectContext();
  
  public static BinaryExpAspectBinaryExpAspectProperties getSelf(final BinaryExp _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.BinaryExpAspectBinaryExpAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryExp, BinaryExpAspectBinaryExpAspectProperties> map = new java.util.WeakHashMap<kmLogo.BinaryExp, logo.BinaryExpAspectBinaryExpAspectProperties>();
  
  public Map<BinaryExp, BinaryExpAspectBinaryExpAspectProperties> getMap() {
    return map;
  }
}
