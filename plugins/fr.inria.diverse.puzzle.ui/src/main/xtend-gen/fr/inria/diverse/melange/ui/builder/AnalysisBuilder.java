package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.metrics.actions.ComputeMetricsActionImpl;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class AnalysisBuilder extends AbstractBuilder {
  public void computeMetrics(final Resource res, final IProject project, final IProgressMonitor monitor) {
    try {
      EList<EObject> _contents = res.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final ModelTypingSpace root = ((ModelTypingSpace) _head);
      SynthesisProperties properties = this.getSynthesisProperties();
      ComputeMetricsActionImpl _instance = ComputeMetricsActionImpl.getInstance();
      _instance.computeMetrics(properties, root, project);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
