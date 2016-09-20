package CompleteDSL;

import java.util.ArrayList;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Context {
  private ArrayList<Hashtable<String, Integer>> stack;
  
  public Context() {
    ArrayList<Hashtable<String, Integer>> _arrayList = new ArrayList<Hashtable<String, Integer>>();
    this.stack = _arrayList;
  }
  
  public void reset() {
    ArrayList<Hashtable<String, Integer>> _arrayList = new ArrayList<Hashtable<String, Integer>>();
    this.stack = _arrayList;
  }
  
  public Hashtable<String, Integer> peek() {
    return IterableExtensions.<Hashtable<String, Integer>>last(this.stack);
  }
  
  public Hashtable<String, Integer> pop() {
    int _size = this.stack.size();
    int _minus = (_size - 1);
    this.stack.remove(_minus);
    return IterableExtensions.<Hashtable<String, Integer>>last(this.stack);
  }
  
  public void push(final Hashtable<String, Integer> elem) {
    this.stack.add(elem);
  }
}
