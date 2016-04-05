package flowchartaspects;

import flowchartaspects.PrintlnAspectPrintlnAspectProperties;
import flowchartpck.Println;
import java.util.Map;

@SuppressWarnings("all")
public class PrintlnAspectPrintlnAspectContext {
  public final static PrintlnAspectPrintlnAspectContext INSTANCE = new PrintlnAspectPrintlnAspectContext();
  
  public static PrintlnAspectPrintlnAspectProperties getSelf(final Println _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.PrintlnAspectPrintlnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Println, PrintlnAspectPrintlnAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Println, flowchartaspects.PrintlnAspectPrintlnAspectProperties>();
  
  public Map<Println, PrintlnAspectPrintlnAspectProperties> getMap() {
    return map;
  }
}
