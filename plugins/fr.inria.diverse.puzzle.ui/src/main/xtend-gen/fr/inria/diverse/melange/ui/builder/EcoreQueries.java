package fr.inria.diverse.melange.ui.builder;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * Some queries on Ecore models.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class EcoreQueries {
  public EClassifier searchClassByName(final EPackage ePackage, final String className) {
    EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
    for (final EClassifier _eClassifier : _eClassifiers) {
      String _name = _eClassifier.getName();
      boolean _equals = _name.equals(className);
      if (_equals) {
        return _eClassifier;
      }
    }
    EList<EPackage> _eSubpackages = ePackage.getESubpackages();
    for (final EPackage _subPackage : _eSubpackages) {
      {
        EClassifier result = this.searchClassByName(_subPackage, className);
        boolean _notEquals = (!Objects.equal(result, null));
        if (_notEquals) {
          return result;
        }
      }
    }
    return null;
  }
  
  public String getQualifiedName(final EObject _eObject) {
    boolean _equals = Objects.equal(_eObject, null);
    if (_equals) {
      return "";
    } else {
      if ((_eObject instanceof EPackage)) {
        EPackage _eSuperPackage = ((EPackage) _eObject).getESuperPackage();
        String answer = this.getQualifiedName(_eSuperPackage);
        boolean _equals_1 = answer.equals("");
        boolean _not = (!_equals_1);
        if (_not) {
          answer = (answer + ".");
        }
        String _name = ((EPackage) _eObject).getName();
        String _plus = (answer + _name);
        answer = _plus;
        return answer;
      } else {
        EPackage _ePackage = ((EClassifier) _eObject).getEPackage();
        String _qualifiedName = this.getQualifiedName(_ePackage);
        String _plus_1 = (_qualifiedName + 
          ".");
        String _name_1 = ((EClassifier) _eObject).getName();
        String answer_1 = (_plus_1 + _name_1);
        return answer_1;
      }
    }
  }
  
  /**
   * Fills the parameter 'incomingReference' with the collection of EReferences whose type corresponds to the
   * parameter 'targetClass'.
   */
  public void getIncomingReferences(final EClass targetClass, final EPackage ePackage, final List<EReference> incomingReferences) {
    EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
    for (final EClassifier _eClassifier : _eClassifiers) {
      if ((_eClassifier instanceof EClass)) {
        EClass _eClass = ((EClass) _eClassifier);
        EList<EReference> _eReferences = _eClass.getEReferences();
        for (final EReference _eReference : _eReferences) {
          EClassifier _eType = _eReference.getEType();
          String _name = _eType.getName();
          String _name_1 = targetClass.getName();
          boolean _equals = _name.equals(_name_1);
          if (_equals) {
            incomingReferences.add(_eReference);
          }
        }
      }
    }
    EList<EPackage> _eSubpackages = ePackage.getESubpackages();
    for (final EPackage _eSubpackage : _eSubpackages) {
      this.getIncomingReferences(targetClass, _eSubpackage, incomingReferences);
    }
  }
  
  /**
   * Fills the parameter 'referringEClasses' with the classes that contain some references to the class 'targetClass'
   */
  public void getReferringClasses(final EClass _targetClass, final EPackage ePackage, final ArrayList<EClass> referringEClasses) {
    EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
    for (final EClassifier _eClassifier : _eClassifiers) {
      if ((_eClassifier instanceof EClass)) {
        boolean _containsReferencesTo = this.containsReferencesTo(((EClass) _eClassifier), _targetClass);
        if (_containsReferencesTo) {
          referringEClasses.add(((EClass) _eClassifier));
        }
      }
    }
    EList<EPackage> _eSubpackages = ePackage.getESubpackages();
    for (final EPackage _eSubPackage : _eSubpackages) {
      this.getReferringClasses(_targetClass, _eSubPackage, referringEClasses);
    }
  }
  
  public boolean containsReferencesTo(final EClass _studiedClass, final EClass _targetClass) {
    EList<EReference> _eReferences = _studiedClass.getEReferences();
    for (final EReference _eReference : _eReferences) {
      EClassifier _eType = _eReference.getEType();
      String _name = _eType.getName();
      String _name_1 = _targetClass.getName();
      boolean _equals = _name.equals(_name_1);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
}
