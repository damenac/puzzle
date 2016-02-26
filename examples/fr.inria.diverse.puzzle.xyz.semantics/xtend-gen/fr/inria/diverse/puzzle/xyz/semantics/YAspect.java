package fr.inria.diverse.puzzle.xyz.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.xyz.semantics.YAspectYAspectProperties;
import fr.inria.diverse.puzzle.xyz.semantics.ZAspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import xyz.Y;
import xyz.Z;

@Aspect(className = Y.class)
@SuppressWarnings("all")
public class YAspect {
  public static void eval(final Y _self) {
    fr.inria.diverse.puzzle.xyz.semantics.YAspectYAspectProperties _self_ = fr.inria.diverse.puzzle.xyz.semantics.YAspectYAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final YAspectYAspectProperties _self_, final Y _self) {
    InputOutput.<String>println("Evaluating Y");
    EList<Z> _zes = _self.getZes();
    final Consumer<Z> _function = (Z z) -> {
      ZAspect.eval(z);
    };
    _zes.forEach(_function);
  }
}
