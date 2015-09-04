package fr.inria.diverse.puzzle.metrics.auxiliarMetrics;

import java.util.ArrayList;

import org.eclipse.xtext.common.types.JvmOperation;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMethodMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Methods counter
 * @author David Mendez-Acuna
 */
public class CollectMethods {

	public static ArrayList<JvmOperation> collectFamilyMethods(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator, MethodComparison methodComparisonOperator ){
		ArrayList<TupleConceptMethodMember> conceptMethodMemberList = FamiliesServices.getInstance().getConceptMethodMemberMappingList(languages);
		ArrayList<TupleConceptMethodMembers> conceptMethodMemberGroupList = FamiliesServices.getInstance().getConceptMethodMemberGroupList(conceptMethodMemberList, conceptComparisonOperator, methodComparisonOperator);
		ArrayList<JvmOperation> answer = new ArrayList<JvmOperation>();
		for (TupleConceptMethodMembers tuple : conceptMethodMemberGroupList) {
			answer.add(tuple.getMethod());
		}
		return answer;
	}
}
