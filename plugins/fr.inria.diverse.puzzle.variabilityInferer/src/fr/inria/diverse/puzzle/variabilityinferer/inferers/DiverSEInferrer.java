package fr.inria.diverse.puzzle.variabilityinferer.inferers;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;
import fr.inria.diverse.k3.sle.common.graphs.EcoreGraph;
import fr.inria.diverse.melange.metamodel.melange.Language;

public class DiverSEInferrer implements VariabilityInferer {

	@Override
	public EObject inferVariabilityModel(ArrayList<Language> languages, EcoreGraph modularizationGraph) {
		System.out.println("Coucou! inferVariabilityModel");
		return null;
	}

}
