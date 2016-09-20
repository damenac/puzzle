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
import semanticsLogo.Window;

@SuppressWarnings("all")
public class Interpreter {
  public Interpreter() {
  }
  
  public Window eval(final String modelPath) {
    Window _xblockexpression = null;
    {
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
      ArrayList<Hashtable<String, Integer>> stack = new ArrayList<Hashtable<String, Integer>>();
      context.put("turtle", turtle);
      context.put("stack", stack);
      LogoProgramAspect.eval(logo, context);
      Object _get_1 = context.get("turtle");
      _xblockexpression = new Window(((Turtle) _get_1));
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    Interpreter _interpreter = new Interpreter();
    _interpreter.eval("models/SimpleLogo.xmi");
  }
}
