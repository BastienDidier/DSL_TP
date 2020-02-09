package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.ut2j.m1ice.fsm.StateFinal;
import fsm.aspects.StateAspect;

@Aspect(className = StateFinal.class)
@SuppressWarnings("all")
public class StateFinalAspect extends StateAspect {
}
