package simple.imperative.aspects;

import java.util.Map;
import simple.imperative.aspects.VarRefAspectVarRefAspectProperties;
import simpleimperative.VarRef;

@SuppressWarnings("all")
public class VarRefAspectVarRefAspectContext {
  public final static VarRefAspectVarRefAspectContext INSTANCE = new VarRefAspectVarRefAspectContext();
  
  public static VarRefAspectVarRefAspectProperties getSelf(final VarRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new simple.imperative.aspects.VarRefAspectVarRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarRef, VarRefAspectVarRefAspectProperties> map = new java.util.WeakHashMap<simpleimperative.VarRef, simple.imperative.aspects.VarRefAspectVarRefAspectProperties>();
  
  public Map<VarRef, VarRefAspectVarRefAspectProperties> getMap() {
    return map;
  }
}
