package fr.inria.diverse.puzzle.abc.semantics;

import abc.A;
import abc.B;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.abc.semantics.AAspectAAspectProperties;
import fr.inria.diverse.puzzle.abc.semantics.BAspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = A.class)
@SuppressWarnings("all")
public class AAspect {
  public static void eval(final A _self) {
    fr.inria.diverse.puzzle.abc.semantics.AAspectAAspectProperties _self_ = fr.inria.diverse.puzzle.abc.semantics.AAspectAAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final AAspectAAspectProperties _self_, final A _self) {
    InputOutput.<String>println("Evaluating A");
    EList<B> _bes = _self.getBes();
    final Consumer<B> _function = (B b) -> {
      BAspect.eval(b);
    };
    _bes.forEach(_function);
  }
}
