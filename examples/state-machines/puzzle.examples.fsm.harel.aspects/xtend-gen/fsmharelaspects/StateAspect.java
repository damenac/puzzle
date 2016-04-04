package fsmharelaspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.Program;
import fsm.Region;
import fsm.State;
import fsmharelaspects.ProgramAspect;
import fsmharelaspects.RegionAspect;
import fsmharelaspects.StateAspectStateAspectProperties;
import java.util.Hashtable;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void entryState(final State _self, final Hashtable<String, Object> context) {
    fsmharelaspects.StateAspectStateAspectProperties _self_ = fsmharelaspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_entryState(_self_, _self,context);
  }
  
  public static void evalState(final State _self, final Hashtable<String, Object> context) {
    fsmharelaspects.StateAspectStateAspectProperties _self_ = fsmharelaspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_evalState(_self_, _self,context);
  }
  
  public static void exitState(final State _self, final Hashtable<String, Object> context) {
    fsmharelaspects.StateAspectStateAspectProperties _self_ = fsmharelaspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_exitState(_self_, _self,context);
  }
  
  protected static void _privk3_entryState(final StateAspectStateAspectProperties _self_, final State _self, final Hashtable<String, Object> context) {
    Program _entry = _self.getEntry();
    boolean _notEquals = (!Objects.equal(_entry, null));
    if (_notEquals) {
      Program _entry_1 = _self.getEntry();
      ProgramAspect.eval(_entry_1, context);
    }
    EList<Region> _ownedRegions = _self.getOwnedRegions();
    final Consumer<Region> _function = (Region _region) -> {
      RegionAspect.initRegion(_region, context);
    };
    _ownedRegions.forEach(_function);
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
            InputOutput.<String>println("");
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
    EList<Region> _ownedRegions = _self.getOwnedRegions();
    final Consumer<Region> _function = (Region _region) -> {
      RegionAspect.saveDeepHistoryState(_region, context);
    };
    _ownedRegions.forEach(_function);
    EList<Region> _ownedRegions_1 = _self.getOwnedRegions();
    final Consumer<Region> _function_1 = (Region _region) -> {
      RegionAspect.saveHistoryState(_region, context);
    };
    _ownedRegions_1.forEach(_function_1);
  }
}
