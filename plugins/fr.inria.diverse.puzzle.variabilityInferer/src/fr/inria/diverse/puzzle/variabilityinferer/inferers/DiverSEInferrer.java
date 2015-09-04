package fr.inria.diverse.puzzle.variabilityinferer.inferers;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.k3.sle.common.utils.EcoreQueries;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class DiverSEInferrer implements VariabilityInferer {

	@Override
	public String inferVariabilityModel(SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph) {
		return this.generatePCMInCVSFormat(properties, languages, modularizationGraph);
	}
	
	private String generatePCMInCVSFormat(SynthesisProperties properties, ArrayList<Language> languages, EcoreGraph modularizationGraph){
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
				pcm += "\"" + this.moduleContainedInLanguage(properties.getConceptComparisonOperator(), language, module) + "\"";
				first = false;
			}
			pcm += "\n";
		}
		return pcm;
	}
	
	private String moduleContainedInLanguage(ConceptComparison conceptComparison, Language language, ArrayList<EcoreVertex> module){
		EPackage ePackage = MelangeServices.getEPackageFromLanguage(language);
		for (EcoreVertex ecoreVertex : module) {
			EClassifier eClassifier = ecoreVertex.getClassifier();
			if(EcoreQueries.searchEClassifierByComparisonOperator(ePackage, eClassifier, conceptComparison) == null){
				return "NO";
			}
		}
		return "YES";
	}
}
