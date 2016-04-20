package fr.inria.diverse.puzzle.metrics;

import org.junit.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.Before;
import org.junit.Test;

import fr.inria.diverse.puzzle.metrics.auxiliarMetrics.PairwiseCohesion;

public class PairwiseCohesionTest {

	// -------------------------------------------------
	// Scenarios
	// -------------------------------------------------
	
	private EClass x;
	private EClass y;
	
	private EClass o;
	private EClass p;
	
	// -------------------------------------------------
	// Scenarios' loading
	// -------------------------------------------------
	
	@Before
	public void setupScenarioA(){
		x = EcoreFactory.eINSTANCE.createEClass();
		x.setName("X");
		
		y = EcoreFactory.eINSTANCE.createEClass();
		y.setName("Y");
		
		EReference a = EcoreFactory.eINSTANCE.createEReference();
		a.setName("a");
		a.setEType(y);
		
		EReference b = EcoreFactory.eINSTANCE.createEReference();
		b.setName("b");
		b.setEType(x);
		
		x.getEStructuralFeatures().add(a);
		x.getEStructuralFeatures().add(b);
		
		o = EcoreFactory.eINSTANCE.createEClass();
		o.setName("O");
		
		p = EcoreFactory.eINSTANCE.createEClass();
		p.setName("P");
		
		o.getESuperTypes().add(p);
		
		EReference c = EcoreFactory.eINSTANCE.createEReference();
		c.setName("c");
		c.setEType(o);
		p.getEStructuralFeatures().add(c);
		
		EReference d = EcoreFactory.eINSTANCE.createEReference();
		d.setName("d");
		d.setEType(o);
		o.getEStructuralFeatures().add(d);
	}
	// -------------------------------------------------
	// Test cases
	// -------------------------------------------------
	
	@Test
	public void computePairwiseCohesionXYTest(){
		Assert.assertEquals(0.5, PairwiseCohesion.computePairwiseCohesion(x, y), 0);
	}
	
	@Test
	public void computePairwiseCohesionXYInverseTest(){
		Assert.assertEquals(0.5, PairwiseCohesion.computePairwiseCohesion(y, x), 0);
	}
	
	@Test
	public void computeCrossReferencesXYTest(){
		Assert.assertEquals(1, PairwiseCohesion.computeCrossReferences(x, y), 0);
	}
	
	@Test
	public void countEReferencesTest(){
		Assert.assertEquals(2, PairwiseCohesion.countReferences(x), 0);
	}
	
	@Test
	public void computeCrossReferencesOPTest(){
		Assert.assertEquals(1, PairwiseCohesion.computeCrossReferences(o, p), 0);
		Assert.assertEquals(1, PairwiseCohesion.computeCrossReferences(p, o), 0);
	}
	
	@Test
	public void computePairwiseCohesionOPTest(){
		Assert.assertEquals(0.6, PairwiseCohesion.computePairwiseCohesion(o, p), 0.1);
	}
	
}
