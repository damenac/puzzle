package fr.inria.diverse.puzzle.breaker.popup.actions;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleModuleConceptsMembers;
import fr.inria.diverse.k3.sle.common.utils.EcoreCloningServices;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices;

/**
 * 
 * @author David Mendez Acuna
 *
 */
public class BreakDownFamilyImpl {
	
	private static BreakDownFamilyImpl instance;
	
	private BreakDownFamilyImpl(){}
	
	public static BreakDownFamilyImpl getInstance(){
		if(instance == null)
			instance = new BreakDownFamilyImpl();
		return instance;
	}
	
	public void breakDownFamily(ArrayList<IResource> selectedResources) throws Exception{
		ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
		for (IResource iResource : selectedResources) {
			IFile currentFile = (IFile) iResource;
			EPackage currentMetamodel = ModelUtils.loadEcoreFile(currentFile.getLocation().toString());
			ePackages.add(currentMetamodel);
		}
		ConceptComparison conceptComparisonOperator = NamingConceptComparison.class.newInstance();
		ArrayList<TupleModuleConceptsMembers> moduleConceptsList = FamiliesServices.getInstance().obtainConceptsOwenerLanguagesList(ePackages, conceptComparisonOperator);
		buildModules(moduleConceptsList);
	}

	private void buildModules(ArrayList<TupleModuleConceptsMembers> moduleConceptsList) throws CoreException {
		for (TupleModuleConceptsMembers moduleConceptsVO : moduleConceptsList) {
			// Build the module metamodel with the required interface.
			EPackage moduleEPackage = this.createEPackageByModule(moduleConceptsVO);

			// Get the module name by obtaining the name of the first class (we can do this better!)
			String moduleName = moduleEPackage.getEClassifiers().get(0).getName();
			moduleConceptsVO.setModuleName(moduleName);
			
			// Create the module project with the folders.
			IProject moduleProject = ProjectManagementServices.createEclipseProject("fr.inria.diverse.examples.breaking." + moduleConceptsVO.getModuleName().trim());
			String modelsFolderPath = ProjectManagementServices.createFolderByName(moduleProject, "models");
						
			// Serialize the module metamodel in the corresponding project. 
			ModelUtils.saveEcoreFile(modelsFolderPath + "/" + moduleConceptsVO.getModuleName() + ".ecore", moduleEPackage);
			
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
	private EPackage createEPackageByModule(TupleModuleConceptsMembers moduleConceptsVO) {
		EcoreCloningServices.getInstance().resetClonedClassifiers();
		EPackage newPackage = EcoreFactory.eINSTANCE.createEPackage();
		newPackage.setName(moduleConceptsVO.getModuleName().trim());
		newPackage.setNsPrefix(moduleConceptsVO.getModuleName().trim());
		newPackage.setNsURI(moduleConceptsVO.getModuleName().trim());
		
		for (EClassifier eClassifier : moduleConceptsVO.getConcepts()) {
			if(eClassifier instanceof EClass){
				EClass newClass = EcoreCloningServices.getInstance().cloneEClass((EClass)eClassifier);
				newPackage.getEClassifiers().add(newClass);
			}
			else if(eClassifier instanceof EEnum){
				EEnum newEEnum = EcoreCloningServices.getInstance().cloneEEnum((EEnum)eClassifier);
				newPackage.getEClassifiers().add(newEEnum);
			}
		}
		EcoreCloningServices.getInstance().resolveLocalReferences(newPackage);
		EcoreCloningServices.getInstance().resolveInterfaceReferences(newPackage);
		EcoreCloningServices.getInstance().resolveLocalSuperTypes(newPackage);
		return newPackage;
	}
}
