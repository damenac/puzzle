package semanticsLogo;

import Logo.Assignation;
import java.util.Map;
import semanticsLogo.AssignationAspectAssignationAspectProperties;

@SuppressWarnings("all")
public class AssignationAspectAssignationAspectContext {
  public final static AssignationAspectAssignationAspectContext INSTANCE = new AssignationAspectAssignationAspectContext();
  
  public static AssignationAspectAssignationAspectProperties getSelf(final Assignation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.AssignationAspectAssignationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assignation, AssignationAspectAssignationAspectProperties> map = new java.util.WeakHashMap<Logo.Assignation, semanticsLogo.AssignationAspectAssignationAspectProperties>();
  
  public Map<Assignation, AssignationAspectAssignationAspectProperties> getMap() {
    return map;
  }
}
