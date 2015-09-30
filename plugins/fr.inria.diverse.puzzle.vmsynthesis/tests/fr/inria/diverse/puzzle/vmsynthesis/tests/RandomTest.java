package fr.inria.diverse.puzzle.vmsynthesis.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import vm.PFeatureModel;
import fr.inria.diverse.generator.pcm.InstanceVO;
import fr.inria.diverse.generator.pcm.PCMGenerator;
import fr.inria.diverse.generator.pcm.PCMQueryServices;
import fr.inria.diverse.graph.Arc;
import fr.inria.diverse.graph.Graph;
import fr.inria.diverse.graph.Vertex;
import fr.inria.diverse.puzzle.vmsynthesis.impl.VmSynthesis;

public class RandomTest {

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
		PFeatureModel openFM = VmSynthesis.getInstance().synthesizeOpenFeatureModel(graph);
		System.out.println("openFM");
		TestServices.printFM(openFM);
		
		int originalNumProducts = instance.getOpenPCM().split("\n").length - 1;
		int numProducts = instance.getClosedPCM().split("\n").length - 1;
		
		System.out.println("Cloned OpenFM");
		PFeatureModel closedFM = synthesis.cloneFeatureModel(openFM);
		PCMQueryServices.getInstance().loadPCM(instance.getClosedPCM());
//		System.out.println(instance.getClosedPCM());
//		TestServices.printAllValidProducts(closedFM, instance.getClosedPCM());
		
		System.out.println("IdentifyMandatoryFeatures OpenFM");
		long before = System.currentTimeMillis();
		synthesis.identifyMandatoryFeatures(closedFM);
//		TestServices.printFM(closedFM);
//		TestServices.printAllValidProducts(closedFM, instance.getClosedPCM());
		
		System.out.println("IdentifyXORs OpenFM");
		synthesis.identifyXORs(closedFM);
//		TestServices.printFM(closedFM);
//		TestServices.printAllValidProducts(closedFM, instance.getClosedPCM());
		
		System.out.println("IdentifyORs OpenFM");
		synthesis.identifyORs(closedFM);
//		TestServices.printFM(closedFM);
//		TestServices.printAllValidProducts(closedFM, instance.getClosedPCM());
		
		System.out.println("AddAdditionalImpliesConstraints OpenFM");
		synthesis.addAdditionalImpliesConstraints(closedFM);
//		TestServices.printFM(closedFM);
//		TestServices.printAllValidProducts(closedFM, instance.getClosedPCM());
		
		System.out.println("AddAdditionalExcludesConstraints OpenFM");
		synthesis.addAdditionalExcludesConstraints(closedFM);
//		TestServices.printFM(closedFM);
//		TestServices.printAllValidProducts(closedFM, instance.getClosedPCM());
		
		System.out.println("GroupingImplicationsByLeftSide OpenFM");
		synthesis.groupImplicationsByLeftSide(closedFM);
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
	public void testRandom() throws Exception{
		StringBuffer results = new StringBuffer();
		
		int executions = 0;
		int success = 0;
		int fails = 0;
		
		PCMGenerator generator = new PCMGenerator();
		List<InstanceVO> instances = generator.generateAllPCMs("testdata");
		
		for (InstanceVO instanceVO : instances) {
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
}