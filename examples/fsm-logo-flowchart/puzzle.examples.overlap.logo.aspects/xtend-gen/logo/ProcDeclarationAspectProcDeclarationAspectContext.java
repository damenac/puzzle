package logo;

import java.util.Map;
import kmLogo.ProcDeclaration;
import logo.ProcDeclarationAspectProcDeclarationAspectProperties;

@SuppressWarnings("all")
public class ProcDeclarationAspectProcDeclarationAspectContext {
  public final static ProcDeclarationAspectProcDeclarationAspectContext INSTANCE = new ProcDeclarationAspectProcDeclarationAspectContext();
  
  public static ProcDeclarationAspectProcDeclarationAspectProperties getSelf(final ProcDeclaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.ProcDeclarationAspectProcDeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProcDeclaration, ProcDeclarationAspectProcDeclarationAspectProperties> map = new java.util.WeakHashMap<kmLogo.ProcDeclaration, logo.ProcDeclarationAspectProcDeclarationAspectProperties>();
  
  public Map<ProcDeclaration, ProcDeclarationAspectProcDeclarationAspectProperties> getMap() {
    return map;
  }
}
