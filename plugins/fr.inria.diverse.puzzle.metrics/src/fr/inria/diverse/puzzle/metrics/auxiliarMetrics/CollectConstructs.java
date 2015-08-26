package fr.inria.diverse.puzzle.metrics.auxiliarMetrics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import fr.inria.diverse.k3.sle.common.comparisonOperators.ConceptComparison;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMember;
import fr.inria.diverse.k3.sle.common.tuples.TupleConceptMembers;
import fr.inria.diverse.k3.sle.common.utils.FamiliesServices;
import fr.inria.diverse.k3.sle.common.utils.MelangeServices;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Constructs counter
 * @author David Mendez-Acuna
 */
public class CollectConstructs {

	public static List<EClassifier> collectFamilyConstructs(ArrayList<Language> languages, ConceptComparison comparisonOperator) throws Exception{
		ArrayList<EPackage> ePackages = MelangeServices.getEPackagesByALanguagesList(languages);
		ArrayList<TupleConceptMember> conceptMemberList = FamiliesServices.getInstance().getConceptMemberMappingList(ePackages);
		ArrayList<TupleConceptMembers> conceptMemberGroupList = FamiliesServices.getInstance().getConceptMemberGroupList(conceptMemberList, comparisonOperator);
		List<EClassifier> constructs = new ArrayList<EClassifier>();
		for (TupleConceptMembers tuple : conceptMemberGroupList) {
			constructs.add(tuple.getConcept());
		}
		return constructs;
	}
}
