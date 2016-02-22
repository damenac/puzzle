package fr.inria.diverse.melange.ui.menu;

import com.google.inject.Inject;
import fr.inria.diverse.melange.ui.builder.AnalysisBuilder;
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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Hanlder for the action: Analyze Family
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class PerformLanguagesAnalysis extends AbstractHandler {
  @Inject
  private AnalysisBuilder builder;
  
  @Inject
  private XtextResourceSetProvider rsProvider;
  
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    new Job("Puzzle: Perform languages analysis") {
      @Override
      public IStatus run(final IProgressMonitor monitor) {
        try {
          monitor.beginTask("Puzzle: Perform languages analysis", 4);
          final ISelection sel = HandlerUtil.getActiveMenuSelection(event);
          final IStructuredSelection selection = ((IStructuredSelection) sel);
          Object _firstElement = selection.getFirstElement();
          final IResource resource = ((IResource) _firstElement);
          final IProject project = resource.getProject();
          final ResourceSet rs = PerformLanguagesAnalysis.this.rsProvider.get(project);
          IPath _fullPath = resource.getFullPath();
          String _string = _fullPath.toString();
          URI _createPlatformResourceURI = URI.createPlatformResourceURI(_string, true);
          Resource _resource = rs.getResource(_createPlatformResourceURI, true);
          final DerivedStateAwareResource res = ((DerivedStateAwareResource) _resource);
          PerformLanguagesAnalysis.this.builder.computeMetrics(res, project, monitor);
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
