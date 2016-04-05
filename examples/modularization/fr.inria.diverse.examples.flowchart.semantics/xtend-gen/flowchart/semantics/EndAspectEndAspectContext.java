package flowchart.semantics;

import flowchart.semantics.EndAspectEndAspectProperties;
import flowchartpck.End;
import java.util.Map;

@SuppressWarnings("all")
public class EndAspectEndAspectContext {
  public final static EndAspectEndAspectContext INSTANCE = new EndAspectEndAspectContext();
  
  public static EndAspectEndAspectProperties getSelf(final End _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.semantics.EndAspectEndAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<End, EndAspectEndAspectProperties> map = new java.util.WeakHashMap<flowchartpck.End, flowchart.semantics.EndAspectEndAspectProperties>();
  
  public Map<End, EndAspectEndAspectProperties> getMap() {
    return map;
  }
}
