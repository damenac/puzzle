package fr.inria.diverse.melange.ui.menu;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import fr.inria.diverse.melange.ui.builder.ValidateLanguageModulesComposabilityBuilder;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Handler for the action: Validate language modules composability
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ValidateLanguageModulesComposability extends AbstractHandler {
  @Inject
  private ValidateLanguageModulesComposabilityBuilder builder;
  
  @Inject
  private XtextResourceSetProvider rsProvider;
  
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    new Job("Puzzle: Validate language modules composability...") {
      @Override
      public IStatus run(final IProgressMonitor monitor) {
        try {
          monitor.beginTask("Computing all metrics of the family\'s analysis", 4);
          final ISelection sel = HandlerUtil.getActiveMenuSelection(event);
          final IStructuredSelection selection = ((IStructuredSelection) sel);
          Object _firstElement = selection.getFirstElement();
          final IResource resource = ((IResource) _firstElement);
          final IProject project = resource.getProject();
          final ResourceSet rs = ValidateLanguageModulesComposability.this.rsProvider.get(project);
          IPath _fullPath = resource.getFullPath();
          String _string = _fullPath.toString();
          URI _createPlatformResourceURI = URI.createPlatformResourceURI(_string, true);
          Resource _resource = rs.getResource(_createPlatformResourceURI, true);
          final DerivedStateAwareResource melangeRes = ((DerivedStateAwareResource) _resource);
          IPath _fullPath_1 = resource.getFullPath();
          String _string_1 = _fullPath_1.toString();
          String _replace = _string_1.replace(".melange", ".binding");
          URI _createPlatformResourceURI_1 = URI.createPlatformResourceURI(_replace, true);
          Resource _resource_1 = rs.getResource(_createPlatformResourceURI_1, true);
          final DerivedStateAwareResource puzzleRes = ((DerivedStateAwareResource) _resource_1);
          final String validation = ValidateLanguageModulesComposability.this.builder.validateLanguageModulesComposability(puzzleRes, melangeRes, project, monitor);
          Display _display = ValidateLanguageModulesComposability.getDisplay();
          _display.syncExec(
            new Runnable() {
              @Override
              public void run() {
                Display _display = ValidateLanguageModulesComposability.getDisplay();
                Shell _activeShell = _display.getActiveShell();
                MessageDialog.openInformation(_activeShell, "Validation result", validation);
              }
            });
        } catch (final Throwable _t) {
          if (_t instanceof OperationCanceledException) {
            final OperationCanceledException e = (OperationCanceledException)_t;
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
