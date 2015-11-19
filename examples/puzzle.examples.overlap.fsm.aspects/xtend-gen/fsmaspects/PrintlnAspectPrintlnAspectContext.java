package fsmaspects;

import fsm.Println;
import fsmaspects.PrintlnAspectPrintlnAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PrintlnAspectPrintlnAspectContext {
  public final static PrintlnAspectPrintlnAspectContext INSTANCE = new PrintlnAspectPrintlnAspectContext();
  
  public static PrintlnAspectPrintlnAspectProperties getSelf(final Println _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.PrintlnAspectPrintlnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Println, PrintlnAspectPrintlnAspectProperties> map = new java.util.WeakHashMap<fsm.Println, fsmaspects.PrintlnAspectPrintlnAspectProperties>();
  
  public Map<Println, PrintlnAspectPrintlnAspectProperties> getMap() {
    return map;
  }
}
