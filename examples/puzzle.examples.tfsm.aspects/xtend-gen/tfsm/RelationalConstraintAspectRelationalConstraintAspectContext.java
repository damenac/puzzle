package tfsm;

import java.util.Map;
import tfsm.RelationalConstraint;
import tfsm.RelationalConstraintAspectRelationalConstraintAspectProperties;

@SuppressWarnings("all")
public class RelationalConstraintAspectRelationalConstraintAspectContext {
  public final static RelationalConstraintAspectRelationalConstraintAspectContext INSTANCE = new RelationalConstraintAspectRelationalConstraintAspectContext();
  
  public static RelationalConstraintAspectRelationalConstraintAspectProperties getSelf(final RelationalConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new tfsm.RelationalConstraintAspectRelationalConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RelationalConstraint, RelationalConstraintAspectRelationalConstraintAspectProperties> map = new java.util.WeakHashMap<tfsm.RelationalConstraint, tfsm.RelationalConstraintAspectRelationalConstraintAspectProperties>();
  
  public Map<RelationalConstraint, RelationalConstraintAspectRelationalConstraintAspectProperties> getMap() {
    return map;
  }
}
