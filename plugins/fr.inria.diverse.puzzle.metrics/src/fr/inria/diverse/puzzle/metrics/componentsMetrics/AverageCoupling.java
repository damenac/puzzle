package fr.inria.diverse.puzzle.metrics.componentsMetrics;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.EcoreGraph;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.tuples.TupleMembersConcepts;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class AverageCoupling {

	public double compute(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator) throws Exception{
		SumCoupling sumOperator = new SumCoupling();
		int sum = sumOperator.compute(languages, conceptComparisonOperator);
		
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<TupleConceptMembers> conceptMembersList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, conceptComparisonOperator);
		ArrayList<TupleMembersConcepts> membersConceptList = FamiliesServices.getInstance().getMembersGroupVsConceptVOList(conceptMembersList);
		EcoreGraph dependenciesGraph = new EcoreGraph(membersConceptList, conceptComparisonOperator);
		dependenciesGraph.groupGraphByFamilyMembership(membersConceptList, conceptComparisonOperator);
		
		double aveCoupling = sum / dependenciesGraph.getGroups().size();
		return aveCoupling;
	}
	
}
