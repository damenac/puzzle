package fr.inria.diverse.generator.pcm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Provides query services for PCMs.
 * 
 * @author David Mendez-Acuna
 *
 */
public class PCMQueryServices {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------

	private static PCMQueryServices instance;

	private String[][] PCM;

	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------

	private PCMQueryServices() {

	}

	public static PCMQueryServices getInstance() {
		if (instance == null)
			instance = new PCMQueryServices();
		return instance;
	}

	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------

	public Set<String> getAllFeatures() {
		Set<String> features = new HashSet<String>();
		for (int j = 1; j < PCM[0].length; j++) {
			features.add(PCM[0][j]);
		}
		return features;
	}

	public boolean existsProductWithFeature(String feature) {
		for (int j = 1; j < PCM[0].length; j++) {

			if (PCM[0][j].equals(feature)) {
				// si encuentro la caracteristica entonces busco
				for (int i = 1; i < PCM.length; i++) {
					if (PCM[i][j].equals("\"YES\"")) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean existsProductWithoutFeature(String feature) {
		for (int j = 1; j < PCM[0].length; j++) {
			if (PCM[0][j].replace("\"", "").equals(feature.replace("\"", ""))) {
				for (int i = 1; i < PCM.length; i++) {
					if (PCM[i][j].replace("\"", "").equals("NO"))
						return true;
				}
			}
		}
		return false;
	}

	public boolean productContainsFeature(String product, String feature) {
		for (int i = 1; i < PCM.length; i++) {
			if (PCM[i][0].replace("\"", "").equals(product.replace("\"", ""))) {
				for (int j = 1; j < PCM[0].length; j++) {
					if (PCM[0][j].replace("\"", "").equals(feature.replace("\"", ""))) {
						String answer = PCM[i][j];
						if (answer.replace("\"", "").equals("YES"))
							return true;
						else
							return false;
					}
				}
			}
		}
		return false;
	}

	public ArrayList<String> getProductsContainingFeature(String feature) {
		ArrayList<String> answer = new ArrayList<String>();
		for (int i = 1; i < PCM.length; i++) {
			String currentProduct = PCM[i][0];
			for (int j = 1; j < PCM[0].length; j++) {
				if (PCM[0][j].replace("\"", "").equals(feature)) {
					if (PCM[i][j].replace("\"", "").equals("YES")) {
						answer.add(currentProduct);
						break;
					}
				}
			}
		}
		return answer;
	}

	public ArrayList<String> getAllProducts() {
		ArrayList<String> answer = new ArrayList<String>();
		for (int i = 1; i < PCM.length; i++) {
			String currentProduct = PCM[i][0];
			answer.add(currentProduct);
		}
		return answer;
	}

	public boolean xor(List<String> features) {
		ArrayList<ArrayList<String>> productsSet = new ArrayList<ArrayList<String>>();
		for (String feature : features) {
			productsSet.add(this.getProductsContainingFeature(feature));
		}
		return this.disjointSets(productsSet);
	}

	private boolean disjointSets(ArrayList<ArrayList<String>> set) {
		ArrayList<String> bigSet = new ArrayList<String>();
		int sumCount = 0;
		for (ArrayList<String> arrayList : set) {
			sumCount += arrayList.size();
			for (String string : arrayList) {
				if (!bigSet.contains(string))
					bigSet.add(string);
			}
		}
		return sumCount == bigSet.size();
	}

	public void loadPCM(String PCMString) {
		String[] products = PCMString.split("\n");
		int productsAmount = products.length;

		String[] features = products[0].split(",");
		int featuresAmount = features.length;

		PCM = new String[productsAmount][featuresAmount];

		for (int i = 1; i < features.length; i++) {
			PCM[0][i] = features[i];
		}

		for (int i = 1; i < products.length; i++) {
			String[] productFeatures = products[i].split(",");
			for (int j = 0; j < productFeatures.length; j++) {
				PCM[i][j] = productFeatures[j];
			}
		}
		PCM[0][0] = "\"Product\"";
	}

	public void printPCM() {
		for (int i = 0; i < PCM.length; i++) {
			for (int j = 0; j < PCM[0].length; j++) {
				System.out.print(PCM[i][j] + ",");
			}
			System.out.println();
		}
	}

	public boolean existsProductWithFeatureAWithoutFeatureB(String A, String B) {

		for (int i = 1; i < PCM.length; i++) {
			boolean withA = false;
			for (int j = 1; j < PCM[0].length && !withA; j++) {
				if (PCM[0][j].equals("\"" + A + "\"")) {
					if (PCM[i][j].equals("\"YES\""))
						withA = true;
				}
			}

			boolean withoutB = false;
			for (int j = 1; j < PCM[0].length && !withoutB; j++) {
				if (PCM[0][j].equals("\"" + B + "\"")) {
					if (PCM[i][j].equals("\"NO\""))
						withoutB = true;
				}
			}

			if (withA && withoutB)
				return true;
		}
		return false;
	}

	/**
	 * Returns true if all the products that contain the feature A, contain also
	 * the feature B. That is A implies B.
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean allProductsWithFeatureAHaveAlsoFeatureB(String A, String B) {

		int count = 0;
		for (int i = 1; i < PCM.length; i++) {
			boolean withA = false;
			for (int j = 1; j < PCM[0].length && !withA; j++) {
				if (PCM[0][j].replace("\"", "").equals(A.replace("\"", ""))) {
					if (PCM[i][j].replace("\"", "").equals("YES")) {
						withA = true;
						count++;
					}
				}
			}

			boolean withoutB = false;
			for (int j = 1; j < PCM[0].length && !withoutB; j++) {
				if (PCM[0][j].replace("\"", "").equals( B.replace("\"", "") )) {
					if (PCM[i][j].replace("\"", "").equals("NO"))
						withoutB = true;
				}
			}

			if (withA && withoutB)
				return false;
		}
		if (count == 0)
			return false;
		else
			return true;
	}

	/**
	 * Returns true if all the products that contain the feature A exclude the
	 * feature B. That is, A implies not B.
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean allProductsWithFeatureAExcludeFeatureB(String A, String B) {

		for (int i = 1; i < PCM.length; i++) {
			boolean withA = false;
			for (int j = 1; j < PCM[0].length && !withA; j++) {
				if (PCM[0][j].replace("\"", "").equals( A.replace("\"", "") )) {
					if (PCM[i][j].replace("\"", "").equals("YES"))
						withA = true;
				}
			}

			boolean withB = false;
			for (int j = 1; j < PCM[0].length && !withB; j++) {
				if (PCM[0][j].replace("\"", "").equals( B.replace("\"", "") )) {
					if (PCM[i][j].replace("\"", "").equals("YES"))
						withB = true;
				}
			}

			if (withA && withB)
				return false;
		}
		return true;
	}

	/**
	 * Returns true if all the products that contain the features in the array A
	 * contain also the feature B. That is, (A[0] and A[1] and ... and A[n])
	 * implies B.
	 * 
	 * @param A.
	 *            Collection of features at the left side of the operation
	 * @param B.
	 *            The right side feature.
	 * @return
	 */
	public boolean allProductsWithFeaturesSetAHaveAlsoFeatureB(ArrayList<String> A, String B) {

		for (int i = 1; i < PCM.length; i++) {
			boolean withA = true;
			for (int index = 0; index < A.size() && withA; index++) {
				String a = A.get(index);
				for (int j = 1; j < PCM[0].length && withA; j++) {
					String currentFeatureName = PCM[0][j].replace("\"", "");
					if (currentFeatureName.equals(a)) {
						if (PCM[i][j].equals("\"NO\""))
							withA = false;
					}
				}
			}

			boolean withoutB = false;
			for (int j = 1; j < PCM[0].length && !withoutB; j++) {
				if (PCM[0][j].equals("\"" + B + "\"")) {
					if (PCM[i][j].equals("\"NO\""))
						withoutB = true;
				}
			}

			if (withA && withoutB)
				return false;
		}
		return true;
	}

	/**
	 * Returns true if all the products that contain the features in the array A
	 * exclude the feature B. That is, (A[0] and A[1] and ... and A[n]) implies
	 * not B.
	 * 
	 * @param leftFeatures
	 * @param name
	 * @return
	 */
	public boolean allProductsWithFeaturesSetAExcludeFeatureB(ArrayList<String> A, String B) {

		for (int i = 1; i < PCM.length; i++) {
			boolean withA = true;
			for (int index = 0; index < A.size() && withA; index++) {
				String a = A.get(index);
				for (int j = 1; j < PCM[0].length && withA; j++) {
					String currentFeatureName = PCM[0][j].replace("\"", "");
					if (currentFeatureName.equals(a)) {
						if (PCM[i][j].equals("\"NO\""))
							withA = false;
					}
				}
			}

			boolean withB = false;
			for (int j = 1; j < PCM[0].length && !withB; j++) {
				if (PCM[0][j].equals("\"" + B + "\"")) {
					if (PCM[i][j].equals("\"YES\""))
						withB = true;
				}
			}

			if (withA && withB)
				return false;
		}
		return true;
	}

	public int minFeaturesOccurrences(ArrayList<String> features, ArrayList<String> productsConsidered) {
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < PCM.length; i++) {
			String currentProduct = PCM[i][0];

			if (productsConsidered.contains(currentProduct)) {
				int currentCount = 0;
				for (String feature : features) {
					if (this.productContainsFeature(currentProduct, feature))
						currentCount++;
				}
				if (currentCount < min)
					min = currentCount;
			}
		}
		return min;
	}

	public int maxFeaturesOccurrences(ArrayList<String> features, ArrayList<String> consideredProducts) {
		int max = -1;
		for (int i = 1; i < PCM.length; i++) {
			String currentProduct = PCM[i][0];

			if (consideredProducts.contains(currentProduct)) {
				int currentCount = 0;
				for (String feature : features) {
					if (this.productContainsFeature(currentProduct, feature))
						currentCount++;
				}
				if (currentCount > max)
					max = currentCount;
			}
		}
		return max;
	}
}
