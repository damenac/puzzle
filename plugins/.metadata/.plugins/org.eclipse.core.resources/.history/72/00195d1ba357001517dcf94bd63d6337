package fr.inria.diverse.puzzle.metrics.managers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.metrics.componentsMetrics.CouplingMetricsTable;

/**
 * Manager for metrics analyzing language product lines
 * @author David Mendez-Acuna
 *
 */
public class ProductLinesMetricManager extends MetricsManager {

	// ------------------------------------------------------
	// Constructor
	// ------------------------------------------------------
	
	public ProductLinesMetricManager(IProject project) throws Exception{
		super(project);
	}

	// ------------------------------------------------------
	// Methods
	// ------------------------------------------------------
	
	/**
	 * Creates a report with the metrics for coupling of the product line. 
	 * @param languages
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public void createProductLineCouplingReport(ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-1-Coupling.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-1-Coupling.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	/**
	 * Creates the data of the report with the metrics for coupling of a language product line. 
	 * @param languages
	 * @param conceptComparisonOperator
	 * @param methodComparisonOperator
	 * @param graphPartition
	 * @throws Exception
	 */
	public void createProductLineCouplingReportData(ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator, 
			EcoreGraph modularizationGraph) throws Exception{
        File fileReport = new File(project.getLocation().toString() + "/lib/coupling.js" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print((new CouplingMetricsTable()).getVariablesDeclaration(languages, 
				conceptComparisonOperator, methodComparisonOperator, modularizationGraph, null));
		outRileReport.close();
	}
	
	public void createDependenciesGraphReport(){
		
	}
}
