package fr.inria.diverse.melange.ui.builder

import javax.inject.Inject

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.k3.sle.common.utils.ModelUtils
import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.melange.metamodel.melange.Language
import org.eclipse.emf.ecore.util.EcoreUtil
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic
import fr.inria.diverse.puzzle.match.impl.PuzzleMatch
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.core.runtime.NullProgressMonitor
import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode
import java.util.List
import java.util.ArrayList
import fr.inria.diverse.melange.ui.vos.CompositionStatementVO
import fr.inria.diverse.melange.ui.vos.CompositionTreeNode
import fr.inria.diverse.melange.ui.vos.CompositionTreeLeaf
import org.eclipse.core.resources.IResource
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import java.util.Collections
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.core.runtime.Path
import java.io.IOException
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.common.util.BasicMonitor
import fr.inria.diverse.melange.ui.vos.CompositionGraph
import fr.inria.diverse.melange.ui.vos.LanguageVO
import fr.inria.diverse.puzzle.language.binding.LanguageBinding
import fr.inria.diverse.puzzle.language.binding.Binding
import fr.inria.diverse.melange.metamodel.melange.Aspect
import org.autorefactor.ui.OverridingAspectsVO
import org.autorefactor.ui.OverlappingAspectsVO
import org.eclipse.emf.ecore.EClassifier
import org.autorefactor.ui.RefactoringPatternVO
import fr.inria.diverse.commons.asm.shade.DirectoryShader
import fr.inria.diverse.commons.asm.shade.ShadeRequest
import fr.inria.diverse.commons.asm.shade.relocation.Relocator
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.emf.common.util.TreeIterator
import fr.inria.diverse.melange.metamodel.melange.Mapping
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnosticItem
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.emf.ecore.EOperation
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.naming.QualifiedName
import java.net.URLClassLoader
import com.google.inject.Provider
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.core.resources.IResourceVisitor
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.CoreException
import java.io.File
import fr.inria.diverse.commons.asm.shade.relocation.SimpleRelocator
import org.autorefactor.ui.PrepareApplyRefactoringsJob
import java.util.Hashtable
import org.autorefactor.ui.PropertiesSetVO
import java.io.BufferedReader
import java.io.FileReader
import java.io.PrintWriter
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.core.runtime.IPath

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
	
	@Inject EclipseProjectHelper eclipseHelper
	@Inject extension EcoreQueries
	@Inject extension PuzzleXbaseInterpreter puzzleXbaseInterpreter
	@Inject private Provider<IEvaluationContext> contextProvider;
	private IProject targetProject
	private Hashtable<String, IJavaElement> cacheJavaElements = new Hashtable<String, IJavaElement>()
	
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
					#["fr.inria.diverse.k3.al.annotationprocessor.plugin"],
					#[],
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
	
	def executeRefactorings(ArrayList<OverlappingAspectsVO> overlappingAspects, ArrayList<OverridingAspectsVO> overridingAspects,
		ArrayList<RefactoringPatternVO> refactoringPatterns) {
			
		val ws = targetProject.project.workspace.root
			
		// Loading the java elements in the overlapping aspects needed for the java AST refactoring
		var boolean mergedFixed = false
		var ArrayList<OverlappingAspectsVO> cleanListOverlappingAspects = overlappingAspects.removeRepeatedElements()
		var Hashtable<String, PropertiesSetVO> propertiesFiles = new Hashtable<String, PropertiesSetVO>()
		var Hashtable<String, String> mergedFiles = new Hashtable<String, String>()
			
		for(OverlappingAspectsVO _overlappingAspect : overlappingAspects){
			if(mergedFiles.get(_overlappingAspect.mergedFile) == null){
				overrideMethod(_overlappingAspect.rightFile, _overlappingAspect.mergedFile);
				mergedFiles.put(_overlappingAspect.mergedFile,_overlappingAspect.mergedFile);
			}
			
			var String aspectName = _overlappingAspect.leftAspect.aspectTypeRef.identifier.substring(
					_overlappingAspect.leftAspect.aspectTypeRef.identifier.lastIndexOf(".") + 1)
				
			var String mergedPropertiesFile = _overlappingAspect.mergedFile.replace(aspectName, aspectName + aspectName + "Properties")
			var String leftPropertiesFile = _overlappingAspect.rightFile.replace(aspectName, aspectName + aspectName + "Properties")
			var String rightPropertiesFile = _overlappingAspect.rightFile.replace(aspectName, aspectName + aspectName + "Properties")
			
			var PropertiesSetVO propertiesSet = propertiesFiles.get(mergedPropertiesFile)
			if(propertiesSet == null){
					propertiesSet = new PropertiesSetVO()
					propertiesSet.mergedPropertiesFile = mergedPropertiesFile
					propertiesSet.allPropertiesFiles.add(mergedPropertiesFile)
				}
			if(!propertiesSet.allPropertiesFiles.contains(leftPropertiesFile))
				propertiesSet.allPropertiesFiles.add(leftPropertiesFile)
			if(!propertiesSet.allPropertiesFiles.contains(rightPropertiesFile))
				propertiesSet.allPropertiesFiles.add(rightPropertiesFile)
			
			propertiesFiles.put(mergedPropertiesFile, propertiesSet)
			
			targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			JavaCore.initializeAfterLoad(null)
			
			val String mergedPathString = _overlappingAspect.mergedFile.replace(ws.location.toString, "")
			var IJavaElement mergedElement = cacheJavaElements.get(mergedPathString)
			if(mergedElement == null){
				val IPath mergedPath = new Path(mergedPathString)
				mergedElement = JavaCore.create(ws.getFile(mergedPath))
				cacheJavaElements.put(mergedPathString, mergedElement)
			}
			
			val String leftPathString = _overlappingAspect.leftFile.replace(ws.location.toString, "")
			var IJavaElement extensionElement = cacheJavaElements.get(leftPathString)
			if(extensionElement == null){
				val IPath leftPath = new Path(leftPathString)
				val IFile leftFile = ws.getFile(leftPath);
				extensionElement = JavaCore.create(leftFile)
				cacheJavaElements.put(leftPathString, extensionElement)
			}
			
			val String righPathString = _overlappingAspect.rightFile.replace(ws.location.toString, "")
			var IJavaElement baseElement = cacheJavaElements.get(righPathString)
			if(baseElement == null){
				val IPath rightPath = new Path(righPathString)
				val IFile rightFile = ws.getFile(rightPath);
				baseElement = JavaCore.create(rightFile)
				cacheJavaElements.put(righPathString, baseElement)
			}
			_overlappingAspect.extensionElement = extensionElement
			_overlappingAspect.mergedElement = mergedElement
			_overlappingAspect.baseElement = baseElement
		}
		
		for(OverridingAspectsVO _overridingAspect : overridingAspects){
			if(_overridingAspect.mergedFile!=null){
				val String mergedPathString = _overridingAspect.mergedFile.replace(ws.location.toString, "")
				var IJavaElement mergedElement = cacheJavaElements.get(mergedPathString)
				if(mergedElement == null){
					val IPath mergedPath = new Path(mergedPathString)
					mergedElement = JavaCore.create(ws.getFile(mergedPath))
					cacheJavaElements.put(mergedPathString, mergedElement)
				}
				
				val String rightPathString = _overridingAspect.baseFile.replace(ws.location.toString, "")
				var IJavaElement rightElement = cacheJavaElements.get(rightPathString)
				if(rightElement == null){
					val IPath rightPath = new Path(rightPathString)
					rightElement = JavaCore.create(ws.getFile(rightPath))
					cacheJavaElements.put(rightPathString, rightElement)
				}
				
				val String leftPathString = _overridingAspect.leftFile.replace(ws.location.toString, "")
				var IJavaElement extensionElement = cacheJavaElements.get(leftPathString)
				if(extensionElement == null){
					val IPath leftPath = new Path(leftPathString)
					val IFile leftFile = ws.getFile(leftPath);
					extensionElement = JavaCore.create(leftFile)
					cacheJavaElements.put(leftPathString, extensionElement)
				}
				
				_overridingAspect.mergedElement = mergedElement
				_overridingAspect.extensionElement = extensionElement
				_overridingAspect.baseElement = rightElement
			}
		}
		
		val targetFolderFile = new File(targetProject.locationURI.path + "/xtend-gen/")
		var PrepareApplyRefactoringsJob refactoringJob = new PrepareApplyRefactoringsJob(cleanListOverlappingAspects, overridingAspects,
			refactoringPatterns, propertiesFiles, targetFolderFile, targetProject
		)
		refactoringJob.schedule()
	}
	
	def ArrayList<OverlappingAspectsVO> removeRepeatedElements(ArrayList<OverlappingAspectsVO> vos) {
		var ArrayList<OverlappingAspectsVO> answer = newArrayList
		for(OverlappingAspectsVO _overlappingAspect : vos){
			if(!answer.contains(_overlappingAspect))
				answer.add(_overlappingAspect)
		}
		return answer
	}
	
	def private overrideMethod(String sourceFilePath, String targetFilePath){
		var String baseContent = ""
			val BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
			var String line = br.readLine();
			
	        while (line != null) {
	           baseContent = baseContent + line + "\n"
	           line = br.readLine();
	        }
			br.close()
			
			var PrintWriter writer = new PrintWriter(new File(targetFilePath));
			writer.print(baseContent);
			writer.close();
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
			
			// Obtaining the provided interface if exists
			// TODO Check the conflict between the provided interface and the exact type. 
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
			
			val MatchingDiagnostic comparison = PuzzleMatch.instance.match(requiringLanguage.metamodel, providingLanguage.metamodel)
			
			// TODO: Validate compatibility

			var LanguageVO mergedLanguage = new LanguageVO()
			this.launchAbstractSyntaxComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison)
			this.launchSemanticsComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison, overlappingAspects, overridingAspects, refactoringPatterns)
			
			return mergedLanguage
		}
		// Error: The composition tree is not valid.
		else {
			return null
		}
	}
	
	/**
	 * Executes the composition of the abstract syntax of the languages in the parameters. 
	 */
	def void launchAbstractSyntaxComposition(LanguageVO mergedLanguage, LanguageVO requiringLanguage, 
		LanguageVO providingLanguage, MatchingDiagnostic comparison){
		var EPackage recalculatedRequiredInterface = PuzzleMerge.getInstance().
				recalculateRequiredInterface(requiringLanguage.requiredInterface, 
						comparison, "merged", providingLanguage.requiredInterface);
			 
			val EPackage mergedPackage = PuzzleMerge.instance.mergeAbstractSyntax(providingLanguage.metamodel, providingLanguage.providedInterface, 
				requiringLanguage.metamodel, requiringLanguage.requiredInterface, comparison, recalculatedRequiredInterface, 'CompleteDSLPckg')
			
			var EPackage recalculatedProvidedInterface = PuzzleMerge.instance.
				recalculateProvidedInterface(requiringLanguage.providedInterface, providingLanguage.providedInterface)
			
			
			mergedLanguage.name = 'CompleteDSL'
			mergedLanguage.mergedPackage = 'CompleteDSLPckg'
			mergedLanguage.metamodel = mergedPackage
			mergedLanguage.requiredInterface = recalculatedRequiredInterface
			mergedLanguage.providedInterface = recalculatedProvidedInterface
	}
	
	/**
	 * Executes the composition of the semantics of the languages in the parameters. 
	 */
	def launchSemanticsComposition(LanguageVO mergedLanguage, LanguageVO requiringLanguage, LanguageVO providingLanguage, 
		MatchingDiagnostic comparison, ArrayList<OverlappingAspectsVO> overlappingAspects, ArrayList<OverridingAspectsVO> overridingAspects,
		ArrayList<RefactoringPatternVO> refactoringPatterns) {
		println("launchSemanticsComposition")
		for(Aspect _providingAspect : providingLanguage.aspects){
			mergedLanguage.aspects.add(_providingAspect)
		}
		
		for(Aspect _requiringAspect : requiringLanguage.aspects){
			var boolean repeated = false
			if(_requiringAspect.aspectTypeRef.qualifiedName.lastIndexOf(".") != -1){
				var String requiringAspectClassName = _requiringAspect.aspectedClass.name

				// Collecting the repeated (overlapping) aspects				
				for(Aspect _providingAspect : providingLanguage.aspects){
					if(_providingAspect.aspectTypeRef.qualifiedName.lastIndexOf(".") != -1){
						var String providingAspectedClassName = _providingAspect.aspectedClass.name
						if(requiringAspectClassName.equals(providingAspectedClassName)){
							repeated = true
							println("Overlapping aspect: " + providingAspectedClassName)
							val overlappingAspect = new OverlappingAspectsVO(_providingAspect, providingAspectedClassName, _requiringAspect, requiringAspectClassName)
							overlappingAspect.rightFile = _providingAspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overlappingAspect.leftFile = _requiringAspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overlappingAspects.add(overlappingAspect)
						}
					}
				}
				
				// Collecting the overriding aspects
				for(Aspect _providingAspect : providingLanguage.aspects){
					if(_providingAspect.aspectTypeRef.qualifiedName.lastIndexOf(".") != -1){
						val String providingAspectedClassName = _providingAspect.aspectedClass.name
						
						if(_requiringAspect.aspectedClass != null && !_requiringAspect.aspectedClass.ESuperTypes.filter[ _superType |
								_superType.name.equals(providingAspectedClassName)].isEmpty){
							val overridingAspect = new OverridingAspectsVO(_providingAspect, providingAspectedClassName, _requiringAspect, requiringAspectClassName)
							overridingAspect.baseFile = _providingAspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overridingAspect.leftFile = _requiringAspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							overridingAspects.add(overridingAspect)		
						}
					}
				}
				
			}
			mergedLanguage.aspects.add(_requiringAspect)
		}
		
		mergedLanguage.oldNamespaces.add(requiringLanguage.metamodel.name)
		mergedLanguage.oldNamespaces.add(providingLanguage.metamodel.name)
		
		for(Aspect _aspect : mergedLanguage.aspects){
			// Changing the namespaces of the required types of the extension language that still required in the merged language.
//			if(mergedLanguage.requiredInterface != null){
//				for(EClassifier _requiredClassifier : mergedLanguage.requiredInterface.EClassifiers){
//				var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(
//					requiringLanguage.metamodel.name, _requiredClassifier.name, mergedLanguage.requiredInterface.name, 
//						_requiredClassifier.name)
//				if(!refactoringPatterns.contains(pattern))
//					refactoringPatterns.add(pattern)
//				}
//				
//				// Changing the namespaces of the required types of the base language that still required in the merged language. 
//				for(EClassifier _requiredClassifier : mergedLanguage.requiredInterface.EClassifiers){
//					var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(
//						providingLanguage.metamodel.name, _requiredClassifier.name, mergedLanguage.requiredInterface.name, 
//							_requiredClassifier.name)
//					if(!refactoringPatterns.contains(pattern))
//						refactoringPatterns.add(pattern)
//				}
//			}
			
			// Changing the namespaces of the required types of the extension language that were provided by the merged language. 
			println("Changing the namespaces of the required types of the extension language that were provided by the merged language. ")
			for(EClassifier _requiredClassifier : mergedLanguage.metamodel.EClassifiers){
				if(searchClassByName(requiringLanguage.requiredInterface, _requiredClassifier.name) != null){
					println("actually _requiredClassifier: " + _requiredClassifier)
					var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(
						requiringLanguage.metamodel.name, _requiredClassifier.name, mergedLanguage.metamodel.name, 
							_requiredClassifier.name)
					println("  . pattern: " + pattern)
					if(!refactoringPatterns.contains(pattern)){
						println("added")
						refactoringPatterns.add(pattern)
					}
						
				}
				
			}
			
			// Copying the aspect files to the target project
			if(_aspect.aspectTypeRef != null && _aspect.aspectTypeRef.type != null 
					&& _aspect.aspectTypeRef.identifier != null && _aspect.aspectTypeRef.type.eResource != null){
				
				val ws = targetProject.project.workspace.root
				val shader = new DirectoryShader
				val request = new ShadeRequest
				val relocators = new ArrayList<Relocator>
				val sourceEmfNamespace = "FSM"
				val targetEmfNamespace = "FSM"
				val sourceAspectNamespace = _aspect.aspectTypeRef.qualifiedName.replace("." + _aspect.aspectTypeRef.simpleName, "")
				val targetAspectNamespace = mergedLanguage.name
				
				if(_aspect.aspectTypeRef.type.eResource.contents.get(0) instanceof XtendFile){
					var XtendFile xtendFile = _aspect.aspectTypeRef.type.eResource.contents.get(0) as XtendFile;
					
					try{
						EcoreUtil.resolveAll(xtendFile)
					}catch(IllegalStateException e){
						println("Crying because of indexing")
					}
					
//					for(MatchingDiagnosticItem _mapping : comparison.items){
//						var EObject _input = _mapping.left;
//						var EObject _output = _mapping.right;
//						
//						if(_input instanceof EClassifier && _output instanceof EClassifier){
//							
//							var EClassifier sourceClass = mergedLanguage.metamodel.searchClassByName((_input as EClassifier).name)
//							var EClassifier targetClass = mergedLanguage.metamodel.searchClassByName((_output as EClassifier).name)
//							var RefactoringPatternVO pattern = new RefactoringPatternVO()
//							pattern.sourcePattern = sourceClass.getQualifiedName//leftLanguage.requiredInterface.name + "." + (_input as EClassifier).name
//							pattern.targetPattern = targetClass.getQualifiedName.replace(sourceAspectNamespace, targetAspectNamespace)
//							
//							if(!refactoringPatterns.contains(pattern))
//								refactoringPatterns.add(pattern)
//								
//							if((_input instanceof EClass) && (_output instanceof EClass)){
//								var EClass _inputClass = _input as EClass;
//								var EClass _outputClass = _output as EClass;
//
//									var List<EReference> incomingReferences = newArrayList;
//									_inputClass.getIncomingReferences(requiringLanguage.metamodel, incomingReferences)
//									
//									for(EReference _eRequiringReference : incomingReferences){
//										var RefactoringPatternVO referenceCallPattern = RefactoringPatternsBuilder.buildReferenceCallPattern(_inputClass.name, 
//											_eRequiringReference.name, _outputClass.name, _eRequiringReference.name);
//										
//										if(!refactoringPatterns.contains(referenceCallPattern))
//											refactoringPatterns.add(referenceCallPattern);
//								}
//							}
//						}
//						
//						for(XtendTypeDeclaration _typeDeclaration : xtendFile.xtendTypes){
//							buildPatternsByType(_typeDeclaration, refactoringPatterns, requiringLanguage, mergedLanguage, _input, _output, _aspect.aspectTypeRef.identifier)
//						}
//					}
					
//					for(String _MetamodelNamespace : mergedLanguage.oldNamespaces){
//						var RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildNamespacePattern(_MetamodelNamespace, targetAspectNamespace)
//						if(!refactoringPatterns.contains(pattern))
//							refactoringPatterns.add(pattern)
//					}
					
					println("_aspect.aspectTypeRef.type.simpleName: " + _aspect.aspectTypeRef.type.simpleName)
					for(RefactoringPatternVO pattern : refactoringPatterns){
						println("pattern: " + pattern)
					}
					
					val projectPathTmp = new StringBuilder
					val projectNameTmp = new StringBuilder
					
					ws.accept(
					new IResourceVisitor {
						override visit(IResource resource) throws CoreException {
							if (resource instanceof IFile) {
								val resourcePath = resource.locationURI.path
								if(_aspect.aspectTypeRef != null && _aspect.aspectTypeRef.identifier != null){
									val String currentAspectIdentifier = _aspect.aspectTypeRef.identifier
									val toBeMatched = currentAspectIdentifier.replace(".", "/") + ".java"
									if (resourcePath.endsWith(toBeMatched)) {
										
										val projectPath = resource.project.locationURI.path
										if (projectPathTmp.length == 0)
											projectPathTmp.append(projectPath)
										if (projectNameTmp.length == 0)
											projectNameTmp.append(resource.project.name)
									}
								}
								return false
							}
							return true
						}
					})
					
					
					val sourceAspectFolder = projectPathTmp + "/xtend-gen/"
					val sourceFolderFile = new File(sourceAspectFolder)
					val targetAspectFolder = targetProject.locationURI.path + "/xtend-gen/"
					
					if(sourceFolderFile != null && sourceFolderFile.exists){
						val targetFolderFile = new File(targetAspectFolder)
						relocators += new SimpleRelocator(sourceAspectNamespace.toString, targetAspectNamespace.toString, null, #[])
						relocators += new SimpleRelocator(sourceEmfNamespace.toString, targetEmfNamespace.toString, null, #[])
						
						var RefactoringPatternVO namespaceRefactoringPattern = new RefactoringPatternVO()
						namespaceRefactoringPattern.sourcePattern = sourceAspectNamespace.toString
						namespaceRefactoringPattern.targetPattern = targetAspectNamespace.toString
						 
						if(!refactoringPatterns.contains(namespaceRefactoringPattern))
						 refactoringPatterns.add(namespaceRefactoringPattern)
						
						request.inputFolders = #{sourceFolderFile}
						request.outputFolder = targetFolderFile
						request.filters = #[]
						request.relocators = relocators
						request.resourceTransformers = new ArrayList
						shader.shade(request)
					}
					
					for(OverlappingAspectsVO _overlappingAspect : overlappingAspects){
						if(_aspect.aspectTypeRef.identifier.equals(_overlappingAspect.leftAspect.aspectTypeRef.identifier)){
							_overlappingAspect.leftFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							_overlappingAspect.mergedFile = targetAspectFolder + targetAspectNamespace.toString + "/" + _aspect.aspectTypeRef.identifier.
								substring(_aspect.aspectTypeRef.identifier.lastIndexOf(".") + 1).replace(".", "/") + ".java"
						}
						if(_aspect.aspectTypeRef.identifier.equals(_overlappingAspect.rightAspect.aspectTypeRef.identifier)){
							_overlappingAspect.rightFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							_overlappingAspect.mergedFile = targetAspectFolder + targetAspectNamespace.toString + "/" + _aspect.aspectTypeRef.identifier.
								substring(_aspect.aspectTypeRef.identifier.lastIndexOf(".") + 1).replace(".", "/") + ".java"
						}
					}
					
					for(OverridingAspectsVO _overridingAspect : overridingAspects){
						if(_aspect.aspectTypeRef.identifier.equals(_overridingAspect.leftAspect.aspectTypeRef.identifier))
							_overridingAspect.leftFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
						if(_aspect.aspectTypeRef.identifier.equals(_overridingAspect.baseAspect.aspectTypeRef.identifier)){
							_overridingAspect.baseFile = sourceAspectFolder + _aspect.aspectTypeRef.identifier.replace(".", "/") + ".java"
							_overridingAspect.mergedFile = targetAspectFolder + targetAspectNamespace.toString + "/" + _aspect.aspectTypeRef.identifier.
								substring(_aspect.aspectTypeRef.identifier.lastIndexOf(".") + 1).replace(".", "/") + ".java"
						}
					}
				}
			}
		}
	}
	
		def private buildPatternsByType(XtendTypeDeclaration _typeDeclaration, ArrayList<RefactoringPatternVO> refactoringPattern, 
		LanguageVO leftLanguage, LanguageVO result, EObject _input, EObject _output, String aspectIdentifier) {
		for(XtendMember _member : _typeDeclaration.members){
			if((_member instanceof XtendField) && (_input instanceof EClass && _output instanceof EClass)){
				var String requiredTypeQualifiedName = (_input as EClassifier).qualifiedName//leftLanguage.requiredInterface.name + "." + (_input as EClassifier).name
				var String currentTypeQualifiedName = (_member as XtendField).type.qualifiedName
				if(currentTypeQualifiedName == null || currentTypeQualifiedName.equals("null")){
					currentTypeQualifiedName = (_member as XtendField).type.toString.substring((_member as XtendField).type.toString.indexOf("#") + 1, (_member as XtendField).type.toString.length-1)
				}
				if(currentTypeQualifiedName.equals(requiredTypeQualifiedName)){
					var List<RefactoringPatternVO> variablePatterns = RefactoringPatternsBuilder.buildVariablesPattern((_input as EClassifier).name, 
						(_member as XtendField).name, (_output as EClassifier).name)
					
					variablePatterns.forEach[ pattern |
						if(!refactoringPattern.contains(pattern))
							refactoringPattern.add(pattern)
					]
				}
			}
			else if((_member instanceof XtendFunction) && (_input instanceof EOperation && _output instanceof EOperation)){
				var String requiringClassName = (_input as EOperation).EContainingClass.name
				var String providingClassName = (_output as EOperation).EContainingClass.name
				println("(_input as EOperation): " + (_input as EOperation))
				if((_member as XtendFunction).expression != null){
					for(XExpression _currentExpressionStatement : ((_member as XtendFunction).expression as XBlockExpression).expressions){
						var IEvaluationContext evaluationContext = contextProvider.get();
						evaluationContext.newValue(QualifiedName.create("baseLanguage"), leftLanguage)
						evaluationContext.newValue(QualifiedName.create("input"), _input)
						evaluationContext.newValue(QualifiedName.create("output"), _output)
						evaluationContext.newValue(QualifiedName.create("providingClassName"), providingClassName)
						evaluationContext.newValue(QualifiedName.create("requiringClassName"), requiringClassName)
						evaluationContext.newValue(QualifiedName.create("aspects"), result.aspects)
						evaluationContext.newValue(QualifiedName.create("refactoringPatterns"), refactoringPattern)
						evaluationContext.newValue(QualifiedName.create("function"),(_member as XtendFunction))
						puzzleXbaseInterpreter.classLoader = URLClassLoader.getSystemClassLoader()
						puzzleXbaseInterpreter.evaluate(_currentExpressionStatement, evaluationContext, CancelIndicator.NullImpl)
					}
				}
			}
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