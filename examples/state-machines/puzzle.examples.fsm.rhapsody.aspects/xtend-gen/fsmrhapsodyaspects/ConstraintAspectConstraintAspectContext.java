package fsmrhapsodyaspects;

import fsm.Constraint;
import fsmrhapsodyaspects.ConstraintAspectConstraintAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConstraintAspectConstraintAspectContext {
  public final static ConstraintAspectConstraintAspectContext INSTANCE = new ConstraintAspectConstraintAspectContext();
  
  public static ConstraintAspectConstraintAspectProperties getSelf(final Constraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmrhapsodyaspects.ConstraintAspectConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constraint, ConstraintAspectConstraintAspectProperties> map = new java.util.WeakHashMap<fsm.Constraint, fsmrhapsodyaspects.ConstraintAspectConstraintAspectProperties>();
  
  public Map<Constraint, ConstraintAspectConstraintAspectProperties> getMap() {
    return map;
  }
}
