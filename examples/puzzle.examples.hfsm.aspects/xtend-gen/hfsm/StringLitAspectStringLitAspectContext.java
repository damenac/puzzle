package hfsm;

import hfsm.StringLit;
import hfsm.StringLitAspectStringLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StringLitAspectStringLitAspectContext {
  public final static StringLitAspectStringLitAspectContext INSTANCE = new StringLitAspectStringLitAspectContext();
  
  public static StringLitAspectStringLitAspectProperties getSelf(final StringLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new hfsm.StringLitAspectStringLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringLit, StringLitAspectStringLitAspectProperties> map = new java.util.WeakHashMap<hfsm.StringLit, hfsm.StringLitAspectStringLitAspectProperties>();
  
  public Map<StringLit, StringLitAspectStringLitAspectProperties> getMap() {
    return map;
  }
}
