package semanticsLiteralsLogo;

import java.util.Map;
import semanticsLiteralsLogo.IntegerAspectIntegerAspectProperties;

@SuppressWarnings("all")
public class IntegerAspectIntegerAspectContext {
  public final static IntegerAspectIntegerAspectContext INSTANCE = new IntegerAspectIntegerAspectContext();
  
  public static IntegerAspectIntegerAspectProperties getSelf(final LogoLiterals.Integer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLiteralsLogo.IntegerAspectIntegerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogoLiterals.Integer, IntegerAspectIntegerAspectProperties> map = new java.util.WeakHashMap<LogoLiterals.Integer, semanticsLiteralsLogo.IntegerAspectIntegerAspectProperties>();
  
  public Map<LogoLiterals.Integer, IntegerAspectIntegerAspectProperties> getMap() {
    return map;
  }
}
