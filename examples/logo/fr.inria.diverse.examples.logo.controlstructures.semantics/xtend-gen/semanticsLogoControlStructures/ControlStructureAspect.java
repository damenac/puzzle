package semanticsLogoControlStructures;

import ControlStructures.ControlStructure;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect {
  public static void evalInstruction(final ControlStructure _self, final Hashtable<String, Object> context) {
    semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectProperties _self_ = semanticsLogoControlStructures.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    _privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Hashtable<String, Object> context) {
  }
}
