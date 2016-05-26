package interpreters;

import CompleteDSL.StateMachineAspect;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.StateMachine;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class Interpreter {
  public Interpreter() {
  }
  
  public void eval(final String modelPath) {
    XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(CompleteDSLPckgPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(CompleteDSLPckgPackage.eNS_URI, CompleteDSLPckgPackage.eINSTANCE);
    }
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("*", fact);
    ResourceSetImpl rs = new ResourceSetImpl();
    URI uri = URI.createFileURI(modelPath);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    StateMachine stateMachine = ((StateMachine) _get);
    StateMachineAspect.eval(stateMachine);
  }
  
  public static void main(final String[] args) {
    Interpreter _interpreter = new Interpreter();
    _interpreter.eval("models/citizenWatch-1.xmi");
  }
}
