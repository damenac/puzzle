package fr.inria.diverse.puzzle.vmsynthesis.tests;

import org.junit.Test;

import fr.inria.diverse.k3.sle.common.graphs.DependencyGraph;
import fr.inria.diverse.puzzle.graphsgenerator.impl.GraphGenerator;

public class RandomTest {

	@Test
	public void testRandom(){
		DependencyGraph randomAciclic = GraphGenerator.generateGraph(100, 880608);
		System.out.println(randomAciclic.toString());
		System.out.println(randomAciclic.thereIsLoop());
	}
}
