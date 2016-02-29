package logo;

import java.util.Map;
import kmLogo.VarDeclaration;
import logo.VarDeclarationAspectVarDeclarationAspectProperties;

@SuppressWarnings("all")
public class VarDeclarationAspectVarDeclarationAspectContext {
  public final static VarDeclarationAspectVarDeclarationAspectContext INSTANCE = new VarDeclarationAspectVarDeclarationAspectContext();
  
  public static VarDeclarationAspectVarDeclarationAspectProperties getSelf(final VarDeclaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.VarDeclarationAspectVarDeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarDeclaration, VarDeclarationAspectVarDeclarationAspectProperties> map = new java.util.WeakHashMap<kmLogo.VarDeclaration, logo.VarDeclarationAspectVarDeclarationAspectProperties>();
  
  public Map<VarDeclaration, VarDeclarationAspectVarDeclarationAspectProperties> getMap() {
    return map;
  }
}
