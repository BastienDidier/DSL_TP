package fsm.aspects;

import fr.ut2j.m1ice.fsm.StateOff;
import fsm.aspects.StateOffAspectStateOffAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StateOffAspectStateOffAspectContext {
  public final static StateOffAspectStateOffAspectContext INSTANCE = new StateOffAspectStateOffAspectContext();
  
  public static StateOffAspectStateOffAspectProperties getSelf(final StateOff _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsm.aspects.StateOffAspectStateOffAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateOff, StateOffAspectStateOffAspectProperties> map = new java.util.WeakHashMap<fr.ut2j.m1ice.fsm.StateOff, fsm.aspects.StateOffAspectStateOffAspectProperties>();
  
  public Map<StateOff, StateOffAspectStateOffAspectProperties> getMap() {
    return map;
  }
}
