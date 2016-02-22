package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Aspect;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class LanguageVO {
  public String name;
  
  public String mergedPackage;
  
  public String metamodelSerializationPath;
  
  public List<Aspect> aspects = CollectionLiterals.<Aspect>newArrayList();
  
  public EPackage metamodel;
  
  public EPackage providedInterface;
  
  public EPackage requiredInterface;
  
  public List<String> oldNamespaces = CollectionLiterals.<String>newArrayList();
  
  public EPackage setMetamodel(final EPackage ePackage) {
    return this.metamodel = ePackage;
  }
  
  public EPackage setProvidedInterface(final EPackage ePackage) {
    return this.providedInterface = ePackage;
  }
  
  public EPackage setRequiredInterface(final EPackage ePackage) {
    return this.requiredInterface = ePackage;
  }
}
