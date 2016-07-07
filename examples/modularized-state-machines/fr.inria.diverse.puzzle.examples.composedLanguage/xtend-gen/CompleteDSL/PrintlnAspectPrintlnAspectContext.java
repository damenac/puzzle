package CompleteDSL;

import CompleteDSLPckg.Println;
import CompleteDSL.PrintlnAspectPrintlnAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PrintlnAspectPrintlnAspectContext {
  public final static PrintlnAspectPrintlnAspectContext INSTANCE = new PrintlnAspectPrintlnAspectContext();
  
  public static PrintlnAspectPrintlnAspectProperties getSelf(final Println _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.PrintlnAspectPrintlnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Println, PrintlnAspectPrintlnAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.Println, CompleteDSL.PrintlnAspectPrintlnAspectProperties>();
  
  public Map<Println, PrintlnAspectPrintlnAspectProperties> getMap() {
    return map;
  }
}
