package fr.inria.diverse.puzzle.variabilityinferer.inferers;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import vm.FeatureModel;
import fama.synthesizer.facade.FamaSynthesizer;
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.variabilityinferer.auxiliar.PCMsGenerator;

/**
 * Implementation of a feature model inferrer that uses the synthesis provided by FAMA.
 * @author David Mendez-Acuna
 *
 */
public class FamaInferrer implements FeaturesModelInference{

	@Override
	public FeatureModel inferOpenFeaturesModel(IProject targetProject, SynthesisProperties properties,
			ArrayList<Language> languages, EcoreGraph modularizationGraph) throws Exception {
		String PCM = PCMsGenerator.getInstance().generatePCM(properties, languages, modularizationGraph, PCMsGenerator.FAMA_FORMAT);
		
		File fileReport = new File(targetProject.getLocation().toString()
				+ "/pcm.csv");
		if (!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter(fileReport);
		outRileReport.print(PCM);
		outRileReport.close();
		
		String inputFile = targetProject.getLocation().toString()
				+ "/pcm.csv";
		String outputFile = targetProject.getLocation().toString()
				+ "/variabilityModel.xml";
		
		FamaSynthesizer.getInstance().synthesizeFeatureModelFromPCM(inputFile, outputFile);
		
		return null;
	}

	@Override
	public FeatureModel inferClosedFeaturesModel(IProject targetProject,
			SynthesisProperties properties, ArrayList<Language> languages,
			EcoreGraph modularizationGraph) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
