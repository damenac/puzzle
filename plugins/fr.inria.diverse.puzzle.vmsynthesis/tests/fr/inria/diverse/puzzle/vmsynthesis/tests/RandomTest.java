package fr.inria.diverse.puzzle.vmsynthesis.tests;

import org.junit.Test;

import vm.PFeatureModel;
import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.puzzle.graphsgenerator.impl.GraphGenerator;
import fr.inria.diverse.puzzle.vmsynthesis.impl.VmSynthesis;

public class RandomTest {

	@Test
	public void testRandom(){
		DependencyGraph randomAciclic = GraphGenerator.generateGraph(10, 880608);
		System.out.println(randomAciclic.toString());
		System.out.println(randomAciclic.thereIsLoop());
		
		PFeatureModel openFM = VmSynthesis.getInstance().synthesizeOpenFeatureModel(randomAciclic);
		System.out.println(openFM.getRootFeature().getChildren().size());
	}
}
