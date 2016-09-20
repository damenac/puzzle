package semanticsLiteralsLogo;

import java.util.Map;
import semanticsLiteralsLogo.BooleanAspectBooleanAspectProperties;

@SuppressWarnings("all")
public class BooleanAspectBooleanAspectContext {
  public final static BooleanAspectBooleanAspectContext INSTANCE = new BooleanAspectBooleanAspectContext();
  
  public static BooleanAspectBooleanAspectProperties getSelf(final LogoLiterals.Boolean _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLiteralsLogo.BooleanAspectBooleanAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogoLiterals.Boolean, BooleanAspectBooleanAspectProperties> map = new java.util.WeakHashMap<LogoLiterals.Boolean, semanticsLiteralsLogo.BooleanAspectBooleanAspectProperties>();
  
  public Map<LogoLiterals.Boolean, BooleanAspectBooleanAspectProperties> getMap() {
    return map;
  }
}
