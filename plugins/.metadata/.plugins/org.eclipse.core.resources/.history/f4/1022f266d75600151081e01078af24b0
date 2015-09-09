package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureAndSourceMethodComparison;
import fr.inria.diverse.k3.sle.common.graphsOperators.MembershipGraphPartition;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.puzzle.metrics.actions.ComputeMetricsActionImpl;
import fr.inria.diverse.puzzle.variabilityinferer.inferers.DiverSEInferrer;
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
      SynthesisProperties properties = this.getSynthesisProperties();
      ComputeMetricsActionImpl _instance = ComputeMetricsActionImpl.getInstance();
      _instance.computeMetrics(properties, root, project);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private SynthesisProperties getSynthesisProperties() {
    ConceptComparison conceptComparisonOperator = new DeepConceptComparison();
    MethodComparison methodComparisonOperator = SignatureAndSourceMethodComparison.getInstance();
    VariabilityInferer variabilityInferer = new DiverSEInferrer();
    GraphPartition graphPartition = new MembershipGraphPartition();
    SynthesisProperties properties = new SynthesisProperties(conceptComparisonOperator, methodComparisonOperator, variabilityInferer, graphPartition);
    return properties;
  }
}
