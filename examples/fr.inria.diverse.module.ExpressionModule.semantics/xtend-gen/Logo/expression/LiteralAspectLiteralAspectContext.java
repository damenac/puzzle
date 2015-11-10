package Logo.expression;

import ExpressionModule.Literal;
import Logo.expression.LiteralAspectLiteralAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class LiteralAspectLiteralAspectContext {
  public final static LiteralAspectLiteralAspectContext INSTANCE = new LiteralAspectLiteralAspectContext();
  
  public static LiteralAspectLiteralAspectProperties getSelf(final Literal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.expression.LiteralAspectLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Literal, LiteralAspectLiteralAspectProperties> map = new java.util.WeakHashMap<ExpressionModule.Literal, Logo.expression.LiteralAspectLiteralAspectProperties>();
  
  public Map<Literal, LiteralAspectLiteralAspectProperties> getMap() {
    return map;
  }
}
