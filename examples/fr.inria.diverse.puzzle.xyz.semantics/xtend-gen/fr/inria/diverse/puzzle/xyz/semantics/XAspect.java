package fr.inria.diverse.puzzle.xyz.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.puzzle.xyz.semantics.XAspectXAspectProperties;
import fr.inria.diverse.puzzle.xyz.semantics.YAspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import xyz.X;
import xyz.Y;

@Aspect(className = X.class)
@SuppressWarnings("all")
public class XAspect {
  public static void eval(final X _self) {
    fr.inria.diverse.puzzle.xyz.semantics.XAspectXAspectProperties _self_ = fr.inria.diverse.puzzle.xyz.semantics.XAspectXAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final XAspectXAspectProperties _self_, final X _self) {
    InputOutput.<String>println("Evaluating X");
    EList<Y> _yes = _self.getYes();
    final Consumer<Y> _function = (Y y) -> {
      YAspect.eval(y);
    };
    _yes.forEach(_function);
  }
}
