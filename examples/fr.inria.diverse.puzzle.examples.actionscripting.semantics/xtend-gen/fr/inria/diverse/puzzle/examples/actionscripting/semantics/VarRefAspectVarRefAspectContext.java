package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.VarRef;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarRefAspectVarRefAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class VarRefAspectVarRefAspectContext {
  public final static VarRefAspectVarRefAspectContext INSTANCE = new VarRefAspectVarRefAspectContext();
  
  public static VarRefAspectVarRefAspectProperties getSelf(final VarRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarRefAspectVarRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarRef, VarRefAspectVarRefAspectProperties> map = new java.util.WeakHashMap<actionscripting.VarRef, fr.inria.diverse.puzzle.examples.actionscripting.semantics.VarRefAspectVarRefAspectProperties>();
  
  public Map<VarRef, VarRefAspectVarRefAspectProperties> getMap() {
    return map;
  }
}
