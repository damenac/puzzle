package fr.inria.diverse.puzzle.breaker.popup.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.k3.sle.common.graphs.EcoreVertex;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
import fr.inria.diverse.k3.sle.common.utils.EcoreCloningServices;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.puzzle.metrics.managers.ProductLinesMetricManager;

/**
 * Action implementation for families decomposition. 
 * @author David Mendez Acuna
 */
public class SynthesisManager {
	
	// --------------------------------------------------------
	// Attributes
	// --------------------------------------------------------
	
	private static SynthesisManager instance;
	
	// --------------------------------------------------------
	// Constructor and singleton
	// --------------------------------------------------------

	private SynthesisManager(){}
	
	public static SynthesisManager getInstance(){
		if(instance == null)
			instance = new SynthesisManager();
		return instance;
	}
	
	// --------------------------------------------------------
	// Methods
	// --------------------------------------------------------
	
	/**
	 * Breaks-down the family in the parameter using the comparison operators and the decomposition strategy in the parameters (TODO) 
	 * @param languages
	 * @throws Exception
	 */
	public EcoreGraph breakDownFamily(ArrayList<Language> languages, SynthesisProperties synthesisProperties, IProject lplProject) throws Exception{
		ConceptComparison conceptComparisonOperator = synthesisProperties.getConceptComparisonOperator();
		MethodComparison methodComparisonOperator = synthesisProperties.getMethodComparisonOperator();
		
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<TupleConceptMembers> conceptMembersList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, conceptComparisonOperator);
		ArrayList<TupleMembersConcepts> membersConceptList = FamiliesServices.getInstance().getMembersGroupVsConceptVOList(conceptMembersList);
		EcoreGraph dependenciesGraph = new EcoreGraph(membersConceptList, conceptComparisonOperator);
		dependenciesGraph.groupGraphByFamilyMembership(membersConceptList, conceptComparisonOperator);
		buildModules(dependenciesGraph);
		
		ProductLinesMetricManager metricsManager = new ProductLinesMetricManager(lplProject);
		metricsManager.createReport1ProductLineCoupling(languages);
		metricsManager.createReport1ProductLineCouplingData(languages, conceptComparisonOperator, methodComparisonOperator);
		
		ProjectManagementServices.refreshProject(lplProject);
		return dependenciesGraph;
	}

	/**
	 * Builds the ecore metamodels according to the decomposed dependencies graph. 
	 * @param ecoreGraph
	 * @throws CoreException
	 */
	private void buildModules(EcoreGraph ecoreGraph) throws CoreException {
		for (ArrayList<EcoreVertex> group : ecoreGraph.getGroups()) {
			// Build the module metamodel with the required interface.
			EPackage moduleEPackage = this.createEPackageByModule(group);

			// Create the module project with the folders.
			IProject moduleProject = ProjectManagementServices.createEclipseProject("fr.inria.diverse.examples.breaking.lpl." + MelangeServices.getLanguageModuleName(group).trim());
			String modelsFolderPath = ProjectManagementServices.createFolderByName(moduleProject, "models");
						
			// Serialize the module metamodel in the corresponding project. 
			ModelUtils.saveEcoreFile(modelsFolderPath + "/" + MelangeServices.getLanguageModuleName(group) + ".ecore", moduleEPackage);
			
			// Create the genmodel and generate the code of the module.
			ProjectManagementServices.refreshProject(moduleProject);
		}
	}

	/**
	 * Creates a metamodel by module taking into consideration the corresponding dependencies with other modules
	 * by establishing the required interfaces.
	 * @param moduleConceptsVO
	 * @return
	 */
	private EPackage createEPackageByModule(ArrayList<EcoreVertex> group) {
		EcoreCloningServices.getInstance().resetClonedClassifiers();
		EPackage newPackage = EcoreFactory.eINSTANCE.createEPackage();
		String moduleName = MelangeServices.getLanguageModuleName(group);
		newPackage.setName(moduleName.trim());
		newPackage.setNsPrefix(moduleName.trim());
		newPackage.setNsURI(moduleName.trim());
		
		for (EcoreVertex vertex : group) {
			if(vertex.getClassifier() instanceof EClass){
				EClass newClass = EcoreCloningServices.getInstance().cloneEClass((EClass)vertex.getClassifier());
				newPackage.getEClassifiers().add(newClass);
			}
			else if(vertex.getClassifier() instanceof EEnum){
				EEnum newEEnum = EcoreCloningServices.getInstance().cloneEEnum((EEnum)vertex.getClassifier());
				newPackage.getEClassifiers().add(newEEnum);
			}
		}
		EcoreCloningServices.getInstance().resolveLocalReferences(newPackage);
		EcoreCloningServices.getInstance().resolveInterfaceReferences(newPackage);
		EcoreCloningServices.getInstance().resolveLocalSuperTypes(newPackage);
		return newPackage;
	}
}