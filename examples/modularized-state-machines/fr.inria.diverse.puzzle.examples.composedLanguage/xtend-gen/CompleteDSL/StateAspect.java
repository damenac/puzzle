package CompleteDSL;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import CompleteDSL.StateAspectStateAspectProperties;
import CompleteDSLPckg.Block;
import CompleteDSLPckg.State;
import java.util.Hashtable;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void entryState(final State _self, final Hashtable<String, Object> context) {
    CompleteDSL.StateAspectStateAspectProperties _self_ = CompleteDSL.StateAspectStateAspectContext.getSelf(_self);
    _privk3_entryState(_self_, _self,context);
  }
  
  public static void evalState(final State _self, final Hashtable<String, Object> context) {
    CompleteDSL.StateAspectStateAspectProperties _self_ = CompleteDSL.StateAspectStateAspectContext.getSelf(_self);
    _privk3_evalState(_self_, _self,context);
  }
  
  public static void exitState(final State _self, final Hashtable<String, Object> context) {
    CompleteDSL.StateAspectStateAspectProperties _self_ = CompleteDSL.StateAspectStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_entryState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    Block _entryAction = _self.getEntryAction();
    boolean _notEquals = (!Objects.equal(_entryAction, null));
    if (_notEquals) {
      Block _entryAction_1 = _self.getEntryAction();
      BlockAspect.evalStatement( _entryAction_1,context);
    }
  }
  
  protected static void _privk3_evalState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    Block _doAction = _self.getDoAction();
    boolean _notEquals = (!Objects.equal(_doAction, null));
    if (_notEquals) {
      Block _doAction_1 = _self.getDoAction();
      BlockAspect.evalStatement( _doAction_1,context);
    }
  }
  
  protected static void _privk3_exitState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    Block _exitAction = _self.getExitAction();
    boolean _notEquals = (!Objects.equal(_exitAction, null));
    if (_notEquals) {
      Block _exitAction_1 = _self.getExitAction();
      BlockAspect.evalStatement( _exitAction_1,context);
    }
  }
}
