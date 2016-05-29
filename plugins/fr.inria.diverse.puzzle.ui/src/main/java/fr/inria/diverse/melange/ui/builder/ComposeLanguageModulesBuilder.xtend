package fr.inria.diverse.melange.ui.builder

import fr.inria.diverse.k3.sle.common.utils.ModelUtils
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode
import fr.inria.diverse.melange.ui.vos.CompositionGraph
import fr.inria.diverse.melange.ui.vos.CompositionStatementVO
import fr.inria.diverse.melange.ui.vos.CompositionTreeLeaf
import fr.inria.diverse.melange.ui.vos.CompositionTreeNode
import fr.inria.diverse.melange.ui.vos.LanguageVO
import fr.inria.diverse.puzzle.engine.AbstractSyntaxCompositionEngine
import fr.inria.diverse.puzzle.engine.SemanticsCompositionEngine
import fr.inria.diverse.puzzle.language.binding.Binding
import fr.inria.diverse.puzzle.language.binding.LanguageBinding
import fr.inria.diverse.puzzle.match.impl.PuzzleMatch
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic
import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import java.util.List
import javax.inject.Inject
import org.autorefactor.ui.OverlappingAspectsVO
import org.autorefactor.ui.OverridingAspectsVO
import org.autorefactor.ui.RefactoringPatternVO
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil
import org.eclipse.emf.common.util.BasicMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnosticItem

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class ComposeLanguageModulesBuilder extends AbstractBuilder {
	
	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	@Inject extension AbstractSyntaxCompositionEngine
	@Inject extension SemanticsCompositionEngine
	@Inject EclipseProjectHelper eclipseHelper
	
	private IProject targetProject
	
	// -------------------------------------------------
	// Methods
	// -------------------------------------------------
	
	/**
	 * Compose the language modules referenced in the melange and puzzle scripts given in the parameters
	 */
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
					#["fr.inria.diverse.k3.al.annotationprocessor.plugin", "fr.inria.diverse.puzzle.annotations"],
					#["CompleteDSL"],
					#[],
					new NullProgressMonitor
				)
		
		var String answer = 'Puzzle diagnostic: \n\n';

		var ArrayList<OverlappingAspectsVO> overlappingAspects = new ArrayList<OverlappingAspectsVO>()
		var ArrayList<OverridingAspectsVO> overridingAspects = new ArrayList<OverridingAspectsVO>()
		var ArrayList<RefactoringPatternVO> refactoringPatterns = new ArrayList<RefactoringPatternVO>()
		
		var AbstractCompositionTreeNode compositionTree = calculateCompositionTree(bindingSpace.binding, modelTypingSpace)
		var LanguageVO composedLanguage = evaluateCompositionTree(compositionTree, overlappingAspects, overridingAspects, refactoringPatterns)
		
		// Generating metamodels and metamodels code
		composedLanguage.serializeEcoreFiles
		var GenModel gen = composedLanguage.serializeGenmodelFiles
		gen.generateCode
		
		// Executing refactoring patters to finish the semantic composition.
		executeRefactorings(overlappingAspects, overridingAspects, refactoringPatterns)
		
		targetProject.refreshLocal(IResource.DEPTH_INFINITE, null)
		
		return answer
	}
	
	/**
	 * Computes a composition tree according to a set of composition statements (binding between language modules)
	 */
	def AbstractCompositionTreeNode calculateCompositionTree(List<Binding> statements, ModelTypingSpace modelTypingSpace){
		var ArrayList<CompositionStatementVO> statementsLeft = new ArrayList<CompositionStatementVO>()
		var AbstractCompositionTreeNode compositionTree = null
		var ArrayList<Language> bindedLanguages = new ArrayList<Language>();
		
		for(Binding _statement : statements){
			statementsLeft.add(new CompositionStatementVO(_statement))
			val Language requiringLanguage = modelTypingSpace.elements.findFirst[ element |
				element instanceof Language && (element as Language).requires.exists[ req | req.name.equals(_statement.left)
					&& req.name.contains((element as Language).name)
				]] as Language
			
			if(!bindedLanguages.contains(requiringLanguage))
				bindedLanguages.add(requiringLanguage)
			
			val Language providingLanguage = modelTypingSpace.elements.findFirst[ element |
				element instanceof Language && requiringLanguage != element && (element as Language).implements.exists[ impl | 
					impl.name.equals(_statement.right) && impl.name.contains((element as Language).name)
				]] as Language
				
			if(!bindedLanguages.contains(providingLanguage))
				bindedLanguages.add(providingLanguage)
		}
		
		var CompositionGraph graph = new CompositionGraph(bindedLanguages, statements, modelTypingSpace)
		
		for(Language bindedLanguage : bindedLanguages){
			if(compositionTree == null){
				var CompositionTreeLeaf leaf = new CompositionTreeLeaf(graph, bindedLanguage);
				compositionTree = leaf;
			}else{
				compositionTree = compositionTree.addNode(bindedLanguage)
			}
		}
		return compositionTree
	}
	
	/**
	 * Executes the composition of a set of languages indexed in a composition
	 * tree given in the parameter.
	 */
	def LanguageVO evaluateCompositionTree(AbstractCompositionTreeNode tree, 
		ArrayList<OverlappingAspectsVO> overlappingAspects, ArrayList<OverridingAspectsVO> overridingAspects, ArrayList<RefactoringPatternVO> refactoringPatterns){
		
		// If the composition tree is a leaf, it returns a VO with the information of the referenced language
		if(tree instanceof CompositionTreeLeaf){
			var CompositionTreeLeaf leaf = tree as CompositionTreeLeaf
			var LanguageVO language = new LanguageVO()
			language.name = leaf.language.name
			language.metamodel = ModelUtils.loadEcoreResource(leaf.language.syntax.ecoreUri)
			
			// Obtaining the required interface if exists
			if(leaf.language.requires.size > 0){
				language.requiredInterface = 
					ModelUtils.loadEcoreResource((leaf.language.requires.get(0) as ModelType).ecoreUri)
			}
			
			if(leaf.language.implements.size > 0){
				language.providedInterface = 
					ModelUtils.loadEcoreResource((leaf.language.implements.get(0) as ModelType).ecoreUri)
			}
			
			// Adding the aspects to the language VO
			if(leaf.language.semantics != null){
				for (Aspect _aspect : leaf.language.semantics) {
					language.aspects.add(_aspect);
				}
			}
			return language
		}
		
		// If the composition tree is a composition node, it performs the composition.
		else if(tree instanceof CompositionTreeNode){
			var CompositionTreeNode compositionNode = tree as CompositionTreeNode
			
			// Obtaining the language corresponding to the two nodes
			var LanguageVO requiringLanguage = compositionNode._requiring.evaluateCompositionTree(overlappingAspects, overridingAspects, refactoringPatterns)
			var LanguageVO providingLanguage = compositionNode._providing.evaluateCompositionTree(overlappingAspects, overridingAspects, refactoringPatterns)
			
			val MatchingDiagnostic comparison = PuzzleMatch.instance.match(requiringLanguage.requiredInterface, providingLanguage.providedInterface)
			
			println("Printing match")
			for(MatchingDiagnosticItem item : comparison.items){
				println("MatchingDiagnosticItem: " + item.left + " -> " + item.right)
			}
			
			// TODO: Validate compatibility

			var LanguageVO mergedLanguage = new LanguageVO()
			launchAbstractSyntaxComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison)
			launchSemanticsComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison, overlappingAspects, overridingAspects, refactoringPatterns, targetProject)
			
			return mergedLanguage
		}
		// Error: The composition tree is not valid.
		else {
			return null
		}
	}
	
	
	// ------------------------------------------------------------------
	// File management utilities
	// ------------------------------------------------------------------
	
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
	
	/**
	 * Serializes the .genmodel file corresponding to the language in the parameter. 
	 * This genmodel file contains the packages of the metamodel and the required interface if any. 
	 * 
	 * TODO: Throw an exception where the metamodel serialization path is null. That is an error!
	 * 
	 * @param language
	 * 			The value object containing the information of the language whose .genmodel file will be serialized.
	 */
	def GenModel serializeGenmodelFiles(LanguageVO language){
		
		if(language.metamodelSerializationPath != null){
			var String mergedProjectName = targetProject.getProject()
				.getLocation().toString();
				
			var String genmodelMetamodelMergedLocation = mergedProjectName + 
					"/composition-gen/" + language.name + ".genmodel";
			
			return generateGenmodelFile(language.metamodel, language.metamodelSerializationPath, 
					genmodelMetamodelMergedLocation, targetProject.getProject().name, 
					language.name, language.mergedPackage);
		}
	}
	
	/**
	 * Generates the corresponding GenModel file for an ecore package in the parameter
	 * @param ePackage
	 * @throws IOException 
	 */
	def private GenModel generateGenmodelFile(EPackage rootPackage, String ecoreLocation, 
		String genModelLocation, String projectName, String languageName, String basePackage) throws IOException {
		var GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setEditDirectory("/" + projectName + ".edit/src");
		genModel.setEditPluginID(projectName + ".edit");
		genModel.setEditorDirectory("/" + projectName + ".editor/src");
		genModel.setEditorPluginID(projectName + ".editor");
        genModel.setModelDirectory("/" + projectName + "/src-gen");
        genModel.setModelPluginID(projectName);
        genModel.setOperationReflection(true);
        genModel.setTestsDirectory("/" + projectName + ".tests/src");
        genModel.setTestsPluginID(projectName + ".tests");
        genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
        genModel.setModelName(languageName);
        genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
        genModel.initialize(Collections.singleton(rootPackage));
        genModel.setCanGenerate(true);
        
        var GenPackage genPackage = genModel.getGenPackages().get(0) as GenPackage;
        var String genModelPrefix = rootPackage.getNsPrefix().charAt(0).toString.toUpperCase + 
        								rootPackage.getNsPrefix().substring(1, rootPackage.getNsPrefix().length)
        genPackage.setPrefix(genModelPrefix);
        var URI genModelURI = URI.createFileURI(genModelLocation);
        var XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
        genModelResource.getContents().add(genModel);
        genModelResource.save(Collections.EMPTY_MAP);

        genModel.reconcile();
    	genModel.setCanGenerate(true);
    	genModel.setValidateModel(true);
		
		return genModel
	}
	
	/**
	 * Generates the code associated to a generated model given in the parameter
	 */
	def void generateCode(GenModel genModel) {
		genModel.reconcile
		genModel.canGenerate = true
		genModel.validateModel = true

		val generator = GenModelUtil::createGenerator(genModel)
		generator.generate(
			genModel,
			GenBaseGeneratorAdapter::MODEL_PROJECT_TYPE,
			new BasicMonitor.Printing(System::out)
		)
	}
}