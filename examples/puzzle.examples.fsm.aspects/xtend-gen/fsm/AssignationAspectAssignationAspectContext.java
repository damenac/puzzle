package fsm;

import fsm.Assignation;
import fsm.AssignationAspectAssignationAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AssignationAspectAssignationAspectContext {
  public final static AssignationAspectAssignationAspectContext INSTANCE = new AssignationAspectAssignationAspectContext();
  
  public static AssignationAspectAssignationAspectProperties getSelf(final Assignation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.AssignationAspectAssignationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assignation, AssignationAspectAssignationAspectProperties> map = new java.util.WeakHashMap<fsm.Assignation, fsm.AssignationAspectAssignationAspectProperties>();
  
  public Map<Assignation, AssignationAspectAssignationAspectProperties> getMap() {
    return map;
  }
}
