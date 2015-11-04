package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureAndSourceMethodComparison;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.puzzle.breaker.breakers.MinimumAcyclicPartition;
import fr.inria.diverse.puzzle.variabilityinferer.inferers.PuzzleInferrer;

/**
 * Abstract builder. Responsible for managing the parameters of the reverse-engineering process.
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class AbstractBuilder {
  /**
   * Defines the reverse-engineering process and returns an object with the corresponding values.
   * 
   * TODO: Read the properties from an external file.
   */
  protected SynthesisProperties getSynthesisProperties() {
    ConceptComparison conceptComparisonOperator = new NamingConceptComparison();
    MethodComparison methodComparisonOperator = SignatureAndSourceMethodComparison.getInstance();
    FeaturesModelInference variabilityInferer = new PuzzleInferrer();
    GraphPartition graphPartition = new MinimumAcyclicPartition();
    SynthesisProperties properties = new SynthesisProperties(conceptComparisonOperator, methodComparisonOperator, variabilityInferer, graphPartition);
    return properties;
  }
}
