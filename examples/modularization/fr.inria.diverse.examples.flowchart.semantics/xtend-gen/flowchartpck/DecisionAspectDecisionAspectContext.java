package flowchartpck;

import flowchartpck.Decision;
import flowchartpck.DecisionAspectDecisionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class DecisionAspectDecisionAspectContext {
  public final static DecisionAspectDecisionAspectContext INSTANCE = new DecisionAspectDecisionAspectContext();
  
  public static DecisionAspectDecisionAspectProperties getSelf(final Decision _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartpck.DecisionAspectDecisionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Decision, DecisionAspectDecisionAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Decision, flowchartpck.DecisionAspectDecisionAspectProperties>();
  
  public Map<Decision, DecisionAspectDecisionAspectProperties> getMap() {
    return map;
  }
}
