package fr.inria.diverse.puzzle.variabilityinferer;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class VariabilityInfererManager {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------

	private static VariabilityInfererManager instance;

	// --------------------------------------------------
	// Constructor and singleton
	// --------------------------------------------------

	private VariabilityInfererManager() {

	}

	public static VariabilityInfererManager getInstance() {
		if (instance == null) {
			instance = new VariabilityInfererManager();
		}
		return instance;
	}

	// --------------------------------------------------
	// Methods
	// --------------------------------------------------

	public void synthesizeVariabilityModel(
			SynthesisProperties synthesisProperties,
			ArrayList<Language> languages, EcoreGraph modularizationGraph,
			IProject project) throws Exception {
		VariabilityInferer inferrer = synthesisProperties
				.getVariabilityInferer();
		
		inferrer.inferVariabilityModel(project, 
				synthesisProperties, languages, modularizationGraph);

		ProjectManagementServices.refreshProject(project);
		// TODO serialize the model
	}
}