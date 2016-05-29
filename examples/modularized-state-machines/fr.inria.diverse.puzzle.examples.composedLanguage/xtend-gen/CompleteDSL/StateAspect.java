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
  
  private static Thread executionThread(final State _self) {
    CompleteDSL.StateAspectStateAspectProperties _self_ = CompleteDSL.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_executionThread(_self_, _self);
    return (java.lang.Thread)result;
  }
  
  private static void executionThread(final State _self, final Thread executionThread) {
    CompleteDSL.StateAspectStateAspectProperties _self_ = CompleteDSL.StateAspectStateAspectContext.getSelf(_self);
    _privk3_executionThread(_self_, _self,executionThread);
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
      Runnable _runnable = new Runnable() {
        @Override
        public void run() {
          synchronized (_self) {
            Block _doAction = _self.getDoAction();
            BlockAspect.evalStatement( _doAction,context);
          }
        }
      };
      Thread _thread = new Thread(_runnable);
      StateAspect.executionThread(_self, _thread);
      Thread _executionThread = StateAspect.executionThread(_self);
      _executionThread.start();
    }
  }
  
  protected static void _privk3_exitState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    boolean _and = false;
    Thread _executionThread = StateAspect.executionThread(_self);
    boolean _notEquals = (!Objects.equal(_executionThread, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Thread _executionThread_1 = StateAspect.executionThread(_self);
      boolean _isAlive = _executionThread_1.isAlive();
      _and = _isAlive;
    }
    if (_and) {
      Thread _executionThread_2 = StateAspect.executionThread(_self);
      _executionThread_2.stop();
      StateAspect.executionThread(_self, null);
    }
    Block _exitAction = _self.getExitAction();
    boolean _notEquals_1 = (!Objects.equal(_exitAction, null));
    if (_notEquals_1) {
      Block _exitAction_1 = _self.getExitAction();
      BlockAspect.evalStatement( _exitAction_1,context);
    }
  }
  
  protected static Thread _privk3_executionThread(final StateAspectStateAspectProperties _self_, final State _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getExecutionThread") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Thread) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.executionThread;
  }
  
  protected static void _privk3_executionThread(final StateAspectStateAspectProperties _self_, final State _self, final Thread executionThread) {
    _self_.executionThread = executionThread; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setExecutionThread")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, executionThread);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
