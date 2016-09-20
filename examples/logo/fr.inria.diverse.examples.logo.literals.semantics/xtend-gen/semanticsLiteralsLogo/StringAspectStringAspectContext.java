package semanticsLiteralsLogo;

import java.util.Map;
import semanticsLiteralsLogo.StringAspectStringAspectProperties;

@SuppressWarnings("all")
public class StringAspectStringAspectContext {
  public final static StringAspectStringAspectContext INSTANCE = new StringAspectStringAspectContext();
  
  public static StringAspectStringAspectProperties getSelf(final LogoLiterals.String _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLiteralsLogo.StringAspectStringAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogoLiterals.String, StringAspectStringAspectProperties> map = new java.util.WeakHashMap<LogoLiterals.String, semanticsLiteralsLogo.StringAspectStringAspectProperties>();
  
  public Map<LogoLiterals.String, StringAspectStringAspectProperties> getMap() {
    return map;
  }
}
