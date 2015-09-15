package fr.inria.diverse.melange.ui.menu;

import fr.inria.diverse.melange.ui.builder.ConfigurationBuilder;
import javax.inject.Inject;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Hanlder for the action: Configure
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class Configure extends AbstractHandler {
  @Inject
  private ConfigurationBuilder builder;
  
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    new Job("Puzzle: Configuring DSL") {
      @Override
      public IStatus run(final IProgressMonitor monitor) {
        try {
          monitor.beginTask("Configuring a DSL in the Language Product Line", 4);
          final ISelection sel = HandlerUtil.getActiveMenuSelection(event);
          final IStructuredSelection selection = ((IStructuredSelection) sel);
          Object _firstElement = selection.getFirstElement();
          final IResource resource = ((IResource) _firstElement);
          final IProject project = resource.getProject();
          Configure.this.builder.configureDSL(resource, project, monitor);
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
}
