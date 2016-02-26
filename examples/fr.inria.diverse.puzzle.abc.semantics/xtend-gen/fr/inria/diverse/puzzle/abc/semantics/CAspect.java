package fr.inria.diverse.puzzle.abc.semantics;

import abc.C;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.abc.semantics.CAspectCAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = C.class)
@SuppressWarnings("all")
public class CAspect {
  public static void eval(final C _self) {
    fr.inria.diverse.puzzle.abc.semantics.CAspectCAspectProperties _self_ = fr.inria.diverse.puzzle.abc.semantics.CAspectCAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final CAspectCAspectProperties _self_, final C _self) {
    InputOutput.<String>println("Evaluating B");
  }
}
