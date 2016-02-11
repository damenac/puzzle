package fr.inria.diverse.melange.ui.builder

import javax.inject.Inject

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.k3.sle.common.utils.ModelUtils
import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.puzzle.adl.language.puzzle.Binding
import fr.inria.diverse.melange.metamodel.melange.Language
import org.eclipse.emf.ecore.util.EcoreUtil
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic
import fr.inria.diverse.puzzle.match.impl.PuzzleMatch
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.core.runtime.NullProgressMonitor

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class LanguageModulesCompositionBuilder extends AbstractBuilder {
	
	@Inject EclipseProjectHelper eclipseHelper
	private IProject targetProject
	
	def String composeLanguageModules(Resource puzzleResource, Resource melangeResource, IProject project, IProgressMonitor monitor) {
		val bindingSpace = puzzleResource.contents.head as LanguageBinding
		val modelTypingSpace = melangeResource.contents.head as ModelTypingSpace
		EcoreUtil.resolveAll(modelTypingSpace);
		
		targetProject = eclipseHelper.createEclipseProject(
					project.name + "." + "composedLanguage",
					#[JavaCore::NATURE_ID, PDE::PLUGIN_NATURE],
					#[JavaCore::BUILDER_ID,	PDE::MANIFEST_BUILDER_ID, PDE::SCHEMA_BUILDER_ID],
					#["src-gen", "xtend-gen"],
					#[],
					#["fr.inria.diverse.puzzle.annotations", 
						"fr.inria.diverse.k3.al.annotationprocessor.plugin"],
					#[],
					#[],
					new NullProgressMonitor
				)
		
		var String answer = 'Puzzle diagnostic: \n\n';
		
		var LanguageVO mergedLanguage = new LanguageVO
		
		// Obtaining required and provided interfaces for each binding
		for(var int i = 0; i < bindingSpace.binding.size; i++){
			var Binding binding = bindingSpace.binding.get(i)
			
			val requiredModelTypeName = binding.left
			val providedModelTypeName = binding.right
			
			val ModelType requiredModelType = modelTypingSpace.elements.findFirst[ element |
				element instanceof ModelType && (element as ModelType).name.equals(requiredModelTypeName)] as ModelType
			
			val ModelType providedModelType = modelTypingSpace.elements.findFirst[ element |
				element instanceof ModelType && (element as ModelType).name.equals(providedModelTypeName)] as ModelType
				
			val EPackage requiredModelTypeEPackage = ModelUtils.loadEcoreResource(requiredModelType.ecoreUri)
			val EPackage providedModelTypeEPackage = ModelUtils.loadEcoreResource(providedModelType.ecoreUri)
			
			val Language requiringLanguage = modelTypingSpace.elements.findFirst[ element |
				element instanceof Language && (element as Language).requires.exists[ req | req.name.equals(requiredModelTypeName)]] as Language
			
			val Language providingLanguage = modelTypingSpace.elements.findFirst[ element |
				element instanceof Language && requiringLanguage != element && (element as Language).implements.exists[ impl | 
					impl.name.equals(providedModelTypeName)
				]] as Language
			
			val EPackage requiredLanguageEPackage = ModelUtils.loadEcoreResource(requiringLanguage.syntax.ecoreUri)
			val EPackage providedLanguageEPackage = ModelUtils.loadEcoreResource(providingLanguage.syntax.ecoreUri)
			
			println('Data ... requiredModelTypeEPackage: ' + requiredModelTypeEPackage.name + ' - '
				+ 'providedModelTypeEPackage: ' + providedModelTypeEPackage.name + ' - '
				+ 'requiringLanguage: ' + requiringLanguage.name + ' - '
				+ 'providingLanguage: ' + providingLanguage.name + ' - '
			)
			
			val MatchingDiagnostic comparison = PuzzleMatch.instance.match(requiredLanguageEPackage, providedLanguageEPackage)
			
			var EPackage recalculatedRequiredInterface = PuzzleMerge.getInstance().
				recalculateRequiredInterface(providedLanguageEPackage, 
						comparison, "merged", requiredLanguageEPackage);
			 
			val EPackage mergedPackage = PuzzleMerge.instance.mergeAbstractSyntax(providedLanguageEPackage, providedModelTypeEPackage, 
				requiredLanguageEPackage, requiredModelTypeEPackage, comparison, recalculatedRequiredInterface, "")
			
			mergedLanguage.metamodel = mergedPackage
			mergedLanguage.requiredInterface = recalculatedRequiredInterface
		}
		return answer
	}
	
	/**
	 * Serializes the .ecore files corresponding to the language in the parameter
	 * A language is composed of three different .ecore files: the metamodel, the provided interface and the required interface.
	 * 
	 * @param language
	 * 		The value object containing the information of the language whose .ecore files will be serialized. 
	 */
	def void serializeEcoreFiles(LanguageVO language) {
		var String mergedProjectName = targetProject.getProject()
				.getLocation().toString();
		
		if(language.providedInterface != null){
			var String providedInterfaceMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + "-Provided.ecore";
			ModelUtils.saveEcoreFile(providedInterfaceMergedLocation, language.providedInterface);
		}
		
		if(language.providedInterface != null){
			var String providedInterfaceMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + "MT.ecore";
			ModelUtils.saveEcoreFile(providedInterfaceMergedLocation, language.providedInterface);
		}
		
		if(language.requiredInterface != null){
			var String requiredInterfaceMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + "-Required.ecore";
			println("serializeEcoreFiles.recalculatedRequiredInterface: " + language.requiredInterface.EClassifiers)
			ModelUtils.saveEcoreFile(requiredInterfaceMergedLocation, language.requiredInterface);
		}
		
		if(language.metamodel != null){
			var String metamodelMergedLocation = mergedProjectName + 
				"/composition-gen/" + language.name + ".ecore";
			language.metamodelSerializationPath = metamodelMergedLocation
			ModelUtils.saveEcoreFile(metamodelMergedLocation, language.metamodel);
		}
	}
}