package fr.inria.diverse.puzzle.xyz.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.xyz.semantics.ZAspectZAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import xyz.Z;

@Aspect(className = Z.class)
@SuppressWarnings("all")
public class ZAspect {
  public static void eval(final Z _self) {
    fr.inria.diverse.puzzle.xyz.semantics.ZAspectZAspectProperties _self_ = fr.inria.diverse.puzzle.xyz.semantics.ZAspectZAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final ZAspectZAspectProperties _self_, final Z _self) {
    InputOutput.<String>println("Evaluating Z");
  }
}
