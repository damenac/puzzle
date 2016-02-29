package fsmaspects;

import fsm.AbstractState;
import fsmaspects.AbstractStateAspectAbstractStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AbstractStateAspectAbstractStateAspectContext {
  public final static AbstractStateAspectAbstractStateAspectContext INSTANCE = new AbstractStateAspectAbstractStateAspectContext();
  
  public static AbstractStateAspectAbstractStateAspectProperties getSelf(final AbstractState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.AbstractStateAspectAbstractStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AbstractState, AbstractStateAspectAbstractStateAspectProperties> map = new java.util.WeakHashMap<fsm.AbstractState, fsmaspects.AbstractStateAspectAbstractStateAspectProperties>();
  
  public Map<AbstractState, AbstractStateAspectAbstractStateAspectProperties> getMap() {
    return map;
  }
}
