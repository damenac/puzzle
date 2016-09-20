package CompleteDSL;

import CompleteDSLPckg.VarDecl;
import java.util.Map;
import CompleteDSL.VarDeclAspectVarDeclAspectProperties;

@SuppressWarnings("all")
public class VarDeclAspectVarDeclAspectContext {
  public final static VarDeclAspectVarDeclAspectContext INSTANCE = new VarDeclAspectVarDeclAspectContext();
  
  public static VarDeclAspectVarDeclAspectProperties getSelf(final VarDecl _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.VarDeclAspectVarDeclAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarDecl, VarDeclAspectVarDeclAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.VarDecl, CompleteDSL.VarDeclAspectVarDeclAspectProperties>();
  
  public Map<VarDecl, VarDeclAspectVarDeclAspectProperties> getMap() {
    return map;
  }
}
