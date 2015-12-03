package transitioneffects.parallel;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import transitioneffect.Statement;
import transitioneffect.Transition;
import transitioneffects.parallel.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static void evalTransition(final Transition _self, final Hashtable<String, Object> context) {
    transitioneffects.parallel.TransitionAspectTransitionAspectProperties _self_ = transitioneffects.parallel.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_evalTransition(_self_, _self,context);
  }
  
  protected static void _privk3_evalTransition(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final Hashtable<String, Object> context) {
    final ArrayList<Hashtable<String, Object>> parallelContexts = new ArrayList<Hashtable<String, Object>>();
    EList<Statement> _effect = _self.getEffect();
    for (final Statement _statement : _effect) {
      {
        Hashtable<String, Object> _newContext = new Hashtable<String, Object>(context);
        _statement.eval(_newContext);
        parallelContexts.add(_newContext);
      }
    }
    for (final Hashtable<String, Object> _context : parallelContexts) {
      {
        Set<String> _keySet = _context.keySet();
        Iterator<String> _it = _keySet.iterator();
        while (_it.hasNext()) {
          {
            String _key = _it.next();
            Object _value = _context.get(_key);
            boolean _startsWith = _key.startsWith("currentState");
            boolean _not = (!_startsWith);
            if (_not) {
              context.put(_key, _value);
            }
          }
        }
      }
    }
  }
}
