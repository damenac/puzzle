package fr.inria.diverse.ksynthesis.ksynthesis.facade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import vm.LanguageProductLine;
import foreverse.ksynthesis.Heuristic;
import foreverse.ksynthesis.InteractiveFMSynthesizer;
import foreverse.ksynthesis.metrics.AlwaysZeroMetric;
import fr.familiar.interpreter.FMLShell;
import fr.familiar.variable.FeatureModelVariable;
import fr.inria.diverse.ksynthesis.ksynthesis.auxiliary.Feature;
import fr.inria.diverse.ksynthesis.ksynthesis.auxiliary.Product;
import fr.inria.diverse.ksynthesis.ksynthesis.auxiliary.ProductLine;
import fr.inria.diverse.ksynthesis.ksynthesis.auxiliary.PuzzleFMTranslator;
import gsd.synthesis.Expression;
import gsd.synthesis.ExpressionType;

/**
 * Facade to the KSynthesis variability synthesizer. 
 * 
 * @author Guillaume Becan
 * @author David Mendez-Acuna
 *
 */
public class KSynthesisSynthesizer {

	// ----------------------------------------------------------
	// Constants
	// ----------------------------------------------------------
	
	final int CONSTRAINT_PER_FEATURE = 1;
	
	final double PERCENTAGE_IMPLIES = 0.8;
	
	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static KSynthesisSynthesizer instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private KSynthesisSynthesizer(){}
	
	public static KSynthesisSynthesizer getInstance(){
		if(instance == null)
			instance = new KSynthesisSynthesizer();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------

	/**
	 * Synthesizes a feature model from a PCM. 
	 * @param inputFile The location of the file containing the PCM in a comma separated file
	 * @param outputFile The location of the file in which the feature model should be saved. 
	 * @throws FileNotFoundException 
	 */
	public LanguageProductLine synthesizeFeatureModelFromPCM(String inputFile, String outputFile) throws Exception{
		ProductLine pl = loadProductLineFromPCM(inputFile);
		FeatureModelVariable fm = obtainVariabilityModelConstraints(pl);
		System.out.println(fm + " base fm");
		
		InteractiveFMSynthesizer synthesizer = new InteractiveFMSynthesizer(fm, new AlwaysZeroMetric(), new ArrayList<Heuristic>(), new AlwaysZeroMetric(), -1);
		synthesizer.setRoot("A");
		FeatureModelVariable synthesizedFM = synthesizer.computeCompleteFeatureModel();
		System.out.println(synthesizedFM + " synthesized fm");
		System.out.println("synthesizedFM.getAllConstraints(): " + synthesizedFM.getAllConstraints());
		System.out.println("synthesizedFM.getHierarchy(): " + synthesizedFM.getHierarchy());
		
		return PuzzleFMTranslator.getInstance().fromFeatureModelVariableToFeatureModel(synthesizedFM);
	}
	
	/**
	 * Loads a ProductLineVO from the PCM in the file in the parameter.
	 * @param inputFile Location of the file that contains the PCM in a comma separated matrix. 
	 * @return
	 * @throws Exception
	 */
	private ProductLine loadProductLineFromPCM(String inputFile) throws Exception {
		ProductLine pl = new ProductLine();
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		String currentLine = br.readLine();
		String[] header = currentLine.split(",");
		
		for (int i = 1; i < header.length; i++) {
			String featureIdentifier = header[i].replace("\"", "");
			
			// FIXME I need this 'cuz Familiar does not support features whose name is a reserved word of the language.  
			if(featureIdentifier.equals("Constraint"))
				featureIdentifier = "Constraints";
			
			Feature feature = new Feature(featureIdentifier);
			pl.getFeatures().add(feature);
		}
		currentLine = br.readLine();
		
		while(currentLine != null){
			String[] productDescription = currentLine.split(",");
			Product product = new Product(productDescription[0]);
			
			for (int i = 1; i < productDescription.length; i++) {
				String currentFeature = productDescription[i].replace("\"", "");
				if(currentFeature.equals("YES")){
					product.getFeatures().add(pl.getFeatures().get(i - 1));
				}
			}
			pl.getProducts().add(product);
			// Loop advance
			currentLine = br.readLine();
		}
		br.close();
		return pl;
	}

	/**
	 * Returns a FeatureModelVariable object with the constraints encoded in the product line in the parameter. 
	 * @param pl Product line from the constraints will be computed. 
	 * @return
	 */
	public FeatureModelVariable obtainVariabilityModelConstraints(ProductLine pl){
		FMLShell _shell = FMLShell.instantiateStandalone(null);
		String command = "fm = FM(" + "A: ";
		
		for (Feature feature : pl.getFeatures()) {
			command += "[" + feature.getIdentifier() + "] ";
		}
		command += "; )";
		
		FeatureModelVariable fm = (FeatureModelVariable) _shell.parse(command);	
		List<Expression<String>> allConstraints = new ArrayList<Expression<String>>();
		
		for (int i = 0; i < pl.getProducts().size(); i++) {
			Product product = pl.getProducts().get(i);
			Expression<String> productConstraint = null;
			for (int j = 1; j < product.getFeatures().size(); j++) {
				Feature productFeatureLeft = product.getFeatures().get(j-1);
				Feature productFeatureRight = product.getFeatures().get(j);
				
				if(productConstraint == null){
					productConstraint = new Expression<String>(ExpressionType.AND, 
						productFeatureLeft.getIdentifier(), productFeatureRight.getIdentifier());
				}else{
					Expression<String> rightExpression = new Expression<String>(productFeatureRight.getIdentifier());
					productConstraint = new Expression<String>(ExpressionType.AND, 
							productConstraint, rightExpression);
				}
			}
			allConstraints.add(productConstraint);
		}
		
		Expression<String> cnf = null;
		for (int i = 1; i < allConstraints.size(); i++) {
			Expression<String> leftConstraint = allConstraints.get(i-1);
			Expression<String> rightConstraint = allConstraints.get(i);
			if(cnf == null){
				cnf = new Expression<String>(ExpressionType.OR, 
						leftConstraint, rightConstraint);
			}else{
				cnf = new Expression<String>(ExpressionType.OR, 
						cnf, rightConstraint);
			}
		}
		
		fm.addConstraint(cnf);
		return fm;
	}
}