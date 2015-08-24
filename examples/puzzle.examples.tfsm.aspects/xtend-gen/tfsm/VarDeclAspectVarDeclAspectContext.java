package tfsm;

import java.util.Map;
import tfsm.VarDecl;
import tfsm.VarDeclAspectVarDeclAspectProperties;

@SuppressWarnings("all")
public class VarDeclAspectVarDeclAspectContext {
  public final static VarDeclAspectVarDeclAspectContext INSTANCE = new VarDeclAspectVarDeclAspectContext();
  
  public static VarDeclAspectVarDeclAspectProperties getSelf(final VarDecl _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new tfsm.VarDeclAspectVarDeclAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarDecl, VarDeclAspectVarDeclAspectProperties> map = new java.util.WeakHashMap<tfsm.VarDecl, tfsm.VarDeclAspectVarDeclAspectProperties>();
  
  public Map<VarDecl, VarDeclAspectVarDeclAspectProperties> getMap() {
    return map;
  }
}
