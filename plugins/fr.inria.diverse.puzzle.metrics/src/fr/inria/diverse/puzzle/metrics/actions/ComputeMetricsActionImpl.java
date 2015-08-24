package fr.inria.diverse.puzzle.metrics.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingMethodComparison;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.DependenciesGraph;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.IndividualizationRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.ProductRelatedReusability;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.PairwiseRelationshipRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SemanticAnalysis;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SemanticOverlapping;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SizeOfCommonality;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SyntactOverlapping;

public class ComputeMetricsActionImpl {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private static ComputeMetricsActionImpl instance;
	
	// -----------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------
	
	private ComputeMetricsActionImpl(){}
	
	public static ComputeMetricsActionImpl getInstance(){
		if(instance == null)
			instance = new ComputeMetricsActionImpl();
		return instance;
	}
	
	// -----------------------------------------------
	// Methods
	// -----------------------------------------------
	
	/**
	 * Computes the metrics defined in Mendez-Acuna et. al and generates the corresponding report in HTML. 
	 * @param selectedResource
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 * @throws URISyntaxException
	 */
	public String computeMetrics(ModelTypingSpace familyTypingSpace, IProject project) throws Exception {
		ConceptComparison conceptComparisonOperator = NamingConceptComparison.class.newInstance();
		MethodComparison methodComparisonOperator = NamingMethodComparison.class.newInstance();
		
		ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
		ArrayList<Language> languages = new ArrayList<Language>();
		
		for (Element element : familyTypingSpace.getElements()) {
			if(element instanceof Language){
				Language language = (Language)element;
				languages.add(language);
				EPackage currentMetamodel = ModelUtils.loadEcoreResource(language.getSyntax().getEcoreUri());
				ePackages.add(currentMetamodel);
			}
		}
		
		String metrics = "Metrics calculated"; 
		
		String generalMetricsString = "";
		generalMetricsString += SizeOfCommonality.getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator);
		generalMetricsString += ProductRelatedReusability.getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator);
		generalMetricsString += IndividualizationRatio.getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator);
		generalMetricsString += PairwiseRelationshipRatio.getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator);

		String generalMetricsWindowsString = "window.onload = function(){\n";
		generalMetricsWindowsString += SizeOfCommonality.getWindow();
		generalMetricsWindowsString += ProductRelatedReusability.getWindow();
		generalMetricsWindowsString += IndividualizationRatio.getWindow();
		generalMetricsWindowsString += PairwiseRelationshipRatio.getWindow(languages);
		generalMetricsWindowsString += "};";
		
		//Copying the java script libraries if they dont exist
		URL libFolderPath = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/libs");
		File libFolder = new File(FileLocator.resolve(libFolderPath).toURI());
        File projectFolder = new File(project.getLocation().toString());
        ProjectManagementServices.copyFolder(libFolder, projectFolder);
		
		File generalMetrics = new File(project.getLocation().toString() + "/lib/metrics.jsonp" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(generalMetricsString + "\n" + generalMetricsWindowsString);
		outMetrics.close();
		
		
		File syntacticVennData = new File(project.getLocation().toString() + "/libVenn/syntacticVennData.jsonp" );
		if(!syntacticVennData.exists())
			syntacticVennData.createNewFile();
		PrintWriter out = new PrintWriter( syntacticVennData );
        out.print(SyntactOverlapping.evaluate(languages, conceptComparisonOperator));
        out.close();
        
        File semanticVennData = new File(project.getLocation().toString() + "/libVenn/semanticVennData.jsonp" );
		if(!semanticVennData.exists())
			semanticVennData.createNewFile();
		PrintWriter outSemanticVennData = new PrintWriter( semanticVennData );
		outSemanticVennData.print(SemanticOverlapping.evaluate(languages, conceptComparisonOperator, methodComparisonOperator));
		outSemanticVennData.close();
		
		this.copyAnalysisReport(project, languages);
		this.copyAnalysisSyntaxData(project, languages, conceptComparisonOperator, methodComparisonOperator);
		this.copyAnalysisSynactic(project, languages);
		this.copyAnalysisSemanticsData(project, languages, conceptComparisonOperator, methodComparisonOperator);
		this.copyAnalysisSemantics(project, languages);
		
		ProjectManagementServices.refreshProject(project);
		return metrics;
	}
	
	public void copyAnalysisReport(IProject project, ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/analysis.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine;
        	currentLine = br.readLine();
        }
        content = content.replace("<!-- Coucou! REPLACE ME WITH THE CORRECT PATTERN -->", PairwiseRelationshipRatio.getTables(languages));
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-Metrics.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	public void copyAnalysisSyntaxData(IProject project, ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		File generalMetrics = new File(project.getLocation().toString() + "/lib/graph.js" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(DependenciesGraph.getVariablesDeclaration(languages, conceptComparisonOperator));
		outMetrics.close();
	}
	
	public void copyAnalysisSynactic(IProject project, ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/syntacticAnalysis.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-SyntacticAnalysis.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	public void copyAnalysisSemanticsData(IProject project, ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws IOException{
		File generalMetrics = new File(project.getLocation().toString() + "/lib/semanticAnalysis.js" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(SemanticAnalysis.getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator));
		outMetrics.close();
	}
	
	public void copyAnalysisSemantics(IProject project, ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/semanticAnalysis.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-SemanticAnalysis.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
}