package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Print;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.PrintAspectPrintAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PrintAspectPrintAspectContext {
  public final static PrintAspectPrintAspectContext INSTANCE = new PrintAspectPrintAspectContext();
  
  public static PrintAspectPrintAspectProperties getSelf(final Print _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.actionscripting.semantics.PrintAspectPrintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Print, PrintAspectPrintAspectProperties> map = new java.util.WeakHashMap<actionscripting.Print, fr.inria.diverse.puzzle.examples.actionscripting.semantics.PrintAspectPrintAspectProperties>();
  
  public Map<Print, PrintAspectPrintAspectProperties> getMap() {
    return map;
  }
}
