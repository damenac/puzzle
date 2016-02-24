package fr.inria.diverse.melange.ui.menu;

import fr.inria.diverse.melange.ui.builder.DeriveLanguageFromConfigurationBuilder;
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
public class DeriveLanguageFromConfiguration extends AbstractHandler {
  @Inject
  private DeriveLanguageFromConfigurationBuilder builder;
  
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    new Job("Puzzle: Deriving language from configuration") {
      @Override
      public IStatus run(final IProgressMonitor monitor) {
        try {
          monitor.beginTask("Puzzle: Deriving language from configuration", 4);
          final ISelection sel = HandlerUtil.getActiveMenuSelection(event);
          final IStructuredSelection selection = ((IStructuredSelection) sel);
          final Object[] resources = selection.toArray();
          Object _firstElement = selection.getFirstElement();
          final IProject project = ((IResource) _firstElement).getProject();
          DeriveLanguageFromConfiguration.this.builder.deriveLanguageFromConfigurationBuilder(resources, project, monitor);
        } catch (final Throwable _t) {
          if (_t instanceof OperationCanceledException) {
            final OperationCanceledException e = (OperationCanceledException)_t;
            return Status.CANCEL_STATUS;
          } else if (_t instanceof Exception) {
            final Exception e_1 = (Exception)_t;
            e_1.printStackTrace();
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
