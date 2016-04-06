package fr.inria.diverse.puzzle.vmsynthesis.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import vm.LanguageFeatureModel;
import vm.LanguageProductLine;
import fr.inria.diverse.generator.pcm.InstanceVO;
import fr.inria.diverse.generator.pcm.PCMGenerator;
import fr.inria.diverse.generator.pcm.PCMQueryServices;
import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;
import fr.inria.diverse.puzzle.vmsynthesis.impl.VmSynthesis;

/**
 * Test scenario based on the comparison benchmark proposed for the paper in [1]
 * 
 * [1] David Mendez-Acuna, Jose A. Galindo, et al. Reverse Engineering Feature Models
 * from Families of Software Products. Envisioned target: ICSR 2016.  
 * 
 * @author David Mendez-Acuna
 *
 */
public class RandomTestFromInstancesFiles {

	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	private VmSynthesis synthesis;
	
	// -------------------------------------------------
	// Loading scenarios
	// -------------------------------------------------
	
	@Before
	public void loadScenarios() throws Exception{
		synthesis = VmSynthesis.getInstance();
	}
	
	// -------------------------------------------------
	// Test Cases
	// -------------------------------------------------
	
	public boolean executeTest(InstanceVO instance, StringBuffer buffer) throws Exception {
		Graph<Vertex, Arc> graph = instance.getDependenciesGraph();
		LanguageProductLine openFM = VmSynthesis.getInstance().synthesizeOpenFeatureModel(graph);
		System.out.println("openFM");
		TestServices.printFM(openFM.getFunctionalVariability());
		
		int originalNumProducts = instance.getOpenPCM().split("\n").length - 1;
		int numProducts = instance.getClosedPCM().split("\n").length - 1;
		
		LanguageFeatureModel closedFM = synthesis.cloneFeatureModel(openFM.getFunctionalVariability());
		PCMQueryServices.getInstance().loadPCM(instance.getClosedPCM());
		long before = System.currentTimeMillis();

		System.out.println("closedFM");
		TestServices.printFM(closedFM);
		
		synthesis.identifyMandatoryFeatures(closedFM);
		System.out.println("identifyMandatoryFeatures");
		TestServices.printFM(closedFM);
		
		synthesis.identifyXORs(closedFM);
		System.out.println("identifyXORs");
		TestServices.printFM(closedFM);
		
		synthesis.identifyORs(closedFM);
		System.out.println("identifyORs");
		TestServices.printFM(closedFM);
		
		synthesis.addAdditionalImpliesConstraints(closedFM);
		System.out.println("addAdditionalImpliesConstraints");
		TestServices.printFM(closedFM);
		
		synthesis.addAdditionalExcludesConstraints(closedFM);
		System.out.println("addAdditionalExcludesConstraints");
		TestServices.printFM(closedFM);
		
//		synthesis.groupImplicationsByLeftSide(closedFM);
		
		TestServices.printFM(closedFM);
		double result = TestServices.printAllValidProducts(closedFM, instance.getClosedPCM());
		
		long after = System.currentTimeMillis();
		long time = after - before;

		String resultMessage = "";
		String successFail = "";
		
		if(result != numProducts){
			successFail = "FAIL:    ";
		}else{
			successFail = "SUCCESS: ";
		}
		
		resultMessage += successFail + "No. Features: " + instance.getFeaturesAmount() + 
				"; No. Products: (original:  " + originalNumProducts + ", updated: " + numProducts + " ); Result: " + result + "; Execution Time: " + time + "\n";
		
		buffer.append(resultMessage);
		
		if(result != numProducts){
			return false;
		}else{
			return true;
		}
	}
	
	@Test
	public void testExecuteTestPool() throws Exception{
		StringBuffer results = new StringBuffer();
		
		int executions = 0;
		int success = 0;
		int fails = 0;
		String folder = "testdata";
		
		PCMGenerator generator = new PCMGenerator();
		List<InstanceVO> instancesList = generator.generateAllPCMs(folder);
		int instances = instancesList.size();
		instancesList = new ArrayList<InstanceVO>();
		
		int index = 1;
		while (index <= instances) {
			File graphFile = new File(folder + "/" + index + "_1_" + "dependencies_graph.txt");
			File openPCMFile = new File(folder + "/" + index + "_2_" + "open_pcm.txt");
			File closedPCMFile = new File(folder + "/" + index + "_3_" + "closed_pcm.txt");
			InstanceVO instance = createInstanceByFiles(graphFile, openPCMFile, closedPCMFile);
			instancesList.add(instance);
			index++;
		}
		
		for (InstanceVO instanceVO : instancesList) {
			boolean result = this.executeTest(instanceVO, results);
			executions++;
			
			if(result){
				success ++;
			}else{
				fails ++;
			}
		}
		double successPercentage = ( success * 100 ) / executions;
		double failsPercentage = ( fails * 100 ) / executions;
		
		System.out.println(results);
		System.out.println("\n\n *** Global results: No. Executions: " + executions + 
				" Success: " + success + " (" +successPercentage + "%); Fails: "  + fails + " (" + failsPercentage + "%).\n\n");
	}

	private InstanceVO createInstanceByFiles(File graphFile, File openPCMFile,
			File closedPCMFile) throws IOException {
		
		String adjacencyMatrix = "";
		BufferedReader br = new BufferedReader(new FileReader(graphFile));
		
		int featuresAmount = 0;
		long graphSeed = 0;
		
		String graphLine = br.readLine();
		while(graphLine != null){
			adjacencyMatrix += graphLine + "\n";
			
			if(graphLine.startsWith("#")){
				graphSeed = Long.parseLong(graphLine.replace("#graphSeed:", ""));
			}
			
			featuresAmount++;
			graphLine = br.readLine();
		}
		
		br.close();
		
		br = new BufferedReader(new FileReader(openPCMFile));
		String openPCM = "";
		long PCMSeed = 0;
		
		int productsAmount = 0;
		String openPCMLine = br.readLine();
		while(openPCMLine != null){
			openPCM += openPCMLine + "\n";
			
			if(openPCMLine.startsWith("#")){
				PCMSeed = Long.parseLong(openPCMLine.replace("#PCMSeed:", ""));
			}
			
			productsAmount++;
			openPCMLine = br.readLine();
		}
		
		br.close();
		
		String closedPCM = this.readFileContent(closedPCMFile);
		
		Graph<Vertex, Arc> dependenciesGraph = new Graph<Vertex, Arc>(adjacencyMatrix); 
		InstanceVO instance = new InstanceVO(dependenciesGraph, openPCM, closedPCM, 
				featuresAmount - 1, productsAmount - 1, graphSeed, PCMSeed);
		
		return instance;
	}
	
	private String readFileContent(File file) throws IOException{
		String content = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = br.readLine();
		while(line != null){
			content += line + "\n";
			line = br.readLine();
		}
		
		br.close();
		return content;
	}
}