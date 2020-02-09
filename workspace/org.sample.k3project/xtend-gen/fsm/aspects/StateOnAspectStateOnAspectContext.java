package fsm.aspects;

import fr.ut2j.m1ice.fsm.StateOn;
import fsm.aspects.StateOnAspectStateOnAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StateOnAspectStateOnAspectContext {
  public final static StateOnAspectStateOnAspectContext INSTANCE = new StateOnAspectStateOnAspectContext();
  
  public static StateOnAspectStateOnAspectProperties getSelf(final StateOn _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.aspects.StateOnAspectStateOnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateOn, StateOnAspectStateOnAspectProperties> map = new java.util.WeakHashMap<fr.ut2j.m1ice.fsm.StateOn, fsm.aspects.StateOnAspectStateOnAspectProperties>();
  
  public Map<StateOn, StateOnAspectStateOnAspectProperties> getMap() {
    return map;
  }
}
