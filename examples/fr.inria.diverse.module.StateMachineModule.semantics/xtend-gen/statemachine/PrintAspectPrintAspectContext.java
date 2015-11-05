package statemachine;

import StateMachineModule.Print;
import java.util.Map;
import statemachine.PrintAspectPrintAspectProperties;

@SuppressWarnings("all")
public class PrintAspectPrintAspectContext {
  public final static PrintAspectPrintAspectContext INSTANCE = new PrintAspectPrintAspectContext();
  
  public static PrintAspectPrintAspectProperties getSelf(final Print _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.PrintAspectPrintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Print, PrintAspectPrintAspectProperties> map = new java.util.WeakHashMap<StateMachineModule.Print, statemachine.PrintAspectPrintAspectProperties>();
  
  public Map<Print, PrintAspectPrintAspectProperties> getMap() {
    return map;
  }
}
