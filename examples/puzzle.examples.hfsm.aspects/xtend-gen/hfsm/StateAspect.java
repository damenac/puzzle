package hfsm;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import hfsm.Program;
import hfsm.ProgramAspect;
import hfsm.State;
import hfsm.StateAspectStateAspectProperties;
import java.util.Hashtable;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void entryState(final State _self, final Hashtable<String, Object> context) {
    hfsm.StateAspectStateAspectProperties _self_ = hfsm.StateAspectStateAspectContext.getSelf(_self);
    _privk3_entryState(_self_, _self,context);
  }
  
  public static void evalState(final State _self, final Hashtable<String, Object> context) {
    hfsm.StateAspectStateAspectProperties _self_ = hfsm.StateAspectStateAspectContext.getSelf(_self);
    _privk3_evalState(_self_, _self,context);
  }
  
  public static void exitState(final State _self, final Hashtable<String, Object> context) {
    hfsm.StateAspectStateAspectProperties _self_ = hfsm.StateAspectStateAspectContext.getSelf(_self);
     if (_self instanceof hfsm.FinalState){
     hfsm.FinalStateAspect.exitState((hfsm.FinalState)_self,context);
    } else  if (_self instanceof hfsm.State){
     hfsm.StateAspect._privk3_exitState(_self_, (hfsm.State)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_entryState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    Program _entry = _self.getEntry();
    boolean _notEquals = (!Objects.equal(_entry, null));
    if (_notEquals) {
      Program _entry_1 = _self.getEntry();
      ProgramAspect.eval(_entry_1, context);
    }
  }
  
  protected static void _privk3_evalState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    Program _doActivity = _self.getDoActivity();
    boolean _notEquals = (!Objects.equal(_doActivity, null));
    if (_notEquals) {
      Runnable _runnable = new Runnable() {
        @Override
        public void run() {
          synchronized (_self) {
            Program _doActivity = _self.getDoActivity();
            ProgramAspect.eval(_doActivity, context);
          }
        }
      };
      Thread _thread = new Thread(_runnable);
      _thread.start();
    }
  }
  
  protected static void _privk3_exitState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    Program _exit = _self.getExit();
    boolean _notEquals = (!Objects.equal(_exit, null));
    if (_notEquals) {
      Program _exit_1 = _self.getExit();
      ProgramAspect.eval(_exit_1, context);
    }
  }
}
