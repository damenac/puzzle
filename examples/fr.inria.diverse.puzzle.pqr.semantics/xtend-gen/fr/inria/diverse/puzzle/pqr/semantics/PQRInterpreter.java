package fr.inria.diverse.puzzle.pqr.semantics;

import fr.inria.diverse.puzzle.pqr.semantics.PAspect;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import pqr.P;
import pqr.PqrPackage;

@SuppressWarnings("all")
public class PQRInterpreter {
  public PQRInterpreter() {
  }
  
  public void eval(final String modelPath) {
    XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(PqrPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(PqrPackage.eNS_URI, PqrPackage.eINSTANCE);
    }
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("*", fact);
    ResourceSetImpl rs = new ResourceSetImpl();
    URI uri = URI.createFileURI(modelPath);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    P a = ((P) _get);
    PAspect.eval(a);
  }
  
  public static void main(final String[] args) {
    PQRInterpreter _pQRInterpreter = new PQRInterpreter();
    _pQRInterpreter.eval("instances/pqr.xmi");
  }
}
