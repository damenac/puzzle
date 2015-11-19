package flowchart;

import flowchart.ActionAspectActionAspectProperties;
import flowchartpck.Action;
import java.util.Map;

@SuppressWarnings("all")
public class ActionAspectActionAspectContext {
  public final static ActionAspectActionAspectContext INSTANCE = new ActionAspectActionAspectContext();
  
  public static ActionAspectActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.ActionAspectActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionAspectActionAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Action, flowchart.ActionAspectActionAspectProperties>();
  
  public Map<Action, ActionAspectActionAspectProperties> getMap() {
    return map;
  }
}
