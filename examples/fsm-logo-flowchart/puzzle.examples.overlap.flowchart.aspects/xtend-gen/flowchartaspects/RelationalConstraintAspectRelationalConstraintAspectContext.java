package flowchartaspects;

import flowchartaspects.RelationalConstraintAspectRelationalConstraintAspectProperties;
import flowchartpck.RelationalConstraint;
import java.util.Map;

@SuppressWarnings("all")
public class RelationalConstraintAspectRelationalConstraintAspectContext {
  public final static RelationalConstraintAspectRelationalConstraintAspectContext INSTANCE = new RelationalConstraintAspectRelationalConstraintAspectContext();
  
  public static RelationalConstraintAspectRelationalConstraintAspectProperties getSelf(final RelationalConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.RelationalConstraintAspectRelationalConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RelationalConstraint, RelationalConstraintAspectRelationalConstraintAspectProperties> map = new java.util.WeakHashMap<flowchartpck.RelationalConstraint, flowchartaspects.RelationalConstraintAspectRelationalConstraintAspectProperties>();
  
  public Map<RelationalConstraint, RelationalConstraintAspectRelationalConstraintAspectProperties> getMap() {
    return map;
  }
}
