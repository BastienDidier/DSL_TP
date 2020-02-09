package fsm.aspects;

import fr.ut2j.m1ice.fsm.StateFinal;
import fsm.aspects.StateFinalAspectStateFinalAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StateFinalAspectStateFinalAspectContext {
  public final static StateFinalAspectStateFinalAspectContext INSTANCE = new StateFinalAspectStateFinalAspectContext();
  
  public static StateFinalAspectStateFinalAspectProperties getSelf(final StateFinal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.aspects.StateFinalAspectStateFinalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateFinal, StateFinalAspectStateFinalAspectProperties> map = new java.util.WeakHashMap<fr.ut2j.m1ice.fsm.StateFinal, fsm.aspects.StateFinalAspectStateFinalAspectProperties>();
  
  public Map<StateFinal, StateFinalAspectStateFinalAspectProperties> getMap() {
    return map;
  }
}
