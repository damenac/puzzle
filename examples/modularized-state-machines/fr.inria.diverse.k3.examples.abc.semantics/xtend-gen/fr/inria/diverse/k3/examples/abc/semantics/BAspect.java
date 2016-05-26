package fr.inria.diverse.k3.examples.abc.semantics;

import ABC.B;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.examples.abc.semantics.AAspect;
import fr.inria.diverse.k3.examples.abc.semantics.BAspectBAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = B.class)
@SuppressWarnings("all")
public class BAspect extends AAspect {
  @OverrideAspectMethod
  public static void eval(final B _self) {
    fr.inria.diverse.k3.examples.abc.semantics.BAspectBAspectProperties _self_ = fr.inria.diverse.k3.examples.abc.semantics.BAspectBAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final BAspectBAspectProperties _self_, final B _self) {
    InputOutput.<String>println("Evaluating B");
  }
}
