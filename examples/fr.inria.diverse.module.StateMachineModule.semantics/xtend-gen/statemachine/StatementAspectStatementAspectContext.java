package statemachine;

import StateMachineModule.Statement;
import java.util.Map;
import statemachine.StatementAspectStatementAspectProperties;

@SuppressWarnings("all")
public class StatementAspectStatementAspectContext {
  public final static StatementAspectStatementAspectContext INSTANCE = new StatementAspectStatementAspectContext();
  
  public static StatementAspectStatementAspectProperties getSelf(final Statement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.StatementAspectStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement, StatementAspectStatementAspectProperties> map = new java.util.WeakHashMap<StateMachineModule.Statement, statemachine.StatementAspectStatementAspectProperties>();
  
  public Map<Statement, StatementAspectStatementAspectProperties> getMap() {
    return map;
  }
}
