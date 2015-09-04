package fr.inria.diverse.puzzle.synthesizer.impl;

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
	
	public void synthesizeLanguageProductLine(){
		
	}
}
