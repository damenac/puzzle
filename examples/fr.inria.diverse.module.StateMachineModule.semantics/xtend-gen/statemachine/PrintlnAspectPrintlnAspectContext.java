package statemachine;

import StateMachineModule.Println;
import java.util.Map;
import statemachine.PrintlnAspectPrintlnAspectProperties;

@SuppressWarnings("all")
public class PrintlnAspectPrintlnAspectContext {
  public final static PrintlnAspectPrintlnAspectContext INSTANCE = new PrintlnAspectPrintlnAspectContext();
  
  public static PrintlnAspectPrintlnAspectProperties getSelf(final Println _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.PrintlnAspectPrintlnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Println, PrintlnAspectPrintlnAspectProperties> map = new java.util.WeakHashMap<StateMachineModule.Println, statemachine.PrintlnAspectPrintlnAspectProperties>();
  
  public Map<Println, PrintlnAspectPrintlnAspectProperties> getMap() {
    return map;
  }
}
