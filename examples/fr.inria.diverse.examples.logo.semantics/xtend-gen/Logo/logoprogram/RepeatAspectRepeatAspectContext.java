package Logo.logoprogram;

import Logo.Repeat;
import Logo.logoprogram.RepeatAspectRepeatAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class RepeatAspectRepeatAspectContext {
  public final static RepeatAspectRepeatAspectContext INSTANCE = new RepeatAspectRepeatAspectContext();
  
  public static RepeatAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.RepeatAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, RepeatAspectRepeatAspectProperties> map = new java.util.WeakHashMap<Logo.Repeat, Logo.logoprogram.RepeatAspectRepeatAspectProperties>();
  
  public Map<Repeat, RepeatAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
