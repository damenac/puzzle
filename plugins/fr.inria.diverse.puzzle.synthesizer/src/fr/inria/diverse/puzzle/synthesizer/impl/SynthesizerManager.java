package fr.inria.diverse.puzzle.synthesizer.impl;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.breaker.popup.actions.SynthesisManager;
import fr.inria.diverse.puzzle.variabilityinferer.VariabilityInfererManager;

public class SynthesizerManager {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static SynthesizerManager instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private SynthesizerManager(){
		
	}
	
	public static SynthesizerManager getInstance(){
		if(instance == null)
			instance = new SynthesizerManager();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	public void synthesizeLanguageProductLine(SynthesisProperties properties, ArrayList<Language> languages, IProject project) throws Exception{
		
		// Step 1. Break-down the family
		EcoreGraph modularizationGraph = SynthesisManager.getInstance().breakDownFamily(languages, properties, project);
		
		// Step 2: Synthesize variability model
		VariabilityInfererManager.getInstance().synthesizeVariabilityModel(properties, languages, modularizationGraph, project);
	}
}