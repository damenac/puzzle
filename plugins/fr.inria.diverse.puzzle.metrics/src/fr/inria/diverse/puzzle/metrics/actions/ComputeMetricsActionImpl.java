package fr.inria.diverse.puzzle.metrics.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingMethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureAndSourceMethodComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureMethodComparison;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.puzzle.metrics.chartMetrics.ChartMetric;
import fr.inria.diverse.puzzle.metrics.chartMetrics.IndividualizationRatio;
import fr.inria.diverse.puzzle.metrics.chartMetrics.MaintananceCosts;
import fr.inria.diverse.puzzle.metrics.chartMetrics.PairwiseRelationshipRatio;
import fr.inria.diverse.puzzle.metrics.chartMetrics.ProductRelatedReusability;
import fr.inria.diverse.puzzle.metrics.chartMetrics.SizeOfCommonality;
import fr.inria.diverse.puzzle.metrics.specialCharts.DependenciesGraph;
import fr.inria.diverse.puzzle.metrics.specialCharts.FamilyMembershipGraph;
import fr.inria.diverse.puzzle.metrics.specialCharts.SemanticalVariabilityTree;
import fr.inria.diverse.puzzle.metrics.specialCharts.SemanticalVennDiagram;
import fr.inria.diverse.puzzle.metrics.specialCharts.SyntacticVennDiagram;
import fr.inria.diverse.puzzle.metrics.specialCharts.TarjansAlgorithmGraph;

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
//		ConceptComparison conceptComparisonOperator = NamingConceptComparison.class.newInstance();
		ConceptComparison conceptComparisonOperator = DeepConceptComparison.class.newInstance();
