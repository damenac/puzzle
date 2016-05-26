package fr.inria.diverse.k3.examples.abc.semantics;

import ABC.C;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.examples.abc.semantics.AAspect;
import fr.inria.diverse.k3.examples.abc.semantics.CAspectCAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = C.class)
@SuppressWarnings("all")
public class CAspect extends AAspect {
  @OverrideAspectMethod
  public static void eval(final C _self) {
    fr.inria.diverse.k3.examples.abc.semantics.CAspectCAspectProperties _self_ = fr.inria.diverse.k3.examples.abc.semantics.CAspectCAspectContext.getSelf(_self);
     if (_self instanceof ABC.C){
     fr.inria.diverse.k3.examples.abc.semantics.CAspect._privk3_eval(_self_, (ABC.C)_self);
    } else  if (_self instanceof ABC.A){
     fr.inria.diverse.k3.examples.abc.semantics.AAspect.eval((ABC.A)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final CAspectCAspectProperties _self_, final C _self) {
    InputOutput.<String>println("Evaluating C");
  }
}
