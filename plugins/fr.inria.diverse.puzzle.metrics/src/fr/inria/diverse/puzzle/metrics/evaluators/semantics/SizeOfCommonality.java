package fr.inria.diverse.puzzle.metrics.evaluators.semantics;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

public class SizeOfCommonality {

	public static int evaluateMetric(ArrayList<EPackage> ePackages){
		// TODO
		return 0;
	}
	
	public static String printMetricsResults(ArrayList<EPackage> ePackages){
		String answer = "";
		answer += "var pieDataSemanticCommonality = [{\n";
		answer += "        value: " + 10 + ",\n"; // TODO DO something!
		answer += "        color:\"#FAAC58\",\n";
		answer += "        highlight: \"#F7BE81\",\n";
		answer += "        label: \"Commonalities\"\n";
		answer += "    },\n";
		answer += "    {\n";
		answer += "        value: " + 100 + ",\n"; // TODO DO something!
		answer += "        color:\"#F5F6CE\",\n";
		answer += "        highlight: \"#FBFBEF\",\n";
		answer += "        label: \"Particularities\"\n";
		answer += "    }\n";
		answer += "];\n\n";
		return answer;
	}
}
