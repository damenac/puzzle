package fr.inria.diverse.puzzle.abc.semantics;

import abc.A;
import abc.AbcPackage;
import fr.inria.diverse.puzzle.abc.semantics.AAspect;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class ABCInterpreter {
  public ABCInterpreter() {
  }
  
  public void eval(final String modelPath) {
    XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(AbcPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(AbcPackage.eNS_URI, AbcPackage.eINSTANCE);
    }
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("*", fact);
    ResourceSetImpl rs = new ResourceSetImpl();
    URI uri = URI.createFileURI(modelPath);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    A a = ((A) _get);
    AAspect.eval(a);
  }
  
  public static void main(final String[] args) {
    ABCInterpreter _aBCInterpreter = new ABCInterpreter();
    _aBCInterpreter.eval("instances/abc.xmi");
  }
}
