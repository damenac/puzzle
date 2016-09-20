package semanticsLogoControlStructures;

import ControlStructures.Block;
import java.util.Map;
import semanticsLogoControlStructures.BlockAspectBlockAspectProperties;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public final static BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();
  
  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoControlStructures.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<ControlStructures.Block, semanticsLogoControlStructures.BlockAspectBlockAspectProperties>();
  
  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
