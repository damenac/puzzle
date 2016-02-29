package logo;

import java.util.Map;
import kmLogo.VarDecl;
import logo.VarDeclAspectVarDeclAspectProperties;

@SuppressWarnings("all")
public class VarDeclAspectVarDeclAspectContext {
  public final static VarDeclAspectVarDeclAspectContext INSTANCE = new VarDeclAspectVarDeclAspectContext();
  
  public static VarDeclAspectVarDeclAspectProperties getSelf(final VarDecl _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.VarDeclAspectVarDeclAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarDecl, VarDeclAspectVarDeclAspectProperties> map = new java.util.WeakHashMap<kmLogo.VarDecl, logo.VarDeclAspectVarDeclAspectProperties>();
  
  public Map<VarDecl, VarDeclAspectVarDeclAspectProperties> getMap() {
    return map;
  }
}
