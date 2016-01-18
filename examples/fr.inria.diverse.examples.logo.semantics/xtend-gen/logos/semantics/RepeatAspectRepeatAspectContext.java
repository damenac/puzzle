package logos.semantics;

import Logo.Repeat;
import java.util.Map;
import logos.semantics.RepeatAspectRepeatAspectProperties;

@SuppressWarnings("all")
public class RepeatAspectRepeatAspectContext {
  public final static RepeatAspectRepeatAspectContext INSTANCE = new RepeatAspectRepeatAspectContext();
  
  public static RepeatAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.RepeatAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, RepeatAspectRepeatAspectProperties> map = new java.util.WeakHashMap<Logo.Repeat, logos.semantics.RepeatAspectRepeatAspectProperties>();
  
  public Map<Repeat, RepeatAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
