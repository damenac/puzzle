package CompleteDSL;

import CompleteDSLPckg.Wait;
import CompleteDSL.WaitAspectWaitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WaitAspectWaitAspectContext {
  public final static WaitAspectWaitAspectContext INSTANCE = new WaitAspectWaitAspectContext();
  
  public static WaitAspectWaitAspectProperties getSelf(final Wait _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.WaitAspectWaitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Wait, WaitAspectWaitAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.Wait, CompleteDSL.WaitAspectWaitAspectProperties>();
  
  public Map<Wait, WaitAspectWaitAspectProperties> getMap() {
    return map;
  }
}
