package semanticsLogo;

import Logo.Literal;
import java.util.Map;
import semanticsLogo.LiteralAspectLiteralAspectProperties;

@SuppressWarnings("all")
public class LiteralAspectLiteralAspectContext {
  public final static LiteralAspectLiteralAspectContext INSTANCE = new LiteralAspectLiteralAspectContext();
  
  public static LiteralAspectLiteralAspectProperties getSelf(final Literal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.LiteralAspectLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Literal, LiteralAspectLiteralAspectProperties> map = new java.util.WeakHashMap<Logo.Literal, semanticsLogo.LiteralAspectLiteralAspectProperties>();
  
  public Map<Literal, LiteralAspectLiteralAspectProperties> getMap() {
    return map;
  }
}
