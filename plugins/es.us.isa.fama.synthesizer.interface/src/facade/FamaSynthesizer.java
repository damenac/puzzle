package facade;

import fm.experiments.utils.FMExtractorFacade;

/**
 * Facade to the FAMA variability synthesizer. 
 * 
 * @author Jose A. Galindo
 * @author David Mendez-Acuna
 *
 */
public class FamaSynthesizer {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	
	private static FamaSynthesizer instance;
	
	// --------------------------------------------------
	// Constructor and singleton
	// --------------------------------------------------
	
	private FamaSynthesizer(){}
	
	public static FamaSynthesizer getInstance(){
		if(instance == null)
			instance = new FamaSynthesizer();
		return instance;
	}
	
	// --------------------------------------------------
	// Methods
	// --------------------------------------------------
	
	/**
	 * Synthesizes a feature model from a PCM. 
	 * @param inputFile The location of the file containing the PCM in a comma separated file
	 * @param outputFile The location of the file in which the feature model should be saved. 
	 */
	public void synthesizeFeatureModelFromPCM(String inputFile, String outputFile){
		FMExtractorFacade.generateFM(inputFile, outputFile);
	}
}
