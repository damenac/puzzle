package puzzle.empirical.study;

import java.io.File;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.puzzle.metrics.specialCharts.SyntacticNamingVennDiagram;

public class Histogram {

	// ------------------------------------------------
	// Attributes
	// ------------------------------------------------
	
	private String dataFolder = "githubmetamodels";
	private ArrayList<Language> languages;
	
	// ------------------------------------------------
	// Loading scenarios
	// ------------------------------------------------
	
	@Before
	public void loadScenario(){
		languages = new ArrayList<Language>();
		
		File dataFolderObject = new File(dataFolder);
		
		for (File file : dataFolderObject.listFiles()) {
			if(file.getName().endsWith("ecore")){
				Language currentLanguage = MelangeFactory.eINSTANCE.createLanguage();
				Metamodel currentMetamodel = MelangeFactory.eINSTANCE.createMetamodel();
				currentMetamodel.setEcoreUri(file.getAbsolutePath());
				currentLanguage.setSyntax(currentMetamodel);
				currentLanguage.setName(file.getName());
				languages.add(currentLanguage);
			}
		}
	}

	// ------------------------------------------------
	// Test cases
	// ------------------------------------------------
	
	@Test
	public void computeHistograms() throws Exception{
		ConceptComparison conceptComparisonOperator = new DeepConceptComparison();

		SyntacticNamingVennDiagram metrics = new SyntacticNamingVennDiagram();
		int[][] theMatrix = metrics.getCommonalitiesMatrix(languages, conceptComparisonOperator);
		int[] maxs = new int[theMatrix.length];
		int[] counts = new int[theMatrix.length];
		double[] avgs = new double[theMatrix.length];
		
		System.out.println("\n\nOverlapping sizes matrix: ");
		for (int i = 0; i < theMatrix.length; i++) {
			int max = -1;
			int count = 0;
			int sum = 0;
			for (int j = 0; j < theMatrix.length; j++) {
				if(i == j)
					System.out.print("-|");
				else{
					System.out.print(theMatrix[i][j] + "|");
					if(theMatrix[i][j] > max)
						max = theMatrix[i][j];
					
					if(theMatrix[i][j] > 0){
						count++;
						sum += theMatrix[i][j];
					}
				}
					
			}
			maxs[i] = max;
			counts[i] = count;
			if(count == 0)
				avgs[i] = 0;
			else
				avgs[i] = (double)((double)sum/(double)count);
			System.out.println();
		}
		
		int remax = -1;
		System.out.print("\nMaximum overlapping: [");
		for (int i = 0; i < maxs.length; i++) {
			System.out.print(maxs[i] + "|");
			if(maxs[i] > remax)
				remax = maxs[i];
		}
		System.out.print("]");
		
		System.out.print("\nCount overlapping: [");
		for (int i = 0; i < counts.length; i++) {
			System.out.print(counts[i] + "|");
		}
		System.out.print("]");
		
		System.out.print("\nAverage overlapping: [");
		for (int i = 0; i < avgs.length; i++) {
			System.out.print(avgs[i] + "|");
		}
		System.out.print("]");
	}
}
