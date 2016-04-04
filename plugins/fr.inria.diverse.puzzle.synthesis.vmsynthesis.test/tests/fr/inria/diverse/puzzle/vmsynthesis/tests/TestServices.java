package fr.inria.diverse.puzzle.vmsynthesis.tests;

import vm.LanguageConstraint;
import vm.LanguageFeature;
import vm.LanguageFeatureGroup;
import vm.LanguageFeatureModel;
import es.us.isa.FAMA.Reasoner.questions.NumberOfProductsQuestion;
import es.us.isa.FAMA.Reasoner.questions.ProductsQuestion;
import es.us.isa.FAMA.models.FAMAAttributedfeatureModel.FAMAAttributedFeatureModel;
import es.us.isa.FAMA.models.variabilityModel.GenericProduct;
import es.us.isa.FAMA.models.variabilityModel.VariabilityElement;
import es.us.isa.fama.PluginQuestionTrader;
import fr.inria.diverse.puzzle.vmsynthesis.impl.FromPuzzleToFAMAAttributed;

public class TestServices {

	// -------------------------------------------------
	// Auxiliary Methods
	// -------------------------------------------------
	
	public static void printFM(LanguageFeatureModel fm){
		System.out.println();
		System.out.println(fm.getName());
		printFeature("", " + ", fm.getRootFeature());
		
		System.out.println("\nConstraints size: " + fm.getConstraints().size());
		for (LanguageConstraint constraint : fm.getConstraints()) {
			System.out.println(constraint.getName());
		}
	}
	
	public static void printFeature(String space, String groupString, LanguageFeature feature){
		System.out.println(space + groupString + feature.getName() + " [mandatory: " + feature.isMandatory() + "]");
		int i = 1;
		for (LanguageFeatureGroup group : feature.getGroups()) {
			for (LanguageFeature childFeature : group.getFeatures()) {
				printFeature("    " + space, " Group " + i + " (" + 
						group.getCardinality().getLowerBound() + "," + group.getCardinality().getUpperBound() 
							+ "): ", childFeature);
			}
			i++;
		}
	}
	
	public static double printAllValidProducts(LanguageFeatureModel fm, String PCM){
//		FAMAFeatureModel famaFm = FromLanguageFeatureModelToFAMA.getInstance().fromLanguageFeatureModelToFAMA(fm);
		FAMAAttributedFeatureModel famaFm = FromPuzzleToFAMAAttributed.getInstance().fromPuzzleToFamaAttributed(fm);
		
		PluginQuestionTrader qt = new PluginQuestionTrader();
		qt.setVariabilityModel(famaFm);
		
		System.out.println();
		NumberOfProductsQuestion npq = (NumberOfProductsQuestion) qt.createQuestion("#Products");
		System.out.println(npq);
		qt.ask(npq);
		double numberOfProducts = npq.getNumberOfProducts();
		System.out.println("The number of products is: " + numberOfProducts);
		
//		ProductsQuestion pq = (ProductsQuestion) qt.createQuestion("Products");
//		qt.ask(pq);
//		
//		ArrayList<String> products = PCMQueryServices.getInstance().getAllProducts();
//		
//		int i = 1;
//		for (int k = 0; k < products.size(); k++) {
//			
//			ArrayList<String> featuresCollection = new ArrayList<String>();
//			Set<String> featuresSet = PCMQueryServices.getInstance().getAllFeatures();
//			featuresCollection.add("Root");
//			
//			Iterator<String> featuresIterator = featuresSet.iterator();
//			while (featuresIterator.hasNext()) {
//				String f = (String) featuresIterator.next();
//				if(PCMQueryServices.getInstance().productContainsFeature(products.get(k), f))
//					featuresCollection.add(f.replace("\"", ""));
//			}
//			
//			String[] featuresStringArray = new String[featuresCollection.size()];
//			for (int j = 0; j < featuresCollection.size(); j++) {
//				
//				featuresStringArray[j] = featuresCollection.get(j);
//			}
//			
//			boolean product1Exists = productExists(featuresStringArray, pq);
//			System.out.println("P" + i + ": " + product1Exists);
//			
//			i++;
//		}
//		
//		for (GenericProduct product : pq.getAllProducts()) {
//			System.out.print("Product: ");
//			for (VariabilityElement element : product.getElements()) {
//				System.out.print(element.getName() + ", ");	
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println();
		
		return numberOfProducts;
	}
	
	public static boolean productExists(String[] productFeatures, ProductsQuestion pq){
		for (GenericProduct product : pq.getAllProducts()) {
			if(productsAreEqual(product, productFeatures)){
				return true;
			}
		}
		return false;
	}

	public static boolean productsAreEqual(GenericProduct product,
			String[] productFeatures) {
		if(product.getElements().size() != productFeatures.length){
			return false;
		}
		
		for (String feature : productFeatures) {
			boolean featureExists = false;
			
			for (VariabilityElement element : product.getElements()) {
				if(element.getName().equals(feature)){
					featureExists = true;
					break;
				}
			}
			
			if(!featureExists)
				return false;
		}
		return true;
	}
}
