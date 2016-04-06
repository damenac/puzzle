package fr.inria.diverse.puzzle.variabilityinferer.inferers;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import vm.LanguageProductLine;
import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.variabilityinferer.auxiliar.PCMsGenerator;
import fr.inria.diverse.puzzle.vmsynthesis.impl.VmSynthesis;

public class PuzzleInferrer implements FeaturesModelInference{

	@Override
	public LanguageProductLine inferOpenFeaturesModel(IProject targetProject, SynthesisProperties properties, 
			ArrayList<Language> languages, EcoreGraph modularizationGraph, Graph<Vertex, Arc> dependenciesGraph) throws Exception{
		return VmSynthesis.getInstance().synthesizeOpenFeatureModel(dependenciesGraph);
	}

	@Override
	public LanguageProductLine inferClosedFeaturesModel(IProject targetProject,
			SynthesisProperties properties, ArrayList<Language> languages,
			EcoreGraph modularizationGraph, LanguageProductLine openFeaturesModel) throws Exception {
		String PCM = PCMsGenerator.getInstance().generatePCM(properties, languages, modularizationGraph, PCMsGenerator.OPEN_COMPARE_FORMAT);
		return VmSynthesis.getInstance().synthesizeClosedFeatureModel(PCM, openFeaturesModel);
	}
}
