package hfsm;

import hfsm.VarDecl;
import hfsm.VarDeclAspectVarDeclAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class VarDeclAspectVarDeclAspectContext {
  public final static VarDeclAspectVarDeclAspectContext INSTANCE = new VarDeclAspectVarDeclAspectContext();
  
  public static VarDeclAspectVarDeclAspectProperties getSelf(final VarDecl _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new hfsm.VarDeclAspectVarDeclAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarDecl, VarDeclAspectVarDeclAspectProperties> map = new java.util.WeakHashMap<hfsm.VarDecl, hfsm.VarDeclAspectVarDeclAspectProperties>();
  
  public Map<VarDecl, VarDeclAspectVarDeclAspectProperties> getMap() {
    return map;
  }
}
