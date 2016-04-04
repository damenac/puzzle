package fr.inria.diverse.puzzle.engine;

import fr.inria.diverse.melange.ui.vos.LanguageVO;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic;
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge;
import org.eclipse.emf.ecore.EPackage;

/**
 * Some queries on Ecore models.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class AbstractSyntaxCompositionEngine {
  /**
   * Executes the composition of the abstract syntax of the languages in the parameters.
   */
  public void launchAbstractSyntaxComposition(final LanguageVO mergedLanguage, final LanguageVO requiringLanguage, final LanguageVO providingLanguage, final MatchingDiagnostic comparison) {
    PuzzleMerge _instance = PuzzleMerge.getInstance();
    EPackage recalculatedRequiredInterface = _instance.recalculateRequiredInterface(requiringLanguage.requiredInterface, comparison, "merged", providingLanguage.requiredInterface);
    PuzzleMerge _instance_1 = PuzzleMerge.getInstance();
    final EPackage mergedPackage = _instance_1.mergeAbstractSyntax(providingLanguage.metamodel, providingLanguage.providedInterface, 
      requiringLanguage.metamodel, requiringLanguage.requiredInterface, comparison, recalculatedRequiredInterface, "CompleteDSLPckg");
    PuzzleMerge _instance_2 = PuzzleMerge.getInstance();
    EPackage recalculatedProvidedInterface = _instance_2.recalculateProvidedInterface(requiringLanguage.providedInterface, providingLanguage.providedInterface);
    mergedLanguage.name = "CompleteDSL";
    mergedLanguage.mergedPackage = "CompleteDSLPckg";
    mergedLanguage.metamodel = mergedPackage;
    mergedLanguage.requiredInterface = recalculatedRequiredInterface;
    mergedLanguage.providedInterface = recalculatedProvidedInterface;
  }
}
