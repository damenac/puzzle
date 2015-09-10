package fr.inria.diverse.puzzle.metrics.specialCharts;

import java.util.ArrayList;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.melange.metamodel.melange.Language;

/**
 * Interface for special charts i.e., graphs and trees
 * @author David Mendez-Acuna
 *
 */
public interface SpecialSyntacticChart {

	public String getVariablesDeclaration(ArrayList<Language> languages, ConceptComparison conceptComparisonOperator) throws Exception;
}
