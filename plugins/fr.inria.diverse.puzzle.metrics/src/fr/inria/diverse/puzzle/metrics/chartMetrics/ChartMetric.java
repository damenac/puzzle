package fr.inria.diverse.puzzle.metrics.chartMetrics;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.melange.metamodel.melange.Language;

public interface ChartMetric {

	/**
	 * Returns the String with the java-script code that specifies the data that will
	 * be used to draw the metric chart in the report.
	 * 
	 * @param languages. The set of languages of the family.
	 * @param conceptComparisonOperator. The comparison operator for the abstract syntax.
	 * @param methodComparisonOperator. The comparison operator for the semantics. 
	 * @return javaScriptData
	 * @throws Exception
	 */
	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator, GraphPartition graphPartition) throws Exception;
	
	/**
	 * Returns the String with the java-script code that specifies the chart window
	 * that will display the metric in the report.
	 * 
	 * @return javaScriptWindow
	 */
	public String getWindow(ArrayList<Language> languages);
}
