package fsmrhapsodyaspects;

import fsm.Statement;
import fsmrhapsodyaspects.StatementAspectStatementAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StatementAspectStatementAspectContext {
  public final static StatementAspectStatementAspectContext INSTANCE = new StatementAspectStatementAspectContext();
  
  public static StatementAspectStatementAspectProperties getSelf(final Statement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmrhapsodyaspects.StatementAspectStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement, StatementAspectStatementAspectProperties> map = new java.util.WeakHashMap<fsm.Statement, fsmrhapsodyaspects.StatementAspectStatementAspectProperties>();
  
  public Map<Statement, StatementAspectStatementAspectProperties> getMap() {
    return map;
  }
}
