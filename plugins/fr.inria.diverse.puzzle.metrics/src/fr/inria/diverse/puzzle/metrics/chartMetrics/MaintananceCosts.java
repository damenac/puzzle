package fr.inria.diverse.puzzle.metrics.chartMetrics;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Chart metric for the family's maintenance costs versus product line maintenance costs.
 * @author David Mendez-Acuna
 */
public class MaintananceCosts implements ChartMetric {

	// ---------------------------------------------------
	// Methods
	// ---------------------------------------------------
	
	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages,
			ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator) throws Exception {
		String javaScriptData = "var barsDataSyntaxMaintainanceCosts = {\n";
		javaScriptData += "    labels: [\"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\"],\n";
		javaScriptData += "    datasets: [\n";
		javaScriptData += "        {\n";
		javaScriptData += "            label: \"My First dataset\",\n";
		javaScriptData += "            fillColor: \"rgba(220,220,220,0.2)\",\n";
		javaScriptData += "            strokeColor: \"rgba(220,220,220,1)\",\n";
		javaScriptData += "            pointColor: \"rgba(220,220,220,1)\",\n";
		javaScriptData += "            pointStrokeColor: \"#fff\",\n";
		javaScriptData += "            pointHighlightFill: \"#fff\",\n";
		javaScriptData += "            pointHighlightStroke: \"rgba(220,220,220,1)\",\n";
		javaScriptData += "            data: [65, 59, 80, 81, 56, 55, 40]\n";
		javaScriptData += "        },\n";
		javaScriptData += "        {\n";
		javaScriptData += "            label: \"My Second dataset\",\n";
		javaScriptData += "            fillColor: \"rgba(151,187,205,0.2)\",\n";
		javaScriptData += "            strokeColor: \"rgba(151,187,205,1)\",\n";
		javaScriptData += "            pointColor: \"rgba(151,187,205,1)\",\n";
		javaScriptData += "            pointStrokeColor: \"#fff\",\n";
		javaScriptData += "            pointHighlightFill: \"#fff\",\n";
		javaScriptData += "            pointHighlightStroke: \"rgba(151,187,205,1)\",\n";
		javaScriptData += "            data: [28, 48, 40, 19, 86, 27, 90]\n";
		javaScriptData += "        }\n";
		javaScriptData += "    ]\n";
		javaScriptData += "};\n\n";
		
		javaScriptData += "var barsDataSemanticMaintainanceCosts = {\n";
		javaScriptData += "    labels: [\"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\"],\n";
		javaScriptData += "    datasets: [\n";
		javaScriptData += "        {\n";
		javaScriptData += "            label: \"My First dataset\",\n";
		javaScriptData += "            fillColor: \"rgba(220,220,220,0.2)\",\n";
		javaScriptData += "            strokeColor: \"rgba(220,220,220,1)\",\n";
		javaScriptData += "            pointColor: \"rgba(220,220,220,1)\",\n";
		javaScriptData += "            pointStrokeColor: \"#fff\",\n";
		javaScriptData += "            pointHighlightFill: \"#fff\",\n";
		javaScriptData += "            pointHighlightStroke: \"rgba(220,220,220,1)\",\n";
		javaScriptData += "            data: [65, 59, 80, 81, 56, 55, 40]\n";
		javaScriptData += "        },\n";
		javaScriptData += "        {\n";
		javaScriptData += "            label: \"My Second dataset\",\n";
		javaScriptData += "            fillColor: \"rgba(151,187,205,0.2)\",\n";
		javaScriptData += "            strokeColor: \"rgba(151,187,205,1)\",\n";
		javaScriptData += "            pointColor: \"rgba(151,187,205,1)\",\n";
		javaScriptData += "            pointStrokeColor: \"#fff\",\n";
		javaScriptData += "            pointHighlightFill: \"#fff\",\n";
		javaScriptData += "            pointHighlightStroke: \"rgba(151,187,205,1)\",\n";
		javaScriptData += "            data: [28, 48, 40, 19, 86, 27, 90]\n";
		javaScriptData += "        }\n";
		javaScriptData += "    ]\n";
		javaScriptData += "};\n\n";
		return javaScriptData;
	}
	
	@Override
	public String getWindow(ArrayList<Language> languages) {
		String javaScriptWindow = "    var ctxLineChartSyntaxMaintaince = document.getElementById(\"chart-maintainance-costs-syntax\").getContext(\"2d\");\n";
		javaScriptWindow += "    window.myLineChartSyntaxMaintaince = new Chart(ctxLineChartSyntaxMaintaince).Line(barsDataSyntaxMaintainanceCosts,{\n";
		javaScriptWindow += "       datasetFill : false\n";
		javaScriptWindow += "    });\n\n";
		
		javaScriptWindow += "    var ctxLineChartSemanticsMaintaince = document.getElementById(\"chart-maintainance-costs-semantics\").getContext(\"2d\");\n";
		javaScriptWindow += "    window.myLineChartSemanticsMaintaince = new Chart(ctxLineChartSemanticsMaintaince).Line(barsDataSemanticMaintainanceCosts,{\n";
		javaScriptWindow += "       datasetFill : false\n";
		javaScriptWindow += "    });\n\n";
		return javaScriptWindow;
	}
	
	// ---------------------------------------------------
	// Auxiliar services
	// ---------------------------------------------------
}