package testcases;


import solver.VerySimpleSolver;



public class Case0 {

	
	public static void main(String[] args) {
	
//			Input set of products
//			Product 0
//			F1;
//			Product 1
//			F1;F3;
//			Product 2
//			F1;F3;F4;
//			Product 3
//			F1;F2;F5;
//			Product 4
//			F1;F2;F3;F4;F5;
		
//			Adding the BINARY observations from the gaph and the pcm 
			String[] features = {"F1","F2","F3","F4","F5"};
			String[] requiresGraph={"F2;F1","F3;F1","F2;F5","F4;F3"};
			String[] requiresPCM={"F5;F2"};
			String[] excludesGraph={};
			String[] excludesPCM={};
			String[] coreMandatory={"F1"};
			
//			Obtaining the COVERINNG SET OF PRODUCTS
			VerySimpleSolver solver = new VerySimpleSolver(features, requiresGraph, requiresPCM, excludesGraph, excludesPCM, coreMandatory);
			solver.solve();
			
//			Product 0
//			F1;
//			Product 1
//			F1;F3;
//			Product 2
//			F1;F3;F4;
//			Product 3
//			F1;F2;F5;
//			Product 4
//			F1;F2;F3;F5;
//			Product 5
//			F1;F2;F3;F4;F5;
			
//			Observamos que nos faltaba el producto 4 para ser capaces de representar la pcm con modelos standard
	}

	
	
}
