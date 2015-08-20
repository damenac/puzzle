package fr.inria.diverse.puzzle.metrics.actions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.IndividualizationRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.ProductRelatedReusability;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.RelationshipRatio;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.ReusabilityBenefit;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.SyntactOverlapping;
import fr.inria.diverse.puzzle.metrics.evaluators.syntax.TotalAmountOfConcepts;

public class ComputeMetricsActionImpl {

	private static ComputeMetricsActionImpl instance;
	
	private ComputeMetricsActionImpl(){
		
	}
	
	public static ComputeMetricsActionImpl getInstance(){
		if(instance == null)
			instance = new ComputeMetricsActionImpl();
		return instance;
	}
	
	public String computeMetrics(ArrayList<IResource> selectedResources) throws IOException, CoreException{
		ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
		for (IResource iResource : selectedResources) {
			IFile currentFile = (IFile) iResource;
			EPackage currentMetamodel = ModelUtils.loadEcoreFile(currentFile.getLocation().toString());
			ePackages.add(currentMetamodel);
		}
		
		String metrics = "Metrics calculated"; 
		
//		metrics += "\n\n" + "Total amount of concepts: " + TotalAmountOfConcepts.evaluateMetric(ePackages);
//		metrics += "\n\n" + "Product-related reusability: " + ProductRelatedReusability.evaluate(ePackages);
//		metrics += "\n\n" + "Individualization ratio: " + IndividualizationRatio.evaluate(ePackages);
//		metrics += "\n\n" + "Individualization ratio: " + ReusabilityBenefit.evaluate(ePackages);
//		metrics += "\n\n" + "Relationship ratio: " + RelationshipRatio.evaluate(ePackages);
//		
//		metrics += "\n\n" + "++: " + SyntactOverlapping.evaluate(ePackages);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject("fr.inria.diverse.sle.examples.family");
		
		String generalMetricsString = "";
		generalMetricsString += fr.inria.diverse.puzzle.metrics.evaluators.syntax.SizeOfCommonality.printMetricsResults(ePackages);
		generalMetricsString += fr.inria.diverse.puzzle.metrics.evaluators.semantics.SizeOfCommonality.printMetricsResults(ePackages);
		generalMetricsString += fr.inria.diverse.puzzle.metrics.evaluators.syntax.ProductRelatedReusability.printMetricsResults(ePackages);
		
		
		File generalMetrics = new File(project.getLocation().toString() + "/libVenn/crazymetrics.txt" );
		if(!generalMetrics.exists())
			generalMetrics.createNewFile();
		PrintWriter outMetrics = new PrintWriter( generalMetrics );
		outMetrics.print(generalMetricsString);
		outMetrics.close();
		
		
		File syntacticVennData = new File(project.getLocation().toString() + "/libVenn/syntacticVennData.jsonp" );
		if(!syntacticVennData.exists())
			syntacticVennData.createNewFile();
		PrintWriter out = new PrintWriter( syntacticVennData );
        out.print(SyntactOverlapping.evaluate(ePackages));
        out.close();
        
        ProjectManagementServices.refreshProject(project);
		
		return metrics;
	}
}
