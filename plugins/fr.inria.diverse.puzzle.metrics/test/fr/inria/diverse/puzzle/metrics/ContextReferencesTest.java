package fr.inria.diverse.puzzle.metrics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.inria.diverse.puzzle.metrics.auxiliarMetrics.ContextReferences;

public class ContextReferencesTest {

	// -------------------------------------------------
	// Scenarios
	// -------------------------------------------------
	
	private EClass x;
	private EClass y;
	private EClass o;
	private EClass p;
	private EClass z;
	private List<EClass> metaClasses;
	
	// -------------------------------------------------
	// Scenarios' loading
	// -------------------------------------------------

	@Before
	public void setupScenario(){
		x = EcoreFactory.eINSTANCE.createEClass();
		x.setName("X");
		
		y = EcoreFactory.eINSTANCE.createEClass();
		y.setName("Y");
		
		o = EcoreFactory.eINSTANCE.createEClass();
		o.setName("O");
		
		p = EcoreFactory.eINSTANCE.createEClass();
		p.setName("P");
		
		z = EcoreFactory.eINSTANCE.createEClass();
		z.setName("Z");
		
		EReference a = EcoreFactory.eINSTANCE.createEReference();
		a.setName("a");
		a.setEType(y);
		x.getEStructuralFeatures().add(a);
		
		EReference b = EcoreFactory.eINSTANCE.createEReference();
		b.setName("b");
		b.setEType(y);
		x.getEStructuralFeatures().add(b);
		
		EReference c = EcoreFactory.eINSTANCE.createEReference();
		c.setName("c");
		c.setEType(x);
		x.getEStructuralFeatures().add(c);
		
		EReference d = EcoreFactory.eINSTANCE.createEReference();
		d.setName("d");
		d.setEType(p);
		y.getEStructuralFeatures().add(d);
		
		EReference e = EcoreFactory.eINSTANCE.createEReference();
		e.setName("e");
		e.setEType(o);
		p.getEStructuralFeatures().add(e);
		
		o.getESuperTypes().add(p);
		z.getESuperTypes().add(o);
		
		metaClasses = new ArrayList<EClass>();
		metaClasses.add(x);
		metaClasses.add(y);
		metaClasses.add(z);
		metaClasses.add(o);
		metaClasses.add(p);
	}
	
	// -------------------------------------------------
	// Test cases
	// -------------------------------------------------
	
	
	@Test
	public void countTotalReferencesTest(){
		Assert.assertEquals(7, ContextReferences.countTotalReferences(metaClasses));
	}
}
