package fr.inria.diverse.k3.examples.abc.semantics;

import ABC.A;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.examples.abc.semantics.AAspectAAspectProperties;

@Aspect(className = A.class)
@SuppressWarnings("all")
public abstract class AAspect {
  @Abstract
  public static void eval(final A _self) {
    fr.inria.diverse.k3.examples.abc.semantics.AAspectAAspectProperties _self_ = fr.inria.diverse.k3.examples.abc.semantics.AAspectAAspectContext.getSelf(_self);
     if (_self instanceof ABC.C){
     fr.inria.diverse.k3.examples.abc.semantics.CAspect.eval((ABC.C)_self);
    } else  if (_self instanceof ABC.A){
     fr.inria.diverse.k3.examples.abc.semantics.AAspect._privk3_eval(_self_, (ABC.A)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final AAspectAAspectProperties _self_, final A _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
