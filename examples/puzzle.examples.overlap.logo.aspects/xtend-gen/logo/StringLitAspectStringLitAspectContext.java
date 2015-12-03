package logo;

import java.util.Map;
import kmLogo.StringLit;
import logo.StringLitAspectStringLitAspectProperties;

@SuppressWarnings("all")
public class StringLitAspectStringLitAspectContext {
  public final static StringLitAspectStringLitAspectContext INSTANCE = new StringLitAspectStringLitAspectContext();
  
  public static StringLitAspectStringLitAspectProperties getSelf(final StringLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.StringLitAspectStringLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringLit, StringLitAspectStringLitAspectProperties> map = new java.util.WeakHashMap<kmLogo.StringLit, logo.StringLitAspectStringLitAspectProperties>();
  
  public Map<StringLit, StringLitAspectStringLitAspectProperties> getMap() {
    return map;
  }
}
