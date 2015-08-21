package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.puzzle.metrics.actions.ComputeMetricsActionImpl;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MetricsBuilder {
  public void computeMetrics(final Resource res, final IProject project, final IProgressMonitor monitor) {
    try {
      EList<EObject> _contents = res.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final ModelTypingSpace root = ((ModelTypingSpace) _head);
      ComputeMetricsActionImpl _instance = ComputeMetricsActionImpl.getInstance();
      _instance.computeMetrics(root, project);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
