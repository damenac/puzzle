package fr.inria.diverse.k3.sle.common.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmOperation;

import fr.inria.diverse.k3.sle.common.comparisonOperators.MethodComparison;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class XtendQueries {

	public static JvmOperation searchJvmOperationByComparisonOperator(Language language,
			JvmOperation operation, MethodComparison comparisonOperator) {
		for (Aspect aspect : language.getSemantics()) {
			for (EObject aspectElement : aspect.getAspectTypeRef().getType().eContents()) {
				if(aspectElement instanceof JvmOperation){
					JvmOperation currentOperation = (JvmOperation) aspectElement;
					if(comparisonOperator.equal(operation, currentOperation))
						return currentOperation;
				}
			}
		}
		return null;
	}

}
