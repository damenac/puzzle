package fr.inria.diverse.puzzle.metrics.evaluators.syntax;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class TotalAmountOfConcepts {

	public static int evaluateMetric(ArrayList<Language> languages, ConceptComparison comparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<TupleConceptMembers> conceptMemberGroupList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, comparisonOperator);
		return conceptMemberGroupList.size();
	}
}
