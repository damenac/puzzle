package flowchart.semantics;

import flowchart.semantics.DecisionAspectDecisionAspectProperties;
import flowchartpck.Decision;
import java.util.Map;

@SuppressWarnings("all")
public class DecisionAspectDecisionAspectContext {
  public final static DecisionAspectDecisionAspectContext INSTANCE = new DecisionAspectDecisionAspectContext();
  
  public static DecisionAspectDecisionAspectProperties getSelf(final Decision _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.semantics.DecisionAspectDecisionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Decision, DecisionAspectDecisionAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Decision, flowchart.semantics.DecisionAspectDecisionAspectProperties>();
  
  public Map<Decision, DecisionAspectDecisionAspectProperties> getMap() {
    return map;
  }
}
