package fr.inria.diverse.puzzle.vmsynthesis.tests;

import org.junit.Before;
import org.junit.Test;

import vm.PFeatureModel;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.k3.sle.common.utils.PCMQueryServices;
import fr.inria.diverse.puzzle.instancesgenerator.impl.GraphGenerator;
import fr.inria.diverse.puzzle.instancesgenerator.impl.PCMFillerGenerator;
import fr.inria.diverse.puzzle.instancesgenerator.impl.PCMGenerator;
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
	
	public boolean executeTest(int numFeatures, int numProducts, StringBuffer buffer) throws Exception {
		DependencyGraph randomAciclic = GraphGenerator.generateGraph(numFeatures, 880608);
		System.out.println("open fm: " + randomAciclic.toString());
		System.out.println("there is loop: " + randomAciclic.thereIsLoop());
		
		PFeatureModel openFM = VmSynthesis.getInstance().synthesizeOpenFeatureModel(randomAciclic);
		System.out.println(openFM.getRootFeature().getChildren().size());
		
		System.out.println("openFM");
		TestServices.printFM(openFM);
		
		String PCM = PCMGenerator.generatePCMs(randomAciclic, numProducts, 880608, 2);
		System.out.println("Original: "+ PCM);
		int originalNumProducts = PCM.split("\n").length - 1;
		
		PCM = updatePCM(PCM, randomAciclic);
		System.out.println("Update: "+ PCM);
		
		numProducts = PCM.split("\n").length - 1;
		
		System.out.println("Cloned OpenFM");
		PFeatureModel closedFM = synthesis.cloneFeatureModel(openFM);
		PCMQueryServices.getInstance().loadPCM(PCM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		System.out.println("IdentifyMandatoryFeatures OpenFM");
		long before = System.currentTimeMillis();
		synthesis.identifyMandatoryFeatures(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		System.out.println("IdentifyXORs OpenFM");
		synthesis.identifyXORs(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		System.out.println("IdentifyORs OpenFM");
		synthesis.identifyORs(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		System.out.println("AddAdditionalImpliesConstraints OpenFM");
		synthesis.addAdditionalImpliesConstraints(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
		System.out.println("AddAdditionalExcludesConstraints OpenFM");
		synthesis.addAdditionalExcludesConstraints(closedFM);
		TestServices.printFM(closedFM);
		TestServices.printAllValidProducts(closedFM, PCM);
		
//		System.out.println("GroupingImplicationsByRightSide OpenFM");
//		synthesis.groupImplicationsByRightSide(closedFM);
//		TestServices.printFM(closedFM);
//		TestServices.printAllValidProducts(closedFM, PCM);
//		
//		System.out.println("GroupingNotImplicationsByRightSide OpenFM");
//		synthesis.groupNotImplicationsByRightSide(closedFM);
//		TestServices.printFM(closedFM);
//		TestServices.printAllValidProducts(closedFM, PCM);
		
		System.out.println("GroupingImplicationsByLeftSide OpenFM");
		synthesis.groupImplicationsByLeftSide(closedFM);
		TestServices.printFM(closedFM);
		double result = TestServices.printAllValidProducts(closedFM, PCM);
		
		long after = System.currentTimeMillis();
		long time = after - before;
		String resultMessage = "";
		String successFail = "";
		
		if(result != numProducts){
			successFail = "FAIL:    ";
		}else{
			successFail = "SUCCESS: ";
		}
		
		resultMessage += successFail + "No. Features: " + numFeatures + 
				"; No. Products: (original:  " + originalNumProducts + ", updated: " + numProducts + " ); Result: " + result + "; Execution Time: " + time + "\n";
		
		buffer.append(resultMessage);
		
		if(result != numProducts){
			return false;
		}else{
			return true;
		}
		
	}
	
	private String updatePCM(String PCM, DependencyGraph randomAciclic) {
		return PCMFillerGenerator.generatePCMs(randomAciclic, PCM);
	}

	@Test
	public void testRandom() throws Exception{
		StringBuffer results = new StringBuffer();
		int[] dataFeatures = {5, 8, 10, 15, 20, 25};
		int[] dataNumProducts = {2, 3, 4, 6, 7, 8, 10, 12};
		
		int executions = 0;
		int success = 0;
		int fails = 0;
		for (int i = 0; i < dataFeatures.length; i++) {
			for (int j = 0; j < dataNumProducts.length; j++) {
				boolean result = this.executeTest(dataFeatures[i], dataNumProducts[j], results);
				executions++;
				
				if(result){
					success ++;
				}else{
					fails ++;
				}
			}
		}
		
		double successPercentage = ( success * 100 ) / executions;
		double failsPercentage = ( fails * 100 ) / executions;
		
		System.out.println(results);
		System.out.println("\n\n *** Global results: No. Executions: " + executions + 
				" Success: " + success + " (" +successPercentage + "%); Fails: "  + fails + " (" + failsPercentage + "%).\n\n");
	}
	
}