//		MethodComparison methodComparisonOperator = NamingMethodComparison.class.newInstance();
//		MethodComparison methodComparisonOperator = SignatureMethodComparison.class.newInstance();
		MethodComparison methodComparisonOperator = SignatureAndSourceMethodComparison.getInstance();
		
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
		
		List<ChartMetric> chartMetrics = new ArrayList<ChartMetric>();
		chartMetrics.add(new SizeOfCommonality());
		chartMetrics.add(new ProductRelatedReusability());
		chartMetrics.add(new IndividualizationRatio());
		chartMetrics.add(new PairwiseRelationshipRatio());
		
		String generalMetricsString = "";
		for (ChartMetric chartMetric : chartMetrics) {
			generalMetricsString += chartMetric.getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator);
		}

		String generalMetricsWindowsString = "window.onload = function(){\n";
		for (ChartMetric chartMetric : chartMetrics) {
			generalMetricsWindowsString += chartMetric.getWindow(languages);
		}
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
        out.print(SyntacticVennDiagram.evaluate(languages, conceptComparisonOperator));
        out.close();
        
        File semanticVennData = new File(project.getLocation().toString() + "/libVenn/semanticVennData.jsonp" );
		if(!semanticVennData.exists())
			semanticVennData.createNewFile();
		PrintWriter outSemanticVennData = new PrintWriter( semanticVennData );
		outSemanticVennData.print(SemanticalVennDiagram.evaluate(languages, conceptComparisonOperator, methodComparisonOperator));
		outSemanticVennData.close();
		
		this.createReport1FamilysShape(project, languages);
		this.createReport2CostSaving(project, languages);
		this.createReport2CostSavingData(project, languages, conceptComparisonOperator, methodComparisonOperator);
		this.createReport3ReuseMetrics(project, languages);
		this.createDependenciesGraphData(project, languages, conceptComparisonOperator, methodComparisonOperator);
		this.createDependenciesGraph(project, languages);
		this.createFamilyMembershipGraphData(project, languages, conceptComparisonOperator, methodComparisonOperator);
		this.createFamilyMembershipGraph(project, languages);
		this.createTarjansGraphData(project, languages, conceptComparisonOperator, methodComparisonOperator);
		this.createTarjansGraph(project, languages);
		this.copyAnalysisSemanticsData(project, languages, conceptComparisonOperator, methodComparisonOperator);
		this.copyAnalysisSemantics(project, languages);
		
		ProjectManagementServices.refreshProject(project);
		System.out.println("SignatureAndSourceMethodComparison.getInstance().getAmountComputations(): " + SignatureAndSourceMethodComparison.getInstance().getAmountComputations());
		return metrics;
	}
	
	public void createReport1FamilysShape(IProject project, ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-1-FamilysShape.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-1-FamilysShape.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	public void createReport2CostSaving(IProject project, ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-2-CostSavingsMetrics.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-2-CostSavingsMetrics.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	public void createReport2CostSavingData(IProject project, ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
        File fileReport = new File(project.getLocation().toString() + "/lib/costSavingMetrics.js" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print((new MaintananceCosts()).getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator));
		outRileReport.close();
	}
	
	public void createReport3ReuseMetrics(IProject project, ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-3-ReuseMetrics.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        content = content.replace("<!-- Coucou! REPLACE ME WITH THE CORRECT PATTERN -->", (new PairwiseRelationshipRatio()).getTables(languages));
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-3-ReuseMetrics.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	/**
	 * Creates the file the the instructions to draw the graph that shows the graph grouping using the family membership criterion.
	 * @param targetProject. The project where the file should be created.
	 * @param languages. The set of languages belonging to the family under study.
	 * @throws Exception
	 */
	public void createDependenciesGraph(IProject project, ArrayList<Language> languages) throws Exception{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-4a-DependenciesGraph.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-4a-DependenciesGraph.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	/**
	 * Creates the file with the data input of the graph that shows the graph grouping using the family membership criterion.
	 * @param targetProject. The project where the file should be created.
	 * @param languages. The set of languages belonging to the family under study.
	 * @param conceptComparisonOperator
	 * @param methodComparisonOperator
	 * @throws Exception
	 */
	public void createDependenciesGraphData(IProject project, ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		File generalMetrics = new File(project.getLocation().toString() + "/lib/dependenciesGraph.js" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(DependenciesGraph.getVariablesDeclaration(languages, conceptComparisonOperator));
		outMetrics.close();
	}
	
	
	/**
	 * Creates the file the the instructions to draw the graph that shows the graph grouping using the family membership criterion.
	 * @param targetProject. The project where the file should be created.
	 * @param languages. The set of languages belonging to the family under study.
	 * @throws Exception
	 */
	public void createFamilyMembershipGraph(IProject project, ArrayList<Language> languages) throws Exception{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-4b-FamilyMembershipGraph.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-4b-FamilyMembershipGraph.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	/**
	 * Creates the file with the data input of the graph that shows the graph grouping using the family membership criterion.
	 * @param targetProject. The project where the file should be created.
	 * @param languages. The set of languages belonging to the family under study.
	 * @param conceptComparisonOperator
	 * @param methodComparisonOperator
	 * @throws Exception
	 */
	public void createFamilyMembershipGraphData(IProject project, ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		File generalMetrics = new File(project.getLocation().toString() + "/lib/graph.js" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(FamilyMembershipGraph.getVariablesDeclaration(languages, conceptComparisonOperator));
		outMetrics.close();
	}
	
	/**
	 * Creates the file the the instructions to draw the graph that shows the graph grouping using the family membership criterion.
	 * @param targetProject. The project where the file should be created.
	 * @param languages. The set of languages belonging to the family under study.
	 * @throws Exception
	 */
	public void createTarjansGraph(IProject project, ArrayList<Language> languages) throws Exception{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-4c-TarjansGraph.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-4c-TarjansGraph.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
	
	/**
	 * Creates the file with the data input of the graph that shows the graph grouping using the family membership criterion.
	 * @param targetProject. The project where the file should be created.
	 * @param languages. The set of languages belonging to the family under study.
	 * @param conceptComparisonOperator
	 * @param methodComparisonOperator
	 * @throws Exception
	 */
	public void createTarjansGraphData(IProject project, ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws Exception{
		File generalMetrics = new File(project.getLocation().toString() + "/lib/tarjansGraph.js" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(TarjansAlgorithmGraph.getVariablesDeclaration(languages, conceptComparisonOperator));
		outMetrics.close();
	}
	
	
	
	
	
	public void copyAnalysisSemanticsData(IProject project, ArrayList<Language> languages, 
			ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator) throws IOException{
		File generalMetrics = new File(project.getLocation().toString() + "/lib/semanticAnalysis.js" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(SemanticalVariabilityTree.getVariablesDeclaration(languages, conceptComparisonOperator, methodComparisonOperator));
		outMetrics.close();
	}
	
	public void copyAnalysisSemantics(IProject project, ArrayList<Language> languages) throws URISyntaxException, IOException{
		URL path = Platform.getBundle("fr.inria.diverse.puzzle.metrics").getEntry("/data/Report-5-SemanticVariability.html");
        File file = new File(FileLocator.resolve(path).toURI());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = "";
        String currentLine = br.readLine();
        while(currentLine != null){
        	content += currentLine + "\n";
        	currentLine = br.readLine();
        }
        br.close();
        
        File fileReport = new File(project.getLocation().toString() + "/Report-5-SemanticVariability.html" );
		if(!fileReport.exists())
			fileReport.createNewFile();
		PrintWriter outRileReport = new PrintWriter( fileReport );
		outRileReport.print(content);
		outRileReport.close();
	}
}
