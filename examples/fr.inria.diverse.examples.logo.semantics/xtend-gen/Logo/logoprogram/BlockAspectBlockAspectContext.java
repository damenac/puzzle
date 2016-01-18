package Logo.logoprogram;

import Logo.Block;
import Logo.logoprogram.BlockAspectBlockAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public final static BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();
  
  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<Logo.Block, Logo.logoprogram.BlockAspectBlockAspectProperties>();
  
  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
