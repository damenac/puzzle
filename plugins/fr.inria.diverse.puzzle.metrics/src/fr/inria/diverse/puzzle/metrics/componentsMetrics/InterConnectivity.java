package fr.inria.diverse.puzzle.metrics.componentsMetrics;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreArc;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGroup;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class InterConnectivity implements LanguageProductLineChartMetric {

	/**
	 * Computes the interconnectivity of all the system. 
	 * @param modularizationGraph
	 * @return
	 */
	public Hashtable<String, Hashtable<String, Double>> compute(EcoreGraph modularizationGraph){
		Hashtable<String, Hashtable<String, Double>> data = new Hashtable<String, Hashtable<String, Double>>();
		for (EcoreGroup groupI : modularizationGraph.getGroups()) {
			Hashtable<String, Double> dataI = new Hashtable<String, Double>();
			for (EcoreGroup groupJ : modularizationGraph.getGroups()) {
				Double interConnectivity = this.computeInterConnectivity(groupI, groupJ, modularizationGraph.getArcs());
				dataI.put(groupJ.getName(), interConnectivity);
			}
			data.put(groupI.getName(), dataI);
		}
		return data;
	}

	/**
	 * Computes the interconnectivity of the given pair of groups
	 * @param groupI
	 * @param groupJ
	 * @return
	 */
	private Double computeInterConnectivity(EcoreGroup groupI, EcoreGroup groupJ, ArrayList<EcoreArc> arcs) {
		if(groupI == groupJ)
			return new Double(0);
		
		SumCoupling sumCouplingMetric = new SumCoupling();
		double epsilonIJ = sumCouplingMetric.getCouplingByGroupsPair(groupJ.getVertex(), groupJ.getVertex(), arcs);
		
		double numberOfModulesI = groupI.getVertex().size();
		double numberOfModulesJ = groupJ.getVertex().size();
		double d = 2 * numberOfModulesI * numberOfModulesJ;
		
		return new Double(epsilonIJ / d);
	}
	
	public double computeSum(
			Hashtable<String, Hashtable<String, Double>> interConnectivityData) {
		double sum = 0;
		Hashtable<String, Hashtable<String, Double>> bigData = interConnectivityData;
		Iterator<String> bigIt = bigData.keySet().iterator();
		while (bigIt.hasNext()) {
			String groupIName = (String) bigIt.next();
			
			Hashtable<String, Double> data = bigData.get(groupIName);
			Iterator<String> it = data.keySet().iterator();
			while (it.hasNext()) {
				String groupJName = (String) it.next();
				double metricValue = data.get(groupJName).doubleValue();
				sum += metricValue;
			}
		}
		return sum;
	}
	

	@Override
	public String getVariablesDeclaration(ArrayList<Language> languages,
			ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator,
			EcoreGraph modularizationGraph, DependencyGraph dependencyGraph)
			throws Exception {
		
		String javaScriptData = "google.load('visualization', '1.1', {packages:['table']});\n";
		javaScriptData += "google.setOnLoadCallback(drawTable);\n\n";
		javaScriptData += "function drawTable() {\n";
		javaScriptData += "  var data = new google.visualization.DataTable();\n";
		javaScriptData += "    data.addColumn('string', 'Group Name');\n";
		javaScriptData += "    data.addColumn('string', 'Group Name');\n";
		javaScriptData += "    data.addColumn('number', 'Coupling');\n";
		javaScriptData += "    data.addRows([";

		Hashtable<String, Hashtable<String, Double>> bigData = this.compute(modularizationGraph);
		Iterator<String> bigIt = bigData.keySet().iterator();
		while (bigIt.hasNext()) {
			String groupIName = (String) bigIt.next();
			
			Hashtable<String, Double> data = bigData.get(groupIName);
			Iterator<String> it = data.keySet().iterator();
			while (it.hasNext()) {
				String groupJName = (String) it.next();
				double metricValue = data.get(groupJName).doubleValue();
				javaScriptData += "      ['" + groupIName + "', '" + groupJName + "', " + metricValue + "],\n";
			}
		}
		
		javaScriptData += "  ]);\n\n";
		javaScriptData += "  var table = new google.visualization.Table(document.getElementById('table_div'));";
		javaScriptData += "  table.draw(data, {showRowNumber: false, width: '80%', height: '100%'});\n";
		javaScriptData += "}\n";
		
		return javaScriptData;
	}

	@Override
	public String getWindow(ArrayList<Language> languages) {
		// TODO Auto-generated method stub
		return null;
	}
}
