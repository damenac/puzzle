package fr.inria.diverse.puzzle.pqr.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.abc.semantics.BAspect;
import fr.inria.diverse.puzzle.pqr.semantics.PAspectPAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import pqr.P;

@Aspect(className = P.class)
@SuppressWarnings("all")
public class PAspect extends BAspect {
  @OverrideAspectMethod
  public static void eval(final P _self) {
    fr.inria.diverse.puzzle.pqr.semantics.PAspectPAspectProperties _self_ = fr.inria.diverse.puzzle.pqr.semantics.PAspectPAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);
  }
  
  private static void super_eval(final P _self) {
    fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectProperties _self_ = fr.inria.diverse.puzzle.abc.semantics.BAspectBAspectContext.getSelf(_self);
     fr.inria.diverse.puzzle.abc.semantics.BAspect._privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final PAspectPAspectProperties _self_, final P _self) {
    InputOutput.<String>println("Evaluating P");
    PAspect.super_eval(_self);
  }
}
