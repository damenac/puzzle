package logo;

import java.util.Map;
import kmLogo.Repeat;
import logo.RepeatAspectRepeatAspectProperties;

@SuppressWarnings("all")
public class RepeatAspectRepeatAspectContext {
  public final static RepeatAspectRepeatAspectContext INSTANCE = new RepeatAspectRepeatAspectContext();
  
  public static RepeatAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.RepeatAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, RepeatAspectRepeatAspectProperties> map = new java.util.WeakHashMap<kmLogo.Repeat, logo.RepeatAspectRepeatAspectProperties>();
  
  public Map<Repeat, RepeatAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
