package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Assignation;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.AssignationAspectAssignationAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AssignationAspectAssignationAspectContext {
  public final static AssignationAspectAssignationAspectContext INSTANCE = new AssignationAspectAssignationAspectContext();
  
  public static AssignationAspectAssignationAspectProperties getSelf(final Assignation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.actionscripting.semantics.AssignationAspectAssignationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assignation, AssignationAspectAssignationAspectProperties> map = new java.util.WeakHashMap<actionscripting.Assignation, fr.inria.diverse.puzzle.examples.actionscripting.semantics.AssignationAspectAssignationAspectProperties>();
  
  public Map<Assignation, AssignationAspectAssignationAspectProperties> getMap() {
    return map;
  }
}
