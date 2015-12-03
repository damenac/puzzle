package fsmumlaspects;

import fsm.Constraint;
import fsmumlaspects.ConstraintAspectConstraintAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConstraintAspectConstraintAspectContext {
  public final static ConstraintAspectConstraintAspectContext INSTANCE = new ConstraintAspectConstraintAspectContext();
  
  public static ConstraintAspectConstraintAspectProperties getSelf(final Constraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmumlaspects.ConstraintAspectConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constraint, ConstraintAspectConstraintAspectProperties> map = new java.util.WeakHashMap<fsm.Constraint, fsmumlaspects.ConstraintAspectConstraintAspectProperties>();
  
  public Map<Constraint, ConstraintAspectConstraintAspectProperties> getMap() {
    return map;
  }
}
