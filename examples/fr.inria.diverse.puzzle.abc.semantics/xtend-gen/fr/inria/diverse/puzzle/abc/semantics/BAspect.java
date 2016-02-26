package fr.inria.diverse.puzzle.abc.semantics;

import abc.B;
import abc.C;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectProperties;
import fr.inria.diverse.puzzle.abc.semantics.CAspect;
import fr.inria.diverse.puzzle.xyz.semantics.XAspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import xyz.X;

@Aspect(className = B.class)
@SuppressWarnings("all")
public class BAspect {
  public static void eval(final B _self) {
    fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectProperties _self_ = fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final BAspectBAspectProperties _self_, final B _self) {
    InputOutput.<String>println("Evaluating B");
    EList<C> _ces = _self.getCes();
    final Consumer<C> _function = (C c) -> {
      CAspect.eval(c);
    };
    _ces.forEach(_function);
    EList<X> _xes = _self.getXes();
    final Consumer<X> _function_1 = (X x) -> {
      XAspect.eval(x);
    };
    _xes.forEach(_function_1);
  }
}
