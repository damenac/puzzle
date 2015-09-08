package fr.inria.diverse.puzzle.variabilityinferer.auxiliar;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.k3.sle.common.utils.EcoreQueries;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Generates PCMs in diverse formats for the variability model inferrers. 
 * @author David Mendez-Acuna
 */
public class PCMsGenerator {

	// --------------------------------------------------------
	// Constants
	// --------------------------------------------------------
	
	public static int OPEN_COMPARE_FORMAT = 1;
	
	public static int FAMA_FORMAT = 2;
	
	// --------------------------------------------------------
	// Methods
	// --------------------------------------------------------
	
	/**
	 * Generates a PCM for the modularization graph in the parameter and according to the desired format. 
	 * @param properties Synthesis properties needed for the computation of the PCM. 
	 * @param modularizationGraph Modularization graph containing the language constructs.
	 * @param format Format in which the PCM should be described. 
	 * @throws Exception Throws an exception if the desired format is not supported. 
	 */
	public static String generatePCM(SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph, int format) throws Exception{
		if(format == OPEN_COMPARE_FORMAT)
			return generatePCMOpenCompareFormat(properties, languages, modularizationGraph);
		else if(format == FAMA_FORMAT)
			return generatePCMFamaFormat(properties, languages, modularizationGraph);
		else
			throw new Exception("PCM format not supported");
	}
	
	/**
	 * Generates a PCM in the format accepted by open compare. 
	 * @param properties Synthesis properties needed for the computation of the PCM. 
	 * @param modularizationGraph Modularization graph containing the language constructs. 
	 * @return
	 */
	private static String generatePCMOpenCompareFormat(SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph){
		String pcm = "\"Product\"";
		for (int i = 0; i < modularizationGraph.getGroups().size(); i++) {
			ArrayList<EcoreVertex> module = modularizationGraph.getGroups().get(i);
			String moduleName = MelangeServices.getLanguageModuleName(module);
			// get name by module. 
			pcm += ",\"" + moduleName + "\"";
		}
		pcm += "\n";
		
		for (int i = 0; i < languages.size(); i++) {
			Language language = languages.get(i);
			pcm += "\"" + language.getName() + "\",";
			boolean first = true;
			for (int j = 0; j < modularizationGraph.getGroups().size(); j++) {
				if(!first) pcm += ",";
				ArrayList<EcoreVertex> module = modularizationGraph.getGroups().get(j);
				boolean contained = moduleContainedInLanguage(properties.getConceptComparisonOperator(), language, module);
				if(contained)
					pcm += "\"YES\"";
				else
					pcm += "\"NO\"";
				first = false;
			}
			pcm += "\n";
		}
		return pcm;
	}
	
	/**
	 * Generates a PCM in the format accepted by FAMA. 
	 * @param properties Synthesis properties needed for the computation of the PCM. 
	 * @param modularizationGraph Modularization graph containing the language constructs. 
	 * @return
	 */
	private static String generatePCMFamaFormat(SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph){
		String pcm = "";
		for (int i = 0; i < languages.size(); i++) {
			Language language = languages.get(i);
			for (int j = 0; j < modularizationGraph.getGroups().size(); j++) {
				ArrayList<EcoreVertex> module = modularizationGraph.getGroups().get(j);
				boolean contained = moduleContainedInLanguage(properties.getConceptComparisonOperator(), language, module);
				if(contained){
					pcm += MelangeServices.getLanguageModuleName(module) + ";";
				}
			}
			pcm += "\n";
		}
		return pcm;
	}
	
	// --------------------------------------------------------
	// Auxiliary Methods
	// --------------------------------------------------------
	
	/**
	 * Indicates if a module is contained in a given language.
	 * @param conceptComparison. Concept comparison operator. 
	 * @param language. Language under study.
	 * @param module. Module under study.
	 * @return
	 * 
	 * TODO: Move this method to MelangeServices?
	 */
	private static boolean moduleContainedInLanguage(ConceptComparison conceptComparison, Language language, ArrayList<EcoreVertex> module){
		EPackage ePackage = MelangeServices.getEPackageFromLanguage(language);
		for (EcoreVertex ecoreVertex : module) {
			EClassifier eClassifier = ecoreVertex.getClassifier();
			if(EcoreQueries.searchEClassifierByComparisonOperator(ePackage, eClassifier, conceptComparison) == null){
				return false;
			}
		}
		return true;
	}
}
