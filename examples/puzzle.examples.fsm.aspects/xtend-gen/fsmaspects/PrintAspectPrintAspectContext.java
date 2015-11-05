package fsmaspects;

import fsm.Print;
import fsmaspects.PrintAspectPrintAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PrintAspectPrintAspectContext {
  public final static PrintAspectPrintAspectContext INSTANCE = new PrintAspectPrintAspectContext();
  
  public static PrintAspectPrintAspectProperties getSelf(final Print _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.PrintAspectPrintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Print, PrintAspectPrintAspectProperties> map = new java.util.WeakHashMap<fsm.Print, fsmaspects.PrintAspectPrintAspectProperties>();
  
  public Map<Print, PrintAspectPrintAspectProperties> getMap() {
    return map;
  }
}
