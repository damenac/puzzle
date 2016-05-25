package fr.inria.diverse.melange.ui.menu;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import fr.inria.diverse.melange.ui.builder.ExtractRequiredInterfaceBuilder;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Handler for the action: Compose language modules
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ExtractRequiredInterface extends AbstractHandler {
  @Inject
  private ExtractRequiredInterfaceBuilder builder;
  
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    new Job("Puzzle: Extract required interface ...") {
      @Override
      public IStatus run(final IProgressMonitor monitor) {
        try {
          monitor.beginTask("Extracting required interface", 4);
          final ISelection sel = HandlerUtil.getActiveMenuSelection(event);
          final IStructuredSelection selection = ((IStructuredSelection) sel);
          Object _firstElement = selection.getFirstElement();
          final IResource resource = ((IResource) _firstElement);
          final IProject project = resource.getProject();
          Object _firstElement_1 = selection.getFirstElement();
          final IResource ecoreResource = ((IResource) _firstElement_1);
          ExtractRequiredInterface.this.builder.extractRequiredInterface(ecoreResource, project, monitor);
          Display _display = ExtractRequiredInterface.getDisplay();
          _display.syncExec(
            new Runnable() {
              @Override
              public void run() {
                Display _display = ExtractRequiredInterface.getDisplay();
                Shell _activeShell = _display.getActiveShell();
                MessageDialog.openInformation(_activeShell, "Required interface successfully extracted", "Required interface successfully extracted");
              }
            });
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            e.printStackTrace();
            return Status.CANCEL_STATUS;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        } finally {
          monitor.done();
        }
        return Status.OK_STATUS;
      }
    }.schedule();
    return null;
  }
  
  public static Display getDisplay() {
    Display display = Display.getCurrent();
    boolean _equals = Objects.equal(display, null);
    if (_equals) {
      Display _default = Display.getDefault();
      display = _default;
    }
    return display;
  }
}
