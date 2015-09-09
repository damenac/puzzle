package fama.synthesizer.facade;

import es.us.isa.FAMA.models.FAMAfeatureModel.FAMAFeatureModel;
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
	public FAMAFeatureModel synthesizeFeatureModelFromPCM(String inputFile, String outputFile){
		FAMAFeatureModel ffm = FMExtractorFacade.generateFM(inputFile);
		return ffm;
	}
	
	public static void main(String args[]){
		FMExtractorFacade.generateFM("./data/pcm2.csv", "vm.xml");
	}
}
