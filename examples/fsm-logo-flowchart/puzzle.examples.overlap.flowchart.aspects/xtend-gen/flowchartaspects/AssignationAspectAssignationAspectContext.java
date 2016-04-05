package flowchartaspects;

import flowchartaspects.AssignationAspectAssignationAspectProperties;
import flowchartpck.Assignation;
import java.util.Map;

@SuppressWarnings("all")
public class AssignationAspectAssignationAspectContext {
  public final static AssignationAspectAssignationAspectContext INSTANCE = new AssignationAspectAssignationAspectContext();
  
  public static AssignationAspectAssignationAspectProperties getSelf(final Assignation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.AssignationAspectAssignationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assignation, AssignationAspectAssignationAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Assignation, flowchartaspects.AssignationAspectAssignationAspectProperties>();
  
  public Map<Assignation, AssignationAspectAssignationAspectProperties> getMap() {
    return map;
  }
}
