package interpreters;

@SuppressWarnings("all")
public class Interpreter {
  public Interpreter() {
  }
  
  public Object eval(final String modelPath) {
    throw new Error("Unresolved compilation problems:"
      + "\nStateMachine cannot be resolved to a type."
      + "\nStateMachine cannot be resolved to a type."
      + "\nThe method or field CompleteDSLPckgPackage is undefined"
      + "\nThe method or field CompleteDSLPckgPackage is undefined"
      + "\nThe method or field CompleteDSLPckgPackage is undefined"
      + "\neNS_URI cannot be resolved"
      + "\neNS_URI cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\neval cannot be resolved");
  }
  
  public static void main(final String[] args) {
    Interpreter _interpreter = new Interpreter();
    _interpreter.eval("models/citizenWatch-2.xmi");
  }
}
