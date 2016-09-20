package semanticsLogo;

import Logo.LogoPackage;
import Logo.LogoProgram;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import semanticsLogo.LogoProgramAspect;
import semanticsLogo.Turtle;

@SuppressWarnings("all")
public class Interpreter {
  public Interpreter() {
  }
  
  public void eval(final String modelPath) {
    XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(LogoPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(LogoPackage.eNS_URI, LogoPackage.eINSTANCE);
    }
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("*", fact);
    ResourceSetImpl rs = new ResourceSetImpl();
    URI uri = URI.createFileURI(modelPath);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    LogoProgram logo = ((LogoProgram) _get);
    Hashtable<String, Object> context = new Hashtable<String, Object>();
    Turtle turtle = new Turtle();
    context.put("turtle", turtle);
    ArrayList<Hashtable<String, Integer>> stack = new ArrayList<Hashtable<String, Integer>>();
    context.put("stack", stack);
    LogoProgramAspect.eval(logo, context);
  }
  
  public static void main(final String[] args) {
    Interpreter _interpreter = new Interpreter();
    _interpreter.eval("models/SimpleLogo.xmi");
  }
}
