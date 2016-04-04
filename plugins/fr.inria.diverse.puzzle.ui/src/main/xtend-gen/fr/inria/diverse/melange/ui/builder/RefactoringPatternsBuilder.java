package fr.inria.diverse.melange.ui.builder;

import java.util.List;
import org.autorefactor.ui.RefactoringPatternVO;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * TODO: Build a document with the explanation of the examples.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class RefactoringPatternsBuilder {
  /**
   * Builds a pattern for redirecting from a feature call to the required interface to
   * its corresponding reference in the merged language.
   * 
   * TODO: We need to take into account that the target and the source references might have not the same name.
   * 
   * @param requiredClassName
   * 			The name of the class declared as required in the required interface that is the type of the reference.
   * @param requiringReferenceName
   * 			The name of the reference that will be redirected.
   * @param providedClassName
   * 			The name of the class that provides the implementation of the required class.
   * @param providingReferenceName
   * 			The name of the reference that actually implements the requiring reference.
   * 
   * Source pattern:
   * 		<RequiredClassName> _<requiringReferenceName> = _self.get<RequiringReferenceName>();
   * 
   * 	-> Example:
   * 		Program _doAction = _self.getDoAction();
   * 
   * Target pattern:
   * 		<ProvidedClassName> _<providingReferenceName> = _self.get<ProvidingReferenceName>();
   * 
   * 	-> Example:
   * 		ClassMethod _doAction = _self.getDoAction();
   */
  public static RefactoringPatternVO buildReferenceCallPattern(final String requiredClassName, final String requiringReferenceName, final String providedClassName, final String providingReferenceName) {
    RefactoringPatternVO result = new RefactoringPatternVO();
    String _firstUpper = StringExtensions.toFirstUpper(requiringReferenceName);
    String _plus = ((((requiredClassName + " _") + requiringReferenceName) + " = _self.get") + _firstUpper);
    String _plus_1 = (_plus + "()");
    result.setSourcePattern(_plus_1);
    String _firstUpper_1 = StringExtensions.toFirstUpper(providingReferenceName);
    String _plus_2 = ((((providedClassName + " _") + providingReferenceName) + " = _self.get") + _firstUpper_1);
    String _plus_3 = (_plus_2 + "()");
    result.setTargetPattern(_plus_3);
    return result;
  }
  
  /**
   * Builds a pattern for redirecting from a operation call to the required interface to
   * its corresponding implementation in the aspect.
   * 
   * TODO: We need to improve the support for the parameters!
   * TODO: We need to reduce the dependence with the spaces in the code!
   * 
   * @param requiredClassName
   * 			The name of the class declared as required in the required interface and that contains the operation call.
   * @param requiringFeatureName
   * 			The name of the feature whose type corresponds to the required class.
   * @param requiredOperationaName
   * 			The name of the operation called on the required feature.
   * @param providedClassName
   * 			The name of the class that provides the implementation of the required class
   * @param providedAspectName
   * 			The name of the aspect that provides the implementation of the operations in the required class
   * @param providedOperationName
   * 			The name of the operation (in the provided class) that implements the required operation (in the required class).
   * 
   * Source pattern:
   * 		<RequiredClassName> _<requiringFeatureName>_1 = _self.get<RequiringFeatureName>();
   *  	_<requiringFeatureName>_1.<requiredOperationName>(
   * 
   *  -> Example:
   * 		Program _doAction_1 = _self.getDoAction();
   * 		_doAction_1.exec(
   * 
   * Target pattern:
   * 		<ProvidedClassName> _<requiringFeatureName> = _self.get<RequiringFeatureName>();
   * 		<ProvidedAspectName>.<providedOperationName>(_self, _<requiringFeatureName>
   * 
   *  -> Example:
   * 		ClassMethod _doAction_1 = _self.getDoAction
   * 		ClassMethodAspect.exec(_doAction_1
   */
  public static List<RefactoringPatternVO> buildOperationCallPattern(final String requiredClassName, final String requiringFeatureName, final String requiredOperationName, final String providedClassName, final String providedAspectName, final String providedOperationName, final boolean hasArguments) {
    List<RefactoringPatternVO> result = CollectionLiterals.<RefactoringPatternVO>newArrayList();
    int index = 0;
    while ((index <= 3)) {
      {
        RefactoringPatternVO patternLine1 = new RefactoringPatternVO();
        String _firstUpper = StringExtensions.toFirstUpper(requiringFeatureName);
        String _plus = ((((((requiredClassName + " _") + requiringFeatureName) + "_") + Integer.valueOf(index)) + " = _self.get") + _firstUpper);
        String _plus_1 = (_plus + "();");
        patternLine1.setSourcePattern(_plus_1);
        String _firstUpper_1 = StringExtensions.toFirstUpper(requiringFeatureName);
        String _plus_2 = ((((((providedClassName + " _") + requiringFeatureName) + "_") + Integer.valueOf(index)) + " = _self.get") + _firstUpper_1);
        String _plus_3 = (_plus_2 + "();");
        patternLine1.setTargetPattern(_plus_3);
        RefactoringPatternVO patternLine2 = new RefactoringPatternVO();
        patternLine2.setSourcePattern((((((("_" + requiringFeatureName) + "_") + Integer.valueOf(index)) + ".") + requiredOperationName) + "("));
        patternLine2.setTargetPattern((((((((providedAspectName + ".") + providedOperationName) + "(_") + requiringFeatureName) + "_") + Integer.valueOf(index)) + ""));
        RefactoringPatternVO patternLine3 = new RefactoringPatternVO();
        patternLine3.setSourcePattern((((("_" + requiringFeatureName) + ".") + requiredOperationName) + "("));
        patternLine3.setTargetPattern(((((providedAspectName + ".") + providedOperationName) + "(_") + requiringFeatureName));
        RefactoringPatternVO patternLine4 = new RefactoringPatternVO();
        patternLine4.setSourcePattern(((((((("((" + requiredClassName) + ")") + "_") + requiringFeatureName) + ").") + requiredOperationName) + "("));
        patternLine4.setTargetPattern(((((providedAspectName + ".") + providedOperationName) + "(_") + requiringFeatureName));
        RefactoringPatternVO patternLine5 = new RefactoringPatternVO();
        patternLine5.setSourcePattern((((requiringFeatureName + ".") + requiredOperationName) + "("));
        patternLine5.setTargetPattern(((((providedAspectName + ".") + providedOperationName) + "(") + requiringFeatureName));
        if (hasArguments) {
          String _targetPattern = patternLine2.getTargetPattern();
          String _plus_4 = (_targetPattern + ", ");
          patternLine2.setTargetPattern(_plus_4);
          String _targetPattern_1 = patternLine3.getTargetPattern();
          String _plus_5 = (_targetPattern_1 + ", ");
          patternLine3.setTargetPattern(_plus_5);
          String _targetPattern_2 = patternLine4.getTargetPattern();
          String _plus_6 = (_targetPattern_2 + ", ");
          patternLine4.setTargetPattern(_plus_6);
          String _targetPattern_3 = patternLine5.getTargetPattern();
          String _plus_7 = (_targetPattern_3 + ", ");
          patternLine5.setTargetPattern(_plus_7);
        }
        result.add(patternLine1);
        result.add(patternLine2);
        result.add(patternLine3);
        result.add(patternLine4);
        result.add(patternLine5);
        index++;
      }
    }
    return result;
  }
  
  /**
   * TODO: To include support for operations with parameters!
   * 
   * Source pattern:
   * 		<RequiringAspectName>._requiredSuper.<operationName>
   * 
   * 	-> Example:
   * 		TimedTransitionAspect._requiredSuper.eval();
   * 
   * Target pattern:
   * 		<SuperAspectName>.<operationName>(_self);
   * 
   * 	-> Example:
   * 		TransitionAspect.eval(_self);
   */
  public static RefactoringPatternVO buildSuperOperationCallPattern(final String requiringAspectName, final String operationName, final String superAspectName, final boolean hasArguments) {
    RefactoringPatternVO pattern = new RefactoringPatternVO();
    pattern.setSourcePattern((((requiringAspectName + "._requiredSuper.") + operationName) + "("));
    pattern.setTargetPattern((((superAspectName + ".super_") + operationName) + "(_self"));
    if (hasArguments) {
      String _targetPattern = pattern.getTargetPattern();
      String _plus = (_targetPattern + ", ");
      pattern.setTargetPattern(_plus);
    }
    return pattern;
  }
  
  /**
   * Builds a refactoring pattern for changing the types of variables when it refers to a required classes.
   * 
   * 	-> Example:
   * 		Program auxVariable
   * 		Program _privk3_auxVariable(
   * 
   * 
   * 	-> Example:
   * 		ClassMethod auxVariable
   * 		ClassMethod _privk3_auxVariable(
   */
  public static List<RefactoringPatternVO> buildVariablesPattern(final String requiredClassName, final String declaredVariableName, final String providedClassName) {
    RefactoringPatternVO patternLine1 = new RefactoringPatternVO();
    patternLine1.setSourcePattern(((requiredClassName + " ") + declaredVariableName));
    patternLine1.setTargetPattern(((providedClassName + " ") + declaredVariableName));
    RefactoringPatternVO patternLine2 = new RefactoringPatternVO();
    patternLine2.setSourcePattern(((requiredClassName + " _privk3_") + declaredVariableName));
    patternLine2.setTargetPattern(((providedClassName + " _privk3_") + declaredVariableName));
    List<RefactoringPatternVO> result = CollectionLiterals.<RefactoringPatternVO>newArrayList();
    result.add(patternLine1);
    result.add(patternLine2);
    return result;
  }
  
  /**
   * Builds a refactoring pattern for changing the references from the classes in the metamodels to the
   * classes to the merged language.
   * 
   * Source pattern:
   * 		<sourceNamespace>.<sourceClassName>
   * 
   * 	-> Example:
   * 		fsmrequired.Program
   * 
   * Target pattern:
   * 		<targetNamespace>.<targetClassName>
   * 
   * 	-> Example:
   * 		CompleteFSM.members.ClassMethod
   */
  public static RefactoringPatternVO buildMetaclassReferencePattern(final String sourceNamespace, final String sourceClassName, final String targetNamespace, final String targetClassName) {
    RefactoringPatternVO result = new RefactoringPatternVO();
    result.setSourcePattern(((sourceNamespace + ".") + sourceClassName));
    result.setTargetPattern(((targetNamespace + ".") + targetClassName));
    return result;
  }
  
  public static RefactoringPatternVO buildNamespacePattern(final String sourceNamespace, final String targetNamespace) {
    RefactoringPatternVO result = new RefactoringPatternVO();
    result.setSourcePattern((sourceNamespace + "."));
    result.setTargetPattern((targetNamespace + "."));
    return result;
  }
}
